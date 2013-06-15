package de.upb.swt.core.ui.runtime;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

import de.upb.swt.core.runtime.AbstractCoreActivator;

public abstract class AbstractActivator extends AbstractCoreActivator implements IActivator {
	private static final String DIALOG_SETTINGS = "dialog_settings.xml"; //$NON-NLS-1$
	private static final String ENCODING = "UTF-8"; //$NON-NLS-1$
	private static final String WORKBENCH = "Workbench"; //$NON-NLS-1$

	private ColorRegistry colorRegistry;
	private IDialogSettings dialogSettings;

	private ImageRegistry imageRegistry;
	private ScopedPreferenceStore preferenceStore;

	@Override
	public final void stop(BundleContext context) throws Exception {
		// dispose additional elements in instance class
		dispose();

		// color registry
		if (colorRegistry != null) {
			// TODO: dispose colors?
		}
		colorRegistry = null;

		// image registry
		if (imageRegistry != null) {
			imageRegistry.dispose();
		}
		imageRegistry = null;

		// dialog settings
		if (dialogSettings != null) {
			try {
				IPath path = Platform.getStateLocation(getBundle());
				if (path == null) {
					throw new NullPointerException("The system is running with no data area.");
				}

				dialogSettings.save(path.append(DIALOG_SETTINGS).toOSString());
			} catch (IOException e) {
				error("Could not save dialog settings!", e);
			} catch (IllegalStateException e) {
				error("Could not save dialog settings!", e);
			} catch (NullPointerException e) {
				error("Could not save dialog settings!", e);
			}
		}
		dialogSettings = null;

		// preference store
		if (preferenceStore != null) {
			try {
				getPreferenceStore().save();
			} catch (IOException e) {
				error("Could not save preference store!", e);
			}
		}
		preferenceStore = null;

		super.stop(context);
	}

	/**
	 * This method is called before the bundle activator will be stopped. Should be used to delete the singleton
	 * instance reference.
	 */
	protected abstract void dispose();

	@Override
	public ScopedPreferenceStore getPreferenceStore() {
		if (preferenceStore == null) {
			preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, getID());
		}
		return preferenceStore;
	}

	@Override
	public Color getColor(String key) {
		if (getColorRegistry().hasValueFor(key)) {
			return getColorRegistry().get(key);
		}
		return null;
	}

	protected final void addColor(String key, RGB rgb) {
		if (getColorRegistry().hasValueFor(key)) {
			warn(String.format("A color with the key '%1s' has already been added to the registry.", key));
			return;
		}

		getColorRegistry().put(key, rgb);
	}

	private ColorRegistry getColorRegistry() {
		if (colorRegistry == null) {
			colorRegistry = new ColorRegistry(getDisplay());
		}
		return colorRegistry;
	}

	@Override
	public final Image getImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image != null) {
			return image;
		}
		return getImageRegistry().get(null);
	}

	@Override
	public final ImageDescriptor getImageDescriptor(String path) {
		ImageDescriptor descriptor = getImageRegistry().getDescriptor(path);
		if (descriptor != null) {
			return descriptor;
		}
		return getImageRegistry().getDescriptor(null);
	}

	protected final void addImage(String path) {
		addImage(path, path);
	}

	protected final void addImage(String key, String path) {
		ImageDescriptor descriptor = getImageRegistry().getDescriptor(key);
		if (descriptor != null) {
			warn(String.format("An image with the key '%1s' has already been added to the registry.", key));
			return;
		}

		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(getID(), path);
		if (descriptor == null) {
			warn(String.format("The image under the path '%1s' could not be found.", path));
			return;
		}

		getImageRegistry().put(key, descriptor);
	}

	protected ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry(getDisplay());
			imageRegistry.put(null, ImageDescriptor.getMissingImageDescriptor());
		}
		return imageRegistry;
	}

	@Override
	public Display getDisplay() {
		// use UI thread
		if (Display.getCurrent() != null) {
			return Display.getCurrent();
		}

		// use platform display
		if (PlatformUI.isWorkbenchRunning()) {
			return PlatformUI.getWorkbench().getDisplay();
		}

		// invalid thread access
		throw new SWTError(SWT.ERROR_THREAD_INVALID_ACCESS);
	}

	@Override
	public final IDialogSettings getDialogSettings() {
		if (dialogSettings == null) {
			dialogSettings = createDialogSettings();
		}
		return dialogSettings;
	}

	private IDialogSettings createDialogSettings() {
		IDialogSettings dialogSettings = new DialogSettings(WORKBENCH);

		// see bug 69387
		IPath path = Platform.getStateLocation(getBundle());
		if (path != null) {
			// try r/w state area in the local file system
			String readWritePath = path.append(DIALOG_SETTINGS).toOSString();
			File settingsFile = new File(readWritePath);
			if (settingsFile.exists()) {
				try {
					dialogSettings.load(readWritePath);
				} catch (IOException e) {
					// load failed so ensure we have an empty settings
					dialogSettings = new DialogSettings(WORKBENCH);
				}

				return dialogSettings;
			}
		}

		// otherwise look for bundle specific dialog settings
		URL dsURL = FileLocator.find(getBundle(), new Path(DIALOG_SETTINGS), null);
		if (dsURL == null) {
			return dialogSettings;
		}

		InputStream is = null;
		try {
			is = dsURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, ENCODING));
			dialogSettings.load(reader);
		} catch (IOException e) {
			// load failed so ensure we have an empty settings
			dialogSettings = new DialogSettings(WORKBENCH);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// do nothing
			}
		}

		return dialogSettings;
	}

	@Override
	public final void start(BundleContext context) throws Exception {
		super.start(context);
		initialize();
	}

	/**
	 * This method is called when the activator has been started. Should be used to store the singleton instance when
	 * necessary and to fill the image registry.
	 */
	protected abstract void initialize();
}

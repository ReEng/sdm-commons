package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.diagram.custom.Activator;
import org.storydriven.storydiagrams.diagram.custom.providers.EPackageResourceContentProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.EPackageResourceLabelProvider;

public class SelectEPackageFromWorkspaceDialog extends Dialog {
	private final Collection<EPackage> selectedFiles;
	private String filterString;
	private ResourceSet resourceSet;

	public SelectEPackageFromWorkspaceDialog(Shell shell, ResourceSet resourceSet) {
		super(shell);
		this.resourceSet = resourceSet;
		selectedFiles = new HashSet<EPackage>();
	}

	public Collection<EPackage> getEPackages() {
		return selectedFiles;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);

		// filter composite
		Composite filterComposite = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(filterComposite);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterComposite);

		Label filterLabel = new Label(filterComposite, SWT.TRAIL);
		GridDataFactory.fillDefaults().applyTo(filterComposite);

		final Text filterText = new Text(filterComposite, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterText);

		final TreeViewer viewer = new TreeViewer(composite, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getControl());
		viewer.setContentProvider(new EPackageResourceContentProvider(resourceSet));
		viewer.setLabelProvider(new EPackageResourceLabelProvider());
		viewer.setComparator(new ViewerComparator());
		viewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IResource) {
					IResource resource = (IResource) element;
					if (resource.isAccessible() && !resource.getName().startsWith(".")) {
						if (resource instanceof IFile) {
							IFile file = (IFile) element;
							if (file.isAccessible() && !file.getName().startsWith(".")) {
								if ("*".equals(filterString)) {
									return true;
								} else if (filterString.contains("*")) {
									String[] parts = filterString.split("\\*");
									for (String part : parts) {
										if (!file.getName().toLowerCase().contains(part.toLowerCase())) {
											return false;
										}
									}
									return true;
								} else {
									return file.getName().toLowerCase().contains(filterString.toLowerCase());
								}
							}
						} else if (resource instanceof IContainer) {
							try {
								for (IResource child : ((IContainer) resource).members()) {
									if (select(viewer, resource, child)) {
										return true;
									}
								}
							} catch (CoreException e) {
								e.printStackTrace();
								return false;
							}
						}
						return true;
					}
				} else if (element instanceof EObject) {
					return true;
				}
				return false;
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (((IStructuredSelection) viewer.getSelection()).size() == 1) {
					Object seected = ((IStructuredSelection) viewer.getSelection()).getFirstElement();
					if (seected instanceof IContainer) {
						viewer.setExpandedState(seected, !viewer.getExpandedState(seected));
					} else if (seected instanceof IFile) {
						System.out.println("load resource");
					}
				}
			}
		});

		// hook listeners
		filterText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.ARROW_DOWN && viewer.getTree().getItemCount() > 0) {
					viewer.getTree().setFocus();
				}
			}
		});
		filterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				filterString = filterText.getText();
				viewer.refresh();
				checkValidity();
			}
		});

		viewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectedFiles.clear();
				for (Object selected : ((IStructuredSelection) viewer.getSelection()).toArray()) {
					if (selected instanceof EPackage) {
						selectedFiles.add((EPackage) selected);
					}
				}
				checkValidity();
			}
		});
		// viewer.addDoubleClickListener(new IDoubleClickListener() {
		// @Override
		// public void doubleClick(DoubleClickEvent event) {
		// if (!selectedFiles.isEmpty()) {
		// okPressed();
		// }
		// }
		// });

		// initialize values
		filterLabel.setText("Filter:");
		filterText.setText("");
		viewer.setInput(ResourcesPlugin.getWorkspace().getRoot());

		checkValidity();

		return composite;
	}

	private void checkValidity() {
		boolean isValid = !selectedFiles.isEmpty();

		Button okButton = getButton(IDialogConstants.OK_ID);
		if (okButton != null) {
			okButton.setEnabled(isValid);
		}
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Add Workspace Resource");
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		IDialogSettings pluginSettings = Activator.getInstance().getDialogSettings();
		IDialogSettings dialogSettings = pluginSettings.getSection(getClass().getCanonicalName());
		if (dialogSettings == null) {
			dialogSettings = pluginSettings.addNewSection(getClass().getCanonicalName());

			dialogSettings.put("DIALOG_WIDTH", 400); //$NON-NLS-1$
			dialogSettings.put("DIALOG_HEIGHT", 500); //$NON-NLS-1$
		}
		return dialogSettings;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
}

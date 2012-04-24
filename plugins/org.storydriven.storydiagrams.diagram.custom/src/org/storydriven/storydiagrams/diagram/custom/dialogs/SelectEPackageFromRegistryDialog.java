package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
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
import org.storydriven.storydiagrams.diagram.custom.providers.StringTableLabelProvider;

public class SelectEPackageFromRegistryDialog extends Dialog {
	private final Collection<String> hiddenUris;
	private final Collection<String> selectedUris;
	private String filterString;

	public SelectEPackageFromRegistryDialog(Shell shell) {
		super(shell);
		hiddenUris = new HashSet<String>();
		selectedUris = new HashSet<String>();
	}

	public Collection<String> getUris() {
		return selectedUris;
	}

	public void setFilteredEPackages(Collection<EPackage> ePackages) {
		hiddenUris.clear();
		for (EPackage ePackage : ePackages) {
			hiddenUris.add(ePackage.getNsURI());
		}
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

		final TableViewer viewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getControl());
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new StringTableLabelProvider());
		viewer.setComparator(new ViewerComparator());
		viewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (!hiddenUris.contains(element)) {
					String uri = ((String) element).toLowerCase();
					if ("*".equals(filterString)) {
						return true;
					} else if (filterString.contains("*")) {
						String[] parts = filterString.split("\\*");
						for (String part : parts) {
							if (!uri.contains(part.toLowerCase())) {
								return false;
							}
						}
						return true;
					} else {
						return uri.contains(filterString);
					}
				}
				return false;
			}
		});

		// hook listeners
		filterText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.ARROW_DOWN && viewer.getTable().getItemCount() > 0) {
					viewer.getTable().setSelection(0);
					viewer.getTable().setFocus();
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
				selectedUris.clear();
				for (Object selected : ((IStructuredSelection) viewer.getSelection()).toArray()) {
					if (selected instanceof String) {
						selectedUris.add((String) selected);
					}
				}
				checkValidity();
			}
		});
		viewer.getTable().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.BS) {
					String text = filterText.getText();
					filterText.setText(text.substring(0, text.length() - 1));
					filterText.setSelection(text.length() - 1);
					filterText.setFocus();
				}
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (!viewer.getSelection().isEmpty()) {
					okPressed();
				}
			}
		});

		// initialize values
		filterLabel.setText("Filter:");
		filterText.setText("");
		viewer.setInput(EPackage.Registry.INSTANCE.keySet());

		checkValidity();

		return composite;
	}

	private void checkValidity() {
		boolean isValid = !selectedUris.isEmpty();

		Button okButton = getButton(IDialogConstants.OK_ID);
		if (okButton != null) {
			okButton.setEnabled(isValid);
		}
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Add Registered EPackage");
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

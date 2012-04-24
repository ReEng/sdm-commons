package org.storydriven.storydiagrams.diagram.custom.dialogs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.storydriven.storydiagrams.diagram.custom.Activator;

public abstract class AbstractTreeSelectionDialog<T extends EObject> extends TitleAreaDialog {
	private String shellText;
	private String title;
	private String description;

	private Text filterText;

	private TreeViewer elementViewer;

	private T element;

	private ElementViewerFilter viewerFilter;

	private static class ElementViewerFilter extends ViewerFilter {
		private String filterText;

		@Override
		public boolean select(Viewer viewer, Object parent, Object element) {
			if (filterText != null && !filterText.trim().isEmpty()) {
				ILabelProvider labelProvider = (ILabelProvider) ((TreeViewer) viewer).getLabelProvider();
				String elementString = labelProvider.getText(element).toLowerCase();
				String filterString = filterText.toLowerCase();

				return elementString.contains(filterString);
			} else {
				return true;
			}
		}

		public void setFilterText(String filterText) {
			this.filterText = filterText.toLowerCase();
		}

	}

	public AbstractTreeSelectionDialog(String shellText, String title, String description) {
		super(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		this.shellText = shellText;
		this.title = title;
		this.description = description;

		setHelpAvailable(false);
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// configure dialog data
		setTitle(title);
		setMessage(description);

		// get created dialog area
		Composite area = (Composite) super.createDialogArea(parent);

		// main composite
		Composite main = new Composite(area, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(main);

		// filter field
		filterText = new Text(main, SWT.LEAD | SWT.BORDER | SWT.SINGLE | SWT.SEARCH);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterText);

		// viewer
		elementViewer = new TreeViewer(main, SWT.BORDER | SWT.SINGLE);
		elementViewer.setLabelProvider(getLabelProvider());
		elementViewer.setContentProvider(getContentProvider());
		elementViewer.setComparator(getViewerComparator());
		viewerFilter = new ElementViewerFilter();
		elementViewer.addFilter(viewerFilter);
		elementViewer.setInput(getInput());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(elementViewer.getControl());

		hookListeners();

		if (element != null) {
			elementViewer.setExpandedElements(new Object[] { element });
			elementViewer.setSelection(new StructuredSelection(element), true);
		}

		checkValidity();

		return elementViewer.getControl();
	}

	protected abstract IBaseLabelProvider getLabelProvider();

	protected abstract IContentProvider getContentProvider();

	protected abstract Object getInput();

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);

		shell.setText(shellText);
	}

	protected ViewerComparator getViewerComparator() {
		return new ViewerComparator();
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		String sectionName = getClass().getCanonicalName();
		IDialogSettings plugin = Activator.getInstance().getDialogSettings();
		IDialogSettings dialog = plugin.getSection(sectionName);
		if (dialog == null) {
			dialog = plugin.addNewSection(sectionName);
		}
		return dialog;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	protected abstract boolean isValid(Object element);

	private void hookListeners() {
		// filter changed
		filterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				viewerFilter.setFilterText(filterText.getText());
				elementViewer.refresh(false);
			}
		});

		// double clicked
		elementViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			@SuppressWarnings("unchecked")
			public void doubleClick(DoubleClickEvent event) {
				element = null;

				IStructuredSelection selection = (IStructuredSelection) elementViewer.getSelection();
				if (selection.size() == 1) {
					if (isValid(selection.getFirstElement())) {
						element = (T) selection.getFirstElement();
						okPressed();
					}
				}
				checkValidity();
			}
		});

		// selection changed
		elementViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			@SuppressWarnings("unchecked")
			public void selectionChanged(SelectionChangedEvent event) {
				element = null;

				IStructuredSelection selection = (IStructuredSelection) elementViewer.getSelection();
				if (selection.size() == 1) {
					if (isValid(selection.getFirstElement())) {
						element = (T) selection.getFirstElement();
					}
				}
				checkValidity();
			}
		});
	}

	private void checkValidity() {
		// check button state
		Button okButton = getButton(IDialogConstants.OK_ID);
		if (okButton != null) {
			okButton.setEnabled(element != null);
		}

		// show error message
		String message;
		int type;
		if (element == null) {
			message = getNoElementErrorMessage();
			type = IMessageProvider.ERROR;
		} else {
			message = description;
			type = IMessageProvider.NONE;
		}
		setMessage(message, type);
	}

	protected String getNoElementErrorMessage() {
		return "No valid element selected!";
	}
}

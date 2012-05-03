package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.storydriven.storydiagrams.diagram.custom.Activator;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.ContainmentContentProvider;

public abstract class AbstractTreeSelectionDialog<T extends Object> extends TitleAreaDialog {
	private String shellText;
	private String title;
	private String description;

	private Text filterText;

	private TreeViewer elementViewer;

	private T element;

	private ElementViewerFilter viewerFilter;
	private LoadResourceDialog loadDialog;
	private ResourceSet resourceSet;

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

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
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
		Composite areaComposite = (Composite) super.createDialogArea(parent);

		// main composite
		Composite mainComposite = new Composite(areaComposite, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(mainComposite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(mainComposite);

		// filter field
		filterText = new Text(mainComposite, SWT.LEAD | SWT.BORDER | SWT.SINGLE | SWT.SEARCH | SWT.ICON_SEARCH);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterText);

		// viewer
		elementViewer = new TreeViewer(mainComposite, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(elementViewer.getControl());
		elementViewer.setContentProvider(getContentProvider());
		elementViewer.setLabelProvider(getLabelProvider());
		elementViewer.setComparator(getViewerComparator());

		viewerFilter = new ElementViewerFilter();
		elementViewer.addFilter(viewerFilter);

		ViewerFilter customFilter = getViewerFilter();
		if (customFilter != null) {
			elementViewer.addFilter(customFilter);
		}

		elementViewer.setInput(getInput());

		hookListeners();

		if (element != null) {
			elementViewer.setSelection(new StructuredSelection(element), true);
		}

		checkValidity();

		elementViewer.getControl().setFocus();
		return elementViewer.getControl();
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		if (hasLoadButton()) {
			Composite wrapperComposite = new Composite(parent, SWT.NONE);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(wrapperComposite);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(wrapperComposite);

			Composite loadButtonsComposite = new Composite(wrapperComposite, SWT.NONE);
			GridLayoutFactory.fillDefaults().applyTo(loadButtonsComposite);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, true).applyTo(loadButtonsComposite);

			Button button = new Button(loadButtonsComposite, SWT.PUSH);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).indent(12, 0).applyTo(button);
			button.setText("Load Resource...");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					handleLoadButtonClicked();
				}
			});

			Composite buttonsComposite = new Composite(wrapperComposite, SWT.NONE);
			GridLayoutFactory.fillDefaults().applyTo(buttonsComposite);

			super.createButtonBar(buttonsComposite);

			return wrapperComposite;
		}

		return super.createButtonBar(parent);
	}

	protected boolean hasLoadButton() {
		return false;
	}

	protected ILabelProvider getLabelProvider() {
		return new ComposedAdapterFactoryLabelProvider();
	}

	protected ITreeContentProvider getContentProvider() {
		return new ContainmentContentProvider();
	}

	protected abstract Object getInput();

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);

		shell.setText(shellText);
	}

	protected ViewerComparator getViewerComparator() {
		return new ViewerComparator();
	}

	protected ViewerFilter getViewerFilter() {
		return null;
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

	protected abstract String validate(Object element);

	private void handleLoadButtonClicked() {
		if (loadDialog == null) {
			loadDialog = new LoadResourceDialog();
		}

		// prepare dialog
		loadDialog.setElement(null);
		loadDialog.setResourceSet(resourceSet);

		if (loadDialog.open() == Window.OK) {
			try {
				IRunnableWithProgress op = new IRunnableWithProgress() {
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						String path = loadDialog.getElement().getFullPath().toString();
						URI uri = URI.createPlatformResourceURI(path, true);

						String message = String.format("Loading Resource '%1s'...", path);
						monitor.beginTask(message, IProgressMonitor.UNKNOWN);

						Resource resource = resourceSet.getResource(uri, true);
						try {
							resource.load(getLoadOptions(resource));
						} catch (IOException e) {
							throw new InvocationTargetException(e);
						}
					}
				};
				new ProgressMonitorDialog(getShell()).run(true, true, op);
			} catch (InvocationTargetException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO: handle cancelation
				e.printStackTrace();
			}

			elementViewer.setInput(getInput());
		}
	}

	private static Map<Object, Object> getLoadOptions(Resource resource) {
		Map<Object, Object> options = resource.getResourceSet().getLoadOptions();

		options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		options.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new LinkedHashMap<String, EObject>());

		return options;
	}

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
			public void doubleClick(DoubleClickEvent event) {
				checkValidity();
				if (element != null) {
					okPressed();
				} else {
					IStructuredSelection selection = (IStructuredSelection) elementViewer.getSelection();
					if (selection.size() == 1) {
						Object element = selection.getFirstElement();
						boolean expanded = elementViewer.getExpandedState(element);
						elementViewer.setExpandedState(element, !expanded);
					}
				}
			}
		});

		// selection changed
		elementViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				checkValidity();
			}
		});
	}

	@SuppressWarnings("unchecked")
	private void checkValidity() {
		element = null;

		IStructuredSelection selection = (IStructuredSelection) elementViewer.getSelection();
		if (selection.size() == 1) {
			String message = validate(selection.getFirstElement());
			if (message == null) {
				element = (T) selection.getFirstElement();
			}

			// check button state
			Button okButton = getButton(IDialogConstants.OK_ID);
			if (okButton != null) {
				okButton.setEnabled(element != null);
			}

			// show error message
			int type;
			if (element == null) {
				type = IMessageProvider.ERROR;
			} else {
				message = description;
				type = IMessageProvider.NONE;
			}
			setMessage(message, type);
		}

	}
}

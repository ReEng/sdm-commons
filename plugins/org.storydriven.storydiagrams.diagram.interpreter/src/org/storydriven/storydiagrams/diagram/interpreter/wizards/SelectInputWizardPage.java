package org.storydriven.storydiagrams.diagram.interpreter.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;
import org.storydriven.storydiagrams.diagram.interpreter.ParameterBindingEditingSupport;
import org.storydriven.storydiagrams.diagram.interpreter.dialogs.SelectWorkspaceResourceDialog;
import org.storydriven.storydiagrams.diagram.interpreter.util.Texts;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class SelectInputWizardPage extends WizardPage {
	private ParameterBindingEditingSupport editingSupport;
	private SelectWorkspaceResourceDialog hostDialog;
	private Button hostPathButton;
	private Text hostPathText;

	private TableViewer parametersTable;

	private String path;

	protected SelectInputWizardPage() {
		super(SelectInputWizardPage.class.getName());

		hostDialog = new SelectWorkspaceResourceDialog();

		// meta data
		setDescription("Configure input and output parameters.");
		setTitle("Configure Input");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);

		// load host graph
		Composite hostComposite = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(hostComposite);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(hostComposite);

		Label hostPathLabel = new Label(hostComposite, SWT.TRAIL);
		hostPathLabel.setText("Host Graph:");
		GridDataFactory.fillDefaults().align(SWT.TRAIL, SWT.CENTER).applyTo(hostPathLabel);

		hostPathText = new Text(hostComposite, SWT.LEAD | SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(hostPathText);

		hostPathButton = new Button(hostComposite, SWT.PUSH);
		hostPathButton.setText("Select");
		GridDataFactory.fillDefaults().applyTo(hostPathButton);

		// input parameters
		Group inParameterGroup = new Group(composite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(inParameterGroup);
		inParameterGroup.setLayout(new GridLayout(2, false));
		inParameterGroup.setText("Input Parameters");

		// table
		parametersTable = new TableViewer(inParameterGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(parametersTable.getControl());
		parametersTable.getTable().setHeaderVisible(true);
		parametersTable.getTable().setLinesVisible(true);
		parametersTable.setContentProvider(new ArrayContentProvider());

		TableViewerColumn nameColumn = new TableViewerColumn(parametersTable, SWT.LEAD);
		nameColumn.getColumn().setWidth(200);
		nameColumn.getColumn().setText("Parameter");
		nameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				return DiagramImages.getImage(DiagramImages.EPARAMETER_IN);
			}

			@Override
			public String getText(Object element) {
				return Texts.get(element);
			}
		});

		TableViewerColumn valueColumn = new TableViewerColumn(parametersTable, SWT.LEAD);
		valueColumn.getColumn().setWidth(200);
		valueColumn.getColumn().setText("Value");
		valueColumn.setLabelProvider(new ColumnLabelProvider() {
			private ComposedAdapterFactoryLabelProvider aflp = new ComposedAdapterFactoryLabelProvider();

			@Override
			public void dispose() {
				aflp.dispose();
				super.dispose();
			}

			@Override
			public Image getImage(Object element) {
				return aflp.getImage(getBinding(element));
			}

			@Override
			public String getText(Object element) {
				return aflp.getText(getBinding(element));
			}
		});

		editingSupport = new ParameterBindingEditingSupport(parametersTable, getWizard().getBindings());
		valueColumn.setEditingSupport(editingSupport);

		// control buttons
		Composite inParameterControlComposite = new Composite(inParameterGroup, SWT.NONE);
		GridDataFactory.fillDefaults().applyTo(inParameterControlComposite);
		GridLayoutFactory.fillDefaults().applyTo(inParameterControlComposite);

		Button button = new Button(inParameterControlComposite, SWT.PUSH);
		button.setText("open");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EParameter element = (EParameter) ((IStructuredSelection) parametersTable.getSelection())
						.getFirstElement();
				parametersTable.editElement(element, 1);
			}
		});

		parametersTable.setInput(getWizard().getBindings().keySet());

		hookListeners();

		setControl(composite);

		setPageComplete(isValid());
	}

	private boolean isValid() {
		// check if resource path exists
		if (path != null) {
			IResource member = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			if (!(member instanceof IFile)) {
				setErrorMessage("The selected resource does not exist.");
				return false;
			}
		} else {
			return false;
		}

		// check if resource is loaded
		if (getWizard().getResource() == null) {
			setErrorMessage("You have to select a host graph resource.");
			return false;
		}

		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	public List<Variable<EClassifier>> getParameters() {
		List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();
		for (EParameter parameter : getWizard().getParameters()) {
			String name = parameter.getName();
			EClassifier classifier = parameter.getEType();
			Object value = getBinding(parameter);
			parameters.add(new Variable<EClassifier>(name, classifier, value));
		}

		return parameters;
	}

	protected Object getBinding(Object element) {
		return getWizard().getBindings().get(element);
	}

	private ResourceSet getResourceSet() {
		return getWizard().getResourceSet();
	}

	@Override
	public InterpreteActivityWizard getWizard() {
		return (InterpreteActivityWizard) super.getWizard();
	}

	private void hookListeners() {
		// load resource on text change
		hostPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				getWizard().setResource(null);
				path = hostPathText.getText();

				// check if the path exists
				IResource member = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
				if (member instanceof IFile) {
					try {
						getContainer().run(true, false, new IRunnableWithProgress() {
							@Override
							public void run(IProgressMonitor monitor) throws InvocationTargetException,
									InterruptedException {
								URI uri = URI.createPlatformResourceURI(path, true);
								String message = String.format("Loading Resource '%1s'...", uri.toPlatformString(true));
								monitor.beginTask(message, IProgressMonitor.UNKNOWN);
								try {
									getWizard().setResource(getResourceSet().getResource(uri, true));
								} catch (Exception e) {
									throw new InvocationTargetException(e);
								}
							}
						});
					} catch (RuntimeException ex) {
						// TODO: handle exception
						ex.printStackTrace();
					} catch (InvocationTargetException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					} catch (InterruptedException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}

				editingSupport.setResource(getWizard().getResource());
				setPageComplete(isValid());
			}
		});

		// open dialog on button click
		hostPathButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (hostDialog.open() == Window.OK) {
					IFile file = hostDialog.getElement();
					hostPathText.setText(file.getFullPath().toString());
				}
			}
		});
	}

	@Override
	public InterpreteWizardPage getNextPage() {
		return (InterpreteWizardPage) super.getNextPage();
	}
}

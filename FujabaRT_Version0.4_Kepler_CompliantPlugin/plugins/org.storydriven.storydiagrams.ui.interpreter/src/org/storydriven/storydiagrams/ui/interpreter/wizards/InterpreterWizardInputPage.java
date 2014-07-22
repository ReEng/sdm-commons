package org.storydriven.storydiagrams.ui.interpreter.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.ui.interpreter.Activator;
import org.storydriven.storydiagrams.ui.interpreter.ParameterBindingEditingSupport;
import org.storydriven.storydiagrams.ui.interpreter.ResourcesContentProvider;
import org.storydriven.storydiagrams.ui.interpreter.dialogs.EPackageRegistryDialog;
import org.storydriven.storydiagrams.ui.interpreter.dialogs.SelectWorkspaceResourceDialog;
import org.storydriven.storydiagrams.ui.interpreter.util.EPackageUtil;
import org.storydriven.storydiagrams.ui.interpreter.util.TextUtil;

import de.upb.swt.core.ui.CoreImages;

public class InterpreterWizardInputPage extends WizardPage implements IEPackageController {
	// needed constructs
	private ResourceSet resourceSet;
	private AdapterFactory adapterFactory;

	// configuration data
	private String filePath;
	private final List<Activity> activities;

	private Collection<EPackage> allEPackages;
	private final Collection<Object> resources;

	private final Map<EParameter, Object> parameters;

	// user interface
	private SelectWorkspaceResourceDialog workspaceResourceDialog;
	private EPackageRegistryDialog packageRegistryDialog;

	private Text activityFileText;
	private Combo activityCombo;

	private TreeViewer resourcesTreeViewer;
	private Button resourcesAddResourceButton;
	private Button resourcesAddPackageButton;
	private Button resourcesRemoveButton;

	private TableViewer parametersTableViewer;
	private Button parameterResetButton;

	protected InterpreterWizardInputPage(IFile file) {
		super(InterpreterWizardInputPage.class.getCanonicalName());

		filePath = file.getFullPath().toString();

		activities = new ArrayList<Activity>();
		parameters = new LinkedHashMap<EParameter, Object>();
		resources = new LinkedHashSet<Object>();

		adapterFactory = new ComposedAdapterFactory(Registry.INSTANCE);

		workspaceResourceDialog = new SelectWorkspaceResourceDialog();

		resourceSet = new ResourceSetImpl();

		setTitle("Configure Activity Interpretation");
		setDescription("Configure the input for the interpreter.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));

		createActivityControls(container);

		SashForm configurationSashForm = new SashForm(container, SWT.VERTICAL);
		configurationSashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		createResourcesControls(configurationSashForm);
		createParameterControls(configurationSashForm);

		configurationSashForm.setWeights(new int[] { 1, 1 });

		initializeValues();

		setControl(container);
	}

	private void createActivityControls(Composite parent) {
		Group activityGroup = new Group(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(activityGroup);
		activityGroup.setText("Activity");
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2).applyTo(activityGroup);

		// file
		Label activityFileLabel = new Label(activityGroup, SWT.NONE);
		GridDataFactory.fillDefaults().align(SWT.TRAIL, SWT.CENTER).applyTo(activityFileLabel);
		activityFileLabel.setText("File:");

		Composite activityFileComposite = new Composite(activityGroup, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(activityFileComposite);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(activityFileComposite);

		activityFileText = new Text(activityFileComposite, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(activityFileText);
		activityFileText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				handleActivityFileModified();
			}
		});

		Button activityFileButton = new Button(activityFileComposite, SWT.NONE);
		GridDataFactory.fillDefaults().applyTo(activityFileButton);
		activityFileButton.setText("Select...");
		activityFileButton.setImage(CoreImages.get(CoreImages.FIND));
		activityFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleOpenActivityFileDialog();
			}
		});

		// activity
		Label activityLabel = new Label(activityGroup, SWT.NONE);
		GridDataFactory.fillDefaults().align(SWT.TRAIL, SWT.CENTER).applyTo(activityLabel);
		activityLabel.setText("Activity:");

		activityCombo = new Combo(activityGroup, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(activityCombo);
		activityCombo.setEnabled(false);
		activityCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleActivitySelected();
			}
		});
	}

	private void createResourcesControls(Composite parent) {
		Group resourcesGroup = new Group(parent, SWT.NONE);
		resourcesGroup.setText("Resources");
		resourcesGroup.setLayout(new GridLayout(2, false));

		resourcesTreeViewer = new TreeViewer(resourcesGroup, SWT.BORDER | SWT.MULTI);
		resourcesTreeViewer.setContentProvider(new ResourcesContentProvider(adapterFactory));
		resourcesTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory) {
			@Override
			public String getText(Object object) {
				// show namespace URI for packages
				if (object instanceof EPackage) {
					return ((EPackage) object).getNsURI();
				}

				// show path for workspace resources
				if (object instanceof Resource) {
					URI uri = ((Resource) object).getURI();
					if (uri.isPlatformResource()) {
						return uri.toPlatformString(true);
					}
				}
				return super.getText(object);
			}
		});
		resourcesTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) resourcesTreeViewer.getSelection();

				// check if empty
				if (selection.isEmpty()) {
					resourcesRemoveButton.setEnabled(false);
					return;
				}

				// check if selected is a resource
				for (Object selected : selection.toArray()) {
					if (!resources.contains(selected)) {
						resourcesRemoveButton.setEnabled(false);
						return;
					}
				}

				// enable it otherwise
				resourcesRemoveButton.setEnabled(true);
			}
		});

		Tree resourcesTree = resourcesTreeViewer.getTree();
		resourcesTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Composite resourcesControlComposite = new Composite(resourcesGroup, SWT.NONE);
		resourcesControlComposite.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		resourcesControlComposite.setLayout(new GridLayout(1, false));

		resourcesAddResourceButton = new Button(resourcesControlComposite, SWT.NONE);
		resourcesAddResourceButton.setImage(Activator.get().getImage(Activator.IMAGE_RESOURCE_WORKSPACE));
		resourcesAddResourceButton.setToolTipText("Add Workspace Resource");
		resourcesAddResourceButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		resourcesAddResourceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleOpenAddResourceDialog();
			}
		});

		resourcesAddPackageButton = new Button(resourcesControlComposite, SWT.NONE);
		resourcesAddPackageButton.setImage(Activator.get().getImage(Activator.IMAGE_EPACKAGE));
		resourcesAddPackageButton.setToolTipText("Add Registered EPackage");
		resourcesAddPackageButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleOpenAddPackageDialog();
			}
		});

		resourcesRemoveButton = new Button(resourcesControlComposite, SWT.NONE);
		resourcesRemoveButton.setEnabled(false);
		resourcesRemoveButton.setImage(CoreImages.get(CoreImages.REMOVE));
		resourcesRemoveButton.setToolTipText("Remove Selected Resource");
		resourcesRemoveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleRemoveResource();
			}
		});
	}

	private void createParameterControls(Composite parent) {
		Group parametersGroup = new Group(parent, SWT.NONE);
		parametersGroup.setText("Parameters");
		parametersGroup.setLayout(new GridLayout(2, false));

		parametersTableViewer = new TableViewer(parametersGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		parametersTableViewer.setContentProvider(new ArrayContentProvider());
		parametersTableViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		parametersTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) parametersTableViewer.getSelection();

				// enable reset if at least one has a value
				for (Object selected : selection.toArray()) {
					if (parameters.get(selected) != null) {
						parameterResetButton.setEnabled(true);
						return;
					}
				}

				// disable reset when empty
				parameterResetButton.setEnabled(selection.isEmpty());
			}
		});

		Table parametersTable = parametersTableViewer.getTable();
		parametersTable.setEnabled(false);
		parametersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		parametersTable.setLinesVisible(true);
		parametersTable.setHeaderVisible(true);

		// parameter column
		TableViewerColumn parametersTableViewerParameterColumn = new TableViewerColumn(parametersTableViewer, SWT.NONE);
		parametersTableViewerParameterColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof EParameter) {
					return TextUtil.getText((EParameter) element);
				}

				return super.getText(element);
			}

			@Override
			public Image getImage(Object element) {
				return ((ILabelProvider) parametersTableViewer.getLabelProvider()).getImage(element);
			}
		});
		TableColumn parametersTableParameterColumn = parametersTableViewerParameterColumn.getColumn();
		parametersTableParameterColumn.setWidth(200);
		parametersTableParameterColumn.setText("Parameter");

		// value
		TableViewerColumn parametersTableViewerValueColumn = new TableViewerColumn(parametersTableViewer, SWT.NONE);
		parametersTableViewerValueColumn.setEditingSupport(new ParameterBindingEditingSupport(this,
				parametersTableViewer));
		parametersTableViewerValueColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((ILabelProvider) parametersTableViewer.getLabelProvider()).getText(parameters.get(element));
			}

			@Override
			public Image getImage(Object element) {
				return ((ILabelProvider) parametersTableViewer.getLabelProvider()).getImage(parameters.get(element));
			}
		});
		TableColumn parametersTableValueColumn = parametersTableViewerValueColumn.getColumn();
		parametersTableValueColumn.setWidth(150);
		parametersTableValueColumn.setText("Value");

		// controls
		Composite parametersControlComposite = new Composite(parametersGroup, SWT.NONE);
		parametersControlComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		parametersControlComposite.setLayout(new GridLayout(1, false));

		parameterResetButton = new Button(parametersControlComposite, SWT.NONE);
		parameterResetButton.setEnabled(false);
		parameterResetButton.setImage(CoreImages.get(CoreImages.REMOVE));
		parameterResetButton.setToolTipText("Reset Selected Parameter");
		parameterResetButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		parameterResetButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleResetParameter();
			}
		});
	}

	private void initializeValues() {
		activityFileText.setText(filePath);
		resourcesTreeViewer.setInput(resources);
		parametersTableViewer.setInput(parameters.keySet());
	}

	@Override
	public void dispose() {
		((IDisposable) adapterFactory).dispose();

		super.dispose();
	}

	@Override
	public Collection<EPackage> getAllEPackages() {
		return allEPackages;
	}

	@Override
	public Collection<Object> getAddedResources() {
		return resources;
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	@Override
	public Map<EParameter, Object> getBindings() {
		return parameters;
	}

	protected void handleActivityFileModified() {
		String newPath = activityFileText.getText().trim();
		if (!newPath.equals(filePath)) {
			// controls state
			boolean enabled = false;

			// store new path
			filePath = newPath;

			// clear activities
			activities.clear();

			// check if file exists
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(newPath);
			if (resource instanceof IFile && resource.exists()) {
				final URI uri = URI.createPlatformResourceURI(newPath, true);

				// load resource and resolve activities
				IRunnableWithProgress runnable = new IRunnableWithProgress() {
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						// load resource
						Resource resource = resourceSet.getResource(uri, true);

						// collect activities
						TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
						while (it.hasNext()) {
							Object object = (Object) it.next();
							if (object instanceof Activity) {
								activities.add((Activity) object);
								it.prune();
							}
						}
					}
				};

				try {
					getContainer().run(true, false, runnable);
				} catch (InvocationTargetException e) {
					// will be shown due to validate()
				} catch (InterruptedException e) {
					// will be shown due to validate()
				}

				// check if activities exist
				if (activities.isEmpty()) {
					activityCombo.setItems(new String[] {});
				} else {
					enabled = true;

					// fill combo
					String[] items = new String[activities.size()];
					int i = 0;
					for (Activity activity : activities) {
						items[i] = TextUtil.getText(activity);
						i++;
					}

					activityCombo.setItems(items);

					// TODO: load last selected activity from settings
					int index = 0;
					activityCombo.select(index);
				}
			} else {
				// clear combo, will be shown due to validate()
				activityCombo.setItems(new String[] {});
			}

			// toggle controls
			activityCombo.setEnabled(enabled);
			parametersTableViewer.getControl().setEnabled(enabled);
			parameterResetButton.setEnabled(false);

			// handle combo modification
			handleActivitySelected();
		}

		validate();
	}

	protected void handleActivitySelected() {
		InterpreterConfiguration configuration = getWizard().getConfiguration();

		Activity activity = null;

		// check if changed
		if (!activities.isEmpty()) {
			activity = activities.get(activityCombo.getSelectionIndex());
			URI newUri = EcoreUtil.getURI(activity);

			if (!newUri.equals(configuration.getActivityUri())) {
				configuration.setActivityUri(newUri);

				// set up parameters
				parameters.clear();

				for (EParameter parameter : activity.getInParameters()) {
					// TODO: get from settings
					parameters.put(parameter, null);
				}

				parametersTableViewer.refresh();
			}
		}

		if (activity == null) {
			configuration.setActivityUri(null);
			parameters.clear();
			parametersTableViewer.refresh();
		}

		validate();
	}

	private void validate() {
		// check if file is valid
		IResource file = ResourcesPlugin.getWorkspace().getRoot().findMember(filePath);
		if (!(file instanceof IFile)) {
			setErrorMessage("Select the file containing the activity that should be interpreted.");
			setPageComplete(false);
			return;
		}

		// check if there are activities inside the file
		if (activityCombo.getItemCount() < 1) {
			setErrorMessage("Select the file containing the activity that should be interpreted.");
			setPageComplete(false);
			return;
		}

		InterpreterConfiguration configuration = getWizard().getConfiguration();

		// check if activity is valid
		if (configuration.getActivityUri() == null) {
			setErrorMessage("Select the activity that should be interpreted.");
			setPageComplete(false);
			return;
		}

		setErrorMessage(null);
		setPageComplete(true);
	}

	protected void handleRemoveResource() {
		IStructuredSelection selection = (IStructuredSelection) resourcesTreeViewer.getSelection();
		InterpreterConfiguration configuration = getWizard().getConfiguration();
		for (Object selected : selection.toArray()) {
			URI uri = null;
			if (selected instanceof Resource) {
				uri = ((Resource) selected).getURI();
			} else if (selected instanceof EPackage) {
				uri = ((EPackage) selected).eResource().getURI();
			}

			if (uri != null) {
				configuration.getResourceUris().remove(uri);
			}
		}

		resourcesTreeViewer.refresh();
	}

	protected void handleOpenAddPackageDialog() {
		// lazy load registry
		if (packageRegistryDialog == null) {
			IRunnableWithProgress runnable = new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					allEPackages = EPackageUtil.getEPackages();
				}
			};

			// run it asynchrony
			try {
				getContainer().run(true, false, runnable);
			} catch (InvocationTargetException e) {
				// will be shown due to validate()
			} catch (InterruptedException e) {
				// will be shown due to validate()
			}

			// create the dialog
			packageRegistryDialog = new EPackageRegistryDialog(this);
		}

		if (packageRegistryDialog.open() == Window.OK) {
			List<URI> resourceUris = getWizard().getConfiguration().getResourceUris();
			for (EPackage ePackage : packageRegistryDialog.getElements()) {
				resources.add(ePackage);
				resourceUris.add(ePackage.eResource().getURI());
			}

			resourcesTreeViewer.refresh();
		}
	}

	@Override
	public InterpreteActivityWizard getWizard() {
		return (InterpreteActivityWizard) super.getWizard();
	}

	protected void handleResetParameter() {
		IStructuredSelection selection = (IStructuredSelection) parametersTableViewer.getSelection();
		EParameter parameter = (EParameter) selection.getFirstElement();
		parameters.put(parameter, null);

		parametersTableViewer.refresh();
	}

	protected void handleOpenAddResourceDialog() {
		if (workspaceResourceDialog.open() == Window.OK) {
			// prepare resource loading
			IRunnableWithProgress runnable = new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					List<URI> resourceUris = getWizard().getConfiguration().getResourceUris();
					for (IFile file : workspaceResourceDialog.getElements()) {
						URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
						Resource resource = resourceSet.getResource(uri, true);

						if (!resources.contains(resource)) {
							resourceUris.add(resource.getURI());
							resources.add(resource);
						}
					}
				}
			};

			// store size before
			int sizeBefore = resources.size();

			// execute the runnable
			try {
				getContainer().run(true, true, runnable);
			} catch (InvocationTargetException e) {
				// will be shown due to validate()
			} catch (InterruptedException e) {
				// will be shown due to validate()
			}

			// check if resource was added
			if (resources.size() > sizeBefore) {
				resourcesTreeViewer.refresh();
			}
		}
	}

	protected void handleOpenActivityFileDialog() {
		if (workspaceResourceDialog.open() == Window.OK) {
			IFile file = workspaceResourceDialog.getElement();
			activityFileText.setText(file.getFullPath().toString());
		}
	}
}

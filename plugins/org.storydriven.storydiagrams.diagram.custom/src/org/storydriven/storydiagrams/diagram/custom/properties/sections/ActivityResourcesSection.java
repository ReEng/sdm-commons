package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectEPackageFromRegistryDialog;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectEPackageFromWorkspaceDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesContentProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesLabelProvider;

public class ActivityResourcesSection extends AbstractSection {
	private TreeViewer viewer;
	private Composite resourcesComposite;
	private Button addNamespaceButton;
	private Button addWorkspaceButton;
	private Button removeEPackageButton;

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void refresh() {
		viewer.refresh();
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		resourcesComposite.setLayoutData(data);
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		resourcesComposite = factory.createFlatFormComposite(parent);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(resourcesComposite);

		// create group
		Group resourcesGroup = factory.createGroup(resourcesComposite, "Resources");
		GridLayoutFactory.fillDefaults().numColumns(2).margins(6, 6).applyTo(resourcesGroup);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(resourcesGroup);

		// configure resources viewer
		Tree tree = factory.createTree(resourcesGroup, SWT.BORDER | SWT.MULTI);
		viewer = new TreeViewer(tree);
		viewer.setContentProvider(new ResourcesContentProvider());
		viewer.setLabelProvider(new ResourcesLabelProvider());
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object element = ((IStructuredSelection) event.getSelection()).getFirstElement();
				boolean expanded = viewer.getExpandedState(element);
				viewer.setExpandedState(element, !expanded);
			}
		});
		viewer.setComparator(new ViewerComparator() {
			@Override
			public int category(Object element) {
				if (element instanceof EPackage) {
					return -3;
				}
				if (element instanceof EDataType) {
					return -2;
				}
				if (element instanceof EClass) {
					return -1;
				}
				return super.category(element);
			}
		});
		viewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof Resource || element instanceof Activity || element instanceof EPackage
						|| element instanceof EClass || element instanceof EDataType) {
					return true;
				}

				for (Object child : ((ITreeContentProvider) ((TreeViewer) viewer).getContentProvider())
						.getChildren(element)) {
					if (!select(viewer, element, child)) {
						return false;
					}
				}
				return false;
			}
		});
		GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getTree());

		// configure buttons
		Composite controlsComposite = factory.createFlatFormComposite(resourcesGroup);
		GridLayoutFactory.fillDefaults().applyTo(controlsComposite);
		GridDataFactory.fillDefaults().applyTo(controlsComposite);

		addNamespaceButton = factory.createButton(controlsComposite, "URI", SWT.PUSH);
		GridDataFactory.fillDefaults().applyTo(addNamespaceButton);
		addNamespaceButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));

		addWorkspaceButton = factory.createButton(controlsComposite, "Resource", SWT.PUSH);
		GridDataFactory.fillDefaults().applyTo(addWorkspaceButton);
		addWorkspaceButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));

		removeEPackageButton = factory.createButton(controlsComposite, "Remove", SWT.PUSH);
		GridDataFactory.fillDefaults().applyTo(removeEPackageButton);
		removeEPackageButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_REMOVE));
	}

	@Override
	protected void hookWidgetListeners() {
		addNamespaceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SelectEPackageFromRegistryDialog dialog = new SelectEPackageFromRegistryDialog(getShell());
				dialog.setFilteredEPackages(getResourceManager().getAllEPackages());
				if (dialog.open() == Window.OK) {
					final Collection<String> uris = dialog.getUris();
					if (!uris.isEmpty()) {
						final Command command = new RecordingCommand(getEditingDomain()) {
							@Override
							protected void doExecute() {
								for (String uri : uris) {
									EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(uri);
									if (ePackage != null) {
										Activity activity = (Activity) getElement();
										EAnnotation annotation = activity.getAnnotation(ResourceManager.SOURCE_TYPES);
										if (annotation == null) {
											annotation = EcoreFactory.eINSTANCE.createEAnnotation();
											annotation.setSource(ResourceManager.SOURCE_TYPES);
											activity.getAnnotations().add(annotation);
										}
										annotation.getDetails().put(uri, String.valueOf(true));
									}
								}
							}
						};
						execute(command);
						viewer.refresh();
					}
				}
			}
		});
		addWorkspaceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SelectEPackageFromWorkspaceDialog dialog = new SelectEPackageFromWorkspaceDialog(getShell(), getEditingDomain()
						.getResourceSet());
				if (dialog.open() == Window.OK) {
					final Collection<EPackage> ePackages = dialog.getEPackages();
					if (!ePackages.isEmpty()) {
						final Command command = new RecordingCommand(getEditingDomain()) {
							@Override
							protected void doExecute() {
								for (EPackage ePackage : ePackages) {
									if (ePackage != null) {
										Activity activity = (Activity) getElement();
										EAnnotation annotation = activity.getAnnotation(ResourceManager.SOURCE_TYPES);
										annotation.getReferences().add(ePackage);
									}
								}
							}
						};
						execute(command);
						viewer.refresh();
					}
				}
			}
		});

		removeEPackageButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				final Command command = new RecordingCommand(getEditingDomain()) {
					@Override
					protected void doExecute() {
						for (Object element : selection.toArray()) {
							if (element instanceof EPackage) {
								EPackage ePackage = (EPackage) element;
								Activity activity = (Activity) getElement();
								EAnnotation annotation = activity.getAnnotation(ResourceManager.SOURCE_TYPES);
								annotation.getReferences().remove(ePackage);
								annotation.getDetails().remove(ePackage.getNsURI());
							}
						}
					}
				};
				execute(command);
				viewer.refresh();
			}
		});

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				boolean removeState = true;
				for (Object element : selection.toArray()) {
					if (element instanceof EPackage && isReferenced((EPackage) element)) {
						removeState = false;
						break;
					}
				}
				removeEPackageButton.setEnabled(removeState);
			}
		});
	}

	protected ResourceManager getResourceManager() {
		return ResourceManager.get((Activity) getElement());
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		viewer.setInput(getElement());
	}

	protected boolean isReferenced(EPackage ePackage) {
		// go down the containment hierarchy
		TreeIterator<EObject> it = EcoreUtil.getAllContents(getElement(), true);
		while (it.hasNext()) {
			// check element
			EObject element = it.next();
			if (ResourceManager.isReferencing(element, ePackage)) {
				return true;
			}
		}
		return false;
	}

	protected Shell getShell() {
		return PlatformUI.getWorkbench().getDisplay().getActiveShell();
	}
}

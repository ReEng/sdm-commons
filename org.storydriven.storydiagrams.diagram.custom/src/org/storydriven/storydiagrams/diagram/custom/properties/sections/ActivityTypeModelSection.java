package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
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
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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

public class ActivityTypeModelSection extends AbstractSection {
	private SelectEPackageFromWorkspaceDialog addWorkspaceDialog;

	private TreeViewer viewer;
	private Composite resourcesComposite;
	private Button addNamespaceButton;
	private Button addWorkspaceButton;
	private Button removeEPackageButton;

	private SelectEPackageFromRegistryDialog addRegisteredDialog;

	public ActivityTypeModelSection() {
		addWorkspaceDialog = new SelectEPackageFromWorkspaceDialog();
		addRegisteredDialog = new SelectEPackageFromRegistryDialog();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		viewer.setInput(getElement());
	}

	protected ResourceManager getResourceManager() {
		return ResourceManager.get(getElement());
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

	private void removeSelected() {
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
		ResourceManager.get(getElement()).recollect();
		viewer.refresh();
	}

	@Override
	protected Activity getElement() {
		return (Activity) super.getElement();
	}

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
		Group resourcesGroup = factory.createGroup(resourcesComposite, "Packages building the Type Model");
		GridLayoutFactory.fillDefaults().numColumns(2).margins(6, 6).applyTo(resourcesGroup);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(resourcesGroup);

		// configure resources viewer
		Tree tree = factory.createTree(resourcesGroup, SWT.BORDER | SWT.MULTI);
		viewer = new TreeViewer(tree);
		viewer.setContentProvider(new ResourcesContentProvider());
		viewer.setLabelProvider(new ResourcesLabelProvider());

		// expand/collapse element
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object element = ((IStructuredSelection) event.getSelection()).getFirstElement();
				boolean expanded = viewer.getExpandedState(element);
				viewer.setExpandedState(element, !expanded);
			}
		});

		// sort elements by name
		viewer.setComparator(new ViewerComparator());

		// filter recursively: Resource + EPackage + EClassifier
		viewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof Resource || element instanceof EPackage || element instanceof EClassifier) {
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
				addRegisteredDialog.reset();
				addRegisteredDialog.setHiddenElements(getResourceManager().getAllEPackages());

				if (addRegisteredDialog.open() == Window.OK) {
					final Collection<EPackage> ePackages = addRegisteredDialog.getElements();

					if (ePackages != null && !ePackages.isEmpty()) {
						final Command command = new RecordingCommand(getEditingDomain()) {
							@Override
							protected void doExecute() {
								Activity activity = (Activity) getElement();
								EAnnotation annotation = activity.getAnnotation(ResourceManager.SOURCE_TYPES);
								if (annotation == null) {
									annotation = EcoreFactory.eINSTANCE.createEAnnotation();
									annotation.setSource(ResourceManager.SOURCE_TYPES);
									activity.getAnnotations().add(annotation);
								}

								for (EPackage ePackage : ePackages) {
									annotation.getDetails().put(ePackage.getNsURI(), String.valueOf(true));
								}
							}
						};
						execute(command);
						ResourceManager.get(getElement()).recollect();
						viewer.refresh();
					}
				}
			}
		});

		addWorkspaceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addWorkspaceDialog.reset();
				if (addWorkspaceDialog.open() == Window.OK) {
					Collection<IFile> files = addWorkspaceDialog.getElements();
					if (files != null && !files.isEmpty()) {
						final Collection<EPackage> ePackages = new HashSet<EPackage>();

						for (IFile file : files) {
							URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
							Resource resource = getEditingDomain().getResourceSet().getResource(uri, true);
							if (resource != null) {
								TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
								while (it.hasNext()) {
									Object object = it.next();
									if (object instanceof EPackage) {
										ePackages.add((EPackage) object);
									}
								}
							}
						}

						if (!ePackages.isEmpty()) {
							final Command command = new RecordingCommand(getEditingDomain()) {
								@Override
								protected void doExecute() {
									for (EPackage ePackage : ePackages) {
										if (ePackage != null) {
											Activity activity = getElement();
											EAnnotation annotation = activity
													.getAnnotation(ResourceManager.SOURCE_TYPES);
											if (annotation == null) {
												annotation = EcoreFactory.eINSTANCE.createEAnnotation();
												annotation.setSource(ResourceManager.SOURCE_TYPES);
												activity.getAnnotations().add(annotation);
											}
											annotation.getReferences().add(ePackage);
										}
									}
								}
							};
							execute(command);
							ResourceManager.get(getElement()).recollect();
							viewer.refresh();
						}
					}
				}
			}
		});

		removeEPackageButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelected();
			}
		});

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				boolean removeState = true;
				for (Object element : selection.toArray()) {
					if (element instanceof EPackage) {
						if (isReferenced((EPackage) element)) {
							removeState = false;
							break;
						}
					} else {
						removeState = false;
						break;
					}
				}
				removeEPackageButton.setEnabled(removeState);
			}
		});

		viewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.DEL && removeEPackageButton.isEnabled()) {
					removeSelected();
				}
			}
		});
	}

	protected Shell getShell() {
		return PlatformUI.getWorkbench().getDisplay().getActiveShell();
	}
}

package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.dialogs.ConfigureEParameterDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;
import org.storydriven.storydiagrams.diagram.custom.providers.EParametersLabelProvider;

public class ActivityParametersSection extends AbstractSection {
	private ConfigureEParameterDialog configureDialog;

	private TableViewer inParametersViewer;
	private Button inAddButton;
	private Button inRemoveButton;
	private Button inConfigureButton;
	private Button inUpButton;
	private Button inDownButton;

	private TableViewer outParametersViewer;
	private Button outAddButton;
	private Button outRemoveButton;
	private Button outConfigureButton;
	private Button outUpButton;
	private Button outDownButton;

	public ActivityParametersSection() {
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		configureDialog = new ConfigureEParameterDialog(shell);
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected void hookWidgetListeners() {
		hookInListeners();
		hookOutListeners();
	}

	private void hookInListeners() {
		// refresh button states
		inParametersViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				checkButtonStates();
			}
		});

		// configure on double click
		inParametersViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent e) {
				configure(false, false, getEParameter(inParametersViewer.getSelection()));
			}
		});

		// add parameter
		inAddButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				configure(true, false, EcoreFactory.eINSTANCE.createEParameter());
			}
		});

		// remove parameter
		inRemoveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) inParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					remove(selection, false);
				}
			}
		});

		// configure parameter
		inConfigureButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				configure(false, false, getEParameter(inParametersViewer.getSelection()));
			}
		});

		// move parameter up
		inUpButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) inParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, false, false);
				}
			}
		});

		// move parameter down
		inDownButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) inParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, false, true);
				}
			}
		});
	}

	private void hookOutListeners() {
		// refresh button states
		outParametersViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				checkButtonStates();
			}
		});

		// configure on double click
		outParametersViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent e) {
				configure(false, true, getEParameter(outParametersViewer.getSelection()));
			}
		});

		// add parameter
		outAddButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				configure(true, true, EcoreFactory.eINSTANCE.createEParameter());
			}
		});

		// remove parameter
		outRemoveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) outParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					remove(selection, true);
				}
			}
		});

		// configure parameter
		outConfigureButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				configure(false, true, getEParameter(outParametersViewer.getSelection()));
			}
		});

		// move parameter up
		outUpButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) outParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, true, false);
				}
			}
		});

		// move parameter down
		outDownButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) outParametersViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, true, true);
				}
			}
		});
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		// input group
		Group inParametersGroup = factory.createGroup(parent, "In Parameters");
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2).applyTo(inParametersGroup);

		// add, remove, configure controls
		Composite inControlsComposite = factory.createFlatFormComposite(inParametersGroup);
		GridLayoutFactory.fillDefaults().spacing(0, 0).margins(0, 0).numColumns(3).applyTo(inControlsComposite);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.TRAIL, SWT.FILL).applyTo(inControlsComposite);

		factory.createFlatFormComposite(inParametersGroup);

		inAddButton = factory.createButton(inControlsComposite, EMPTY, SWT.PUSH);
		inAddButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));
		inAddButton.setToolTipText("Add In Parameter");

		inRemoveButton = factory.createButton(inControlsComposite, EMPTY, SWT.PUSH);
		inRemoveButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_REMOVE));
		inRemoveButton.setToolTipText("Remove Selected In Parameters");
		inRemoveButton.setEnabled(false);

		inConfigureButton = factory.createButton(inControlsComposite, EMPTY, SWT.PUSH);
		inConfigureButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_CONFIGURE));
		inConfigureButton.setToolTipText("Configure Selected In Parameter");
		inConfigureButton.setEnabled(false);

		// input table
		Table inParametersTable = factory.createTable(inParametersGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		inParametersTable.setLinesVisible(true);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(inParametersTable);

		inParametersViewer = new TableViewer(inParametersTable);
		inParametersViewer.setContentProvider(new ArrayContentProvider());
		inParametersViewer.setLabelProvider(new EParametersLabelProvider());

		// up, down controls
		Composite inUpDownControlsComposite = factory.createFlatFormComposite(inParametersGroup);
		GridLayoutFactory.fillDefaults().spacing(0, 6).margins(0, 0).applyTo(inUpDownControlsComposite);

		inUpButton = factory.createButton(inUpDownControlsComposite, EMPTY, SWT.PUSH);
		inUpButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_UP));
		inUpButton.setToolTipText("Move Parameter Up");
		inUpButton.setEnabled(false);

		inDownButton = factory.createButton(inUpDownControlsComposite, "", SWT.PUSH);
		inDownButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_DOWN));
		inDownButton.setToolTipText("Move Parameter Down");
		inDownButton.setEnabled(false);

		// output group
		Group outParametersGroup = factory.createGroup(parent, "Out Parameters");
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2).applyTo(outParametersGroup);

		// add, remove, configure controls
		Composite outControlsComposite = factory.createFlatFormComposite(outParametersGroup);
		GridLayoutFactory.fillDefaults().spacing(0, 0).margins(0, 0).numColumns(4).applyTo(outControlsComposite);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.TRAIL, SWT.FILL).applyTo(outControlsComposite);

		factory.createFlatFormComposite(outParametersGroup);

		outAddButton = factory.createButton(outControlsComposite, EMPTY, SWT.PUSH);
		outAddButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));
		outAddButton.setToolTipText("Add Out Parameter");

		outRemoveButton = factory.createButton(outControlsComposite, EMPTY, SWT.PUSH);
		outRemoveButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_REMOVE));
		outRemoveButton.setToolTipText("Remove Selected Out Parameters");
		outRemoveButton.setEnabled(false);

		outConfigureButton = factory.createButton(outControlsComposite, EMPTY, SWT.PUSH);
		outConfigureButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_CONFIGURE));
		outConfigureButton.setToolTipText("Configure Selected Out Parameter");
		outConfigureButton.setEnabled(false);

		// output table
		Table outParametersTable = factory.createTable(outParametersGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		outParametersTable.setLinesVisible(true);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(outParametersTable);

		outParametersViewer = new TableViewer(outParametersTable);
		outParametersViewer.setContentProvider(new ArrayContentProvider());
		outParametersViewer.setLabelProvider(new EParametersLabelProvider(true));

		// up, down controls
		Composite outUpDownControlsComposite = factory.createFlatFormComposite(outParametersGroup);
		GridLayoutFactory.fillDefaults().spacing(0, 6).margins(0, 0).applyTo(outUpDownControlsComposite);

		outUpButton = factory.createButton(outUpDownControlsComposite, EMPTY, SWT.PUSH);
		outUpButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_UP));
		outUpButton.setToolTipText("Move Parameter Up");
		outUpButton.setEnabled(false);

		outDownButton = factory.createButton(outUpDownControlsComposite, EMPTY, SWT.PUSH);
		outDownButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_DOWN));
		outDownButton.setToolTipText("Move Parameter Down");
		outDownButton.setEnabled(false);
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(50, -6);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		inParametersViewer.getControl().getParent().setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(50, 6);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		outParametersViewer.getControl().getParent().setLayoutData(data);
	}

	private void configure(final boolean isCreating, final boolean isOutgoing, final EParameter eParameter) {
		// prepare dialog
		configureDialog.setCreating(isCreating);
		configureDialog.setOutgoing(isOutgoing);
		configureDialog.setName(eParameter.getName());
		configureDialog.setEClassifier(eParameter.getEType());
		configureDialog.setActivity(getElement());

		int result = configureDialog.open();
		if (result == Window.OK) {
			final String name = configureDialog.getName();
			final EClassifier eClassifier = configureDialog.getEClassifier();

			Command command = new RecordingCommand(getEditingDomain()) {
				@Override
				public void doExecute() {
					eParameter.setName(name);
					eParameter.setEType(eClassifier);
					if (isCreating) {
						getElement().getContainedParameters().add(eParameter);

						// get insertion index
						EList<EParameter> list;
						if (isOutgoing) {
							list = getElement().getOutParameters();
						} else {
							list = getElement().getInParameters();
						}

						int insertionIndex = list.size();
						if (isCreating) {
							int index = 0;
							IStructuredSelection selection = (IStructuredSelection) inParametersViewer.getSelection();
							for (Object element : selection.toArray()) {
								int currentIndex = list.indexOf(element) + 1;
								if (currentIndex > index) {
									index = currentIndex;
								}
							}
							insertionIndex = index;
						}

						list.add(insertionIndex, eParameter);
					}
				}
			};
			execute(command);
			refresh();
		}
	}

	private void move(final IStructuredSelection selection, final boolean isOutgoing, final boolean down) {
		Command command = new RecordingCommand(getEditingDomain()) {
			@Override
			public void doExecute() {
				EList<EParameter> list;
				if (isOutgoing) {
					list = getElement().getOutParameters();
				} else {
					list = getElement().getInParameters();
				}

				Object[] parameters = selection.toArray();
				if (down) {
					for (int i = parameters.length - 1; i >= 0; i--) {
						int index = list.indexOf(parameters[i]);
						list.move(index + 1, (EParameter) parameters[i]);
					}
				} else {
					for (int i = 0; i < parameters.length; i++) {
						int index = list.indexOf(parameters[i]);
						list.move(index - 1, (EParameter) parameters[i]);
					}
				}
			}
		};
		execute(command);
		refresh();
	}

	private void remove(final IStructuredSelection selection, final boolean isOutgoing) {
		Command command = new RecordingCommand(getEditingDomain()) {
			@Override
			public void doExecute() {
				for (Object element : selection.toArray()) {
					if (element instanceof EParameter) {
						EcoreUtil.delete((EParameter) element);
					}
				}
			}
		};
		execute(command);
		refresh();
	}

	@Override
	public void refresh() {
		if (getElement() != null) {
			inParametersViewer.setInput(getElement().getInParameters());
			outParametersViewer.setInput(getElement().getOutParameters());
		} else {
			inParametersViewer.setInput(null);
			outParametersViewer.setInput(null);
		}
		outParametersViewer.refresh();
		inParametersViewer.refresh();
		checkButtonStates();

		// check if the activity is contained in an eOperation -> disable controls
		inParametersViewer.getControl().setEnabled(false);
		outParametersViewer.getControl().setEnabled(false);
	}

	private void checkButtonStates() {
		// in parameters
		IStructuredSelection selection = (IStructuredSelection) inParametersViewer.getSelection();
		if (!selection.isEmpty()) {
			int count = getElement().getInParameters().size();
			if (selection.size() == 1) {
				inConfigureButton.setEnabled(true);
				int index = getElement().getInParameters().indexOf(selection.getFirstElement());
				inUpButton.setEnabled(index > 0);
				inDownButton.setEnabled(index < count - 1);
			} else {
				inConfigureButton.setEnabled(false);
				int minIndex = count;
				int maxIndex = 0;
				for (Object element : selection.toArray()) {
					int currentIndex = getElement().getInParameters().indexOf(element);
					if (currentIndex > maxIndex) {
						maxIndex = currentIndex;
					}
					if (currentIndex < minIndex) {
						minIndex = currentIndex;
					}
				}
				inUpButton.setEnabled(minIndex > 0);
				inDownButton.setEnabled(maxIndex < count - 1);
			}

			inRemoveButton.setEnabled(true);
		}

		// out parameters
		selection = (IStructuredSelection) outParametersViewer.getSelection();
		if (!selection.isEmpty()) {
			int count = getElement().getOutParameters().size();
			if (selection.size() == 1) {
				outConfigureButton.setEnabled(true);
				int index = getElement().getOutParameters().indexOf(selection.getFirstElement());
				outUpButton.setEnabled(index > 0);
				outDownButton.setEnabled(index < count - 1);
			} else {
				outConfigureButton.setEnabled(false);
				int minIndex = count;
				int maxIndex = 0;
				for (Object element : selection.toArray()) {
					int currentIndex = getElement().getOutParameters().indexOf(element);
					if (currentIndex > maxIndex) {
						maxIndex = currentIndex;
					}
					if (currentIndex < minIndex) {
						minIndex = currentIndex;
					}
				}
				outUpButton.setEnabled(minIndex > 0);
				outDownButton.setEnabled(maxIndex < count - 1);
			}

			outRemoveButton.setEnabled(true);
		}
	}

	@Override
	protected Activity getElement() {
		return (Activity) super.getElement();
	}

	private static EParameter getEParameter(ISelection selection) {
		if (!selection.isEmpty()) {
			Object element = ((IStructuredSelection) selection).getFirstElement();
			if (element instanceof EParameter) {
				return (EParameter) element;
			}
		}
		return null;
	}
}

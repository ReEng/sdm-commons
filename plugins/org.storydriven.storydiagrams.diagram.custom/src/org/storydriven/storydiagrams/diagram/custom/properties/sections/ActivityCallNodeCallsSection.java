package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectActivityDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivitiesLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivityBindingsContentProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivityBindingsLabelProvider;

public class ActivityCallNodeCallsSection extends AbstractSection {
	private SelectActivityDialog dialog;

	private Group activitiesGroup;

	private TableViewer activitiesViewer;

	private Button addButton;
	private Button removeButton;
	private Button calleeButton;
	private Button upButton;
	private Button downButton;
	private TableViewer bindingsViewer;

	public ActivityCallNodeCallsSection() {
		dialog = new SelectActivityDialog();
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected void notifyChanged(Notification msg) {
		refresh();
	}

	@Override
	public void refresh() {
		if (activitiesViewer != null && !activitiesViewer.getTable().isDisposed()) {
			activitiesViewer.setInput(getElement().getCalledActivities());
			((CalledActivitiesLabelProvider) activitiesViewer.getLabelProvider()).setActivityCallNode(getElement());
		}
		checkButtonStates();
	}

	private void checkButtonStates() {
		// in parameters
		IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
		if (!selection.isEmpty()) {
			int count = getElement().getCalledActivities().size();
			if (selection.size() == 1) {
				calleeButton.setEnabled(true);
				calleeButton.setSelection(selection.getFirstElement().equals(getElement().getCallee()));

				int index = getElement().getCalledActivities().indexOf(selection.getFirstElement());
				upButton.setEnabled(index > 0);
				downButton.setEnabled(index < count - 1);
			} else {
				calleeButton.setEnabled(false);
				int minIndex = count;
				int maxIndex = 0;
				for (Object element : selection.toArray()) {
					int currentIndex = getElement().getCalledActivities().indexOf(element);
					if (currentIndex > maxIndex) {
						maxIndex = currentIndex;
					}
					if (currentIndex < minIndex) {
						minIndex = currentIndex;
					}
				}
				upButton.setEnabled(minIndex > 0);
				downButton.setEnabled(maxIndex < count - 1);
			}

			removeButton.setEnabled(true);
		}
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		// activities
		activitiesGroup = factory.createGroup(parent, "Called Activities");
		GridDataFactory.fillDefaults().grab(true, true).applyTo(activitiesGroup);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(6, 6).applyTo(activitiesGroup);

		Composite activitiesControlComposite = factory.createFlatFormComposite(activitiesGroup);
		GridDataFactory.fillDefaults().align(SWT.TRAIL, SWT.FILL).indent(0, -6).applyTo(activitiesControlComposite);
		GridLayoutFactory.fillDefaults().numColumns(3).margins(0, 0).spacing(0, 0).applyTo(activitiesControlComposite);

		addButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.PUSH);
		addButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));
		addButton.setToolTipText("Add");

		removeButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.PUSH);
		removeButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_REMOVE));
		removeButton.setToolTipText("Remove");
		removeButton.setEnabled(false);

		calleeButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.TOGGLE);
		calleeButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_CONFIGURE));
		calleeButton.setToolTipText("Toggle Callee");
		calleeButton.setEnabled(false);

		factory.createFlatFormComposite(activitiesGroup);

		Table activitiesTable = factory.createTable(activitiesGroup, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(activitiesTable);
		activitiesTable.setLinesVisible(true);

		activitiesViewer = new TableViewer(activitiesTable);
		activitiesViewer.setContentProvider(new ArrayContentProvider());
		activitiesViewer.setLabelProvider(new CalledActivitiesLabelProvider());

		Composite activitiesControlUpDownComposite = factory.createFlatFormComposite(activitiesGroup);
		GridDataFactory.fillDefaults().grab(false, true).applyTo(activitiesControlUpDownComposite);
		GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).applyTo(activitiesControlUpDownComposite);

		upButton = factory.createButton(activitiesControlUpDownComposite, EMPTY, SWT.PUSH);
		upButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_UP));
		upButton.setToolTipText("Up");
		upButton.setEnabled(false);

		downButton = factory.createButton(activitiesControlUpDownComposite, EMPTY, SWT.PUSH);
		downButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_DOWN));
		downButton.setToolTipText("Down");
		downButton.setEnabled(false);

		// bindings
		Group bindingGroup = factory.createGroup(activitiesGroup, "Parameter Bindings");
		GridDataFactory.fillDefaults().span(2, 1).grab(true, true).applyTo(bindingGroup);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(bindingGroup);

		Composite bindingControlComposite = factory.createFlatFormComposite(bindingGroup);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(bindingControlComposite);

		Table bindingViewerTable = factory.createTable(bindingGroup, SWT.BORDER | SWT.FULL_SELECTION);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(bindingViewerTable);

		bindingsViewer = new TableViewer(bindingViewerTable);
		bindingViewerTable.setHeaderVisible(true);
		bindingViewerTable.setLinesVisible(true);
		bindingsViewer.setContentProvider(new CalledActivityBindingsContentProvider());
		bindingsViewer.setLabelProvider(new CalledActivityBindingsLabelProvider());

		TableColumn nameColumn = new TableColumn(bindingViewerTable, SWT.LEAD);
		nameColumn.setText("Parameter");
		nameColumn.setWidth(200);

		TableColumn bindingColumn = new TableColumn(bindingViewerTable, SWT.LEAD);
		bindingColumn.setText("Binding");
		bindingColumn.setWidth(200);
	}

	@Override
	protected void hookWidgetListeners() {
		activitiesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof Activity) {
						bindingsViewer.setInput(element);
					}
				}
				checkButtonStates();
			}
		});

		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// prepare dialog
				dialog.setActivityCallNode(getElement());

				if (dialog.open() == Window.OK) {
					final Activity call = dialog.getElement();
					if (call != null) {
						RecordingCommand command = new RecordingCommand(getEditingDomain()) {
							@Override
							protected void doExecute() {
								getElement().getCalledActivities().add(call);
							}
						};
						execute(command);
					}
				}
			}
		});

		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
				if (!selection.isEmpty()) {
					RecordingCommand command = new RecordingCommand(getEditingDomain()) {
						@Override
						protected void doExecute() {
							for (Object object : selection.toArray()) {
								if (object.equals(getElement().getCallee())) {
									getElement().setCallee(null);
								}
								getElement().getCalledActivities().remove(object);
							}
						}
					};
					execute(command);
				}
			}
		});

		// set callee on double click
		activitiesViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent e) {
				Activity activity = getActivity();
				if (activity != null) {
					toggleCallee(activity);
				}
			}
		});

		// set callee on button click
		calleeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Activity activity = getActivity();
				if (activity != null) {
					toggleCallee(activity);
				}
			}
		});

		// move parameter up
		upButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, false);
				}
			}
		});

		// move parameter down
		downButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
				if (!selection.isEmpty()) {
					move(selection, true);
				}
			}
		});
	}

	protected void toggleCallee(final Activity activity) {
		RecordingCommand command = new RecordingCommand(getEditingDomain()) {
			@Override
			protected void doExecute() {
				if (activity.equals(getElement().getCallee())) {
					getElement().setCallee(null);
				} else {
					getElement().setCallee(activity);
				}
			}
		};

		execute(command);
	}

	protected Activity getActivity() {
		final IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();

		if (selection.size() == 1 && selection.getFirstElement() instanceof Activity) {
			return (Activity) selection.getFirstElement();
		}
		return null;
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		activitiesGroup.setLayoutData(data);
	}

	private void move(final IStructuredSelection selection, final boolean down) {
		Command command = new RecordingCommand(getEditingDomain()) {
			@Override
			public void doExecute() {
				EList<Activity> list = getElement().getCalledActivities();

				Object[] activities = selection.toArray();
				if (down) {
					for (int i = activities.length - 1; i >= 0; i--) {
						int index = list.indexOf(activities[i]);
						list.move(index + 1, (Activity) activities[i]);
					}
				} else {
					for (int i = 0; i < activities.length; i++) {
						int index = list.indexOf(activities[i]);
						list.move(index - 1, (Activity) activities[i]);
					}
				}
			}
		};
		execute(command);
	}
}

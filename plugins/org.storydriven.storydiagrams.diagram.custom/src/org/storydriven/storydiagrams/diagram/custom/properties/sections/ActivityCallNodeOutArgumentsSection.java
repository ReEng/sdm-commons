package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;
import org.storydriven.storydiagrams.diagram.custom.providers.ContainmentContentProvider;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.BoundUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public class ActivityCallNodeOutArgumentsSection extends AbstractSection {
	private TableViewer viewer;
	private Label label;

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		viewer.setInput(getInput());
	}

	@Override
	protected void notifyChanged(Notification msg) {
		if (msg.getFeature() != null && msg.getFeature().equals(CallsPackage.Literals.INVOCATION__CALLEE)) {
			if (viewer != null && !viewer.getControl().isDisposed()) {
				viewer.setInput(getInput());
			}
		}
	}

	private Object getInput() {
		if (getElement() == null || getElement().getCallee() == null) {
			return Collections.emptyList();
		}

		return getElement().getCallee().getOutParameters();
	}

	private ParameterBinding getBinding(EParameter parameter) {
		if (parameter != null) {
			// search parameter binding
			for (ParameterBinding binding : getElement().getOwnedParameterBindings()) {
				if (parameter.equals(binding.getParameter())) {
					return binding;
				}
			}
		}

		// clear bindings and create new ones
		RecordingCommand command = new RecordingCommand(getEditingDomain()) {
			@Override
			protected void doExecute() {
				// clear bindings
				Collection<ParameterBinding> toRemove = new ArrayList<ParameterBinding>();
				for (ParameterBinding binding : getElement().getOwnedParameterBindings()) {
					if (getElement().getCallee().getOutParameters().contains(binding)) {
						toRemove.add(binding);
					}
				}

				for (ParameterBinding binding : toRemove) {
					getElement().getOwnedParameterBindings().remove(binding);
				}

				// add new ones
				for (EParameter out : getElement().getCallee().getOutParameters()) {
					ParameterBinding binding = CallsFactory.eINSTANCE.createParameterBinding();

					binding.setParameter(out);
					binding.setInvocation(getElement());
				}
			}
		};
		execute(command);

		return getBinding(parameter);
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		label = factory.createLabel(parent, "Out Parameter" + ':', SWT.TRAIL);

		final Table table = factory.createTable(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		viewer = new TableViewer(table);
		viewer.setContentProvider(new ContainmentContentProvider());

		TableViewerColumn parameterColumn = new TableViewerColumn(viewer, SWT.LEAD);
		parameterColumn.getColumn().setText("Parameter");
		parameterColumn.getColumn().setWidth(150);
		parameterColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return EcoreTextUtil.getText((EParameter) element);
			}

			@Override
			public Image getImage(Object element) {
				if (getElement().getCallee().getOutParameters().contains(element)) {
					return DiagramImages.getImage(DiagramImages.EPARAMETER_OUT);
				}
				return DiagramImages.getImage(DiagramImages.EPARAMETER_IN);
			}
		});

		TableViewerColumn argumentColumn = new TableViewerColumn(viewer, SWT.LEAD);
		argumentColumn.getColumn().setText("Argument");
		argumentColumn.getColumn().setWidth(200);
		argumentColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ParameterBinding binding = getBinding((EParameter) element);
				return TextUtil.getText(binding.getValueExpression());
			}
		});
		EditingSupport editingSupport = new EditingSupport(viewer) {
			private ComboBoxCellEditor editor;
			private Map<String, Expression> expressions;
			private List<String> names;

			@Override
			protected void setValue(final Object element, final Object value) {
				final int index = (Integer) value;
				if (index > -1) {
					RecordingCommand command = new RecordingCommand(getEditingDomain()) {
						@Override
						protected void doExecute() {
							Callable callee = getElement().getCallee();

							// set expression
							ParameterBinding binding = getBinding((EParameter) element);
							Expression expression = expressions.get(names.get(index));

							binding.setValueExpression(expression);

							// 'refresh'
							getElement().setCallee(null);
							getElement().setCallee(callee);
						}
					};
					execute(command);

					viewer.refresh();
				}
			}

			@Override
			protected Object getValue(Object element) {
				// return index
				ParameterBinding binding = getBinding((EParameter) element);
				Expression expression = binding.getValueExpression();
				if (expression == null) {
					return -1;
				}
				return names.indexOf(expressions.get(expression));
			}

			@Override
			protected CellEditor getCellEditor(final Object element) {
				// reset names
				if (names == null) {
					names = new ArrayList<String>();
				} else {
					names.clear();
				}

				// reset expressions
				if (expressions == null) {
					expressions = new LinkedHashMap<String, Expression>();
				} else {
					expressions.clear();
				}

				// add object variabes
				for (ObjectVariable var : BoundUtil.getAllObjectVariables(ActivityUtil.getActivity(getElement()))) {
					ObjectVariableExpression expression = PatternsExpressionsFactory.eINSTANCE
							.createObjectVariableExpression();
					expression.setObject(var);
					expressions.put(var.getName(), expression);
					names.add(var.getName());
				}

				// add primitive variabes
				for (PrimitiveVariable var : BoundUtil.getAllPrimitiveVariables(ActivityUtil.getActivity(getElement()))) {
					PrimitiveVariableExpression expression = PatternsExpressionsFactory.eINSTANCE
							.createPrimitiveVariableExpression();
					expression.setPrimitiveVariable(var);
					expressions.put(var.getName(), expression);
					names.add(var.getName());
				}

				String[] items = names.toArray(new String[names.size()]);
				if (editor == null || editor.getControl().isDisposed()) {
					editor = new ComboBoxCellEditor(viewer.getTable(), items, SWT.READ_ONLY);
				}
				editor.setItems(items);
				return editor;
			}

			@Override
			protected boolean canEdit(Object element) {
				ParameterBinding binding = getBinding(((EParameter) element));
				return binding != null;
			}
		};
		argumentColumn.setEditingSupport(editingSupport);
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		Table table = viewer.getTable();

		FormData data = new FormData();
		data.left = new FormAttachment(0, LABEL_WIDTH);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		table.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(table);
		data.top = new FormAttachment(table, 0, SWT.TOP);
		data.bottom = new FormAttachment(table, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}
}

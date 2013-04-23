package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.EditExpressionDialog;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.BoundUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

import de.upb.swt.core.ui.properties.sections.AbstractPropertySection;
import de.upb.swt.core.ui.providers.ContainmentContentProvider;

public abstract class AbstractActivityCallNodeArgumentsSection extends AbstractPropertySection {
	private EditExpressionDialog dialog;
	private TableViewer viewer;
	private Label label;

	public AbstractActivityCallNodeArgumentsSection() {
		dialog = new EditExpressionDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		viewer.setInput(getInput());
	}

	@Override
	protected boolean shouldRefresh(Notification msg) {
		return super.shouldRefresh(msg) && msg.getFeature() != null
				&& msg.getFeature().equals(CallsPackage.Literals.INVOCATION__CALLEE);
	}

	@Override
	public void refresh() {
		if (viewer != null && !viewer.getControl().isDisposed()) {
			viewer.setInput(getInput());
		}
	}

	private Object getInput() {
		if (getElement() == null || getElement().getCallee() == null) {
			return Collections.emptyList();
		}

		return new ArrayList<EParameter>(getParameters());
	}

	protected abstract Collection<? extends EParameter> getParameters();

	private TextualExpression getExpression(final EParameter element) {
		Expression expression = getBinding(element).getValueExpression();
		if (expression instanceof TextualExpression) {
			return (TextualExpression) expression;
		}

		if (expression == null) {
			final TextualExpression newExpression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			newExpression.setLanguage("OCL");
			newExpression.setLanguageVersion("3.0");

			EStructuralFeature feature = CallsPackage.Literals.PARAMETER_BINDING__VALUE_EXPRESSION;
			Command command = SetCommand.create(getEditingDomain(), getBinding(element), feature, newExpression);
			execute(command);

			return newExpression;
		}

		return null;
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
		Collection<ParameterBinding> toRemove = new ArrayList<ParameterBinding>();
		for (ParameterBinding binding : getElement().getOwnedParameterBindings()) {
			if (getParameters().contains(binding)) {
				toRemove.add(binding);
			}
		}

		// create command
		ActivityCallNode owner = getElement();
		EStructuralFeature feature = CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS;

		CompoundCommand command = new CompoundCommand();

		command.append(RemoveCommand.create(getEditingDomain(), owner, feature, toRemove));

		// add new ones
		for (EParameter in : getParameters()) {
			ParameterBinding binding = CallsFactory.eINSTANCE.createParameterBinding();

			binding.setParameter(in);

			command.append(AddCommand.create(getEditingDomain(), owner, feature, binding));
		}

		execute(command.unwrap());

		return getBinding(parameter);
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		label = factory.createLabel(parent, "Arguments" + ':', SWT.TRAIL);

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
				if (getParameters().contains(element)) {
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
			@Override
			protected void setValue(Object element, Object value) {
				viewer.refresh();
				Callable callee = getElement().getCallee();
				ActivityCallNode owner = getElement();
				EStructuralFeature feature = CallsPackage.Literals.INVOCATION__CALLEE;

				Command command = SetCommand.create(getEditingDomain(), owner, feature, null);
				command.chain(SetCommand.create(getEditingDomain(), owner, feature, callee));

				execute(command);
			}

			@Override
			protected Object getValue(Object element) {
				ParameterBinding binding = getBinding((EParameter) element);
				return TextUtil.getText(binding.getValueExpression());
			}

			@Override
			protected CellEditor getCellEditor(final Object element) {
				final TextualExpression expression = getExpression((EParameter) element);

				if (expression != null) {
					return new DialogCellEditor(table) {
						@Override
						protected Object openDialogBox(Control control) {
							dialog.setExpression(expression);
							dialog.setContextInformation(BoundUtil.getBoundObjects(getElement()));
							dialog.setExpectedReturnType(((EParameter) element).getEType());
							dialog.setActivity(ActivityUtil.getActivity(getElement()));
							dialog.setChangeAttributeCommand(null, getEditingDomain());
							if (dialog.open() == Window.OK) {
								return dialog.getExpression();
							}

							return null;
						}

					};
				}

				return null;
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		};
		argumentColumn.setEditingSupport(editingSupport);
	}

	@Override
	protected void layoutWidgets() {
		Table table = viewer.getTable();

		FormData data = new FormData();
		data.left = new FormAttachment(0, WIDTH_LABEL);
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

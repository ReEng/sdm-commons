package org.storydriven.storydiagrams.ui.interpreter;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.storydriven.storydiagrams.ui.interpreter.dialogs.SelectEClassifierBindingDialog;
import org.storydriven.storydiagrams.ui.interpreter.wizards.IEPackageController;

public class ParameterBindingEditingSupport extends EditingSupport {
	private IEPackageController controller;

	private SelectEClassifierBindingDialog dialog;

	private CheckboxCellEditor booleanCellEditor;
	private ComboBoxCellEditor enumCellEditor;
	private TextCellEditor stringCellEditor;
	private DialogCellEditor dialogCellEditor;

	protected EParameter parameter;

	public ParameterBindingEditingSupport(IEPackageController controller, TableViewer viewer) {
		super(viewer);

		this.controller = controller;

		dialog = new SelectEClassifierBindingDialog(controller);

		// boolean
		booleanCellEditor = new CheckboxCellEditor(getTable()) {
			@Override
			protected void doSetValue(Object value) {
				if (value != null) {
					super.doSetValue(value);
				}
				super.doSetValue(false);
			}
		};

		// enum
		enumCellEditor = new ComboBoxCellEditor(getTable(), new String[] {}, SWT.READ_ONLY) {
			@Override
			protected void doSetValue(Object value) {
				if (value != null) {
					super.doSetValue(value);
				}
				super.doSetValue(0);
			}
		};

		// string
		stringCellEditor = new TextCellEditor(getTable()) {
			@Override
			protected void doSetValue(Object value) {
				if (value != null) {
					super.doSetValue(value);
				}
				super.doSetValue(""); //$NON-NLS-1$
			}
		};
		stringCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				if (parameter.getEType() instanceof EDataType) {
					EDataType type = (EDataType) parameter.getEType();
					try {
						Object parsed = EcoreUtil.createFromString(type, (String) value);
						if (parsed == null) {
							return "The value is not valid!";
						}
					} catch (Exception e) {
						// TODO: give it to UI
						e.printStackTrace();
					}
				}

				return null;
			}
		});

		// eclass
		dialogCellEditor = new DialogCellEditor(getTable()) {
			@Override
			protected Object openDialogBox(Control control) {
				if (dialog.open() == Window.OK) {
					return dialog.getElement();
				}

				return null;
			}
		};
	}

	private Table getTable() {
		return getViewer().getTable();
	}

	@Override
	protected void setValue(Object element, Object value) {
		controller.getBindings().put((EParameter) element, value);
		getViewer().refresh(element);
	}

	@Override
	public TableViewer getViewer() {
		return (TableViewer) super.getViewer();
	}

	@Override
	protected Object getValue(Object element) {
		return controller.getBindings().get(element);
	}

	@Override
	protected boolean canEdit(Object element) {
		return element instanceof EParameter;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		parameter = (EParameter) element;
		EClassifier type = parameter.getEType();

		// boolean
		if (type.isInstance(true)) {
			return booleanCellEditor;
		}

		// enum
		if (type instanceof EEnum) {
			// collect literals
			List<EEnumLiteral> literals = ((EEnum) type).getELiterals();
			String[] items = new String[literals.size()];
			int i = 0;
			for (EEnumLiteral literal : literals) {
				items[i] = literal.getName();
				i++;
			}

			enumCellEditor.setItems(items);
			return enumCellEditor;
		}

		// string
		if (type instanceof EDataType) {
			return stringCellEditor;
		}

		// eclass
		dialog.setType(((EParameter) element).getEType());
		dialog.setSelectedElement((EObject) controller.getBindings().get(element));
		return dialogCellEditor;
	}
}

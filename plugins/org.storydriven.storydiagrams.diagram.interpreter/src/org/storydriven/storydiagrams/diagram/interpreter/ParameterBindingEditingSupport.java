package org.storydriven.storydiagrams.diagram.interpreter;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.storydriven.storydiagrams.diagram.interpreter.dialogs.SelectEClassifierBindingDialog;
import org.storydriven.storydiagrams.diagram.interpreter.util.TypeUtil;
import org.storydriven.storydiagrams.diagram.interpreter.util.TypeUtil.Type;

public class ParameterBindingEditingSupport extends EditingSupport {
	private final Map<EParameter, Object> bindings;

	private CheckboxCellEditor booleanCellEditor;

	private TextCellEditor byteCellEditor;
	private TextCellEditor charTextCellEditor;
	private SelectEClassifierBindingDialog dialog;
	private DialogCellEditor dialogCellEditor;
	private TextCellEditor doubleCellEditor;
	private ComboBoxCellEditor enumCellEditor;
	private TextCellEditor floatCellEditor;
	private TextCellEditor intCellEditor;
	private TextCellEditor longCellEditor;
	private Resource resource;
	private TextCellEditor shortCellEditor;

	private TextCellEditor stringCellEditor;

	public ParameterBindingEditingSupport(TableViewer viewer, Map<EParameter, Object> bindings) {
		super(viewer);

		this.bindings = bindings;

		dialog = new SelectEClassifierBindingDialog();

		// boolean
		booleanCellEditor = new CheckboxCellEditor(getTable());

		// byte
		byteCellEditor = new TextCellEditor(getTable());
		byteCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Byte.parseByte((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid byte value.";
			}
		});

		// short
		shortCellEditor = new TextCellEditor(getTable());
		shortCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Short.parseShort((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid short value.";
			}
		});

		// char
		charTextCellEditor = new TextCellEditor(getTable());
		charTextCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					if (((String) value).length() == 1) {
						return null;
					}
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid character.";
			}
		});

		// integer
		intCellEditor = new TextCellEditor(getTable());
		intCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Integer.parseInt((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid integer value.";
			}
		});

		// float
		floatCellEditor = new TextCellEditor(getTable());
		floatCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Float.parseFloat((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid float value.";
			}
		});

		// long
		longCellEditor = new TextCellEditor(getTable());
		longCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Long.parseLong((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "This is not a valid long value.";
			}
		});

		// double
		doubleCellEditor = new TextCellEditor(getTable());
		doubleCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				try {
					Double.parseDouble((String) value);
					return null;
				} catch (Exception e) {
					// nothing
				}
				return "The value is not a valid integer.";
			}
		});

		// enum
		enumCellEditor = new ComboBoxCellEditor(getTable(), new String[0], SWT.READ_ONLY);

		// String
		stringCellEditor = new TextCellEditor(getTable());
		stringCellEditor.setValidator(new ICellEditorValidator() {
			@Override
			public String isValid(Object value) {
				if (value instanceof String && !((String) value).isEmpty()) {
					return null;
				}
				return "The input is not a valid String.";
			}
		});

		// unknown (search on tree)
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
		Object newValue;
		switch (TypeUtil.getType(element)) {
		case BOOLEAN:
			newValue = Boolean.valueOf((String) value);
			break;
		case BYTE:
			newValue = Byte.valueOf((String) value);
			break;
		case SHORT:
			newValue = Short.valueOf((String) value);
			break;
		case CHAR:
			newValue = ((String) value).charAt(0);
			break;
		case INTEGER:
			newValue = Integer.valueOf((String) value);
			break;
		case LONG:
			newValue = Long.valueOf((String) value);
			break;
		case FLOAT:
			newValue = Float.valueOf((String) value);
			break;
		case DOUBLE:
			newValue = Double.valueOf((String) value);
			break;
		case ENUM:
			newValue = TypeUtil.getLiteral(element, (Integer) value);
			break;
		case STRING:
			newValue = value;
			break;
		case UNKNOWN:
			newValue = value;
			break;
		default:
			newValue = null;
			break;
		}
		bindings.put((EParameter) element, newValue);
		getViewer().refresh(element);
	}

	@Override
	public TableViewer getViewer() {
		return (TableViewer) super.getViewer();
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	protected Object getValue(Object element) {
		Type type = TypeUtil.getType(element);
		if (Type.ENUM.equals(type)) {
			return TypeUtil.getIndex(element, bindings.get(element));
		} else if (Type.BOOLEAN.equals(type)) {
			return bindings.get(element);
		} else if (Type.UNKNOWN.equals(type)) {
			return bindings.get(element);
		} else {
			return String.valueOf(bindings.get(element));
		}
	}

	@Override
	protected boolean canEdit(Object element) {
		return element instanceof EParameter;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		switch (TypeUtil.getType(element)) {
		case BOOLEAN:
			return booleanCellEditor;
		case BYTE:
			return byteCellEditor;
		case SHORT:
			return shortCellEditor;
		case CHAR:
			return charTextCellEditor;
		case INTEGER:
			return intCellEditor;
		case LONG:
			return longCellEditor;
		case FLOAT:
			return floatCellEditor;
		case DOUBLE:
			return doubleCellEditor;
		case ENUM:
			enumCellEditor.setItems(TypeUtil.getEnumItems(element));
			return enumCellEditor;
		case STRING:
			return stringCellEditor;
		case UNKNOWN:
			dialog.setType(((EParameter) element).getEType());
			dialog.setElement((EObject) bindings.get(element));
			dialog.setResource(resource);
			return dialogCellEditor;
		default:
			return null;
		}
	}
}

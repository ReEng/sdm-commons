package de.upb.swt.core.ui.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.upb.swt.core.ui.properties.util.State;

public abstract class AbstractTextSection extends AbstractFeaturePropertySection {
	private Label label;
	private Text text;
	private Label icon;

	@Override
	public void refresh() {
		if (isReady()) {
			EClassifier type = getType();
			Object value = getValue();
			String stringValue = EcoreUtil.convertToString((EDataType) type, value);

			if (!isEqual(text.getText(), stringValue)) {
				if (stringValue == null) {
					stringValue = EMPTY;
				}
				text.setText(stringValue);
			}
			validate();
		}
	}

	private boolean isReady() {
		return text != null && !text.isDisposed();
	}

	private void doExecute() {
		Object oldValue = getValue();
		Object newValue = EcoreUtil.createFromString(getType(), text.getText());

		boolean abort = false;
		if (oldValue != null) {
			abort = oldValue.equals(newValue);
		}
		if (!abort && newValue != null) {
			abort = newValue.equals(oldValue);
		}

		if (!abort) {
			Point selection = text.getSelection();
			set(newValue);
			text.setSelection(selection);
		}
	}

	private EDataType getType() {
		return (EDataType) getFeature().getEType();
	}

	private static boolean isEqual(String one, String two) {
		if (one == null) {
			one = EMPTY;
		}

		if (two == null) {
			two = EMPTY;
		}

		return one.equals(two);
	}

	private void validate() {
		String value = getValue(text.getText());
		State state = validate(value);

		decorateBackground(text, state);
		decorateImage(icon, state);
	}

	/**
	 * Can be used to wrap a value to be set to the model.
	 * 
	 * @param value The unwrapped value.
	 * @return Returns the real value that should be set to the model.
	 */
	protected String getValue(String value) {
		return value;
	}

	protected State validate(String value) {
		return State.NONE;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return isMultiLine();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		String labelText = getLabelText() + ':';
		label = factory.createLabel(parent, labelText, SWT.TRAIL);

		text = factory.createText(parent, EMPTY, SWT.BORDER | (isMultiLine() ? SWT.MULTI : SWT.SINGLE));

		icon = factory.createLabel(parent, EMPTY);
	}

	/**
	 * Whether the text field should be multi-lined. The section will {@link #shouldUseExtraSpace() expand} accordingly.
	 * 
	 * @return Returns <code>true</code> to let the text field be multi-lined.
	 */
	protected boolean isMultiLine() {
		return false;
	}

	/**
	 * The title of the section left to the actual text field.
	 * 
	 * @return Returns the text for the label.
	 */
	protected abstract String getLabelText();

	@Override
	protected void hookWidgetListeners() {
		// select text on label click
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setFocus();
				text.selectAll();
			}
		});

		// execute command when focus lost
		text.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				doExecute();
			}
		});

		// execute command on [ENTER] key
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (SWT.CR == e.character) {
					doExecute();
				}
			}
		});

		// validate on modify
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	}

	@Override
	protected void layoutWidgets() {
		// control
		FormData data = new FormData();
		data.left = new FormAttachment(0, WIDTH_LABEL);
		data.right = new FormAttachment(100, -(16 + SIZE_MARGIN * 3));
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		text.setLayoutData(data);

		// help
		data = new FormData();
		data.left = new FormAttachment(text, SIZE_MARGIN * 2, SWT.RIGHT);
		data.right = new FormAttachment(100, -SIZE_MARGIN);
		data.top = new FormAttachment(text, 0, SWT.TOP);
		data.bottom = new FormAttachment(text, 0, SWT.BOTTOM);
		icon.setLayoutData(data);

		// label
		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(text, -SIZE_MARGIN);
		data.top = new FormAttachment(text, 2, SWT.TOP);
		data.bottom = new FormAttachment(text, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}
}

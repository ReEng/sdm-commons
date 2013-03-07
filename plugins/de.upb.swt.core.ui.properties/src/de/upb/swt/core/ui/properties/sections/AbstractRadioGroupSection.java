package de.upb.swt.core.ui.properties.sections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.upb.swt.core.ui.properties.util.State;

public abstract class AbstractRadioGroupSection<T extends Enumerator> extends AbstractFeaturePropertySection {
	private final Map<T, Button> buttons;

	private Label label;
	private Composite composite;
	private Label icon;

	public AbstractRadioGroupSection() {
		buttons = new LinkedHashMap<T, Button>();
	}

	@Override
	public void refresh() {
		if (isReady() && hasChanged()) {
			// disable all
			for (Button button : buttons.values()) {
				if (!button.isDisposed()) {
					button.setSelection(false);
				}
			}

			Button button = buttons.get(getValue());
			if (!button.isDisposed()) {
				button.setSelection(true);
			}

			checkEnabled();
			validate();
		}
	}

	private void validate() {
		decorateImage(icon, validate(getValue()));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T getValue() {
		return (T) super.getValue();
	}

	protected void checkEnabled() {
		for (T literal : buttons.keySet()) {
			Button button = buttons.get(literal);
			if (button != null && !button.isDisposed()) {
				button.setEnabled(isEnabled(literal));
			}
		}
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		label = factory.createLabel(parent, getLabelText() + ':', SWT.TRAIL);

		composite = factory.createFlatFormComposite(parent);

		for (final T literal : getValues()) {
			Button button = factory.createButton(composite, getText(literal), SWT.RADIO);
			button.setToolTipText(getToolTipText(literal));

			buttons.put(literal, button);
		}

		icon = factory.createLabel(parent, EMPTY);
	}

	/**
	 * The title of the section left to the actual radio buttons.
	 * 
	 * @return Returns the text for the label.
	 */
	protected abstract String getLabelText();

	protected State validate(T literal) {
		return State.NONE;
	}

	protected String getText(T literal) {
		return literal.getName();
	}

	protected String getToolTipText(T literal) {
		return null;
	}

	protected abstract List<T> getValues();

	@Override
	protected void hookWidgetListeners() {
		for (final T literal : buttons.keySet()) {
			final Button button = buttons.get(literal);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					set(literal);
					validate();
				}
			});
		}
	}

	protected boolean isEnabled(T literal) {
		return true;
	}

	protected boolean isVertical() {
		return false;
	}

	@Override
	protected void layoutWidgets() {
		if (isVertical()) {
			GridLayoutFactory.fillDefaults().applyTo(composite);
		} else {
			GridLayoutFactory.fillDefaults().numColumns(buttons.size()).applyTo(composite);
		}

		for (Button button : buttons.values()) {
			GridDataFactory.fillDefaults().grab(false, true).applyTo(button);
		}

		// control
		FormData data = new FormData();
		data.left = new FormAttachment(0, WIDTH_LABEL);
		data.right = new FormAttachment(100, -(16 + SIZE_MARGIN * 3));
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		composite.setLayoutData(data);

		// help
		data = new FormData();
		data.left = new FormAttachment(composite, SIZE_MARGIN * 2, SWT.RIGHT);
		data.right = new FormAttachment(100, -SIZE_MARGIN);
		data.top = new FormAttachment(composite, 0, SWT.TOP);
		data.bottom = new FormAttachment(composite, 0, SWT.BOTTOM);
		icon.setLayoutData(data);

		// label
		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(composite, -SIZE_MARGIN);
		data.top = new FormAttachment(composite, 2, SWT.TOP);
		data.bottom = new FormAttachment(composite, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}

	private boolean hasChanged() {
		return !buttons.get(getValue()).getSelection();
	}

	private boolean isReady() {
		return composite != null && !composite.isDisposed();
	}
}

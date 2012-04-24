package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public abstract class AbstractEStringSection extends AbstractSection {
	private CLabel label;
	private Text text;

	@Override
	public void refresh() {
		if (getElement() != null) {
			Object value = getElement().eGet(getFeature());
			if (value instanceof String) {
				text.setText((String) value);
			}
		} else {
			text.setText(EMPTY);
		}
	}

	@Override
	protected void notifyChanged(Notification msg) {
		if (getElement() != null && getFeature() != null && getFeature().equals(msg.getFeature())) {
			if (text != null && !text.isDisposed()) {
				Object value = getElement().eGet(getFeature());
				// TODO: LOOPED!
				if (value instanceof String) {
					// text.setText((String) value);
				} else {
					// text.setText(EMPTY);
				}
			}
		}
	}

	protected abstract EStructuralFeature getFeature();

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		String labelText = getLabelText() + ':';
		label = factory.createCLabel(parent, labelText, SWT.TRAIL);

		text = factory.createText(parent, EMPTY, SWT.BORDER | SWT.SINGLE);
	}

	protected abstract String getLabelText();

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0, LABEL_WIDTH);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		text.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(text);
		data.top = new FormAttachment(text, 0, SWT.TOP);
		data.bottom = new FormAttachment(text, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}

	@Override
	protected void hookWidgetListeners() {
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (!text.getText().isEmpty()) {
					execute(getFeature(), text.getText());
				}
			}
		});
	}

	protected String getHelpText() {
		return null;
	}
}

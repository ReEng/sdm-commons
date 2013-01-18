package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public abstract class AbstractEBooleanSection extends AbstractSection {
	private Button button;

	@Override
	public void refresh() {
		if (getElement() != null) {
			Object value = getElement().eGet(getFeature());
			if (value instanceof Boolean) {
				button.setSelection((Boolean) value);
			}
		}
	}

	protected abstract EStructuralFeature getFeature();

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		button = factory.createButton(parent, getButtonText(), SWT.CHECK);
	}

	protected abstract String getButtonText();

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0, LABEL_WIDTH);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		button.setLayoutData(data);
	}

	@Override
	protected void hookWidgetListeners() {
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				execute(getFeature(), button.getSelection());
			}
		});
	}
}

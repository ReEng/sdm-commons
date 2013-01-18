package org.storydriven.storydiagrams.diagram.custom.properties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public abstract class AbstractEEnumRadioSection<T extends Enumerator> extends AbstractSection {
	private final Map<T, Button> literals;

	private CLabel label;
	private Composite composite;

	public AbstractEEnumRadioSection() {
		literals = new HashMap<T, Button>();
	}

	@Override
	public void refresh() {
		for (Button button : literals.values()) {
			button.setSelection(false);
		}

		if (getElement() != null) {
			Object value = getElement().eGet(getFeature());
			if (value instanceof Enumerator) {
				literals.get(value).setSelection(true);
			}
		}

		checkEnabled();
	}

	protected abstract EStructuralFeature getFeature();

	@Override
	protected void layoutWidgets(Composite parent) {
		if (isVertical()) {
			GridLayoutFactory.fillDefaults().applyTo(composite);
		} else {
			GridLayoutFactory.fillDefaults().numColumns(literals.size()).applyTo(composite);
		}

		for (Button button : literals.values()) {
			GridDataFactory.fillDefaults().grab(false, true).applyTo(button);
		}

		FormData data = new FormData();
		data.left = new FormAttachment(0, LABEL_WIDTH);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		composite.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(composite);
		data.top = new FormAttachment(composite, 0, SWT.TOP);
		data.bottom = new FormAttachment(composite, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}

	protected void checkEnabled() {
		for (T literal : literals.keySet()) {
			Button button = literals.get(literal);
			if (button != null && !button.isDisposed()) {
				button.setEnabled(isEnabled(literal));
			}
		}
	}

	protected boolean isVertical() {
		return false;
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		label = factory.createCLabel(parent, getDescription() + ':', SWT.TRAIL);

		composite = factory.createFlatFormComposite(parent);

		for (final T literal : getValues()) {
			Button button = factory.createButton(composite, getText(literal), SWT.RADIO);
			button.setToolTipText(getToolTipText(literal));

			literals.put(literal, button);
		}
	}

	protected abstract String getDescription();

	protected String getText(T literal) {
		return literal.getName();
	}

	protected String getToolTipText(T literal) {
		return null;
	}

	protected abstract List<T> getValues();

	@Override
	protected void hookWidgetListeners() {
		for (final T literal : literals.keySet()) {
			Button button = literals.get(literal);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					execute(getFeature(), literal);
				}
			});
		}
	}

	protected boolean isEnabled(T literal) {
		return true;
	}
}
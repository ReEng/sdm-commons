package org.storydriven.storydiagrams.diagram.custom.properties;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

public abstract class AbstractEListComboSection<E> extends AbstractSection {
	private final Map<Integer, E> map;

	private CLabel label;
	private Combo combo;
	private Button searchButton;

	public AbstractEListComboSection() {
		map = new LinkedHashMap<Integer, E>();
	}

	@Override
	public void refresh() {
		map.clear();
		int index = 0;
		List<E> items = getItems();
		String[] itemTexts = new String[items.size()];
		for (E object : items) {
			map.put(index, object);
			itemTexts[index] = getText(object);
			index++;
		}
		combo.setItems(itemTexts);
		if (getElement() != null) {
			Object value = getElement().eGet(getFeature());
			if (value != null) {
				combo.select(getIndex(value));
			}
		} else {
			combo.select(-1);
		}
	}

	protected abstract EStructuralFeature getFeature();

	protected void execute(E value) {
		execute(getFeature(), value);
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();

		data.right = new FormAttachment(100);
		data.top = new FormAttachment(searchButton, 0, SWT.TOP);
		data.bottom = new FormAttachment(searchButton, 0, SWT.BOTTOM);
		if (isShowSearchButton()) {
			searchButton.setLayoutData(data);
		}

		data = new FormData();
		data.left = new FormAttachment(0, LABEL_WIDTH);
		if (isShowSearchButton()) {
			data.right = new FormAttachment(searchButton);
		} else {
			data.right = new FormAttachment(100);
		}
		data.top = new FormAttachment(0, 2);
		data.bottom = new FormAttachment(100);
		combo.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(combo);
		data.top = new FormAttachment(combo, 0, SWT.TOP);
		data.bottom = new FormAttachment(combo, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}

	protected void handleSearchButtonClicked() {
		// nothing by default
	}

	protected boolean isShowSearchButton() {
		return false;
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		label = factory.createCLabel(parent, getLabelText() + ':', SWT.TRAIL);

		combo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY);
		factory.adapt(combo);
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				execute(getFeature(), map.get(combo.getSelectionIndex()));
			}
		});

		if (isShowSearchButton()) {
			searchButton = factory.createButton(parent, "Find", SWT.PUSH);
			searchButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_SEARCH));
			searchButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					handleSearchButtonClicked();
				}
			});
		}
	}

	protected abstract String getLabelText();

	protected abstract List<E> getItems();

	protected String getText(E element) {
		return String.valueOf(element);
	}

	private int getIndex(Object value) {
		for (Entry<Integer, E> entry : map.entrySet()) {
			if ((entry.getValue() != null && entry.getValue().equals(value)) || entry.getValue() == value) {
				return entry.getKey();
			}
		}

		return 0;
	}
}

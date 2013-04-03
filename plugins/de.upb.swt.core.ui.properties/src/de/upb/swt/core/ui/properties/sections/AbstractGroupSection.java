package de.upb.swt.core.ui.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.upb.swt.core.ui.properties.util.State;

public abstract class AbstractGroupSection extends
		AbstractFeaturePropertySection {
	private List<AbstractFeaturePropertySection> sections = new ArrayList<AbstractFeaturePropertySection>();
	protected Label label;
	protected Button checkbox;
	protected Group group;
	protected Label icon;
	protected int offset = 6;

	public void addSection(AbstractFeaturePropertySection section) {
//		EClassifier classifier = getFeature().getEType();
//		Assert.isTrue(classifier instanceof EClass);
//		EClass clazz = (EClass) classifier;
//		Assert.isTrue(clazz.getEAllStructuralFeatures().contains(
//				section.getFeature()));
		sections.add(section);
	}

	public void removeSection(AbstractFeaturePropertySection section) {
		sections.remove(section);
	}

	@Override
	public void refresh() {
		if (isReady() && hasChanged()) {
			setSelection(getValue());
			validate();
		}
	}

	private void setSelection(Object value) {
		checkbox.setSelection(value != null);
	}

	private boolean isReady() {
		return group != null && !group.isDisposed();
	}

	private boolean hasChanged() {
		boolean oldValue = checkbox.getSelection();
		boolean newValue = getValue() != null;
		return oldValue != newValue;
	}

	private void validate() {
		Object value = getValue();
		decorateImage(icon, validate(value));

		group.setVisible(value != null);

		// Set selection of children
		if (value != null) {
			ISelection selection = new StructuredSelection(value);
			for (AbstractPropertySection section : sections) {
				section.setInput(null, selection);
				section.refresh();
			}
		}
		
		
	}

	protected State validate(Object value) {
		return State.NONE;
	}

	protected String getCheckboxText() {
		return toHumanReadable(getFeature().getEType().getName());
	}

	private String toHumanReadable(String camelCased) {
		StringBuffer buffer = new StringBuffer();
		boolean newWord = true, oldWord = true;
		for (int p = 0; p < camelCased.length(); p++) {
			char c = camelCased.charAt(p);
			newWord = Character.isUpperCase(c);
			if (newWord && !oldWord) {
				buffer.append(' ');
			}
			oldWord = newWord;
			buffer.append(c);
		}
		return buffer.toString();
	}

	@Override
	protected void createWidgets(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		checkbox = factory.createButton(parent, getCheckboxText(), SWT.CHECK);
		group = factory.createGroup(parent, "");
		icon = factory.createLabel(parent, EMPTY);
		icon.setToolTipText(getHelpText());

		String labelText = getLabelText() + ':';
		label = factory.createLabel(parent, labelText, SWT.TRAIL);

		group.setLayout(new FillLayout(SWT.VERTICAL));
		for (AbstractPropertySection section : sections) {
			section.createControls(group, getPage());
		}

		group.setVisible(false);
	}

	protected abstract String getLabelText();

	protected String getHelpText() {
		return null;
	}

	@Override
	protected void hookWidgetListeners() {
		checkbox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EObject object = null;
				if (checkbox.getSelection()) {
					EClassifier classifier = getFeature().getEType();

					// TODO: Create object if necessary
					object = EcoreUtil.create((EClass) classifier);

				}
				set(object);

				validate();
			}
		});
	}

	@Override
	protected void layoutWidgets() {
		// group control
		FormData data = new FormData();
		data.left = new FormAttachment(0, WIDTH_LABEL);
		data.right = new FormAttachment(100, -(16 + SIZE_MARGIN * 3));
		data.top = new FormAttachment(offset);
		data.bottom = new FormAttachment(100);
		group.setLayoutData(data);

		// checkbox control
		data = new FormData();
		data.left = new FormAttachment(group, 16, SWT.LEFT);
		data.top = new FormAttachment(group, -offset, SWT.TOP);
		checkbox.setLayoutData(data);

		// help icon
		data = new FormData();
		data.left = new FormAttachment(group, SIZE_MARGIN * 2, SWT.RIGHT);
		data.right = new FormAttachment(100, -SIZE_MARGIN);
		data.top = new FormAttachment(group, 0, SWT.TOP);
		data.bottom = new FormAttachment(group, 0, SWT.BOTTOM);
		icon.setLayoutData(data);

		// label
		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(group, -SIZE_MARGIN);
		data.top = new FormAttachment(offset - 2);
		data.bottom = new FormAttachment(group, 0, SWT.BOTTOM);
		label.setLayoutData(data);
	}

}

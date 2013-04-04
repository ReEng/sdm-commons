package de.upb.swt.core.ui.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.upb.swt.core.ui.properties.util.State;

public abstract class AbstractGroupSection extends
		AbstractFeaturePropertySection {
	private List<AbstractFeaturePropertySection> sections = new ArrayList<AbstractFeaturePropertySection>();
	protected boolean useCheckbox = true;
	protected Label label;
	protected Button checkbox;
	protected Group group;
	protected int offset = 6;

	public AbstractGroupSection() {
		useCheckbox = getFeature().getLowerBound() == 0;// getFeature().isUnsettable();
	}

	public void addSection(AbstractFeaturePropertySection section) {
		// EClassifier classifier = getFeature().getEType();
		// Assert.isTrue(classifier instanceof EClass);
		// EClass clazz = (EClass) classifier;
		// Assert.isTrue(clazz.getEAllStructuralFeatures().contains(
		// section.getFeature()));
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
		if (checkbox != null) {
			checkbox.setSelection(value != null);
		}
	}

	private boolean isReady() {
		return group != null && !group.isDisposed();
	}

	private boolean hasChanged() {
		boolean oldValue = true;
		if (checkbox != null) {
			oldValue = checkbox.getSelection();
		}
		boolean newValue = getValue() != null;
		return oldValue != newValue;
	}

	private void validate() {
		Object object = getValue();
		boolean isSet = checkbox == null || checkbox.getSelection();
		if (object == null && isSet) {
			EClassifier classifier = getFeature().getEType();
			object = EcoreUtil.create((EClass) classifier);
		}
		if (object != null && !isSet) {
			object = null;
		}
		set(object);

		group.setVisible(object != null);

		// Set selection of children
		if (object != null) {
			ISelection selection = new StructuredSelection(object);
			for (AbstractPropertySection section : sections) {
				section.setInput(null, selection);
				section.refresh();
			}
		}
		layoutWidgets();
		revalidateLayout(group);
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
		if (useCheckbox) {
			String checkboxText = getCheckboxText();
			checkbox = factory.createButton(parent, checkboxText, SWT.CHECK);
		}

		group = factory.createGroup(parent, "");

		String labelText = getLabelText() + ':';
		label = factory.createLabel(parent, labelText, SWT.TRAIL);

		GridLayout layout = new GridLayout(1, true);
		layout.marginLeft = layout.marginRight = 0;
		layout.marginTop = layout.marginBottom = 0;
		layout.marginHeight = layout.marginWidth = 0;
		group.setLayout(layout);
		for (AbstractPropertySection section : sections) {
			section.createControls(group, getPage());
		}
		for (Control child : group.getChildren()) {
			child.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		}

		if (useCheckbox) {
			group.setVisible(false);
		}
	}

	protected abstract String getLabelText();

	protected String getHelpText() {
		return null;
	}

	@Override
	protected void hookWidgetListeners() {
		if (checkbox != null) {
			checkbox.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					validate();
				}
			});
		}
	}

	@Override
	protected void layoutWidgets() {
		// group control
		FormData data = new FormData();
		data.left = new FormAttachment(0, WIDTH_LABEL);
		data.right = new FormAttachment(100, -(16 + SIZE_MARGIN * 3));
		data.top = new FormAttachment(label, offset, SWT.TOP);
		if (group.isVisible()) {
			data.bottom = new FormAttachment(100);
		} else {
			data.bottom = new FormAttachment(0);
		}
		group.setLayoutData(data);

		// checkbox control
		if (useCheckbox) {
			data = new FormData();
			data.left = new FormAttachment(0, WIDTH_LABEL + 16);
			data.top = new FormAttachment(offset);
			checkbox.setLayoutData(data);
		}
		// label
		data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(0, WIDTH_LABEL);
		data.top = new FormAttachment(offset);
		data.bottom = new FormAttachment(100);
		label.setLayoutData(data);
	}
	public static void revalidateLayout (Control control) {

		Control c = control;
		do {
			if (c instanceof ExpandBar) {
				ExpandBar expandBar = (ExpandBar) c;
				for (ExpandItem expandItem : expandBar.getItems()) {
					expandItem
						.setHeight(expandItem.getControl().computeSize(expandBar.getSize().x, SWT.DEFAULT, true).y);
				}
			}
			c = c.getParent();

		} while (c != null && c.getParent() != null && !(c instanceof ScrolledComposite));

		if (c instanceof ScrolledComposite) {
			ScrolledComposite scrolledComposite = (ScrolledComposite) c;
			if (scrolledComposite.getExpandHorizontal() || scrolledComposite.getExpandVertical()) {
				scrolledComposite
					.setMinSize(scrolledComposite.getContent().computeSize(SWT.DEFAULT, SWT.DEFAULT, true));
			} else {
				scrolledComposite.getContent().pack(true);
			}
		}
		if (c instanceof Composite) {
			Composite composite = (Composite) c;
			composite.layout(true, true);
		}
	}
}

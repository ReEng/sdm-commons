package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;

public class CommentableElementCommentSection extends AbstractSection {
	private Group group;
	private Text text;

	@Override
	public void refresh() {
		String textValue = text.getText();
		if (getElement() != null) {
			String modelValue = getElement().getComment();
			if (!textValue.equals(modelValue)) {
				if (modelValue == null) {
					text.setText(EMPTY);
				} else {
					text.setText(modelValue);
				}
			}
		}
	}

	@Override
	protected CommentableElement getElement() {
		return (CommentableElement) super.getElement();
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.top = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.bottom = new FormAttachment(100);
		group.setLayoutData(data);

		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(group);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(text);

		group.getParent().layout();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		group = factory.createGroup(parent, "Comment");

		text = factory.createText(group, EMPTY, SWT.LEAD | SWT.MULTI | SWT.WRAP);
	}

	@Override
	protected void hookWidgetListeners() {
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String textValue = text.getText();
				String modelValue = getElement().getComment();
				if (!textValue.equals(modelValue)) {
					execute(getFeature(), textValue);
				}
			}
		});
	}

	private EStructuralFeature getFeature() {
		return CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT;
	}
}

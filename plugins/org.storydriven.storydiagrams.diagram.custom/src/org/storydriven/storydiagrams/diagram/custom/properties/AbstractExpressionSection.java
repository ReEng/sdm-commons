package org.storydriven.storydiagrams.diagram.custom.properties;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.ui.IExpressionEditor;
import org.storydriven.core.ui.util.ExpressionEditorUtil;
import org.storydriven.storydiagrams.diagram.custom.util.BoundUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;

public abstract class AbstractExpressionSection extends AbstractSection {
	private IExpressionEditor provider;

	private Group group;
	private CLabel typeLabel;
	protected ISourceViewer viewer;

	@Override
	public void refresh() {
		Expression expression = getExpression();
		if (getElement() != null && expression instanceof TextualExpression) {
			provider = ExpressionEditorUtil
					.getEditor((TextualExpression) expression);

			EClassifier classifier = getContextClassifier();
			String value = ((TextualExpression) expression).getExpressionText();

			if (viewer != null) {
				viewer.getTextWidget().dispose();
				viewer = null;
			}

			viewer = provider.createSourceViewer(group, SWT.BORDER
					| SWT.V_SCROLL | SWT.H_SCROLL, classifier,
					getContextInformation(), value);
			GridDataFactory.fillDefaults().grab(true, true)
					.applyTo(viewer.getTextWidget());
			viewer.addTextListener(new ITextListener() {
				@Override
				public void textChanged(TextEvent event) {
					final Expression expression = getExpression();
					if (expression instanceof TextualExpression) {
						RecordingCommand command = new RecordingCommand(
								getEditingDomain()) {
							@Override
							protected void doExecute() {
								((TextualExpression) expression)
										.setExpressionText(viewer.getDocument()
												.get());
								postUpdate();
							}
						};

						execute(command);
					}
				}
			});

			typeLabel.setText(getTypeText(classifier));

			provider.setText(value);
			group.setVisible(true);
			group.layout();
		} else {
			group.setVisible(false);
		}
	}

	protected abstract Expression getExpression();

	protected EClassifier getContextClassifier() {
		return null;
	}

	protected Map<String, EClassifier> getContextInformation() {
		return BoundUtil.getBoundObjects(getElement());
	}

	private String getTypeText(EClassifier classifier) {
		StringBuilder builder = new StringBuilder();

		builder.append("Expected return type of the following OCL 1.0 constraint: '");
		builder.append(EcoreTextUtil.getText(classifier));
		builder.append("'.");

		return builder.toString();
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void dispose() {
		if (provider != null) {
			provider.dispose();
		}
		super.dispose();
	}

	@Override
	protected void createWidgets(Composite parent,
			TabbedPropertySheetWidgetFactory factory) {
		group = factory.createGroup(parent, getLabelText());
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(group);

		typeLabel = factory.createCLabel(group, EMPTY, SWT.LEAD);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(typeLabel);
	}

	protected String getLabelText() {
		return "Textual Expression";
	}

	protected void postUpdate() {
		// nothing by default
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		group.setLayoutData(data);
	}
}

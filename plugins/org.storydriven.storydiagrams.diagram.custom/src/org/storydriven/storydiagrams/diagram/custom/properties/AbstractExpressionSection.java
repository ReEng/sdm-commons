package org.storydriven.storydiagrams.diagram.custom.properties;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
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
import org.storydriven.core.expressions.util.ExpressionUtils;
import org.storydriven.storydiagrams.diagram.custom.SourceViewerProvider;
import org.storydriven.storydiagrams.diagram.custom.util.BoundUtil;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;

public abstract class AbstractExpressionSection extends AbstractSection {
	private static final String EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID = "org.storydriven.storydiagrams.diagram.custom.expressionSourceViewerExtension";
	private static final String EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
	private static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
	private static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";

	private static HashMap<String, SourceViewerProvider> sourceViewerProviders;
	private SourceViewerProvider provider;

	private Group group;
	private CLabel typeLabel;
	protected ISourceViewer viewer;

	public AbstractExpressionSection() {
		initializeSourceViewerProviders();
	}

	private static void initializeSourceViewerProviders() {
		if (sourceViewerProviders == null && Platform.getExtensionRegistry() != null) {
			sourceViewerProviders = new HashMap<String, SourceViewerProvider>();

			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID);

			for (IConfigurationElement configurationElement : configurationElements) {
				String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME);
				String v = configurationElement.getAttribute(EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME);

				if ((s != null && !("".equals(s))) && (v != null && !("".equals(v)))) {
					try {
						sourceViewerProviders.put(s.concat(v), (SourceViewerProvider) configurationElement
								.createExecutableExtension(EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME));
					} catch (CoreException e) {
						// Skip it but show error message
						e.printStackTrace();
					}
				}
			}
		}

		for (String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
			for (String aVersion : ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
				if (!sourceViewerProviders.containsKey(aLanguage.concat(aVersion))) {
					sourceViewerProviders.put(aLanguage.concat(aVersion), new SourceViewerProvider());
				}
			}
		}
	}

	@Override
	public void refresh() {
		Expression expression = getExpression();
		if (getElement() != null && expression instanceof TextualExpression) {
			EClassifier classifier = getContextClassifier();
			String value = ((TextualExpression) expression).getExpressionText();

			if (provider == null) {
				provider = sourceViewerProviders.get("OCL1.0");
			}
			if (viewer != null) {
				viewer.getTextWidget().dispose();
				viewer = null;
			}

			viewer = provider.createSourceViewer(group, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL, null,
					getContextInformation(), value);
			GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getTextWidget());
			viewer.addTextListener(new ITextListener() {
				@Override
				public void textChanged(TextEvent event) {
					final Expression expression = getExpression();
					if (expression instanceof TextualExpression) {
						RecordingCommand command = new RecordingCommand(getEditingDomain()) {
							@Override
							protected void doExecute() {
								((TextualExpression) expression).setExpressionText(viewer.getDocument().get());
							}
						};

						execute(command);
					}
				}
			});

			typeLabel.setText(getTypeText(classifier));

			provider.setText(value);
			group.layout();
		}
	}

	protected EClassifier getContextClassifier() {
		return null;
	}

	private String getTypeText(EClassifier classifier) {
		StringBuilder builder = new StringBuilder();

		builder.append("Expected return type of the following OCL 1.0 constraint: '");
		builder.append(EcoreTextUtil.getText(classifier));
		builder.append("'.");

		return builder.toString();
	}

	protected abstract Expression getExpression();

	protected Map<String, EClassifier> getContextInformation() {
		return BoundUtil.getBoundObjects(getElement());
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
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		group = factory.createGroup(parent, getLabelText());
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(group);

		typeLabel = factory.createCLabel(group, EMPTY, SWT.LEAD);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(typeLabel);
	}

	protected String getLabelText() {
		return "Textual Expression";
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

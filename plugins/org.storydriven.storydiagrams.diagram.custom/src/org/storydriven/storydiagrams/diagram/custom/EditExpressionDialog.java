package org.storydriven.storydiagrams.diagram.custom;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.util.ExpressionUtils;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.ui.SourceViewerProvider;

public class EditExpressionDialog extends Dialog {

	private LanguageSelectionWidget languageChoosingWidget;

	protected ISourceViewer currentSourceViewer;
	private ISourceViewer defaultSourceViewer;

	protected static final String DIALOG_TITLE = "Edit Expression";
	protected static final int DIALOG_WIDTH = 500;
	protected static final int DIALOG_HEIGHT = 400;
	protected static final int DIALOG_PADDING = 10;
	private static final int SOURCEVIEWER_HEIGHT = 300;

	private static final int RADIO_BUTTON_THRESHOLD_LANGUAGES = 3;
	private static final int RADIO_BUTTON_THRESHOLD_VERSIONS = 3;
	private static final String DEFAULT_LANGUAGE = "OCL";

	public static final String EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID = "org.storydriven.storydiagrams.diagram.custom.expressionSourceViewerExtension";
	public static final String EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
	public static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
	public static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";

	// Key for both Maps is the source viewers name concatenated with the source viewers version.
	private Map<String, SourceViewerProvider> sourceViewerProviders = new HashMap<String, SourceViewerProvider>();
	private HashMap<String, ISourceViewer> sourceViewers;

	private EClassifier contextClassifier;
	private EClassifier expectedReturnType;
	private EditingDomain editingDomain;
	private String originalText;
	private TextualExpression expression;
	private Activity activity;
	private Map<String, EClassifier> contextInformation;

	private Composite languageEditingArea;

	public interface LanguageSelectionWidget {
		public abstract void addLanguageSelectedListener(LanguageSelectedListener listener);

		public abstract void removeLanguageSelectedListener(LanguageSelectedListener listener);

		public abstract void setSelectedLanguage(String language, String version);

		public abstract void addLanguageWithVersion(String language, String version);

		public abstract String getSelectedLanguage();

		public abstract String getSelectedVersion();

	}

	public class LanguageSelectedEvent extends java.util.EventObject {

		private static final long serialVersionUID = 1L;
		public String language, version;

		public LanguageSelectedEvent(Object source, String language, String version) {
			super(source);
			this.language = language;
			this.version = version;
		}
	}

	public interface LanguageSelectedListener extends java.util.EventListener {
		public void languageSelected(LanguageSelectedEvent event);

		public void noLanguageSelected();
	}

	protected class LanguageSelectionComboWidget extends Composite implements LanguageSelectionWidget {

		Combo languageCombo;
		Combo versionCombo;

		Map<String, Collection<String>> languageDirectory;

		Vector<LanguageSelectedListener> languageSelectedListeners = new Vector<LanguageSelectedListener>();

		public LanguageSelectionComboWidget(Composite parent, int style) {
			super(parent, style);
			this.setLayout(new GridLayout(2, false));

			languageDirectory = new HashMap<String, Collection<String>>();

			Label languageLabel = new Label(this, SWT.NONE);
			languageLabel.setText("Expression Language");
			createDialogLanguageCombo(this);

			Label versionLabel = new Label(this, SWT.NONE);
			versionLabel.setText("Language Version");
			createDialogVersionCombo(this);
		}

		public void addLanguageSelectedListener(LanguageSelectedListener listener) {

			languageSelectedListeners.addElement(listener);

		}

		public void removeLanguageSelectedListener(LanguageSelectedListener listener) {

			languageSelectedListeners.removeElement(listener);

		}

		private void createDialogLanguageCombo(Composite mainArea) {
			languageCombo = new Combo(mainArea, SWT.DROP_DOWN);
			languageCombo.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
			String[] items = {};
			languageCombo.setItems(items);

			languageCombo.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					changeDialogVersionCombo(languageCombo.getItem(languageCombo.getSelectionIndex()));
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					String[] emptyBuffer = {};
					versionCombo.setItems(emptyBuffer);
					noLanguageSelected();
				}

			});
		}

		private void changeDialogVersionCombo(String language) {
			String[] emptyBuffer = {};
			versionCombo.setItems(languageDirectory.get(language).toArray(emptyBuffer));
		}

		private void createDialogVersionCombo(Composite mainArea) {
			versionCombo = new Combo(mainArea, SWT.DROP_DOWN);
			versionCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false));
			String[] items = {};
			versionCombo.setItems(items);

			versionCombo.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					languageSelected(languageCombo.getItem(languageCombo.getSelectionIndex()),
							versionCombo.getItem(versionCombo.getSelectionIndex()));
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					noLanguageSelected();
				}

			});
		}

		protected void languageSelected(String language, String version) {
			LanguageSelectedEvent e = new LanguageSelectedEvent(this, language, version);

			for (LanguageSelectedListener listener : this.languageSelectedListeners) {
				listener.languageSelected(e);
			}

		}

		/**
		 * Sets the selected Language of the widget if it is already registered. If not nothing happens. Furthermore
		 * this does not trigger a languageSelectedEvent.
		 */
		@Override
		public void setSelectedLanguage(String language, String version) {
			int index = searchStringInCombo(languageCombo, language);
			languageCombo.select(index);

			index = searchStringInCombo(versionCombo, version);
			languageCombo.select(index);
		}

		@Override
		public void addLanguageWithVersion(String language, String version) {
			if (!languageDirectory.containsKey(language)) {
				languageDirectory.put(language, new Vector<String>());
				String[] items = {};
				languageCombo.setItems(languageDirectory.keySet().toArray(items));
			}
			languageDirectory.get(language).add(version);
		}

		private void noLanguageSelected() {
			for (LanguageSelectedListener listener : this.languageSelectedListeners) {
				listener.noLanguageSelected();
			}
		}

		private int searchStringInCombo(Combo aCombo, String searchString) {
			String[] items = aCombo.getItems();
			int numberOfItems = items.length;

			int searchedIndex = 0;
			for (int i = 0; i < numberOfItems && !items[searchedIndex].equals(searchString); i++) {
				searchedIndex++;
			}

			return searchedIndex;
		}

		@Override
		public String getSelectedLanguage() {
			return languageCombo.getItem(languageCombo.getSelectionIndex());
		}

		@Override
		public String getSelectedVersion() {
			return versionCombo.getItem(versionCombo.getSelectionIndex());
		}

	}

	protected class LanguageSelectionRadioWidget extends Composite implements LanguageSelectionWidget {

		private Map<String, Collection<String>> languageDirectory;
		Composite languageRadioArea;

		Map<String, Composite> buttonRowList;
		Map<Button, String[]> buttonList;

		Vector<LanguageSelectedListener> languageSelectedListeners = new Vector<LanguageSelectedListener>();

		public LanguageSelectionRadioWidget(Composite parent, int style) {
			super(parent, style);
			this.setLayout(new RowLayout(SWT.VERTICAL));

			languageDirectory = new HashMap<String, Collection<String>>();

			Label languageLabel = new Label(this, SWT.NONE);
			languageLabel.setText("Expression Language");
			createDialogLanguageRadioButtons(this);

		}

		public void addLanguageSelectedListener(LanguageSelectedListener listener) {

			languageSelectedListeners.addElement(listener);

		}

		public void removeLanguageSelectedListener(LanguageSelectedListener listener) {

			languageSelectedListeners.removeElement(listener);

		}

		public void createDialogLanguageRadioButtons(Composite mainArea) {
			languageRadioArea = new Composite(mainArea, SWT.NONE);
			languageRadioArea.setLayout(new RowLayout(SWT.VERTICAL));
			buttonList = new HashMap<Button, String[]>();
			buttonRowList = new HashMap<String, Composite>();
		}

		protected void languageSelected(String language, String version) {
			LanguageSelectedEvent e = new LanguageSelectedEvent(this, language, version);

			for (LanguageSelectedListener listener : this.languageSelectedListeners) {
				listener.languageSelected(e);
			}

		}

		@Override
		public void setSelectedLanguage(String language, String version) {
			Button searchedButton = buttonList.keySet().iterator().next();
			for (Button aButton : buttonList.keySet()) {
				if (buttonList.get(aButton)[0].equals(language) && buttonList.get(aButton)[1].equals(version)) {
					searchedButton = aButton;
				}
				aButton.setSelection(false);
			}
			searchedButton.setSelection(true);
		}

		@Override
		public void addLanguageWithVersion(String language, String version) {
			if (!languageDirectory.containsKey(language)) {
				languageDirectory.put(language, new Vector<String>());
				Composite buttonRow = new Composite(this, SWT.NONE);
				buttonRow.setLayout(new RowLayout());
				buttonRowList.put(language, buttonRow);
			}
			languageDirectory.get(language).add(version);

			Listener listener = new Listener() {
				public void handleEvent(Event e) {
					for (Control aButton : buttonList.keySet()) {
						((Button) aButton).setSelection(false);
					}
					((Button) e.widget).setSelection(true);
					languageSelected(buttonList.get((Button) e.widget)[0], buttonList.get((Button) e.widget)[1]);
				}
			};

			Button tempButton = new Button(buttonRowList.get(language), SWT.RADIO);
			tempButton.setText(language.concat(" ").concat(version));
			tempButton.addListener(SWT.Selection, listener);
			String[] buttonInfo = new String[2];
			buttonInfo[0] = language;
			buttonInfo[1] = version;
			buttonList.put(tempButton, buttonInfo);

		}

		@Override
		public String getSelectedLanguage() {
			return getInfoOfSelectedButton(0);
		}

		@Override
		public String getSelectedVersion() {
			return getInfoOfSelectedButton(1);
		}

		private String getInfoOfSelectedButton(int indexOfInfo) {
			String resultString = "none";
			for (Button aButton : buttonList.keySet()) {
				if (aButton.getSelection()) {
					resultString = buttonList.get(aButton)[indexOfInfo];
				}
			}
			return resultString;
		}

	}

	public EditExpressionDialog(Shell parent) {
		super(parent);
		initializeSourceViewerProviders();
	}

	private void initializeSourceViewerProviders() {

		// This method accesses the extension point instead of using ExpressionUtils because this particular extension
		// point
		// belongs to the .modeling.diagram.custom package. ExpressionUtils provides access to the extension point in
		// .modeling
		if (Platform.getExtensionRegistry() != null) {
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
	public void create() {
		super.create();
	}

	@Override
	public boolean close() {
		this.disposeSourceViewerProviders();
		return super.close();
	}

	public void setExpectedReturnType(EClassifier classifier) {
		this.expectedReturnType = classifier;
	}

	public void setChangeAttributeCommand(Command changeAttributeCommand, EditingDomain transactionalEditingDomain) {

		this.editingDomain = transactionalEditingDomain;
	}

	public void setContextInformation(Map<String, EClassifier> contextInformation) {
		this.contextInformation = contextInformation;
	}

	public void setExpression(TextualExpression expression) {
		this.expression = expression;
		this.originalText = expression.getExpressionText();
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Expression getExpression() {
		return expression;
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog# createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {

		this.getShell().setText(DIALOG_TITLE);

		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new RowLayout(SWT.VERTICAL));

		if (ExpressionUtils.getAmountLanguages() <= RADIO_BUTTON_THRESHOLD_LANGUAGES
				&& ExpressionUtils.getMaximumAmountVersions() <= RADIO_BUTTON_THRESHOLD_VERSIONS) {
			languageChoosingWidget = new LanguageSelectionRadioWidget(composite, SWT.NONE);
		} else {
			languageChoosingWidget = new LanguageSelectionComboWidget(composite, SWT.NONE);
		}

		populateLanguageChoosingWidget(languageChoosingWidget);

		LanguageSelectedListener listener = new LanguageSelectedListener() {
			@Override
			public void languageSelected(LanguageSelectedEvent event) {
				changeSourceViewerTo(event.language, event.version);
			}

			@Override
			public void noLanguageSelected() {
				changeToDefaultSourceViewer();
			}
		};

		languageChoosingWidget.addLanguageSelectedListener(listener);

		Composite expectedReturnArea = new Composite(composite, SWT.NONE);
		expectedReturnArea.setLayout(new RowLayout());
		Label expectedReturnLabel = new Label(expectedReturnArea, SWT.NONE);
		expectedReturnLabel.setText("Expected return Value:");
		Label expectedReturnValueLabel = new Label(expectedReturnArea, SWT.NONE);
		expectedReturnValueLabel.setText(this.getExpectedReturnString());

		languageEditingArea = new Composite(composite, SWT.NONE);
		languageEditingArea.setLayout(new StackLayout());
		languageEditingArea.setLayoutData(new RowData(DIALOG_WIDTH, SOURCEVIEWER_HEIGHT));

		initializeSourceViewers();
		composite.layout(false);
		languageEditingArea.layout(false);

		adjustDefaultSourceViewer();

		return composite;
	}

	private void populateLanguageChoosingWidget(LanguageSelectionWidget alanguageChoosingWidget) {
		for (String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
			for (String aVersion : ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
				alanguageChoosingWidget.addLanguageWithVersion(aLanguage, aVersion);
			}
		}
	}

	private void initializeSourceViewers() {
		sourceViewers = new HashMap<String, ISourceViewer>();
		if (contextInformation == null) {
			contextInformation = new LinkedHashMap<String, EClassifier>();
		}
		for (Entry<String, SourceViewerProvider> svpEntry : sourceViewerProviders.entrySet()) {
			ISourceViewer sv = svpEntry.getValue().createSourceViewer(languageEditingArea,
					SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, contextClassifier, contextInformation,
					originalText);
			sourceViewers.put(svpEntry.getKey(), sv);

			sv.getTextWidget().setVisible(false);
		}

		defaultSourceViewer = new SourceViewerProvider().createSourceViewer(languageEditingArea, SWT.BORDER | SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL, contextClassifier, contextInformation, originalText);
		currentSourceViewer = defaultSourceViewer;
		currentSourceViewer.getTextWidget().setVisible(true);
		((StackLayout) languageEditingArea.getLayout()).topControl = currentSourceViewer.getTextWidget();

		languageEditingArea.layout();
	}

	private void adjustDefaultSourceViewer() {
		if (ExpressionUtils.getAvailableExpressionLanguages().contains(DEFAULT_LANGUAGE)) {
			String availableVersion = ExpressionUtils.getAvailableExpressionLanguageVersions(DEFAULT_LANGUAGE).get(0);
			languageChoosingWidget.setSelectedLanguage(DEFAULT_LANGUAGE, availableVersion);
			changeSourceViewerTo(DEFAULT_LANGUAGE, availableVersion);
		}
	}

	private void changeSourceViewerTo(String language, String version) {
		changeSourceViewerTo(language.concat(version));
	}

	private void changeSourceViewerTo(String languageKey) {
		if (sourceViewers.containsKey(languageKey)) {
			placeSourceViewer(sourceViewers.get(languageKey));
		} else {
			changeToDefaultSourceViewer();
		}
	}

	private void changeToDefaultSourceViewer() {
		placeSourceViewer(defaultSourceViewer);
	}

	private void placeSourceViewer(ISourceViewer nextSourceViewer) {
		String text = currentSourceViewer.getDocument().get();
		nextSourceViewer.getDocument().set(text);
		currentSourceViewer.getTextWidget().setVisible(false);

		((StackLayout) languageEditingArea.getLayout()).topControl = nextSourceViewer.getTextWidget();
		nextSourceViewer.getTextWidget().setVisible(true);
		currentSourceViewer = nextSourceViewer;
		languageEditingArea.layout();
	}

	@Override
	protected void okPressed() {
		if (expression != null) {
			EStructuralFeature feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE;
			Command command = SetCommand.create(editingDomain, expression, feature, getSelectedLanguage());

			feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION;
			command.chain(SetCommand.create(editingDomain, expression, feature, getSelectedVersion()));

			feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT;
			command.chain(SetCommand
					.create(editingDomain, expression, feature, currentSourceViewer.getDocument().get()));

			editingDomain.getCommandStack().execute(command);
		}
		super.okPressed();
	}

	private String getSelectedLanguage() {
		return languageChoosingWidget.getSelectedLanguage();
	}

	private String getSelectedVersion() {
		return languageChoosingWidget.getSelectedVersion();
	}

	protected Map<String, EClassifier> getContextInformation() {
		Map<String, EClassifier> contextInfos = new HashMap<String, EClassifier>();

		if (activity != null) {
			/*
			 * THIS and parameters
			 */
			if (activity.getOwningOperation().getOperation() != null) {
				EClass thisClass = activity.getOwningOperation().getOperation().getEContainingClass();

				if (thisClass != null) {
					contextInfos.put("this", thisClass);
				}

				for (EParameter parameter : activity.getOwningOperation().getOperation().getEParameters()) {
					if (parameter.getName() != null && !"".equals(parameter) && parameter.getEType() != null) {
						contextInfos.put(parameter.getName(), parameter.getEType());
					}
				}
			}

			/*
			 * Variables created in story patterns and VariableDeclarationActions
			 */
			TreeIterator<EObject> it = activity.eAllContents();

			while (it.hasNext()) {
				EObject eObject = it.next();

				if (eObject instanceof ObjectVariable) {
					ObjectVariable spo = (ObjectVariable) eObject;

					if (spo.getName() != null && !"".equals(spo.getName()) && spo.getClassifier() != null) {
						contextInfos.put(spo.getName(), spo.getClassifier());
					}
				}
			}
		}

		return contextInfos;
	}

	private void disposeSourceViewerProviders() {
		for (SourceViewerProvider svp : sourceViewerProviders.values()) {
			svp.dispose();
		}
	}

	private String getExpectedReturnString() {
		return (this.expectedReturnType != null) ? this.expectedReturnType.getName() : "null";
	}
}

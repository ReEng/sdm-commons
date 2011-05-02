package org.storydriven.modeling.diagram.custom.expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
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
import org.storydriven.modeling.diagram.custom.SourceViewerProvider;
import org.storydriven.modeling.expressions.util.ExpressionUtils;


public class EditExpressionDialog extends Dialog {
	
	protected Combo languageCombo;
	protected Combo versionCombo;
	protected Composite languageEditingArea;
	
	protected Composite	languageRadioArea;
	protected List<Button> languageRadioButtons;

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
	
	public static final String EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID = "org.storydriven.modeling.diagram.custom.expressionSourceViewerExtension";
	public static final String EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
	public static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
	public static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";
	
	// Key for both Maps is the source viewers name concatenated with the source viewers version.
	private Map<String, SourceViewerProvider> sourceViewerProviders = new HashMap<String, SourceViewerProvider>();
	private HashMap<String, ISourceViewer> sourceViewers;
	private EClassifier contextClassifier;
	
	public EditExpressionDialog(Shell parent) {
		super(parent);
		initializeSourceViewerProviders();
	}

	private void initializeSourceViewerProviders() {

		// This method accesses the extension point instead of using ExpressionUtils because this particular extension point
		// belongs to the .modeling.diagram.custom package. ExpressionUtils provides access to the extension point in .modeling
		if (Platform.getExtensionRegistry() != null)
		{
			sourceViewerProviders = new HashMap<String, SourceViewerProvider>();

			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(
					EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID);

			for (IConfigurationElement configurationElement : configurationElements)
			{
				String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME);
				String v = configurationElement.getAttribute(EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME);

				if ((s != null && !("".equals(s))) && (v != null && !("".equals(v))))
				{
					try
					{
						sourceViewerProviders.put(s.concat(v), (SourceViewerProvider) configurationElement
								.createExecutableExtension(EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME));
					}
					catch (CoreException e)
					{
						// Skip it but show error message
						e.printStackTrace();
					}
				}
			}
		}

			for( String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
				for ( String aVersion: ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
					if(!sourceViewerProviders.containsKey(aLanguage.concat(aVersion))) {
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
		this.disposeSourceViewers();
		return super.close();
	}
	
	@Override
	protected void okPressed() {
		setReturnCode(OK);
		// Implement whatever we want to do here
		this.close();
	}

	/**
	   * @see org.eclipse.jface.dialogs.Dialog#
	   *      createDialogArea(org.eclipse.swt.widgets.Composite) 
	   */
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new RowLayout(SWT.VERTICAL));
		composite.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);

		Composite languageChoosing = new Composite(composite, SWT.NONE);
		

		if (ExpressionUtils.getAmountLanguages() <= RADIO_BUTTON_THRESHOLD_LANGUAGES
				&& ExpressionUtils.getMaximumAmountVersions() <= RADIO_BUTTON_THRESHOLD_VERSIONS) {
			languageChoosing.setLayout(new RowLayout(SWT.VERTICAL));
			Label languageLabel = new Label(languageChoosing, SWT.NONE);
			languageLabel.setText("Expression Language");
			createDialogLanguageRadioButtons(languageChoosing);
		} 
		else 
		{
			languageChoosing.setLayout(new GridLayout(2, false));
			Label languageLabel = new Label(languageChoosing, SWT.NONE);
			languageLabel.setText("Expression Language");
			createDialogLanguageCombo(languageChoosing);

			Label versionLabel = new Label(languageChoosing, SWT.NONE);
			versionLabel.setText("Language Version");
			createDialogVersionCombo(languageChoosing);
		}

		Composite expectedReturnArea = new Composite(composite, SWT.NONE);
		expectedReturnArea.setLayout(new RowLayout());
		Label expectedReturnLabel = new Label(expectedReturnArea, SWT.NONE);
		expectedReturnLabel.setText("Expected return Value:");
		Label expectedReturnValueLabel = new Label(expectedReturnArea, SWT.NONE);
		expectedReturnValueLabel.setText("null");
		
		languageEditingArea = new Composite(composite, SWT.NONE);
		languageEditingArea.setLayout(new StackLayout());
		languageEditingArea.setLayoutData(new RowData(DIALOG_WIDTH, SOURCEVIEWER_HEIGHT));
		
		initializeSourceViewers();
		composite.layout(false);
		languageEditingArea.layout(false);
		
		this.getShell().setText(DIALOG_TITLE);
		
		adjustDefaultSourceViewer();
		
		return composite;
	}

	private void adjustDefaultSourceViewer() {
		if(ExpressionUtils.getAvailableExpressionLanguages().contains(DEFAULT_LANGUAGE)) {
			String searchString = DEFAULT_LANGUAGE.concat(
					ExpressionUtils.getAvailableExpressionLanguageVersions(DEFAULT_LANGUAGE).get(0));
			changeSourceViewerTo(searchString);

			if (ExpressionUtils.getAmountLanguages() <= RADIO_BUTTON_THRESHOLD_LANGUAGES
					&& ExpressionUtils.getMaximumAmountVersions() <= RADIO_BUTTON_THRESHOLD_VERSIONS) {

				// In case we have Radio Buttons as selection widgets.
				for(Button aButton : languageRadioButtons) {
					if(aButton.getText().equals(searchString)) {
						aButton.setSelection(true);
						changeSourceViewerTo(searchString);
					}
				}
			} else 
			{
				// In case we have Combos as selection widgets.
				for(int i = 0; i < languageCombo.getItemCount(); i++) {
					if(languageCombo.getItem(i).equals(DEFAULT_LANGUAGE)) {
						languageCombo.select(i);
						changeDialogVersionCombo(DEFAULT_LANGUAGE);
						versionCombo.select(0);
					}
				}
			}
		} 
				
	}

	private void createDialogLanguageCombo(Composite languageChoosingArea) {
		languageCombo = new Combo(languageChoosingArea, SWT.DROP_DOWN);
		languageCombo.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
		String[] items =  {};
		languageCombo.setItems((String[]) ExpressionUtils.getAvailableExpressionLanguages().toArray(items));
		
		languageCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				changeDialogVersionCombo(languageCombo.getItem(languageCombo.getSelectionIndex()));
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				String[] emptyBuffer = {};
				versionCombo.setItems(emptyBuffer);
				changeToDefaultSourceViewer();
			}
		});
	}
	
	private void changeDialogVersionCombo(String language) {
		String[] emptyBuffer = {};
		versionCombo.setItems(ExpressionUtils.getAvailableExpressionLanguageVersions(language).toArray(emptyBuffer));
	}
	
	private void createDialogVersionCombo(Composite languageChoosingArea) {
		versionCombo = new Combo(languageChoosingArea, SWT.DROP_DOWN);
		versionCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false));
		String[] items =  {};
		versionCombo.setItems(items);	
		
		versionCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				changeSourceViewerTo(languageCombo.getItem(languageCombo.getSelectionIndex()), 
									versionCombo.getItem(versionCombo.getSelectionIndex()));
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				changeToDefaultSourceViewer();
			}

		});
	}
	
	private void createDialogLanguageRadioButtons(Composite languageChoosingArea) {
		languageRadioArea = new Composite(languageChoosingArea, SWT.NONE);
		languageRadioArea.setLayout(new RowLayout(SWT.VERTICAL));
		languageRadioButtons = new ArrayList<Button>();
		
		Listener listener = new Listener() {
             public void handleEvent (Event e) {
            	 	for( Control aButton : languageRadioButtons) {
            	 		((Button) aButton).setSelection(false);
            	 	}
            	 	((Button)e.widget).setSelection(true);
                     changeSourceViewerTo(((Button)e.widget).getText());
             }
		 };
		
		Button tempButton;
		Composite buttonRow;
		for( String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
			buttonRow = new Composite(languageRadioArea, SWT.NONE);
			buttonRow.setLayout(new RowLayout());
			for (String aVersion : ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
				tempButton = new Button(buttonRow, SWT.RADIO);
				tempButton.setText(aLanguage.concat(aVersion));
				tempButton.addListener(SWT.Selection, listener);
				languageRadioButtons.add(tempButton);
			}
		}
		
	}

//	TODO Deprecated & Deletion with next revision	
//	private void changeVersionButtons(String languageName) {
//		for( Control aButton : ((Composite)((StackLayout)versionRadioButtonsArea.getLayout()).topControl).getChildren()) {
//			((Button) aButton).setSelection(false);
//		}
//		
//		((StackLayout)versionRadioButtonsArea.getLayout()).topControl = versionSelectionAreas.get(languageName);
//		versionRadioButtonsArea.layout();
//	}
//
//	private void createDialogVersionRadioButtons(Composite languageChoosingArea) {
//		versionRadioButtonsArea = new Composite(languageChoosingArea, SWT.NONE);
//		versionRadioButtonsArea.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
//		versionRadioButtonsArea.setLayout(new StackLayout());
//		versionSelectionAreas = new HashMap<String, Composite>();
//		
//		Listener listener = new Listener() {
//            public void handleEvent (Event e) {
//            		Button tempButton = null;
//            		for(Button aButton : languageRadioButtons) {
//            			if(aButton.getSelection()) {
//            				tempButton = aButton;
//            			}
//            		}
//            		if(tempButton != null) {
//            			changeSourceViewerTo(tempButton.getText(), ((Button)e.widget).getText());
//            		}
//            }
//		 };
//		
//		Composite tempComposite;
//		Button	  tempButton;
//		 
//		for(String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
//			tempComposite = new Composite(versionRadioButtonsArea, SWT.NONE | SWT.BORDER);
//			tempComposite.setLayout(new RowLayout());
//			
//			for(String aVersion : ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
//				tempButton = new Button(tempComposite, SWT.RADIO);
//				tempButton.setText(aVersion);
//				tempButton.addListener(SWT.Selection, listener);
//			}
//			tempComposite.layout();
//			versionSelectionAreas.put(aLanguage, tempComposite);
//		}
//	}
//	
	private void initializeSourceViewers() {
		sourceViewers = new HashMap<String, ISourceViewer>();

		for (Entry<String, SourceViewerProvider> svpEntry : sourceViewerProviders.entrySet())
		{
			ISourceViewer sv = svpEntry.getValue().createSourceViewer(languageEditingArea, 
																	SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, 
																	contextClassifier,
																	getContextInformation(), 
																	"");
			sourceViewers.put(svpEntry.getKey(), sv);

			sv.getTextWidget().setVisible(false);
		}

		defaultSourceViewer = new SourceViewerProvider().createSourceViewer(languageEditingArea, 
				SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, 
				contextClassifier,
				getContextInformation(), 
				"");
		currentSourceViewer = defaultSourceViewer;
		currentSourceViewer.getTextWidget().setVisible(true);
		((StackLayout) languageEditingArea.getLayout()).topControl = currentSourceViewer.getTextWidget();
		
		languageEditingArea.layout();
	}

	private void disposeSourceViewers() {
		// TODO Auto-generated method stub
		
	}
	
	private Map<String, EClassifier> getContextInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	private void changeSourceViewerTo(String language, String version) {
		changeSourceViewerTo(language.concat(version));
	}

	private void changeSourceViewerTo(String languageVersion) {
		if(sourceViewers.containsKey(languageVersion)) {
			placeSourceViewer(sourceViewers.get(languageVersion));
		}
		else 
		{
			changeToDefaultSourceViewer();
		}
		
	}
	
	private void changeToDefaultSourceViewer() {
		placeSourceViewer(defaultSourceViewer);
	}

	private void placeSourceViewer(ISourceViewer nextSourceViewer) {
		nextSourceViewer.setDocument(currentSourceViewer.getDocument());
		currentSourceViewer.getTextWidget().setVisible(false);
		
		((StackLayout) languageEditingArea.getLayout()).topControl = nextSourceViewer.getTextWidget();
		nextSourceViewer.getTextWidget().setVisible(true);
		currentSourceViewer = nextSourceViewer;
		languageEditingArea.layout();
	}
}

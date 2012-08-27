package org.storydriven.storydiagrams.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableNameLabelEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.parsers.MessageFormatParser;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityCallNodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getActivityCallNodeName_5001Parser() {
		if (activityCallNodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			activityCallNodeName_5001Parser = parser;
		}
		return activityCallNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser statementNodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5003Parser() {
		if (statementNodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			statementNodeName_5003Parser = parser;
		}
		return statementNodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser modifyingStoryNodeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getModifyingStoryNodeName_5011Parser() {
		if (modifyingStoryNodeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			modifyingStoryNodeName_5011Parser = parser;
		}
		return modifyingStoryNodeName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchingStoryNodeName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMatchingStoryNodeName_5012Parser() {
		if (matchingStoryNodeName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			matchingStoryNodeName_5012Parser = parser;
		}
		return matchingStoryNodeName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionVariableName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionVariableName_5006Parser() {
		if (collectionVariableName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			collectionVariableName_5006Parser = parser;
		}
		return collectionVariableName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectVariableName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getObjectVariableName_5009Parser() {
		if (objectVariableName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			objectVariableName_5009Parser = parser;
		}
		return objectVariableName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityCallNodeNameEditPart.VISUAL_ID:
			return getActivityCallNodeName_5001Parser();
		case StatementNodeNameEditPart.VISUAL_ID:
			return getStatementNodeName_5003Parser();
		case ModifyingStoryNodeNameEditPart.VISUAL_ID:
			return getModifyingStoryNodeName_5011Parser();
		case MatchingStoryNodeNameEditPart.VISUAL_ID:
			return getMatchingStoryNodeName_5012Parser();
		case CollectionVariableNameLabelEditPart.VISUAL_ID:
			return getCollectionVariableName_5006Parser();
		case ObjectVariableNameEditPart.VISUAL_ID:
			return getObjectVariableName_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(StorydiagramsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(StorydiagramsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (StorydiagramsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

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
import org.storydriven.storydiagrams.diagram.edit.parts.CollectionVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.parsers.MessageFormatParser;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityCallNodeName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getActivityCallNodeName_5032Parser() {
		if (activityCallNodeName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			activityCallNodeName_5032Parser = parser;
		}
		return activityCallNodeName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser statementNodeName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5034Parser() {
		if (statementNodeName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			statementNodeName_5034Parser = parser;
		}
		return statementNodeName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser modifyingStoryNodeName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getModifyingStoryNodeName_5042Parser() {
		if (modifyingStoryNodeName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			modifyingStoryNodeName_5042Parser = parser;
		}
		return modifyingStoryNodeName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchingStoryNodeName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getMatchingStoryNodeName_5043Parser() {
		if (matchingStoryNodeName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			matchingStoryNodeName_5043Parser = parser;
		}
		return matchingStoryNodeName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectVariableName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getObjectVariableName_5037Parser() {
		if (objectVariableName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			objectVariableName_5037Parser = parser;
		}
		return objectVariableName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionVariableName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionVariableName_5040Parser() {
		if (collectionVariableName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			collectionVariableName_5040Parser = parser;
		}
		return collectionVariableName_5040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityCallNodeNameEditPart.VISUAL_ID:
			return getActivityCallNodeName_5032Parser();
		case StatementNodeNameEditPart.VISUAL_ID:
			return getStatementNodeName_5034Parser();
		case ModifyingStoryNodeNameEditPart.VISUAL_ID:
			return getModifyingStoryNodeName_5042Parser();
		case MatchingStoryNodeNameEditPart.VISUAL_ID:
			return getMatchingStoryNodeName_5043Parser();
		case ObjectVariableNameEditPart.VISUAL_ID:
			return getObjectVariableName_5037Parser();
		case CollectionVariableNameEditPart.VISUAL_ID:
			return getCollectionVariableName_5040Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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

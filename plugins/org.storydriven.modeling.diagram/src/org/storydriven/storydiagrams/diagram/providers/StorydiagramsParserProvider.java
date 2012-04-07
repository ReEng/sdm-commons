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
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.PrimitiveVariableNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StructuredNodeNameEditPart;
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
	private IParser statementNodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5001Parser() {
		if (statementNodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			statementNodeName_5001Parser = parser;
		}
		return statementNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredNodeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredNodeName_5010Parser() {
		if (structuredNodeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			structuredNodeName_5010Parser = parser;
		}
		return structuredNodeName_5010Parser;
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
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			modifyingStoryNodeName_5011Parser = parser;
		}
		return modifyingStoryNodeName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityCallNodeName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getActivityCallNodeName_5012Parser() {
		if (activityCallNodeName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			activityCallNodeName_5012Parser = parser;
		}
		return activityCallNodeName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser statementNodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getStatementNodeName_5002Parser() {
		if (statementNodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			statementNodeName_5002Parser = parser;
		}
		return statementNodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser structuredNodeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredNodeName_5009Parser() {
		if (structuredNodeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			structuredNodeName_5009Parser = parser;
		}
		return structuredNodeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser modifyingStoryNodeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getModifyingStoryNodeName_5008Parser() {
		if (modifyingStoryNodeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			modifyingStoryNodeName_5008Parser = parser;
		}
		return modifyingStoryNodeName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectVariableName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getObjectVariableName_5003Parser() {
		if (objectVariableName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			objectVariableName_5003Parser = parser;
		}
		return objectVariableName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveVariableName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveVariableName_5006Parser() {
		if (primitiveVariableName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			primitiveVariableName_5006Parser = parser;
		}
		return primitiveVariableName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StatementNodeNameEditPart.VISUAL_ID:
			return getStatementNodeName_5001Parser();
		case StructuredNodeNameEditPart.VISUAL_ID:
			return getStructuredNodeName_5010Parser();
		case ModifyingStoryNodeNameEditPart.VISUAL_ID:
			return getModifyingStoryNodeName_5011Parser();
		case ActivityCallNodeNameEditPart.VISUAL_ID:
			return getActivityCallNodeName_5012Parser();
		case StatementNodeName2EditPart.VISUAL_ID:
			return getStatementNodeName_5002Parser();
		case StructuredNodeName2EditPart.VISUAL_ID:
			return getStructuredNodeName_5009Parser();
		case ModifyingStoryNodeName2EditPart.VISUAL_ID:
			return getModifyingStoryNodeName_5008Parser();
		case ObjectVariableNameEditPart.VISUAL_ID:
			return getObjectVariableName_5003Parser();
		case PrimitiveVariableNameEditPart.VISUAL_ID:
			return getPrimitiveVariableName_5006Parser();
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

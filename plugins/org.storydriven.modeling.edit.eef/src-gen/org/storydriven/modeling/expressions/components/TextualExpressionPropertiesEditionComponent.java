/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.expressions.parts.TextualExpressionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TextualExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TextualExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textualExpression, String editing_mode) {
		super(editingContext, textualExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.TextualExpression.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final TextualExpression textualExpression = (TextualExpression)elt;
			final TextualExpressionPropertiesEditionPart basePart = (TextualExpressionPropertiesEditionPart)editingPart;
			// init values
			if (textualExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textualExpression.getComment()));
			
			if (textualExpression.getExpressionText() != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.expressionText))
				basePart.setExpressionText(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textualExpression.getExpressionText()));
			
			if (textualExpression.getLanguage() != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.language))
				basePart.setLanguage(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textualExpression.getLanguage()));
			
			if (textualExpression.getLanguageVersion() != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion))
				basePart.setLanguageVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textualExpression.getLanguageVersion()));
			
			// init filters
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ExpressionsViewsRepository.TextualExpression.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.TextualExpression.Properties.expressionText) {
			return ExpressionsPackage.eINSTANCE.getTextualExpression_ExpressionText();
		}
		if (editorKey == ExpressionsViewsRepository.TextualExpression.Properties.language) {
			return ExpressionsPackage.eINSTANCE.getTextualExpression_Language();
		}
		if (editorKey == ExpressionsViewsRepository.TextualExpression.Properties.languageVersion) {
			return ExpressionsPackage.eINSTANCE.getTextualExpression_LanguageVersion();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TextualExpression textualExpression = (TextualExpression)semanticObject;
		if (ExpressionsViewsRepository.TextualExpression.Properties.comment == event.getAffectedEditor()) {
			textualExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.TextualExpression.Properties.expressionText == event.getAffectedEditor()) {
			textualExpression.setExpressionText((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.TextualExpression.Properties.language == event.getAffectedEditor()) {
			textualExpression.setLanguage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.TextualExpression.Properties.languageVersion == event.getAffectedEditor()) {
			textualExpression.setLanguageVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TextualExpressionPropertiesEditionPart basePart = (TextualExpressionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getTextualExpression_ExpressionText().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.expressionText)) {
				if (msg.getNewValue() != null) {
					basePart.setExpressionText(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExpressionText("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getTextualExpression_Language().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.language)) {
				if (msg.getNewValue() != null) {
					basePart.setLanguage(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLanguage("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getTextualExpression_LanguageVersion().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.TextualExpression.Properties.languageVersion)) {
				if (msg.getNewValue() != null) {
					basePart.setLanguageVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLanguageVersion("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.TextualExpression.Properties.expressionText || key == ExpressionsViewsRepository.TextualExpression.Properties.language;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ExpressionsViewsRepository.TextualExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.TextualExpression.Properties.expressionText == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ExpressionsPackage.eINSTANCE.getTextualExpression_ExpressionText().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getTextualExpression_ExpressionText().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.TextualExpression.Properties.language == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ExpressionsPackage.eINSTANCE.getTextualExpression_Language().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getTextualExpression_Language().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.TextualExpression.Properties.languageVersion == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ExpressionsPackage.eINSTANCE.getTextualExpression_LanguageVersion().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getTextualExpression_LanguageVersion().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}

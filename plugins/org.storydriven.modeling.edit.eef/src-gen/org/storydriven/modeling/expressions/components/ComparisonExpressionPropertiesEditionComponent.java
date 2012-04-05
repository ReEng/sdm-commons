/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
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
import org.storydriven.modeling.expressions.ComparingOperator;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.parts.ComparisonExpressionPropertiesEditionPart;
import org.storydriven.modeling.expressions.parts.ExpressionsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ComparisonExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ComparisonExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject comparisonExpression, String editing_mode) {
		super(editingContext, comparisonExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.ComparisonExpression.class;
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
			final ComparisonExpression comparisonExpression = (ComparisonExpression)elt;
			final ComparisonExpressionPropertiesEditionPart basePart = (ComparisonExpressionPropertiesEditionPart)editingPart;
			// init values
			if (comparisonExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.ComparisonExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), comparisonExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.ComparisonExpression.Properties.operator)) {
				basePart.initOperator((EEnum) ExpressionsPackage.eINSTANCE.getComparisonExpression_Operator().getEType(), comparisonExpression.getOperator());
			}
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
		if (editorKey == ExpressionsViewsRepository.ComparisonExpression.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.ComparisonExpression.Properties.operator) {
			return ExpressionsPackage.eINSTANCE.getComparisonExpression_Operator();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ComparisonExpression comparisonExpression = (ComparisonExpression)semanticObject;
		if (ExpressionsViewsRepository.ComparisonExpression.Properties.comment == event.getAffectedEditor()) {
			comparisonExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.ComparisonExpression.Properties.operator == event.getAffectedEditor()) {
			comparisonExpression.setOperator((ComparingOperator)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ComparisonExpressionPropertiesEditionPart basePart = (ComparisonExpressionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ComparisonExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getComparisonExpression_Operator().equals(msg.getFeature()) && isAccessible(ExpressionsViewsRepository.ComparisonExpression.Properties.operator))
				basePart.setOperator((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.ComparisonExpression.Properties.operator;
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
				if (ExpressionsViewsRepository.ComparisonExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.ComparisonExpression.Properties.operator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ExpressionsPackage.eINSTANCE.getComparisonExpression_Operator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getComparisonExpression_Operator().getEAttributeType(), newValue);
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

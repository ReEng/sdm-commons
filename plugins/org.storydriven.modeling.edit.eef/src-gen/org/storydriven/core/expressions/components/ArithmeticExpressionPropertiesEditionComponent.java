/**
 * Generated with Acceleo
 */
package org.storydriven.core.expressions.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ArithmeticExpression;
import org.storydriven.core.expressions.ArithmeticOperator;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.parts.ArithmeticExpressionPropertiesEditionPart;
import org.storydriven.core.expressions.parts.ExpressionsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ArithmeticExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArithmeticExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject arithmeticExpression, String editing_mode) {
		super(editingContext, arithmeticExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.ArithmeticExpression.class;
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
			final ArithmeticExpression arithmeticExpression = (ArithmeticExpression)elt;
			final ArithmeticExpressionPropertiesEditionPart basePart = (ArithmeticExpressionPropertiesEditionPart)editingPart;
			// init values
			if (arithmeticExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.ArithmeticExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), arithmeticExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.ArithmeticExpression.Properties.operator)) {
				basePart.initOperator(EEFUtils.choiceOfValues(arithmeticExpression, ExpressionsPackage.eINSTANCE.getArithmeticExpression_Operator()), arithmeticExpression.getOperator());
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
		if (editorKey == ExpressionsViewsRepository.ArithmeticExpression.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.ArithmeticExpression.Properties.operator) {
			return ExpressionsPackage.eINSTANCE.getArithmeticExpression_Operator();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArithmeticExpression arithmeticExpression = (ArithmeticExpression)semanticObject;
		if (ExpressionsViewsRepository.ArithmeticExpression.Properties.comment == event.getAffectedEditor()) {
			arithmeticExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.ArithmeticExpression.Properties.operator == event.getAffectedEditor()) {
			arithmeticExpression.setOperator((ArithmeticOperator)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ArithmeticExpressionPropertiesEditionPart basePart = (ArithmeticExpressionPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ArithmeticExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getArithmeticExpression_Operator().equals(msg.getFeature()) && isAccessible(ExpressionsViewsRepository.ArithmeticExpression.Properties.operator))
				basePart.setOperator((ArithmeticOperator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.ArithmeticExpression.Properties.operator;
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
				if (ExpressionsViewsRepository.ArithmeticExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.ArithmeticExpression.Properties.operator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ExpressionsPackage.eINSTANCE.getArithmeticExpression_Operator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getArithmeticExpression_Operator().getEAttributeType(), newValue);
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

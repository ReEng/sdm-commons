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
import org.storydriven.core.expressions.BinaryLogicExpression;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.LogicOperator;
import org.storydriven.core.expressions.parts.BinaryLogicExpressionPropertiesEditionPart;
import org.storydriven.core.expressions.parts.ExpressionsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BinaryLogicExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public BinaryLogicExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject binaryLogicExpression, String editing_mode) {
		super(editingContext, binaryLogicExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.BinaryLogicExpression.class;
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
			final BinaryLogicExpression binaryLogicExpression = (BinaryLogicExpression)elt;
			final BinaryLogicExpressionPropertiesEditionPart basePart = (BinaryLogicExpressionPropertiesEditionPart)editingPart;
			// init values
			if (binaryLogicExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), binaryLogicExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator)) {
				basePart.initOperator(EEFUtils.choiceOfValues(binaryLogicExpression, ExpressionsPackage.eINSTANCE.getBinaryLogicExpression_Operator()), binaryLogicExpression.getOperator());
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
		if (editorKey == ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator) {
			return ExpressionsPackage.eINSTANCE.getBinaryLogicExpression_Operator();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BinaryLogicExpression binaryLogicExpression = (BinaryLogicExpression)semanticObject;
		if (ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment == event.getAffectedEditor()) {
			binaryLogicExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator == event.getAffectedEditor()) {
			binaryLogicExpression.setOperator((LogicOperator)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BinaryLogicExpressionPropertiesEditionPart basePart = (BinaryLogicExpressionPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getBinaryLogicExpression_Operator().equals(msg.getFeature()) && isAccessible(ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator))
				basePart.setOperator((LogicOperator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator;
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
				if (ExpressionsViewsRepository.BinaryLogicExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ExpressionsViewsRepository.BinaryLogicExpression.Properties.operator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ExpressionsPackage.eINSTANCE.getBinaryLogicExpression_Operator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ExpressionsPackage.eINSTANCE.getBinaryLogicExpression_Operator().getEAttributeType(), newValue);
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

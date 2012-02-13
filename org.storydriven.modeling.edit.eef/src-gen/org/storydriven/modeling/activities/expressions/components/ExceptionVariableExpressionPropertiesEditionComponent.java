/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.expressions.components;

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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.activities.expressions.ExceptionVariableExpression;
import org.storydriven.modeling.activities.expressions.ExpressionsPackage;
import org.storydriven.modeling.activities.expressions.parts.ExceptionVariableExpressionPropertiesEditionPart;
import org.storydriven.modeling.activities.expressions.parts.ExpressionsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ExceptionVariableExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for exceptionVariable EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings exceptionVariableSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExceptionVariableExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject exceptionVariableExpression, String editing_mode) {
		super(editingContext, exceptionVariableExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.ExceptionVariableExpression.class;
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
			final ExceptionVariableExpression exceptionVariableExpression = (ExceptionVariableExpression)elt;
			final ExceptionVariableExpressionPropertiesEditionPart basePart = (ExceptionVariableExpressionPropertiesEditionPart)editingPart;
			// init values
			if (exceptionVariableExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), exceptionVariableExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable)) {
				// init part
				exceptionVariableSettings = new EObjectFlatComboSettings(exceptionVariableExpression, ExpressionsPackage.eINSTANCE.getExceptionVariableExpression_ExceptionVariable());
				basePart.initExceptionVariable(exceptionVariableSettings);
				// set the button mode
				basePart.setExceptionVariableButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToExceptionVariable(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ExceptionVariable);
				}
			
			});
			// Start of user code for additional businessfilters for exceptionVariable
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable) {
			return ExpressionsPackage.eINSTANCE.getExceptionVariableExpression_ExceptionVariable();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExceptionVariableExpression exceptionVariableExpression = (ExceptionVariableExpression)semanticObject;
		if (ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment == event.getAffectedEditor()) {
			exceptionVariableExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				exceptionVariableSettings.setToReference((ExceptionVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ExceptionVariable eObject = ActivitiesFactory.eINSTANCE.createExceptionVariable();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				exceptionVariableSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ExceptionVariableExpressionPropertiesEditionPart basePart = (ExceptionVariableExpressionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getExceptionVariableExpression_ExceptionVariable().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable))
				basePart.setExceptionVariable((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.ExceptionVariableExpression.Properties.exceptionVariable;
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
				if (ExpressionsViewsRepository.ExceptionVariableExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
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

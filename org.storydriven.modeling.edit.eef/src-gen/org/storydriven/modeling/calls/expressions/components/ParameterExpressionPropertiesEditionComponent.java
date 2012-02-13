/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.expressions.components;

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
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.calls.expressions.ExpressionsPackage;
import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.calls.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.modeling.calls.expressions.parts.ParameterExpressionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ParameterExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for parameter EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings parameterSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParameterExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameterExpression, String editing_mode) {
		super(editingContext, parameterExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.ParameterExpression.class;
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
			final ParameterExpression parameterExpression = (ParameterExpression)elt;
			final ParameterExpressionPropertiesEditionPart basePart = (ParameterExpressionPropertiesEditionPart)editingPart;
			// init values
			if (parameterExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.ParameterExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), parameterExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.ParameterExpression.Properties.parameter)) {
				// init part
				parameterSettings = new EObjectFlatComboSettings(parameterExpression, ExpressionsPackage.eINSTANCE.getParameterExpression_Parameter());
				basePart.initParameter(parameterSettings);
				// set the button mode
				basePart.setParameterButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToParameter(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ParameterExtension); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for parameter
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
		if (editorKey == ExpressionsViewsRepository.ParameterExpression.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.ParameterExpression.Properties.parameter) {
			return ExpressionsPackage.eINSTANCE.getParameterExpression_Parameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ParameterExpression parameterExpression = (ParameterExpression)semanticObject;
		if (ExpressionsViewsRepository.ParameterExpression.Properties.comment == event.getAffectedEditor()) {
			parameterExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.ParameterExpression.Properties.parameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parameterSettings.setToReference((ParameterExtension)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ParameterExtension eObject = CallsFactory.eINSTANCE.createParameterExtension();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parameterSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ParameterExpressionPropertiesEditionPart basePart = (ParameterExpressionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ParameterExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getParameterExpression_Parameter().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ParameterExpression.Properties.parameter))
				basePart.setParameter((EObject)msg.getNewValue());
			
		}
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
				if (ExpressionsViewsRepository.ParameterExpression.Properties.comment == event.getAffectedEditor()) {
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

/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.expressions.components;

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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.calls.expressions.parts.MethodCallExpressionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class MethodCallExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for callee EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings calleeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodCallExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject methodCallExpression, String editing_mode) {
		super(editingContext, methodCallExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.MethodCallExpression.class;
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
			final MethodCallExpression methodCallExpression = (MethodCallExpression)elt;
			final MethodCallExpressionPropertiesEditionPart basePart = (MethodCallExpressionPropertiesEditionPart)editingPart;
			// init values
			if (methodCallExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.MethodCallExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), methodCallExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.MethodCallExpression.Properties.callee)) {
				// init part
				calleeSettings = new EObjectFlatComboSettings(methodCallExpression, CallsPackage.eINSTANCE.getInvocation_Callee());
				basePart.initCallee(calleeSettings);
				// set the button mode
				basePart.setCalleeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToCallee(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Callable); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for callee
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
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ExpressionsViewsRepository.MethodCallExpression.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.MethodCallExpression.Properties.callee) {
			return CallsPackage.eINSTANCE.getInvocation_Callee();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MethodCallExpression methodCallExpression = (MethodCallExpression)semanticObject;
		if (ExpressionsViewsRepository.MethodCallExpression.Properties.comment == event.getAffectedEditor()) {
			methodCallExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.MethodCallExpression.Properties.callee == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				calleeSettings.setToReference((Callable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, calleeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			MethodCallExpressionPropertiesEditionPart basePart = (MethodCallExpressionPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.MethodCallExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getInvocation_Callee().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.MethodCallExpression.Properties.callee))
				basePart.setCallee((EObject)msg.getNewValue());
			
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
				if (ExpressionsViewsRepository.MethodCallExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
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

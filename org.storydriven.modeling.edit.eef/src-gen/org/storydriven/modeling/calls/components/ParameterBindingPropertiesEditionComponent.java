/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
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
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.Invocation;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.parts.CallsViewsRepository;
import org.storydriven.modeling.calls.parts.ParameterBindingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ParameterBindingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for parameter EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings parameterSettings;
	
	/**
	 * Settings for invocation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings invocationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParameterBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameterBinding, String editing_mode) {
		super(editingContext, parameterBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CallsViewsRepository.class;
		partKey = CallsViewsRepository.ParameterBinding.class;
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
			final ParameterBinding parameterBinding = (ParameterBinding)elt;
			final ParameterBindingPropertiesEditionPart basePart = (ParameterBindingPropertiesEditionPart)editingPart;
			// init values
			if (parameterBinding.getComment() != null && isAccessible(CallsViewsRepository.ParameterBinding.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), parameterBinding.getComment()));
			
			if (isAccessible(CallsViewsRepository.ParameterBinding.Properties.parameter)) {
				// init part
				parameterSettings = new EObjectFlatComboSettings(parameterBinding, CallsPackage.eINSTANCE.getParameterBinding_Parameter());
				basePart.initParameter(parameterSettings);
				// set the button mode
				basePart.setParameterButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CallsViewsRepository.ParameterBinding.Properties.invocation)) {
				// init part
				invocationSettings = new EObjectFlatComboSettings(parameterBinding, CallsPackage.eINSTANCE.getParameterBinding_Invocation());
				basePart.initInvocation(invocationSettings);
				// set the button mode
				basePart.setInvocationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToParameter(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof EParameter); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for parameter
			// End of user code
			
			basePart.addFilterToInvocation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Invocation);
				}
			
			});
			// Start of user code for additional businessfilters for invocation
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
		if (editorKey == CallsViewsRepository.ParameterBinding.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == CallsViewsRepository.ParameterBinding.Properties.parameter) {
			return CallsPackage.eINSTANCE.getParameterBinding_Parameter();
		}
		if (editorKey == CallsViewsRepository.ParameterBinding.Properties.invocation) {
			return CallsPackage.eINSTANCE.getParameterBinding_Invocation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ParameterBinding parameterBinding = (ParameterBinding)semanticObject;
		if (CallsViewsRepository.ParameterBinding.Properties.comment == event.getAffectedEditor()) {
			parameterBinding.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (CallsViewsRepository.ParameterBinding.Properties.parameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parameterSettings.setToReference((EParameter)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EParameter eObject = EcoreFactory.eINSTANCE.createEParameter();
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
		if (CallsViewsRepository.ParameterBinding.Properties.invocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				invocationSettings.setToReference((Invocation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, invocationSettings, editingContext.getAdapterFactory());
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
			ParameterBindingPropertiesEditionPart basePart = (ParameterBindingPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.ParameterBinding.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getParameterBinding_Parameter().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.ParameterBinding.Properties.parameter))
				basePart.setParameter((EObject)msg.getNewValue());
			if (CallsPackage.eINSTANCE.getParameterBinding_Invocation().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.ParameterBinding.Properties.invocation))
				basePart.setInvocation((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CallsViewsRepository.ParameterBinding.Properties.invocation;
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
				if (CallsViewsRepository.ParameterBinding.Properties.comment == event.getAffectedEditor()) {
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

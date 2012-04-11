/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.calls.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.parts.CallsViewsRepository;
import org.storydriven.storydiagrams.calls.parts.OpaqueCallablePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class OpaqueCallablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for inParameter ReferencesTable
	 */
	private	ReferencesTableSettings inParameterSettings;
	
	/**
	 * Settings for outParameter ReferencesTable
	 */
	private	ReferencesTableSettings outParameterSettings;
	
	/**
	 * Settings for callExpression EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings callExpressionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OpaqueCallablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject opaqueCallable, String editing_mode) {
		super(editingContext, opaqueCallable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CallsViewsRepository.class;
		partKey = CallsViewsRepository.OpaqueCallable.class;
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
			final OpaqueCallable opaqueCallable = (OpaqueCallable)elt;
			final OpaqueCallablePropertiesEditionPart basePart = (OpaqueCallablePropertiesEditionPart)editingPart;
			// init values
			if (opaqueCallable.getComment() != null && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), opaqueCallable.getComment()));
			
			if (isAccessible(CallsViewsRepository.OpaqueCallable.Properties.inParameter)) {
				inParameterSettings = new ReferencesTableSettings(opaqueCallable, CallsPackage.eINSTANCE.getCallable_InParameter());
				basePart.initInParameter(inParameterSettings);
			}
			if (isAccessible(CallsViewsRepository.OpaqueCallable.Properties.outParameter)) {
				outParameterSettings = new ReferencesTableSettings(opaqueCallable, CallsPackage.eINSTANCE.getCallable_OutParameter());
				basePart.initOutParameter(outParameterSettings);
			}
			if (opaqueCallable.getName() != null && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), opaqueCallable.getName()));
			
			if (isAccessible(CallsViewsRepository.OpaqueCallable.Properties.callExpression)) {
				// init part
				callExpressionSettings = new EObjectFlatComboSettings(opaqueCallable, CallsPackage.eINSTANCE.getOpaqueCallable_CallExpression());
				basePart.initCallExpression(callExpressionSettings);
				// set the button mode
				basePart.setCallExpressionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToInParameter(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInParameterTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToInParameter(new EObjectFilter(EcorePackage.eINSTANCE.getEParameter()));
			// Start of user code for additional businessfilters for inParameter
			// End of user code
			
			basePart.addFilterToOutParameter(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutParameterTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutParameter(new EObjectFilter(EcorePackage.eINSTANCE.getEParameter()));
			// Start of user code for additional businessfilters for outParameter
			// End of user code
			
			
			basePart.addFilterToCallExpression(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof MethodCallExpression);
				}
			
			});
			// Start of user code for additional businessfilters for callExpression
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
		if (editorKey == CallsViewsRepository.OpaqueCallable.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == CallsViewsRepository.OpaqueCallable.Properties.inParameter) {
			return CallsPackage.eINSTANCE.getCallable_InParameter();
		}
		if (editorKey == CallsViewsRepository.OpaqueCallable.Properties.outParameter) {
			return CallsPackage.eINSTANCE.getCallable_OutParameter();
		}
		if (editorKey == CallsViewsRepository.OpaqueCallable.Properties.name) {
			return CallsPackage.eINSTANCE.getOpaqueCallable_Name();
		}
		if (editorKey == CallsViewsRepository.OpaqueCallable.Properties.callExpression) {
			return CallsPackage.eINSTANCE.getOpaqueCallable_CallExpression();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OpaqueCallable opaqueCallable = (OpaqueCallable)semanticObject;
		if (CallsViewsRepository.OpaqueCallable.Properties.comment == event.getAffectedEditor()) {
			opaqueCallable.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (CallsViewsRepository.OpaqueCallable.Properties.inParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EParameter) {
					inParameterSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inParameterSettings.move(event.getNewIndex(), (EParameter) event.getNewValue());
			}
		}
		if (CallsViewsRepository.OpaqueCallable.Properties.outParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EParameter) {
					outParameterSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outParameterSettings.move(event.getNewIndex(), (EParameter) event.getNewValue());
			}
		}
		if (CallsViewsRepository.OpaqueCallable.Properties.name == event.getAffectedEditor()) {
			opaqueCallable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (CallsViewsRepository.OpaqueCallable.Properties.callExpression == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				callExpressionSettings.setToReference((MethodCallExpression)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MethodCallExpression eObject = CallsExpressionsFactory.eINSTANCE.createMethodCallExpression();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				callExpressionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			OpaqueCallablePropertiesEditionPart basePart = (OpaqueCallablePropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getCallable_InParameter().equals(msg.getFeature())  && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.inParameter))
				basePart.updateInParameter();
			if (CallsPackage.eINSTANCE.getCallable_OutParameter().equals(msg.getFeature())  && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.outParameter))
				basePart.updateOutParameter();
			if (CallsPackage.eINSTANCE.getOpaqueCallable_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CallsPackage.eINSTANCE.getOpaqueCallable_CallExpression().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.OpaqueCallable.Properties.callExpression))
				basePart.setCallExpression((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CallsViewsRepository.OpaqueCallable.Properties.name || key == CallsViewsRepository.OpaqueCallable.Properties.callExpression;
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
				if (CallsViewsRepository.OpaqueCallable.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (CallsViewsRepository.OpaqueCallable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CallsPackage.eINSTANCE.getOpaqueCallable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CallsPackage.eINSTANCE.getOpaqueCallable_Name().getEAttributeType(), newValue);
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

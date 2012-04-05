/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.ActivityEdgePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ActivityEdgePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for owningActivity EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings owningActivitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityEdgePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activityEdge, String editing_mode) {
		super(editingContext, activityEdge, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.ActivityEdge.class;
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
			final ActivityEdge activityEdge = (ActivityEdge)elt;
			final ActivityEdgePropertiesEditionPart basePart = (ActivityEdgePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(activityEdge, ActivitiesPackage.eINSTANCE.getActivityEdge_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(activityEdge, ActivitiesPackage.eINSTANCE.getActivityEdge_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity)) {
				// init part
				owningActivitySettings = new EObjectFlatComboSettings(activityEdge, ActivitiesPackage.eINSTANCE.getActivityEdge_OwningActivity());
				basePart.initOwningActivity(owningActivitySettings);
				// set the button mode
				basePart.setOwningActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.guard)) {
				basePart.initGuard((EEnum) ActivitiesPackage.eINSTANCE.getActivityEdge_Guard().getEType(), activityEdge.getGuard());
			}
			// init filters
			basePart.addFilterToTarget(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ActivityNode);
				}
			
			});
			// Start of user code for additional businessfilters for target
			// End of user code
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ActivityNode);
				}
			
			});
			// Start of user code for additional businessfilters for source
			// End of user code
			
			basePart.addFilterToOwningActivity(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Activity);
				}
			
			});
			// Start of user code for additional businessfilters for owningActivity
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
		if (editorKey == ActivitiesViewsRepository.ActivityEdge.Properties.target) {
			return ActivitiesPackage.eINSTANCE.getActivityEdge_Target();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityEdge.Properties.source) {
			return ActivitiesPackage.eINSTANCE.getActivityEdge_Source();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity) {
			return ActivitiesPackage.eINSTANCE.getActivityEdge_OwningActivity();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityEdge.Properties.guard) {
			return ActivitiesPackage.eINSTANCE.getActivityEdge_Guard();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ActivityEdge activityEdge = (ActivityEdge)semanticObject;
		if (ActivitiesViewsRepository.ActivityEdge.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((ActivityNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, targetSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ActivitiesViewsRepository.ActivityEdge.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((ActivityNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sourceSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningActivitySettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Activity eObject = ActivitiesFactory.eINSTANCE.createActivity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				owningActivitySettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.ActivityEdge.Properties.guard == event.getAffectedEditor()) {
			activityEdge.setGuard((EdgeGuard)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActivityEdgePropertiesEditionPart basePart = (ActivityEdgePropertiesEditionPart)editingPart;
			if (ActivitiesPackage.eINSTANCE.getActivityEdge_Target().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityEdge_Source().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityEdge_OwningActivity().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity))
				basePart.setOwningActivity((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityEdge_Guard().equals(msg.getFeature()) && isAccessible(ActivitiesViewsRepository.ActivityEdge.Properties.guard))
				basePart.setGuard((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ActivitiesViewsRepository.ActivityEdge.Properties.target || key == ActivitiesViewsRepository.ActivityEdge.Properties.source || key == ActivitiesViewsRepository.ActivityEdge.Properties.owningActivity || key == ActivitiesViewsRepository.ActivityEdge.Properties.guard;
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
				if (ActivitiesViewsRepository.ActivityEdge.Properties.guard == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ActivitiesPackage.eINSTANCE.getActivityEdge_Guard().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ActivitiesPackage.eINSTANCE.getActivityEdge_Guard().getEAttributeType(), newValue);
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

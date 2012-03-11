/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.components;

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
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.ActivityPropertiesEditionPart;
import org.storydriven.modeling.calls.CallsPackage;


// End of user code

/**
 * 
 * 
 */
public class ActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for owningOperation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings owningOperationSettings;
	
	/**
	 * Settings for precondition EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings preconditionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activity, String editing_mode) {
		super(editingContext, activity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.Activity.class;
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
			final Activity activity = (Activity)elt;
			final ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			// init values
			if (activity.getComment() != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activity.getComment()));
			
			if (isAccessible(ActivitiesViewsRepository.Activity.Properties.inParameter)) {
				inParameterSettings = new ReferencesTableSettings(activity, CallsPackage.eINSTANCE.getCallable_InParameter());
				basePart.initInParameter(inParameterSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.Activity.Properties.outParameter)) {
				outParameterSettings = new ReferencesTableSettings(activity, CallsPackage.eINSTANCE.getCallable_OutParameter());
				basePart.initOutParameter(outParameterSettings);
			}
			if (activity.getName() != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activity.getName()));
			
			if (isAccessible(ActivitiesViewsRepository.Activity.Properties.owningOperation)) {
				// init part
				owningOperationSettings = new EObjectFlatComboSettings(activity, ActivitiesPackage.eINSTANCE.getActivity_OwningOperation());
				basePart.initOwningOperation(owningOperationSettings);
				// set the button mode
				basePart.setOwningOperationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.Activity.Properties.precondition)) {
				// init part
				preconditionSettings = new EObjectFlatComboSettings(activity, ActivitiesPackage.eINSTANCE.getActivity_Precondition());
				basePart.initPrecondition(preconditionSettings);
				// set the button mode
				basePart.setPreconditionButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			basePart.addFilterToOwningOperation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof OperationExtension); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningOperation
			// End of user code
			
			basePart.addFilterToPrecondition(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MatchingStoryNode); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for precondition
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
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.inParameter) {
			return CallsPackage.eINSTANCE.getCallable_InParameter();
		}
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.outParameter) {
			return CallsPackage.eINSTANCE.getCallable_OutParameter();
		}
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.owningOperation) {
			return ActivitiesPackage.eINSTANCE.getActivity_OwningOperation();
		}
		if (editorKey == ActivitiesViewsRepository.Activity.Properties.precondition) {
			return ActivitiesPackage.eINSTANCE.getActivity_Precondition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Activity activity = (Activity)semanticObject;
		if (ActivitiesViewsRepository.Activity.Properties.comment == event.getAffectedEditor()) {
			activity.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.Activity.Properties.inParameter == event.getAffectedEditor()) {
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
		if (ActivitiesViewsRepository.Activity.Properties.outParameter == event.getAffectedEditor()) {
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
		if (ActivitiesViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
			activity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.Activity.Properties.owningOperation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningOperationSettings.setToReference((OperationExtension)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				OperationExtension eObject = ActivitiesFactory.eINSTANCE.createOperationExtension();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				owningOperationSettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.Activity.Properties.precondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				preconditionSettings.setToReference((MatchingStoryNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MatchingStoryNode eObject = ActivitiesFactory.eINSTANCE.createMatchingStoryNode();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				preconditionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getCallable_InParameter().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.Activity.Properties.inParameter))
				basePart.updateInParameter();
			if (CallsPackage.eINSTANCE.getCallable_OutParameter().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.Activity.Properties.outParameter))
				basePart.updateOutParameter();
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ActivitiesPackage.eINSTANCE.getActivity_OwningOperation().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.owningOperation))
				basePart.setOwningOperation((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivity_Precondition().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.Activity.Properties.precondition))
				basePart.setPrecondition((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ActivitiesViewsRepository.Activity.Properties.name;
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
				if (ActivitiesViewsRepository.Activity.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ActivitiesViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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

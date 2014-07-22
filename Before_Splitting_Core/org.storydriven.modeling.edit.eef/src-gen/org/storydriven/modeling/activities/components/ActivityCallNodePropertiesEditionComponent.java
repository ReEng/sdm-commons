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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
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
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.StructuredNode;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.ActivityCallNodePropertiesEditionPart;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;


// End of user code

/**
 * 
 * 
 */
public class ActivityCallNodePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for outgoing ReferencesTable
	 */
	private	ReferencesTableSettings outgoingSettings;
	
	/**
	 * Settings for owningActivity EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings owningActivitySettings;
	
	/**
	 * Settings for owningActivityNode EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings owningActivityNodeSettings;
	
	/**
	 * Settings for incoming ReferencesTable
	 */
	private	ReferencesTableSettings incomingSettings;
	
	/**
	 * Settings for callee EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings calleeSettings;
	
	/**
	 * Settings for calledActivity ReferencesTable
	 */
	private	ReferencesTableSettings calledActivitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityCallNodePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activityCallNode, String editing_mode) {
		super(editingContext, activityCallNode, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.ActivityCallNode.class;
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
			final ActivityCallNode activityCallNode = (ActivityCallNode)elt;
			final ActivityCallNodePropertiesEditionPart basePart = (ActivityCallNodePropertiesEditionPart)editingPart;
			// init values
			if (activityCallNode.getName() != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activityCallNode.getName()));
			
			if (activityCallNode.getComment() != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activityCallNode.getComment()));
			
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.outgoing)) {
				outgoingSettings = new ReferencesTableSettings(activityCallNode, ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing());
				basePart.initOutgoing(outgoingSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivity)) {
				// init part
				owningActivitySettings = new EObjectFlatComboSettings(activityCallNode, ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity());
				basePart.initOwningActivity(owningActivitySettings);
				// set the button mode
				basePart.setOwningActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivityNode)) {
				// init part
				owningActivityNodeSettings = new EObjectFlatComboSettings(activityCallNode, ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode());
				basePart.initOwningActivityNode(owningActivityNodeSettings);
				// set the button mode
				basePart.setOwningActivityNodeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.incoming)) {
				incomingSettings = new ReferencesTableSettings(activityCallNode, ActivitiesPackage.eINSTANCE.getActivityNode_Incoming());
				basePart.initIncoming(incomingSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.callee)) {
				// init part
				calleeSettings = new EObjectFlatComboSettings(activityCallNode, CallsPackage.eINSTANCE.getInvocation_Callee());
				basePart.initCallee(calleeSettings);
				// set the button mode
				basePart.setCalleeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.calledActivity)) {
				calledActivitySettings = new ReferencesTableSettings(activityCallNode, ActivitiesPackage.eINSTANCE.getActivityCallNode_CalledActivity());
				basePart.initCalledActivity(calledActivitySettings);
			}
			// init filters
			
			
			basePart.addFilterToOutgoing(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoing(new EObjectFilter(ActivitiesPackage.eINSTANCE.getActivityEdge()));
			// Start of user code for additional businessfilters for outgoing
			// End of user code
			
			basePart.addFilterToOwningActivity(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningActivity
			// End of user code
			
			basePart.addFilterToOwningActivityNode(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof StructuredNode); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningActivityNode
			// End of user code
			
			basePart.addFilterToIncoming(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncoming(new EObjectFilter(ActivitiesPackage.eINSTANCE.getActivityEdge()));
			// Start of user code for additional businessfilters for incoming
			// End of user code
			
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
			
			basePart.addFilterToCalledActivity(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCalledActivityTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCalledActivity(new EObjectFilter(ActivitiesPackage.eINSTANCE.getActivity()));
			// Start of user code for additional businessfilters for calledActivity
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
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.outgoing) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivity) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivityNode) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.incoming) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_Incoming();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.callee) {
			return CallsPackage.eINSTANCE.getInvocation_Callee();
		}
		if (editorKey == ActivitiesViewsRepository.ActivityCallNode.Properties.calledActivity) {
			return ActivitiesPackage.eINSTANCE.getActivityCallNode_CalledActivity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ActivityCallNode activityCallNode = (ActivityCallNode)semanticObject;
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.name == event.getAffectedEditor()) {
			activityCallNode.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.comment == event.getAffectedEditor()) {
			activityCallNode.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.outgoing == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ActivityEdge) {
					outgoingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
			}
		}
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivity == event.getAffectedEditor()) {
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
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivityNode == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningActivityNodeSettings.setToReference((StructuredNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				StructuredNode eObject = ActivitiesFactory.eINSTANCE.createStructuredNode();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				owningActivityNodeSettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.incoming == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ActivityEdge) {
					incomingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
			}
		}
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.callee == event.getAffectedEditor()) {
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
		if (ActivitiesViewsRepository.ActivityCallNode.Properties.calledActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Activity) {
					calledActivitySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				calledActivitySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				calledActivitySettings.move(event.getNewIndex(), (Activity) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActivityCallNodePropertiesEditionPart basePart = (ActivityCallNodePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.outgoing))
				basePart.updateOutgoing();
			if (ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivity))
				basePart.setOwningActivity((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.owningActivityNode))
				basePart.setOwningActivityNode((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityNode_Incoming().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.incoming))
				basePart.updateIncoming();
			if (CallsPackage.eINSTANCE.getInvocation_Callee().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.callee))
				basePart.setCallee((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityCallNode_CalledActivity().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.ActivityCallNode.Properties.calledActivity))
				basePart.updateCalledActivity();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ActivitiesViewsRepository.ActivityCallNode.Properties.name || key == ActivitiesViewsRepository.ActivityCallNode.Properties.calledActivity;
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
				if (ActivitiesViewsRepository.ActivityCallNode.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (ActivitiesViewsRepository.ActivityCallNode.Properties.comment == event.getAffectedEditor()) {
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

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
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.OperationExtension;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.OperationExtensionPropertiesEditionPart;
import org.storydriven.modeling.calls.CallsPackage;


// End of user code

/**
 * 
 * 
 */
public class OperationExtensionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for extendableBase EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings extendableBaseSettings;
	
	/**
	 * Settings for inParameter ReferencesTable
	 */
	private	ReferencesTableSettings inParameterSettings;
	
	/**
	 * Settings for outParameter ReferencesTable
	 */
	private	ReferencesTableSettings outParameterSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OperationExtensionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject operationExtension, String editing_mode) {
		super(editingContext, operationExtension, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.OperationExtension.class;
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
			final OperationExtension operationExtension = (OperationExtension)elt;
			final OperationExtensionPropertiesEditionPart basePart = (OperationExtensionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase)) {
				// init part
				extendableBaseSettings = new EObjectFlatComboSettings(operationExtension, SDMPackage.eINSTANCE.getExtension_ExtendableBase());
				basePart.initExtendableBase(extendableBaseSettings);
				// set the button mode
				basePart.setExtendableBaseButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (operationExtension.getComment() != null && isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), operationExtension.getComment()));
			
			if (isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.inParameter)) {
				inParameterSettings = new ReferencesTableSettings(operationExtension, CallsPackage.eINSTANCE.getCallable_InParameter());
				basePart.initInParameter(inParameterSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.outParameter)) {
				outParameterSettings = new ReferencesTableSettings(operationExtension, CallsPackage.eINSTANCE.getCallable_OutParameter());
				basePart.initOutParameter(outParameterSettings);
			}
			// init filters
			basePart.addFilterToExtendableBase(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ExtendableElement); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for extendableBase
			// End of user code
			
			
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
		if (editorKey == ActivitiesViewsRepository.OperationExtension.Properties.extendableBase) {
			return SDMPackage.eINSTANCE.getExtension_ExtendableBase();
		}
		if (editorKey == ActivitiesViewsRepository.OperationExtension.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ActivitiesViewsRepository.OperationExtension.Properties.inParameter) {
			return CallsPackage.eINSTANCE.getCallable_InParameter();
		}
		if (editorKey == ActivitiesViewsRepository.OperationExtension.Properties.outParameter) {
			return CallsPackage.eINSTANCE.getCallable_OutParameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OperationExtension operationExtension = (OperationExtension)semanticObject;
		if (ActivitiesViewsRepository.OperationExtension.Properties.extendableBase == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				extendableBaseSettings.setToReference((ExtendableElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, extendableBaseSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ActivitiesViewsRepository.OperationExtension.Properties.comment == event.getAffectedEditor()) {
			operationExtension.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.OperationExtension.Properties.inParameter == event.getAffectedEditor()) {
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
		if (ActivitiesViewsRepository.OperationExtension.Properties.outParameter == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			OperationExtensionPropertiesEditionPart basePart = (OperationExtensionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getExtension_ExtendableBase().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.extendableBase))
				basePart.setExtendableBase((EObject)msg.getNewValue());
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getCallable_InParameter().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.inParameter))
				basePart.updateInParameter();
			if (CallsPackage.eINSTANCE.getCallable_OutParameter().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.OperationExtension.Properties.outParameter))
				basePart.updateOutParameter();
			
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
				if (ActivitiesViewsRepository.OperationExtension.Properties.comment == event.getAffectedEditor()) {
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

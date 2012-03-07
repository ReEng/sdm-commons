/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
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
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ExceptionVariable;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.ExceptionVariablePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ExceptionVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for activityEdge EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings activityEdgeSettings;
	
	/**
	 * Settings for exceptionType ReferencesTable
	 */
	private	ReferencesTableSettings exceptionTypeSettings;
	
	/**
	 * Settings for genericExceptionType ReferencesTable
	 */
	private	ReferencesTableSettings genericExceptionTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExceptionVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject exceptionVariable, String editing_mode) {
		super(editingContext, exceptionVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.ExceptionVariable.class;
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
			final ExceptionVariable exceptionVariable = (ExceptionVariable)elt;
			final ExceptionVariablePropertiesEditionPart basePart = (ExceptionVariablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge)) {
				// init part
				activityEdgeSettings = new EObjectFlatComboSettings(exceptionVariable, ActivitiesPackage.eINSTANCE.getExceptionVariable_ActivityEdge());
				basePart.initActivityEdge(activityEdgeSettings);
				// set the button mode
				basePart.setActivityEdgeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (exceptionVariable.getName() != null && isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), exceptionVariable.getName()));
			
			if (isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType)) {
				exceptionTypeSettings = new ReferencesTableSettings(exceptionVariable, ActivitiesPackage.eINSTANCE.getExceptionVariable_ExceptionType());
				basePart.initExceptionType(exceptionTypeSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType)) {
				genericExceptionTypeSettings = new ReferencesTableSettings(exceptionVariable, ActivitiesPackage.eINSTANCE.getExceptionVariable_GenericExceptionType());
				basePart.initGenericExceptionType(genericExceptionTypeSettings);
			}
			// init filters
			basePart.addFilterToActivityEdge(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ActivityEdge);
				}
			
			});
			// Start of user code for additional businessfilters for activityEdge
			// End of user code
			
			
			basePart.addFilterToExceptionType(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInExceptionTypeTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToExceptionType(new EObjectFilter(EcorePackage.eINSTANCE.getEClassifier()));
			// Start of user code for additional businessfilters for exceptionType
			// End of user code
			
			basePart.addFilterToGenericExceptionType(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInGenericExceptionTypeTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToGenericExceptionType(new EObjectFilter(EcorePackage.eINSTANCE.getEGenericType()));
			// Start of user code for additional businessfilters for genericExceptionType
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
		if (editorKey == ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge) {
			return ActivitiesPackage.eINSTANCE.getExceptionVariable_ActivityEdge();
		}
		if (editorKey == ActivitiesViewsRepository.ExceptionVariable.Properties.name) {
			return ActivitiesPackage.eINSTANCE.getExceptionVariable_Name();
		}
		if (editorKey == ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType) {
			return ActivitiesPackage.eINSTANCE.getExceptionVariable_ExceptionType();
		}
		if (editorKey == ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType) {
			return ActivitiesPackage.eINSTANCE.getExceptionVariable_GenericExceptionType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExceptionVariable exceptionVariable = (ExceptionVariable)semanticObject;
		if (ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				activityEdgeSettings.setToReference((ActivityEdge)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ActivityEdge eObject = ActivitiesFactory.eINSTANCE.createActivityEdge();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				activityEdgeSettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.ExceptionVariable.Properties.name == event.getAffectedEditor()) {
			exceptionVariable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EClassifier) {
					exceptionTypeSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				exceptionTypeSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				exceptionTypeSettings.move(event.getNewIndex(), (EClassifier) event.getNewValue());
			}
		}
		if (ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EGenericType) {
					genericExceptionTypeSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				genericExceptionTypeSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				genericExceptionTypeSettings.move(event.getNewIndex(), (EGenericType) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ExceptionVariablePropertiesEditionPart basePart = (ExceptionVariablePropertiesEditionPart)editingPart;
			if (ActivitiesPackage.eINSTANCE.getExceptionVariable_ActivityEdge().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge))
				basePart.setActivityEdge((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getExceptionVariable_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ActivitiesPackage.eINSTANCE.getExceptionVariable_ExceptionType().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.exceptionType))
				basePart.updateExceptionType();
			if (ActivitiesPackage.eINSTANCE.getExceptionVariable_GenericExceptionType().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.ExceptionVariable.Properties.genericExceptionType))
				basePart.updateGenericExceptionType();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ActivitiesViewsRepository.ExceptionVariable.Properties.activityEdge || key == ActivitiesViewsRepository.ExceptionVariable.Properties.name;
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
				if (ActivitiesViewsRepository.ExceptionVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ActivitiesPackage.eINSTANCE.getExceptionVariable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ActivitiesPackage.eINSTANCE.getExceptionVariable_Name().getEAttributeType(), newValue);
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

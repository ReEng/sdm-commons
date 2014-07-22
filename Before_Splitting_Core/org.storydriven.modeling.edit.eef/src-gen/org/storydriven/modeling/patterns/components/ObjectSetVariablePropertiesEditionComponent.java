/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.patterns.parts.ObjectSetVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ObjectSetVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for pattern EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for incomingLink ReferencesTable
	 */
	private	ReferencesTableSettings incomingLinkSettings;
	
	/**
	 * Settings for outgoingLink ReferencesTable
	 */
	private	ReferencesTableSettings outgoingLinkSettings;
	
	/**
	 * Settings for classifier EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings classifierSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ObjectSetVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject objectSetVariable, String editing_mode) {
		super(editingContext, objectSetVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.ObjectSetVariable.class;
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
			final ObjectSetVariable objectSetVariable = (ObjectSetVariable)elt;
			final ObjectSetVariablePropertiesEditionPart basePart = (ObjectSetVariablePropertiesEditionPart)editingPart;
			// init values
			if (objectSetVariable.getName() != null && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objectSetVariable.getName()));
			
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(objectSetVariable, PatternsPackage.eINSTANCE.getAbstractVariable_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingState)) {
				basePart.initBindingState((EEnum) PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEType(), objectSetVariable.getBindingState());
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.incomingLink)) {
				incomingLinkSettings = new ReferencesTableSettings(objectSetVariable, PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink());
				basePart.initIncomingLink(incomingLinkSettings);
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.outgoingLink)) {
				outgoingLinkSettings = new ReferencesTableSettings(objectSetVariable, PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink());
				basePart.initOutgoingLink(outgoingLinkSettings);
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics)) {
				basePart.initBindingSemantics((EEnum) PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEType(), objectSetVariable.getBindingSemantics());
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator)) {
				basePart.initBindingOperator((EEnum) PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEType(), objectSetVariable.getBindingOperator());
			}
			if (isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.classifier)) {
				// init part
				classifierSettings = new EObjectFlatComboSettings(objectSetVariable, PatternsPackage.eINSTANCE.getObjectVariable_Classifier());
				basePart.initClassifier(classifierSettings);
				// set the button mode
				basePart.setClassifierButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof StoryPattern);
				}
			
			});
			// Start of user code for additional businessfilters for pattern
			// End of user code
			
			
			basePart.addFilterToIncomingLink(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingLinkTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncomingLink(new EObjectFilter(PatternsPackage.eINSTANCE.getAbstractLinkVariable()));
			// Start of user code for additional businessfilters for incomingLink
			// End of user code
			
			basePart.addFilterToOutgoingLink(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingLinkTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoingLink(new EObjectFilter(PatternsPackage.eINSTANCE.getAbstractLinkVariable()));
			// Start of user code for additional businessfilters for outgoingLink
			// End of user code
			
			
			
			basePart.addFilterToClassifier(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EClass);
				}
			
			});
			// Start of user code for additional businessfilters for classifier
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
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.pattern) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_Pattern();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.bindingState) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_BindingState();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.incomingLink) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.outgoingLink) {
			return PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics) {
			return PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator) {
			return PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator();
		}
		if (editorKey == PatternsViewsRepository.ObjectSetVariable.Properties.classifier) {
			return PatternsPackage.eINSTANCE.getObjectVariable_Classifier();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ObjectSetVariable objectSetVariable = (ObjectSetVariable)semanticObject;
		if (PatternsViewsRepository.ObjectSetVariable.Properties.name == event.getAffectedEditor()) {
			objectSetVariable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.pattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				patternSettings.setToReference((StoryPattern)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				StoryPattern eObject = PatternsFactory.eINSTANCE.createStoryPattern();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				patternSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingState == event.getAffectedEditor()) {
			objectSetVariable.setBindingState((BindingState)event.getNewValue());
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.incomingLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AbstractLinkVariable) {
					incomingLinkSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingLinkSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingLinkSettings.move(event.getNewIndex(), (AbstractLinkVariable) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.outgoingLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AbstractLinkVariable) {
					outgoingLinkSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingLinkSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingLinkSettings.move(event.getNewIndex(), (AbstractLinkVariable) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
			objectSetVariable.setBindingSemantics((BindingSemantics)event.getNewValue());
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator == event.getAffectedEditor()) {
			objectSetVariable.setBindingOperator((BindingOperator)event.getNewValue());
		}
		if (PatternsViewsRepository.ObjectSetVariable.Properties.classifier == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				classifierSettings.setToReference((EClass)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EClass eObject = EcoreFactory.eINSTANCE.createEClass();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				classifierSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ObjectSetVariablePropertiesEditionPart basePart = (ObjectSetVariablePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (PatternsPackage.eINSTANCE.getAbstractVariable_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingState))
				basePart.setBindingState((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.incomingLink))
				basePart.updateIncomingLink();
			if (PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.outgoingLink))
				basePart.updateOutgoingLink();
			if (PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics))
				basePart.setBindingSemantics((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator))
				basePart.setBindingOperator((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getObjectVariable_Classifier().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ObjectSetVariable.Properties.classifier))
				basePart.setClassifier((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.ObjectSetVariable.Properties.name || key == PatternsViewsRepository.ObjectSetVariable.Properties.pattern || key == PatternsViewsRepository.ObjectSetVariable.Properties.bindingState || key == PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics || key == PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator || key == PatternsViewsRepository.ObjectSetVariable.Properties.classifier;
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
				if (PatternsViewsRepository.ObjectSetVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingState == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ObjectSetVariable.Properties.bindingOperator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEAttributeType(), newValue);
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

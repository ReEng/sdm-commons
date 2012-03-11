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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class LinkVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for secondLinkConstraint ReferencesTable
	 */
	private	ReferencesTableSettings secondLinkConstraintSettings;
	
	/**
	 * Settings for firstLinkConstraint ReferencesTable
	 */
	private	ReferencesTableSettings firstLinkConstraintSettings;
	
	/**
	 * Settings for pattern EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	/**
	 * Settings for targetEnd EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetEndSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LinkVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject linkVariable, String editing_mode) {
		super(editingContext, linkVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.LinkVariable.class;
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
			final LinkVariable linkVariable = (LinkVariable)elt;
			final LinkVariablePropertiesEditionPart basePart = (LinkVariablePropertiesEditionPart)editingPart;
			// init values
			if (linkVariable.getName() != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), linkVariable.getName()));
			
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics)) {
				basePart.initBindingSemantics((EEnum) PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().getEType(), linkVariable.getBindingSemantics());
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingOperator)) {
				basePart.initBindingOperator((EEnum) PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().getEType(), linkVariable.getBindingOperator());
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(linkVariable, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint)) {
				secondLinkConstraintSettings = new ReferencesTableSettings(linkVariable, PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint());
				basePart.initSecondLinkConstraint(secondLinkConstraintSettings);
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint)) {
				firstLinkConstraintSettings = new ReferencesTableSettings(linkVariable, PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint());
				basePart.initFirstLinkConstraint(firstLinkConstraintSettings);
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingState)) {
				basePart.initBindingState((EEnum) PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().getEType(), linkVariable.getBindingState());
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(linkVariable, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(linkVariable, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.LinkVariable.Properties.targetEnd)) {
				// init part
				targetEndSettings = new EObjectFlatComboSettings(linkVariable, PatternsPackage.eINSTANCE.getLinkVariable_TargetEnd());
				basePart.initTargetEnd(targetEndSettings);
				// set the button mode
				basePart.setTargetEndButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ObjectVariable);
				}
			
			});
			// Start of user code for additional businessfilters for source
			// End of user code
			
			basePart.addFilterToSecondLinkConstraint(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSecondLinkConstraintTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSecondLinkConstraint(new EObjectFilter(PatternsPackage.eINSTANCE.getLinkConstraint()));
			// Start of user code for additional businessfilters for secondLinkConstraint
			// End of user code
			
			basePart.addFilterToFirstLinkConstraint(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInFirstLinkConstraintTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToFirstLinkConstraint(new EObjectFilter(PatternsPackage.eINSTANCE.getLinkConstraint()));
			// Start of user code for additional businessfilters for firstLinkConstraint
			// End of user code
			
			
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
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof AbstractVariable);
				}
			
			});
			// Start of user code for additional businessfilters for target
			// End of user code
			
			basePart.addFilterToTargetEnd(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EReference);
				}
			
			});
			// Start of user code for additional businessfilters for targetEnd
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
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.bindingSemantics) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.bindingOperator) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.source) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.bindingState) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.pattern) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.target) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target();
		}
		if (editorKey == PatternsViewsRepository.LinkVariable.Properties.targetEnd) {
			return PatternsPackage.eINSTANCE.getLinkVariable_TargetEnd();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LinkVariable linkVariable = (LinkVariable)semanticObject;
		if (PatternsViewsRepository.LinkVariable.Properties.name == event.getAffectedEditor()) {
			linkVariable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternsViewsRepository.LinkVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
			linkVariable.setBindingSemantics((BindingSemantics)event.getNewValue());
		}
		if (PatternsViewsRepository.LinkVariable.Properties.bindingOperator == event.getAffectedEditor()) {
			linkVariable.setBindingOperator((BindingOperator)event.getNewValue());
		}
		if (PatternsViewsRepository.LinkVariable.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((ObjectVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ObjectVariable eObject = PatternsFactory.eINSTANCE.createObjectVariable();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sourceSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LinkConstraint) {
					secondLinkConstraintSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				secondLinkConstraintSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				secondLinkConstraintSettings.move(event.getNewIndex(), (LinkConstraint) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LinkConstraint) {
					firstLinkConstraintSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				firstLinkConstraintSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				firstLinkConstraintSettings.move(event.getNewIndex(), (LinkConstraint) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.LinkVariable.Properties.bindingState == event.getAffectedEditor()) {
			linkVariable.setBindingState((BindingState)event.getNewValue());
		}
		if (PatternsViewsRepository.LinkVariable.Properties.pattern == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.LinkVariable.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((AbstractVariable)event.getNewValue());
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
		if (PatternsViewsRepository.LinkVariable.Properties.targetEnd == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetEndSettings.setToReference((EReference)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReference eObject = EcoreFactory.eINSTANCE.createEReference();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				targetEndSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LinkVariablePropertiesEditionPart basePart = (LinkVariablePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics))
				basePart.setBindingSemantics((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingOperator))
				basePart.setBindingOperator((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint))
				basePart.updateSecondLinkConstraint();
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint))
				basePart.updateFirstLinkConstraint();
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.LinkVariable.Properties.bindingState))
				basePart.setBindingState((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getLinkVariable_TargetEnd().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkVariable.Properties.targetEnd))
				basePart.setTargetEnd((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.LinkVariable.Properties.name || key == PatternsViewsRepository.LinkVariable.Properties.bindingSemantics || key == PatternsViewsRepository.LinkVariable.Properties.bindingOperator || key == PatternsViewsRepository.LinkVariable.Properties.source || key == PatternsViewsRepository.LinkVariable.Properties.bindingState || key == PatternsViewsRepository.LinkVariable.Properties.pattern || key == PatternsViewsRepository.LinkVariable.Properties.target || key == PatternsViewsRepository.LinkVariable.Properties.targetEnd;
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
				if (PatternsViewsRepository.LinkVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.LinkVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.LinkVariable.Properties.bindingOperator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.LinkVariable.Properties.bindingState == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().getEAttributeType(), newValue);
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

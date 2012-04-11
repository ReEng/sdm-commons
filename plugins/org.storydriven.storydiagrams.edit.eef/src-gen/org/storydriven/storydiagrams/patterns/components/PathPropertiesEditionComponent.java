/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.LinkConstraint;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.parts.PathPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class PathPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceSettings;
	
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
	private EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PathPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject path, String editing_mode) {
		super(editingContext, path, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.Path.class;
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
			final Path path = (Path)elt;
			final PathPropertiesEditionPart basePart = (PathPropertiesEditionPart)editingPart;
			// init values
			if (path.getName() != null && isAccessible(PatternsViewsRepository.Path.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), path.getName()));
			
			if (isAccessible(PatternsViewsRepository.Path.Properties.bindingSemantics)) {
				basePart.initBindingSemantics(EEFUtils.choiceOfValues(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics()), path.getBindingSemantics());
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.bindingOperator)) {
				basePart.initBindingOperator(EEFUtils.choiceOfValues(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator()), path.getBindingOperator());
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.secondLinkConstraint)) {
				secondLinkConstraintSettings = new ReferencesTableSettings(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint());
				basePart.initSecondLinkConstraint(secondLinkConstraintSettings);
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.firstLinkConstraint)) {
				firstLinkConstraintSettings = new ReferencesTableSettings(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint());
				basePart.initFirstLinkConstraint(firstLinkConstraintSettings);
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.bindingState)) {
				basePart.initBindingState(EEFUtils.choiceOfValues(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState()), path.getBindingState());
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.Path.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(path, PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
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
		if (editorKey == PatternsViewsRepository.Path.Properties.name) {
			return CorePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.bindingSemantics) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.bindingOperator) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.source) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.secondLinkConstraint) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.firstLinkConstraint) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.bindingState) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.pattern) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern();
		}
		if (editorKey == PatternsViewsRepository.Path.Properties.target) {
			return PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Path path = (Path)semanticObject;
		if (PatternsViewsRepository.Path.Properties.name == event.getAffectedEditor()) {
			path.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternsViewsRepository.Path.Properties.bindingSemantics == event.getAffectedEditor()) {
			path.setBindingSemantics((BindingSemantics)event.getNewValue());
		}
		if (PatternsViewsRepository.Path.Properties.bindingOperator == event.getAffectedEditor()) {
			path.setBindingOperator((BindingOperator)event.getNewValue());
		}
		if (PatternsViewsRepository.Path.Properties.source == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.Path.Properties.secondLinkConstraint == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.Path.Properties.firstLinkConstraint == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.Path.Properties.bindingState == event.getAffectedEditor()) {
			path.setBindingState((BindingState)event.getNewValue());
		}
		if (PatternsViewsRepository.Path.Properties.pattern == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.Path.Properties.target == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PathPropertiesEditionPart basePart = (PathPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Path.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.Path.Properties.bindingSemantics))
				basePart.setBindingSemantics((BindingSemantics)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.Path.Properties.bindingOperator))
				basePart.setBindingOperator((BindingOperator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Source().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Path.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_SecondLinkConstraint().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.Path.Properties.secondLinkConstraint))
				basePart.updateSecondLinkConstraint();
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_FirstLinkConstraint().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.Path.Properties.firstLinkConstraint))
				basePart.updateFirstLinkConstraint();
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.Path.Properties.bindingState))
				basePart.setBindingState((BindingState)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Path.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractLinkVariable_Target().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Path.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.Path.Properties.name || key == PatternsViewsRepository.Path.Properties.bindingSemantics || key == PatternsViewsRepository.Path.Properties.bindingOperator || key == PatternsViewsRepository.Path.Properties.source || key == PatternsViewsRepository.Path.Properties.bindingState || key == PatternsViewsRepository.Path.Properties.pattern || key == PatternsViewsRepository.Path.Properties.target;
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
				if (PatternsViewsRepository.Path.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.Path.Properties.bindingSemantics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingSemantics().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.Path.Properties.bindingOperator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingOperator().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.Path.Properties.bindingState == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractLinkVariable_BindingState().getEAttributeType(), (String)newValue);
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

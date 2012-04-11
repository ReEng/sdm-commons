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
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.parts.ConstraintPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for pattern EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for objectVariable EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings objectVariableSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject constraint, String editing_mode) {
		super(editingContext, constraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.Constraint.class;
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
			final Constraint constraint = (Constraint)elt;
			final ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(PatternsViewsRepository.Constraint.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(constraint, PatternsPackage.eINSTANCE.getConstraint_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.Constraint.Properties.objectVariable)) {
				// init part
				objectVariableSettings = new EObjectFlatComboSettings(constraint, PatternsPackage.eINSTANCE.getConstraint_ObjectVariable());
				basePart.initObjectVariable(objectVariableSettings);
				// set the button mode
				basePart.setObjectVariableButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof StoryPattern); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for pattern
			// End of user code
			
			basePart.addFilterToObjectVariable(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof AbstractVariable); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for objectVariable
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
		if (editorKey == PatternsViewsRepository.Constraint.Properties.pattern) {
			return PatternsPackage.eINSTANCE.getConstraint_Pattern();
		}
		if (editorKey == PatternsViewsRepository.Constraint.Properties.objectVariable) {
			return PatternsPackage.eINSTANCE.getConstraint_ObjectVariable();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Constraint constraint = (Constraint)semanticObject;
		if (PatternsViewsRepository.Constraint.Properties.pattern == event.getAffectedEditor()) {
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
		if (PatternsViewsRepository.Constraint.Properties.objectVariable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				objectVariableSettings.setToReference((AbstractVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, objectVariableSettings, editingContext.getAdapterFactory());
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
			ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			if (PatternsPackage.eINSTANCE.getConstraint_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Constraint.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getConstraint_ObjectVariable().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.Constraint.Properties.objectVariable))
				basePart.setObjectVariable((EObject)msg.getNewValue());
			
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}

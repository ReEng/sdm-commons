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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.parts.StoryPatternPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class StoryPatternPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for parentPattern EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentPatternSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StoryPatternPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject storyPattern, String editing_mode) {
		super(editingContext, storyPattern, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.StoryPattern.class;
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
			final StoryPattern storyPattern = (StoryPattern)elt;
			final StoryPatternPropertiesEditionPart basePart = (StoryPatternPropertiesEditionPart)editingPart;
			// init values
			if (storyPattern.getComment() != null && isAccessible(PatternsViewsRepository.StoryPattern.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), storyPattern.getComment()));
			
			if (isAccessible(PatternsViewsRepository.StoryPattern.Properties.parentPattern)) {
				// init part
				parentPatternSettings = new EObjectFlatComboSettings(storyPattern, PatternsPackage.eINSTANCE.getStoryPattern_ParentPattern());
				basePart.initParentPattern(parentPatternSettings);
				// set the button mode
				basePart.setParentPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics)) {
				basePart.initBindingSemantics(EEFUtils.choiceOfValues(storyPattern, PatternsPackage.eINSTANCE.getStoryPattern_BindingSemantics()), storyPattern.getBindingSemantics());
			}
			// init filters
			
			basePart.addFilterToParentPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof StoryPattern); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for parentPattern
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
		if (editorKey == PatternsViewsRepository.StoryPattern.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == PatternsViewsRepository.StoryPattern.Properties.parentPattern) {
			return PatternsPackage.eINSTANCE.getStoryPattern_ParentPattern();
		}
		if (editorKey == PatternsViewsRepository.StoryPattern.Properties.bindingSemantics) {
			return PatternsPackage.eINSTANCE.getStoryPattern_BindingSemantics();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		StoryPattern storyPattern = (StoryPattern)semanticObject;
		if (PatternsViewsRepository.StoryPattern.Properties.comment == event.getAffectedEditor()) {
			storyPattern.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternsViewsRepository.StoryPattern.Properties.parentPattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentPatternSettings.setToReference((StoryPattern)event.getNewValue());
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
				parentPatternSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.StoryPattern.Properties.bindingSemantics == event.getAffectedEditor()) {
			storyPattern.setBindingSemantics((BindingSemantics)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			StoryPatternPropertiesEditionPart basePart = (StoryPatternPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.StoryPattern.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (PatternsPackage.eINSTANCE.getStoryPattern_ParentPattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.StoryPattern.Properties.parentPattern))
				basePart.setParentPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getStoryPattern_BindingSemantics().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.StoryPattern.Properties.bindingSemantics))
				basePart.setBindingSemantics((BindingSemantics)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.StoryPattern.Properties.bindingSemantics;
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
				if (PatternsViewsRepository.StoryPattern.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.StoryPattern.Properties.bindingSemantics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PatternsPackage.eINSTANCE.getStoryPattern_BindingSemantics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getStoryPattern_BindingSemantics().getEAttributeType(), newValue);
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

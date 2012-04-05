/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.templates.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
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
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplateSignature;
import org.storydriven.modeling.templates.TemplatesFactory;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.parts.TemplateBindingPropertiesEditionPart;
import org.storydriven.modeling.templates.parts.TemplatesViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class TemplateBindingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for boundParameter EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings boundParameterSettings;
	
	/**
	 * Settings for template EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings templateSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TemplateBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject templateBinding, String editing_mode) {
		super(editingContext, templateBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = TemplatesViewsRepository.class;
		partKey = TemplatesViewsRepository.TemplateBinding.class;
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
			final TemplateBinding templateBinding = (TemplateBinding)elt;
			final TemplateBindingPropertiesEditionPart basePart = (TemplateBindingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter)) {
				// init part
				boundParameterSettings = new EObjectFlatComboSettings(templateBinding, TemplatesPackage.eINSTANCE.getTemplateBinding_BoundParameter());
				basePart.initBoundParameter(boundParameterSettings);
				// set the button mode
				basePart.setBoundParameterButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(TemplatesViewsRepository.TemplateBinding.Properties.template)) {
				// init part
				templateSettings = new EObjectFlatComboSettings(templateBinding, TemplatesPackage.eINSTANCE.getTemplateBinding_Template());
				basePart.initTemplate(templateSettings);
				// set the button mode
				basePart.setTemplateButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToBoundParameter(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EClassifier);
				}
			
			});
			// Start of user code for additional businessfilters for boundParameter
			// End of user code
			
			basePart.addFilterToTemplate(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof TemplateSignature);
				}
			
			});
			// Start of user code for additional businessfilters for template
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
		if (editorKey == TemplatesViewsRepository.TemplateBinding.Properties.boundParameter) {
			return TemplatesPackage.eINSTANCE.getTemplateBinding_BoundParameter();
		}
		if (editorKey == TemplatesViewsRepository.TemplateBinding.Properties.template) {
			return TemplatesPackage.eINSTANCE.getTemplateBinding_Template();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TemplateBinding templateBinding = (TemplateBinding)semanticObject;
		if (TemplatesViewsRepository.TemplateBinding.Properties.boundParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				boundParameterSettings.setToReference((EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, boundParameterSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (TemplatesViewsRepository.TemplateBinding.Properties.template == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				templateSettings.setToReference((TemplateSignature)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TemplateSignature eObject = TemplatesFactory.eINSTANCE.createTemplateSignature();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				templateSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TemplateBindingPropertiesEditionPart basePart = (TemplateBindingPropertiesEditionPart)editingPart;
			if (TemplatesPackage.eINSTANCE.getTemplateBinding_BoundParameter().equals(msg.getFeature()) && basePart != null && isAccessible(TemplatesViewsRepository.TemplateBinding.Properties.boundParameter))
				basePart.setBoundParameter((EObject)msg.getNewValue());
			if (TemplatesPackage.eINSTANCE.getTemplateBinding_Template().equals(msg.getFeature()) && basePart != null && isAccessible(TemplatesViewsRepository.TemplateBinding.Properties.template))
				basePart.setTemplate((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == TemplatesViewsRepository.TemplateBinding.Properties.boundParameter || key == TemplatesViewsRepository.TemplateBinding.Properties.template;
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

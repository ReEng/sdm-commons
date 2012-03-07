/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.templates.components;

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
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplatesFactory;
import org.storydriven.modeling.templates.TemplatesPackage;
import org.storydriven.modeling.templates.parts.PropertyBindingPropertiesEditionPart;
import org.storydriven.modeling.templates.parts.TemplatesViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class PropertyBindingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for boundProperty EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings boundPropertySettings;
	
	/**
	 * Settings for templateBinding EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings templateBindingSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PropertyBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertyBinding, String editing_mode) {
		super(editingContext, propertyBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = TemplatesViewsRepository.class;
		partKey = TemplatesViewsRepository.PropertyBinding.class;
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
			final PropertyBinding propertyBinding = (PropertyBinding)elt;
			final PropertyBindingPropertiesEditionPart basePart = (PropertyBindingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty)) {
				// init part
				boundPropertySettings = new EObjectFlatComboSettings(propertyBinding, TemplatesPackage.eINSTANCE.getPropertyBinding_BoundProperty());
				basePart.initBoundProperty(boundPropertySettings);
				// set the button mode
				basePart.setBoundPropertyButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding)) {
				// init part
				templateBindingSettings = new EObjectFlatComboSettings(propertyBinding, TemplatesPackage.eINSTANCE.getPropertyBinding_TemplateBinding());
				basePart.initTemplateBinding(templateBindingSettings);
				// set the button mode
				basePart.setTemplateBindingButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToBoundProperty(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EStructuralFeature);
				}
			
			});
			// Start of user code for additional businessfilters for boundProperty
			// End of user code
			
			basePart.addFilterToTemplateBinding(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof TemplateBinding);
				}
			
			});
			// Start of user code for additional businessfilters for templateBinding
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
		if (editorKey == TemplatesViewsRepository.PropertyBinding.Properties.boundProperty) {
			return TemplatesPackage.eINSTANCE.getPropertyBinding_BoundProperty();
		}
		if (editorKey == TemplatesViewsRepository.PropertyBinding.Properties.templateBinding) {
			return TemplatesPackage.eINSTANCE.getPropertyBinding_TemplateBinding();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PropertyBinding propertyBinding = (PropertyBinding)semanticObject;
		if (TemplatesViewsRepository.PropertyBinding.Properties.boundProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				boundPropertySettings.setToReference((EStructuralFeature)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, boundPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (TemplatesViewsRepository.PropertyBinding.Properties.templateBinding == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				templateBindingSettings.setToReference((TemplateBinding)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TemplateBinding eObject = TemplatesFactory.eINSTANCE.createTemplateBinding();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				templateBindingSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PropertyBindingPropertiesEditionPart basePart = (PropertyBindingPropertiesEditionPart)editingPart;
			if (TemplatesPackage.eINSTANCE.getPropertyBinding_BoundProperty().equals(msg.getFeature()) && basePart != null && isAccessible(TemplatesViewsRepository.PropertyBinding.Properties.boundProperty))
				basePart.setBoundProperty((EObject)msg.getNewValue());
			if (TemplatesPackage.eINSTANCE.getPropertyBinding_TemplateBinding().equals(msg.getFeature()) && basePart != null && isAccessible(TemplatesViewsRepository.PropertyBinding.Properties.templateBinding))
				basePart.setTemplateBinding((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == TemplatesViewsRepository.PropertyBinding.Properties.boundProperty || key == TemplatesViewsRepository.PropertyBinding.Properties.templateBinding;
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

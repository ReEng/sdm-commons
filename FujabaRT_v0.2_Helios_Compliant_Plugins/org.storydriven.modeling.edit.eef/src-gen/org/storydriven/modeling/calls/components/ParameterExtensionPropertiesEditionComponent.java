/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.calls.components;

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
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.ParameterExtension;
import org.storydriven.modeling.calls.parts.CallsViewsRepository;
import org.storydriven.modeling.calls.parts.ParameterExtensionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ParameterExtensionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for extendableBase EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings extendableBaseSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParameterExtensionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject parameterExtension, String editing_mode) {
		super(editingContext, parameterExtension, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CallsViewsRepository.class;
		partKey = CallsViewsRepository.ParameterExtension.class;
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
			final ParameterExtension parameterExtension = (ParameterExtension)elt;
			final ParameterExtensionPropertiesEditionPart basePart = (ParameterExtensionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CallsViewsRepository.ParameterExtension.Properties.extendableBase)) {
				// init part
				extendableBaseSettings = new EObjectFlatComboSettings(parameterExtension, SDMPackage.eINSTANCE.getExtension_ExtendableBase());
				basePart.initExtendableBase(extendableBaseSettings);
				// set the button mode
				basePart.setExtendableBaseButtonMode(ButtonsModeEnum.BROWSE);
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
		if (editorKey == CallsViewsRepository.ParameterExtension.Properties.extendableBase) {
			return SDMPackage.eINSTANCE.getExtension_ExtendableBase();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ParameterExtension parameterExtension = (ParameterExtension)semanticObject;
		if (CallsViewsRepository.ParameterExtension.Properties.extendableBase == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ParameterExtensionPropertiesEditionPart basePart = (ParameterExtensionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getExtension_ExtendableBase().equals(msg.getFeature()) && basePart != null && isAccessible(CallsViewsRepository.ParameterExtension.Properties.extendableBase))
				basePart.setExtendableBase((EObject)msg.getNewValue());
			
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

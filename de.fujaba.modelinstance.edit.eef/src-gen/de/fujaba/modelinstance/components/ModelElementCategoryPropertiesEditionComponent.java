/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.components;

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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;
import de.fujaba.modelinstance.parts.ModelElementCategoryPropertiesEditionPart;
import de.fujaba.modelinstance.parts.ModelinstanceViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ModelElementCategoryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ModelElementCategoryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject modelElementCategory, String editing_mode) {
		super(editingContext, modelElementCategory, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ModelinstanceViewsRepository.class;
		partKey = ModelinstanceViewsRepository.ModelElementCategory.class;
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
			final ModelElementCategory modelElementCategory = (ModelElementCategory)elt;
			final ModelElementCategoryPropertiesEditionPart basePart = (ModelElementCategoryPropertiesEditionPart)editingPart;
			// init values
			if (modelElementCategory.getKey() != null && isAccessible(ModelinstanceViewsRepository.ModelElementCategory.Properties.key))
				basePart.setKey(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), modelElementCategory.getKey()));
			
			if (modelElementCategory.getName() != null && isAccessible(ModelinstanceViewsRepository.ModelElementCategory.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), modelElementCategory.getName()));
			
			// init filters
			
			
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
		if (editorKey == ModelinstanceViewsRepository.ModelElementCategory.Properties.key) {
			return ModelinstancePackage.eINSTANCE.getModelElementCategory_Key();
		}
		if (editorKey == ModelinstanceViewsRepository.ModelElementCategory.Properties.name) {
			return ModelinstancePackage.eINSTANCE.getModelElementCategory_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ModelElementCategory modelElementCategory = (ModelElementCategory)semanticObject;
		if (ModelinstanceViewsRepository.ModelElementCategory.Properties.key == event.getAffectedEditor()) {
			modelElementCategory.setKey((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ModelinstanceViewsRepository.ModelElementCategory.Properties.name == event.getAffectedEditor()) {
			modelElementCategory.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ModelElementCategoryPropertiesEditionPart basePart = (ModelElementCategoryPropertiesEditionPart)editingPart;
			if (ModelinstancePackage.eINSTANCE.getModelElementCategory_Key().equals(msg.getFeature()) && basePart != null && isAccessible(ModelinstanceViewsRepository.ModelElementCategory.Properties.key)) {
				if (msg.getNewValue() != null) {
					basePart.setKey(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setKey("");
				}
			}
			if (ModelinstancePackage.eINSTANCE.getModelElementCategory_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ModelinstanceViewsRepository.ModelElementCategory.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			
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
				if (ModelinstanceViewsRepository.ModelElementCategory.Properties.key == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ModelinstancePackage.eINSTANCE.getModelElementCategory_Key().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ModelinstancePackage.eINSTANCE.getModelElementCategory_Key().getEAttributeType(), newValue);
				}
				if (ModelinstanceViewsRepository.ModelElementCategory.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ModelinstancePackage.eINSTANCE.getModelElementCategory_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ModelinstancePackage.eINSTANCE.getModelElementCategory_Name().getEAttributeType(), newValue);
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

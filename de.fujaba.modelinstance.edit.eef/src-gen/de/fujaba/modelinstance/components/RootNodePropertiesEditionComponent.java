/**
 * Generated with Acceleo
 */
package de.fujaba.modelinstance.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstancePackage;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.modelinstance.parts.ModelinstanceViewsRepository;
import de.fujaba.modelinstance.parts.RootNodePropertiesEditionPart;




// End of user code

/**
 * 
 * 
 */
public class RootNodePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for categories ReferencesTable
	 */
	protected ReferencesTableSettings categoriesSettings;
	
	/**
	 * Settings for ecoreDataTypes ReferencesTable
	 */
	private	ReferencesTableSettings ecoreDataTypesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RootNodePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rootNode, String editing_mode) {
		super(editingContext, rootNode, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ModelinstanceViewsRepository.class;
		partKey = ModelinstanceViewsRepository.RootNode.class;
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
			final RootNode rootNode = (RootNode)elt;
			final RootNodePropertiesEditionPart basePart = (RootNodePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ModelinstanceViewsRepository.RootNode.Properties.categories)) {
				categoriesSettings = new ReferencesTableSettings(rootNode, ModelinstancePackage.eINSTANCE.getRootNode_Categories());
				basePart.initCategories(categoriesSettings);
			}
			if (isAccessible(ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes)) {
				ecoreDataTypesSettings = new ReferencesTableSettings(rootNode, ModelinstancePackage.eINSTANCE.getRootNode_EcoreDataTypes());
				basePart.initEcoreDataTypes(ecoreDataTypesSettings);
			}
			// init filters
			basePart.addFilterToCategories(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ModelElementCategory); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for categories
			// End of user code
			
			basePart.addFilterToEcoreDataTypes(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInEcoreDataTypesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToEcoreDataTypes(new EObjectFilter(EcorePackage.eINSTANCE.getEDataType()));
			// Start of user code for additional businessfilters for ecoreDataTypes
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
		if (editorKey == ModelinstanceViewsRepository.RootNode.Properties.categories) {
			return ModelinstancePackage.eINSTANCE.getRootNode_Categories();
		}
		if (editorKey == ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes) {
			return ModelinstancePackage.eINSTANCE.getRootNode_EcoreDataTypes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RootNode rootNode = (RootNode)semanticObject;
		if (ModelinstanceViewsRepository.RootNode.Properties.categories == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, categoriesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categoriesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categoriesSettings.move(event.getNewIndex(), (ModelElementCategory) event.getNewValue());
			}
		}
		if (ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EDataType) {
					ecoreDataTypesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ecoreDataTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ecoreDataTypesSettings.move(event.getNewIndex(), (EDataType) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RootNodePropertiesEditionPart basePart = (RootNodePropertiesEditionPart)editingPart;
			if (ModelinstancePackage.eINSTANCE.getRootNode_Categories().equals(msg.getFeature()) && isAccessible(ModelinstanceViewsRepository.RootNode.Properties.categories))
				basePart.updateCategories();
			if (ModelinstancePackage.eINSTANCE.getRootNode_EcoreDataTypes().equals(msg.getFeature())  && isAccessible(ModelinstanceViewsRepository.RootNode.Properties.ecoreDataTypes))
				basePart.updateEcoreDataTypes();
			
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

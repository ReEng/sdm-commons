/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.parts.AttributeAssignmentPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class AttributeAssignmentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for attribute EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings attributeSettings;
	
	/**
	 * Settings for objectVariable EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings objectVariableSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AttributeAssignmentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject attributeAssignment, String editing_mode) {
		super(editingContext, attributeAssignment, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.AttributeAssignment.class;
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
			final AttributeAssignment attributeAssignment = (AttributeAssignment)elt;
			final AttributeAssignmentPropertiesEditionPart basePart = (AttributeAssignmentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(PatternsViewsRepository.AttributeAssignment.Properties.attribute)) {
				// init part
				attributeSettings = new EObjectFlatComboSettings(attributeAssignment, PatternsPackage.eINSTANCE.getAttributeAssignment_Attribute());
				basePart.initAttribute(attributeSettings);
				// set the button mode
				basePart.setAttributeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable)) {
				// init part
				objectVariableSettings = new EObjectFlatComboSettings(attributeAssignment, PatternsPackage.eINSTANCE.getAttributeAssignment_ObjectVariable());
				basePart.initObjectVariable(objectVariableSettings);
				// set the button mode
				basePart.setObjectVariableButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToAttribute(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EAttribute);
				}
			
			});
			// Start of user code for additional businessfilters for attribute
			// End of user code
			
			basePart.addFilterToObjectVariable(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ObjectVariable);
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
		if (editorKey == PatternsViewsRepository.AttributeAssignment.Properties.attribute) {
			return PatternsPackage.eINSTANCE.getAttributeAssignment_Attribute();
		}
		if (editorKey == PatternsViewsRepository.AttributeAssignment.Properties.objectVariable) {
			return PatternsPackage.eINSTANCE.getAttributeAssignment_ObjectVariable();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AttributeAssignment attributeAssignment = (AttributeAssignment)semanticObject;
		if (PatternsViewsRepository.AttributeAssignment.Properties.attribute == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				attributeSettings.setToReference((EAttribute)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EAttribute eObject = EcoreFactory.eINSTANCE.createEAttribute();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				attributeSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.AttributeAssignment.Properties.objectVariable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				objectVariableSettings.setToReference((ObjectVariable)event.getNewValue());
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
				objectVariableSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			AttributeAssignmentPropertiesEditionPart basePart = (AttributeAssignmentPropertiesEditionPart)editingPart;
			if (PatternsPackage.eINSTANCE.getAttributeAssignment_Attribute().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.AttributeAssignment.Properties.attribute))
				basePart.setAttribute((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAttributeAssignment_ObjectVariable().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.AttributeAssignment.Properties.objectVariable))
				basePart.setObjectVariable((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.AttributeAssignment.Properties.attribute || key == PatternsViewsRepository.AttributeAssignment.Properties.objectVariable;
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

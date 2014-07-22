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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.LinkConstraint;
import org.storydriven.modeling.patterns.LinkConstraintType;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.parts.LinkConstraintPropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class LinkConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for firstLink EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings firstLinkSettings;
	
	/**
	 * Settings for referencingObject EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings referencingObjectSettings;
	
	/**
	 * Settings for secondLink EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings secondLinkSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LinkConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject linkConstraint, String editing_mode) {
		super(editingContext, linkConstraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.LinkConstraint.class;
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
			final LinkConstraint linkConstraint = (LinkConstraint)elt;
			final LinkConstraintPropertiesEditionPart basePart = (LinkConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.index)) {
				basePart.setIndex(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), linkConstraint.getIndex()));
			}
			
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.constraintType)) {
				basePart.initConstraintType((EEnum) PatternsPackage.eINSTANCE.getLinkConstraint_ConstraintType().getEType(), linkConstraint.getConstraintType());
			}
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.negative)) {
				basePart.setNegative(linkConstraint.isNegative());
			}
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.firstLink)) {
				// init part
				firstLinkSettings = new EObjectFlatComboSettings(linkConstraint, PatternsPackage.eINSTANCE.getLinkConstraint_FirstLink());
				basePart.initFirstLink(firstLinkSettings);
				// set the button mode
				basePart.setFirstLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.referencingObject)) {
				// init part
				referencingObjectSettings = new EObjectFlatComboSettings(linkConstraint, PatternsPackage.eINSTANCE.getLinkConstraint_ReferencingObject());
				basePart.initReferencingObject(referencingObjectSettings);
				// set the button mode
				basePart.setReferencingObjectButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.LinkConstraint.Properties.secondLink)) {
				// init part
				secondLinkSettings = new EObjectFlatComboSettings(linkConstraint, PatternsPackage.eINSTANCE.getLinkConstraint_SecondLink());
				basePart.initSecondLink(secondLinkSettings);
				// set the button mode
				basePart.setSecondLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			basePart.addFilterToFirstLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof AbstractLinkVariable);
				}
			
			});
			// Start of user code for additional businessfilters for firstLink
			// End of user code
			
			basePart.addFilterToReferencingObject(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ObjectVariable);
				}
			
			});
			// Start of user code for additional businessfilters for referencingObject
			// End of user code
			
			basePart.addFilterToSecondLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof AbstractLinkVariable); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for secondLink
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
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.index) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_Index();
		}
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.constraintType) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_ConstraintType();
		}
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.negative) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_Negative();
		}
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.firstLink) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_FirstLink();
		}
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.referencingObject) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_ReferencingObject();
		}
		if (editorKey == PatternsViewsRepository.LinkConstraint.Properties.secondLink) {
			return PatternsPackage.eINSTANCE.getLinkConstraint_SecondLink();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LinkConstraint linkConstraint = (LinkConstraint)semanticObject;
		if (PatternsViewsRepository.LinkConstraint.Properties.index == event.getAffectedEditor()) {
			linkConstraint.setIndex((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (PatternsViewsRepository.LinkConstraint.Properties.constraintType == event.getAffectedEditor()) {
			linkConstraint.setConstraintType((LinkConstraintType)event.getNewValue());
		}
		if (PatternsViewsRepository.LinkConstraint.Properties.negative == event.getAffectedEditor()) {
			linkConstraint.setNegative((Boolean)event.getNewValue());
		}
		if (PatternsViewsRepository.LinkConstraint.Properties.firstLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				firstLinkSettings.setToReference((AbstractLinkVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, firstLinkSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (PatternsViewsRepository.LinkConstraint.Properties.referencingObject == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referencingObjectSettings.setToReference((ObjectVariable)event.getNewValue());
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
				referencingObjectSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.LinkConstraint.Properties.secondLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				secondLinkSettings.setToReference((AbstractLinkVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, secondLinkSettings, editingContext.getAdapterFactory());
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
			LinkConstraintPropertiesEditionPart basePart = (LinkConstraintPropertiesEditionPart)editingPart;
			if (PatternsPackage.eINSTANCE.getLinkConstraint_Index().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.index)) {
				if (msg.getNewValue() != null) {
					basePart.setIndex(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setIndex("");
				}
			}
			if (PatternsPackage.eINSTANCE.getLinkConstraint_ConstraintType().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.constraintType))
				basePart.setConstraintType((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getLinkConstraint_Negative().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.negative))
				basePart.setNegative((Boolean)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getLinkConstraint_FirstLink().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.firstLink))
				basePart.setFirstLink((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getLinkConstraint_ReferencingObject().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.referencingObject))
				basePart.setReferencingObject((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getLinkConstraint_SecondLink().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.LinkConstraint.Properties.secondLink))
				basePart.setSecondLink((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.LinkConstraint.Properties.index || key == PatternsViewsRepository.LinkConstraint.Properties.constraintType || key == PatternsViewsRepository.LinkConstraint.Properties.negative || key == PatternsViewsRepository.LinkConstraint.Properties.firstLink || key == PatternsViewsRepository.LinkConstraint.Properties.referencingObject;
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
				if (PatternsViewsRepository.LinkConstraint.Properties.index == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getLinkConstraint_Index().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getLinkConstraint_Index().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.LinkConstraint.Properties.constraintType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getLinkConstraint_ConstraintType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getLinkConstraint_ConstraintType().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.LinkConstraint.Properties.negative == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getLinkConstraint_Negative().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getLinkConstraint_Negative().getEAttributeType(), newValue);
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

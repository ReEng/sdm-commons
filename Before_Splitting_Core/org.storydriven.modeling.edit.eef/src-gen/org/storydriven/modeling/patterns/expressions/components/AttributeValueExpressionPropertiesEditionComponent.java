/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.expressions.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.parts.AttributeValueExpressionPropertiesEditionPart;
import org.storydriven.modeling.patterns.expressions.parts.ExpressionsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class AttributeValueExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for object EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings objectSettings;
	
	/**
	 * Settings for attribute EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings attributeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AttributeValueExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject attributeValueExpression, String editing_mode) {
		super(editingContext, attributeValueExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.AttributeValueExpression.class;
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
			final AttributeValueExpression attributeValueExpression = (AttributeValueExpression)elt;
			final AttributeValueExpressionPropertiesEditionPart basePart = (AttributeValueExpressionPropertiesEditionPart)editingPart;
			// init values
			if (attributeValueExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), attributeValueExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.object)) {
				// init part
				objectSettings = new EObjectFlatComboSettings(attributeValueExpression, ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Object());
				basePart.initObject(objectSettings);
				// set the button mode
				basePart.setObjectButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute)) {
				// init part
				attributeSettings = new EObjectFlatComboSettings(attributeValueExpression, ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Attribute());
				basePart.initAttribute(attributeSettings);
				// set the button mode
				basePart.setAttributeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToObject(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ObjectVariable);
				}
			
			});
			// Start of user code for additional businessfilters for object
			// End of user code
			
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
		if (editorKey == ExpressionsViewsRepository.AttributeValueExpression.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.AttributeValueExpression.Properties.object) {
			return ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Object();
		}
		if (editorKey == ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute) {
			return ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Attribute();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AttributeValueExpression attributeValueExpression = (AttributeValueExpression)semanticObject;
		if (ExpressionsViewsRepository.AttributeValueExpression.Properties.comment == event.getAffectedEditor()) {
			attributeValueExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.AttributeValueExpression.Properties.object == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				objectSettings.setToReference((ObjectVariable)event.getNewValue());
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
				objectSettings.setToReference(eObject);
			}
		}
		if (ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AttributeValueExpressionPropertiesEditionPart basePart = (AttributeValueExpressionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Object().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.object))
				basePart.setObject((EObject)msg.getNewValue());
			if (ExpressionsPackage.eINSTANCE.getAttributeValueExpression_Attribute().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute))
				basePart.setAttribute((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.AttributeValueExpression.Properties.object || key == ExpressionsViewsRepository.AttributeValueExpression.Properties.attribute;
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
				if (ExpressionsViewsRepository.AttributeValueExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
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

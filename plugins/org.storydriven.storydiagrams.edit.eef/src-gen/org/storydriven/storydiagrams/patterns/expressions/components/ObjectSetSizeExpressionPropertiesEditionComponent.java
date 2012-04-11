/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.expressions.components;

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
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.patterns.ObjectSetVariable;
import org.storydriven.storydiagrams.patterns.PatternsFactory;
import org.storydriven.storydiagrams.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage;
import org.storydriven.storydiagrams.patterns.expressions.parts.ExpressionsViewsRepository;
import org.storydriven.storydiagrams.patterns.expressions.parts.ObjectSetSizeExpressionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ObjectSetSizeExpressionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for set EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings setSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ObjectSetSizeExpressionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject objectSetSizeExpression, String editing_mode) {
		super(editingContext, objectSetSizeExpression, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ExpressionsViewsRepository.class;
		partKey = ExpressionsViewsRepository.ObjectSetSizeExpression.class;
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
			final ObjectSetSizeExpression objectSetSizeExpression = (ObjectSetSizeExpression)elt;
			final ObjectSetSizeExpressionPropertiesEditionPart basePart = (ObjectSetSizeExpressionPropertiesEditionPart)editingPart;
			// init values
			if (objectSetSizeExpression.getComment() != null && isAccessible(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objectSetSizeExpression.getComment()));
			
			if (isAccessible(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set)) {
				// init part
				setSettings = new EObjectFlatComboSettings(objectSetSizeExpression, PatternsExpressionsPackage.eINSTANCE.getObjectSetSizeExpression_Set());
				basePart.initSet(setSettings);
				// set the button mode
				basePart.setSetButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToSet(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ObjectSetVariable);
				}
			
			});
			// Start of user code for additional businessfilters for set
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
		if (editorKey == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set) {
			return PatternsExpressionsPackage.eINSTANCE.getObjectSetSizeExpression_Set();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ObjectSetSizeExpression objectSetSizeExpression = (ObjectSetSizeExpression)semanticObject;
		if (ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment == event.getAffectedEditor()) {
			objectSetSizeExpression.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				setSettings.setToReference((ObjectSetVariable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ObjectSetVariable eObject = PatternsFactory.eINSTANCE.createObjectSetVariable();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				setSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ObjectSetSizeExpressionPropertiesEditionPart basePart = (ObjectSetSizeExpressionPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (PatternsExpressionsPackage.eINSTANCE.getObjectSetSizeExpression_Set().equals(msg.getFeature()) && basePart != null && isAccessible(ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set))
				basePart.setSet((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.set;
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
				if (ExpressionsViewsRepository.ObjectSetSizeExpression.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
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

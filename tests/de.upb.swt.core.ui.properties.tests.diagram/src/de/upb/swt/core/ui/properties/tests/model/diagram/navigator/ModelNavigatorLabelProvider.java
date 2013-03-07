package de.upb.swt.core.ui.properties.tests.model.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import de.upb.swt.core.ui.properties.tests.model.BooleanAttribute;
import de.upb.swt.core.ui.properties.tests.model.Container;
import de.upb.swt.core.ui.properties.tests.model.Reference;
import de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts.BooleanAttributeEditPart;
import de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts.ContainerEditPart;
import de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts.ReferenceEditPart;
import de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts.TypeEditPart;
import de.upb.swt.core.ui.properties.tests.model.diagram.edit.parts.TypeNameEditPart;
import de.upb.swt.core.ui.properties.tests.model.diagram.part.ModelDiagramEditorPlugin;
import de.upb.swt.core.ui.properties.tests.model.diagram.part.ModelVisualIDRegistry;
import de.upb.swt.core.ui.properties.tests.model.diagram.providers.ModelElementTypes;
import de.upb.swt.core.ui.properties.tests.model.diagram.providers.ModelParserProvider;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ModelDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ModelDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModelNavigatorItem && !isOwnView(((ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return ModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.uni-paderborn.de/swt/core/ui/properties/tests/model?Type", ModelElementTypes.Type_2001); //$NON-NLS-1$
		case ContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.uni-paderborn.de/swt/core/ui/properties/tests/model?Container", ModelElementTypes.Container_1000); //$NON-NLS-1$
		case BooleanAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.uni-paderborn.de/swt/core/ui/properties/tests/model?BooleanAttribute", ModelElementTypes.BooleanAttribute_3001); //$NON-NLS-1$
		case ReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.uni-paderborn.de/swt/core/ui/properties/tests/model?Reference", ModelElementTypes.Reference_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ModelElementTypes.isKnownElementType(elementType)) {
			image = ModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getType_2001Text(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_1000Text(view);
		case BooleanAttributeEditPart.VISUAL_ID:
			return getBooleanAttribute_3001Text(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getType_2001Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Type_2001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(TypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainer_1000Text(View view) {
		Container domainModelElement = (Container) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBooleanAttribute_3001Text(View view) {
		BooleanAttribute domainModelElement = (BooleanAttribute) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReference_4001Text(View view) {
		Reference domainModelElement = (Reference) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ContainerEditPart.MODEL_ID.equals(ModelVisualIDRegistry.getModelID(view));
	}

}

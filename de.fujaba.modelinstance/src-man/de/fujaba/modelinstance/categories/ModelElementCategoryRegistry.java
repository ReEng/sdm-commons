package de.fujaba.modelinstance.categories;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;

public class ModelElementCategoryRegistry {
	private static final String EXTENSION_POINT_ID = "de.fujaba.modelinstance.modelelementcategory";

	public boolean isValidCategory(String key, EObject modelElement) {
		if (key == null || modelElement == null) {
			return false;
		}
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement configElement : config) {
			String extensionKey = configElement.getAttribute("key");
			IConfigurationElement[] children = configElement
					.getChildren("child");
			for (IConfigurationElement child : children) {
				String extensionPackage = child.getAttribute("packageNsUri");
				String extensionClass = child.getAttribute("class");
				if (key.equals(extensionKey)
						&& hasType(modelElement, extensionPackage,
								extensionClass)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * We use EMF reflection to find out, if the given object is of type
	 * "className".
	 * 
	 * @param object
	 *            The object, which type should be checked.
	 * @param packageName
	 * @param className
	 *            The className to compare with.
	 * @return true, if object is of type "className".
	 */
	private boolean hasType(EObject object, String packageName, String className) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(packageName);
		EClassifier classifier = ePackage.getEClassifier(className);
		if (classifier instanceof EClass) {
			return ((EClass) classifier).isSuperTypeOf(object.eClass());
		}
		return false;
	}

	public String getCategoryName(String key) {
		if (key != null) {
			IConfigurationElement[] config = RegistryFactory.getRegistry()
					.getConfigurationElementsFor(EXTENSION_POINT_ID);
			for (IConfigurationElement configElement : config) {
				String extensionKey = configElement.getAttribute("key");
				String extensionName = configElement.getAttribute("name");
				if (key.equals(extensionKey)) {
					return extensionName;
				}
			}
		}
		return null;
	}

	
	public ModelElementCategory getModelElementCategory(RootNode rootNode,
			String categoryKey) {
		ModelElementCategory result = null;
		if (categoryKey != null) {
			for (ModelElementCategory category : rootNode.getCategories()) {
				if (categoryKey.equals(category.getKey())
				/*
				 * && category .isValidElement(diagramElement)
				 */) {
					result = category;
					break;
				}
			}
		}

		if (result == null) {
			result = ModelinstanceFactory.eINSTANCE
					.createModelElementCategory();
			String categoryName = null;
			ModelElementCategoryRegistry registry = ModelInstancePlugin.getInstance().getModelElementCategoryRegistry();
			if (registry != null) {
				categoryName = registry.getCategoryName(categoryKey);
			}
			result.setName(categoryName);
			result.setKey(categoryKey);
			rootNode.getCategories().add(result);
		}
		return result;
	}


}

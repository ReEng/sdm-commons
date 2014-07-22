package org.storydriven.storydiagrams.tests.edit;

import org.eclipse.emf.common.notify.Adapter;

public class CustomTestsItemProviderAdapterFactory extends TestsItemProviderAdapterFactory {
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new CustomProjectItemProvider(this);
		}
		return projectItemProvider;
	}

	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new CustomPackageItemProvider(this);
		}
		return packageItemProvider;
	}

	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new CustomInterfaceItemProvider(this);
		}
		return interfaceItemProvider;
	}

	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new CustomClassItemProvider(this);
		}
		return classItemProvider;
	}

	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new CustomFieldItemProvider(this);
		}
		return fieldItemProvider;
	}

	@Override
	public Adapter createEnumAdapter() {
		if (enumItemProvider == null) {
			enumItemProvider = new CustomEnumItemProvider(this);
		}
		return enumItemProvider;
	}

	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new CustomMethodItemProvider(this);
		}
		return methodItemProvider;
	}

	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new CustomParameterItemProvider(this);
		}
		return parameterItemProvider;
	}

	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new CustomStatementItemProvider(this);
		}
		return statementItemProvider;
	}
}

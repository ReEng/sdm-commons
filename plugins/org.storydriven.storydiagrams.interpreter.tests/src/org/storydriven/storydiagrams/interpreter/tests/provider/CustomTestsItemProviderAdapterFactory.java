package org.storydriven.storydiagrams.interpreter.tests.provider;

import org.eclipse.emf.common.notify.Adapter;

public class CustomTestsItemProviderAdapterFactory extends TestsItemProviderAdapterFactory {
	@Override
	public Adapter createTModelAdapter() {
		if (tModelItemProvider == null) {
			tModelItemProvider = new CustomTModelItemProvider(this);
		}
		return tModelItemProvider;
	}

	@Override
	public Adapter createTPackageAdapter() {
		if (tPackageItemProvider == null) {
			tPackageItemProvider = new CustomTPackageItemProvider(this);
		}
		return tPackageItemProvider;
	}

	@Override
	public Adapter createTInterfaceAdapter() {
		if (tInterfaceItemProvider == null) {
			tInterfaceItemProvider = new CustomTInterfaceItemProvider(this);
		}
		return tInterfaceItemProvider;
	}

	@Override
	public Adapter createTClassAdapter() {
		if (tClassItemProvider == null) {
			tClassItemProvider = new CustomTClassItemProvider(this);
		}
		return tClassItemProvider;
	}

	@Override
	public Adapter createTEnumAdapter() {
		if (tEnumItemProvider == null) {
			tEnumItemProvider = new CustomTEnumItemProvider(this);
		}
		return tEnumItemProvider;
	}

	@Override
	public Adapter createTFieldAdapter() {
		if (tFieldItemProvider == null) {
			tFieldItemProvider = new CustomTFieldItemProvider(this);
		}
		return tFieldItemProvider;
	}

	@Override
	public Adapter createTMethodAdapter() {
		if (tMethodItemProvider == null) {
			tMethodItemProvider = new CustomTMethodItemProvider(this);
		}
		return tMethodItemProvider;
	}

	@Override
	public Adapter createTParameterAdapter() {
		if (tParameterItemProvider == null) {
			tParameterItemProvider = new CustomTParameterItemProvider(this);
		}
		return tParameterItemProvider;
	}

	@Override
	public Adapter createTReturnStatementAdapter() {
		if (tReturnStatementItemProvider == null) {
			tReturnStatementItemProvider = new CustomTReturnStatementItemProvider(this);
		}
		return tReturnStatementItemProvider;
	}

	@Override
	public Adapter createTMethodCallStatementAdapter() {
		if (tMethodCallStatementItemProvider == null) {
			tMethodCallStatementItemProvider = new CustomTCallItemProvider(this);
		}
		return tMethodCallStatementItemProvider;
	}
}

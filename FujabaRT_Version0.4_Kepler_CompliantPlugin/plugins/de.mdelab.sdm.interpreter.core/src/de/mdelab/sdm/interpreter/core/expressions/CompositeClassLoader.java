package de.mdelab.sdm.interpreter.core.expressions;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A class loader that delegates to a set of other class loaders. Class loaders
 * can be added at runtime.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CompositeClassLoader extends ClassLoader
{
	private final Set<ClassLoader>	classLoaders;

	public CompositeClassLoader(ClassLoader classLoader)
	{
		assert classLoader != null;

		this.classLoaders = Collections.synchronizedSet(new LinkedHashSet<ClassLoader>());
		this.addClassLoader(classLoader);
	}

	public void addClassLoader(ClassLoader classLoader)
	{
		this.classLoaders.add(classLoader);
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException
	{
		for (ClassLoader classLoader : this.classLoaders)
		{
			try
			{
				return classLoader.loadClass(name);
			}
			catch (ClassNotFoundException ex)
			{
				// Try next classloader
			}
		}

		/*
		 * No class loader could load this class.
		 */
		throw new ClassNotFoundException();
	}

}

package de.mdelab.sdm.interpreter.ocl.environment;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This map is used by the Ecore OCL evaluation environment so that calls to
 * allInstances method in OCL will return all objects of the type that are
 * contained in all resources of the resources set that contains the resource of
 * the context EObject.
 * 
 * @author <a href="mailto:dominique.blouin@univ-ubs.fr">Dominique Blouin</a>
 */
public class MultiResourceLazyExtentMap implements Map<EClass, Set<EObject>>
{

	private final Map<EClass, Set<EObject>>	delegate	= new HashMap<EClass, Set<EObject>>();

	private final Collection<EObject>		roots;

	/**
	 * Initializes me with the context element of an OCL expression evaluation.
	 * I discover the scope of the model from this element.
	 * 
	 * @param context
	 *            my context element
	 */
	public MultiResourceLazyExtentMap(List<EObject> contextElements)
	{
		super();

		this.roots = new HashSet<EObject>();

		for (EObject e : contextElements)
		{
			final EObject rootElement = EcoreUtil.getRootContainer(e);

			if (rootElement.eResource() != null)
			{
				final ResourceSet resSet = rootElement.eResource().getResourceSet();

				if (resSet != null)
				{
					for (final Resource resource : resSet.getResources())
					{
						this.roots.addAll(resource.getContents());
					}
				}
			}
			else
			{
				// can only search this object tree
				this.roots.add(e);
			}
		}
	}

	/**
	 * Lazily computes the extent of the specified class <code>key</code>.
	 * 
	 * @param key
	 *            a class in the model
	 */
	@Override
	public Set<EObject> get(final Object p_key)
	{
		// TODO: Optimize by parsing ahead of time to find all EClasses that we
		// will query
		Set<EObject> result = this.delegate.get(p_key);

		if (result == null)
		{
			final EClass cls = (EClass) p_key;

			result = new HashSet<EObject>();
			this.delegate.put(cls, result);

			for (final Iterator<Notifier> iter = EcoreUtil.getAllContents(this.roots); iter.hasNext();)
			{
				final EObject nextObject = (EObject) iter.next();

				if (this.isInstance(cls, nextObject))
				{
					result.add(nextObject);
				}
			}
		}

		return result;
	}

	protected boolean isInstance(final EClass p_class, final EObject p_element)
	{
		return p_class.isInstance(p_element);
	}

	//
	// Strictly delegating methods
	//
	@Override
	public void clear()
	{
		this.delegate.clear();
	}

	@Override
	public boolean containsKey(Object key)
	{
		return this.delegate.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value)
	{
		return this.delegate.containsValue(value);
	}

	@Override
	public Set<Map.Entry<EClass, Set<EObject>>> entrySet()
	{
		return this.delegate.entrySet();
	}

	@Override
	public boolean equals(Object obj)
	{
		return this.delegate.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return this.delegate.hashCode();
	}

	@Override
	public boolean isEmpty()
	{
		return this.delegate.isEmpty();
	}

	@Override
	public Set<EClass> keySet()
	{
		return this.delegate.keySet();
	}

	@Override
	public Set<EObject> put(EClass key, Set<EObject> value)
	{
		return this.delegate.put(key, value);
	}

	@Override
	public void putAll(Map<? extends EClass, ? extends Set<EObject>> t)
	{
		this.delegate.putAll(t);
	}

	@Override
	public Set<EObject> remove(Object key)
	{
		return this.delegate.remove(key);
	}

	@Override
	public int size()
	{
		return this.delegate.size();
	}

	@Override
	public String toString()
	{
		return this.delegate.toString();
	}

	@Override
	public Collection<Set<EObject>> values()
	{
		return this.delegate.values();
	}
}

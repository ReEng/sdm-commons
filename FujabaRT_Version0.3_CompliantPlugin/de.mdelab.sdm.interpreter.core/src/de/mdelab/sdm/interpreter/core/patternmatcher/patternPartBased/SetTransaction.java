package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Set;

/**
 * A transaction is a reversible move operation between sets. It is used to move
 * an element between two sets. However, it is not necessary to provide two
 * sets. One of them can also be null.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <T>
 */
public class SetTransaction<T> extends Transaction
{
	private final Set<T>	sourceSet;

	private final Set<T>	targetSet;

	public T				element;

	public SetTransaction(T element, Set<T> sourceSet, Set<T> targetSet)
	{
		assert element != null;
		
		this.element = element;
		this.sourceSet = sourceSet;
		this.targetSet = targetSet;
	}

	/**
	 * Commit the transaction, i.e. move the element from the source to the
	 * target set.
	 */
	@Override
	public void commit()
	{
		if (this.sourceSet != null)
		{
			this.sourceSet.remove(this.element);
		}

		if (this.targetSet != null)
		{
			this.targetSet.add(this.element);
		}
	}

	/**
	 * Undo the transaction, i.e. move the element from the target set back to
	 * the source set.
	 */
	@Override
	public void rollBack()
	{
		if (this.targetSet != null)
		{
			this.targetSet.remove(this.element);
		}

		if (this.sourceSet != null)
		{
			this.sourceSet.add(this.element);
		}
	}
}

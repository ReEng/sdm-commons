package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

public abstract class Transaction
{
	public abstract void commit();

	public abstract void rollBack();
}

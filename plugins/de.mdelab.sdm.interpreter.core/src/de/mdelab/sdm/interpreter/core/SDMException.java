package de.mdelab.sdm.interpreter.core;

/**
 * General container exception for all kinds of exceptions occurring during the
 * execution of a story diagram.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class SDMException extends Exception
{
	private static final long	serialVersionUID	= 4051161944125615443L;

	public SDMException(final String message)
	{
		super(message);
	}

	public SDMException(final String message, final Exception innerException)
	{
		super(message, innerException);
	}
}

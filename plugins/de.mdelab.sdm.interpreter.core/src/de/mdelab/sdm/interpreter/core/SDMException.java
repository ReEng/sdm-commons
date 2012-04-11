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

	private String				message				= "";
	private Exception			innerException		= null;

	public SDMException(String message)
	{
		this.message = message;
	}

	public SDMException(String message, Exception innerException)
	{
		this.message = message;
		this.innerException = innerException;
	}

	@Override
	public String toString()
	{
		if (this.innerException == null)
		{
			return this.message;
		}
		else
		{
			return this.message + "\nInnerException:\n" + this.innerException.toString();
		}
	}
}

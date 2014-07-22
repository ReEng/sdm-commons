package de.mdelab.sdm.interpreter.core;

/**
 * This exception can be thrown during the execution of a story diagram. It
 * aborts the execution either completely (if targetInterpreter is null), or to
 * the specified targetInterpreter. The targetInterpreter will then continue
 * execution with the next activity node.
 * 
 * The main purpose of this exception is to allow a debugger to abort the
 * execution of a story diagram.
 * 
 * @author Stephan Hildebrandt.
 * 
 */
public class AbortInterpretationException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long								serialVersionUID	= 7667924488354799785L;

	private final SDMInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?>	targetInterpreter;

	public AbortInterpretationException(SDMInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?> targetInterpreter)
	{
		this.targetInterpreter = targetInterpreter;
	}

	/**
	 * 
	 * @return The target SDM interpreter that should catch the exception.
	 */
	public SDMInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?> getTargetInterpreter()
	{
		return this.targetInterpreter;
	}
}

package de.mdelab.sdm.interpreter.core.executionTrace;

import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;

/**
 * A profile filter determins whether a particular notification of the story
 * diagram interpreter should be profiled or not. The filter can do this based
 * on the notification's type a some arbitrary other criterion.
 * 
 * @author Stephan
 * 
 * @param <Classifier>
 */
public interface ProfilingFilter<Classifier>
{
	/**
	 * Returns true if the notification should be profiled, i.e., included in
	 * the execution trace, false otherwise.
	 * 
	 * @param notification
	 * @return
	 */
	public boolean doProfile(InterpreterNotification<Classifier> notification);
}

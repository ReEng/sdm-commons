package de.mdelab.sdm.interpreter.core.executionTrace;

import java.util.HashSet;
import java.util.Set;

import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;

/**
 * Filters notifications based on the story diagram element they belong to.
 * Note, that contained elements are not filtered, e.g., if an activity node is
 * filtered, only notifications concerning the activity node itself are
 * profiled, notifications concerning children of that activity node are
 * discarded.
 * 
 * @author Stephan
 * 
 * @param <Classifier>
 */
public class StoryDiagramElementProfilingFilter<Classifier> implements ProfilingFilter<Classifier>
{
	private final Set<Object>	filteredElements;

	public StoryDiagramElementProfilingFilter(final Object[] filteredElements)
	{
		this.filteredElements = new HashSet<Object>();

		for (final Object element : filteredElements)
		{
			this.filteredElements.add(element);
		}
	}

	@Override
	public boolean doProfile(final InterpreterNotification<Classifier> notification)
	{
		return this.filteredElements.contains(notification.getMainStoryDiagramElement());
	}

}

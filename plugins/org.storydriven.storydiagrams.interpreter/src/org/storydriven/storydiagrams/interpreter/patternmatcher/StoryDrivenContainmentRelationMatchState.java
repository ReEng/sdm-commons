package org.storydriven.storydiagrams.interpreter.patternmatcher;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class StoryDrivenContainmentRelationMatchState extends StoryDrivenLinkVariableMatchState<TreeIterator<EObject>>
{
	private EObject	lastContainer;

	public EObject getLastContainer()
	{
		return this.lastContainer;
	}

	public void setLastContainer(EObject lastContainer)
	{
		this.lastContainer = lastContainer;
	}
}

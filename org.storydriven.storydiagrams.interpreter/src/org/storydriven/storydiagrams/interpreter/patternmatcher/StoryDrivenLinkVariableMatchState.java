package org.storydriven.storydiagrams.interpreter.patternmatcher;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;

public class StoryDrivenLinkVariableMatchState<ITERATOR_TYPE> extends MatchState
{
	private ITERATOR_TYPE	linkIterator;

	private EObject			sourceInstanceObject;

	public ITERATOR_TYPE getLinkIterator()
	{
		return this.linkIterator;
	}

	public void setLinkIterator(ITERATOR_TYPE linkIterator)
	{
		this.linkIterator = linkIterator;
	}

	public EObject getSourceInstanceObject()
	{
		return this.sourceInstanceObject;
	}

	public void setSourceInstanceObject(EObject sourceInstanceObject)
	{
		this.sourceInstanceObject = sourceInstanceObject;
	}
}

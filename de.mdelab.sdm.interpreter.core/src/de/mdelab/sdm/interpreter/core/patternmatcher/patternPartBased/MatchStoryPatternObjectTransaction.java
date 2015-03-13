package de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased;

import java.util.Set;

public class MatchStoryPatternObjectTransaction<StoryPatternObject> extends MatchTransaction
{
	private final StoryPatternObject					storyPatternObject;

	private final Object								instanceObject;

	private final SetTransaction<StoryPatternObject>	storyPatternObjectTransaction;

	private final SetTransaction<Object>				instanceObjectTransaction;

	public MatchStoryPatternObjectTransaction(StoryPatternObject storyPatternObject, Object instanceObject,
			Set<StoryPatternObject> unboundSPO, Set<StoryPatternObject> boundSPO, Set<Object> boundInstanceObjects)
	{
		assert storyPatternObject != null;
		assert instanceObject != null;
		assert unboundSPO != null;
		assert boundSPO != null;
		assert boundInstanceObjects != null;

		assert unboundSPO.contains(storyPatternObject);
		assert !boundSPO.contains(storyPatternObject);
		assert !boundInstanceObjects.contains(instanceObject);

		this.storyPatternObject = storyPatternObject;
		this.instanceObject = instanceObject;

		this.storyPatternObjectTransaction = new SetTransaction<StoryPatternObject>(storyPatternObject, unboundSPO, boundSPO);
		this.instanceObjectTransaction = new SetTransaction<Object>(instanceObject, null, boundInstanceObjects);
	}

	@Override
	public void commit()
	{
		this.storyPatternObjectTransaction.commit();
		this.instanceObjectTransaction.commit();
	}

	@Override
	public void rollBack()
	{
		this.storyPatternObjectTransaction.rollBack();
		this.instanceObjectTransaction.rollBack();
	}

	public StoryPatternObject getStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	public Object getInstanceObject()
	{
		return this.instanceObject;
	}
}

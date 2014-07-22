package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * The attribute of an object was set to a new value.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <Classifier>
 * @param <Feature>
 */
public class AttributeValueSetNotification<StoryPatternObject, Classifier, Feature> extends InterpreterNotification<Classifier>
{
	private final StoryPatternObject	storyPatternObject;

	private final Object				instanceObject;

	private final Feature				feature;

	private final Object				featureValue;

	public AttributeValueSetNotification(VariablesScope<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> variablesScope,
			Notifier<?, ?, ?, ?, StoryPatternObject, ?, Classifier, Feature, ?> notifier, StoryPatternObject storyPatternObject,
			Object instanceObject, Feature feature, Object featureValue)
	{
		super(variablesScope, notifier);

		assert storyPatternObject != null;
		assert instanceObject != null;
		assert feature != null;

		this.storyPatternObject = storyPatternObject;
		this.instanceObject = instanceObject;
		this.feature = feature;
		this.featureValue = featureValue;
	}

	public StoryPatternObject getStoryPatternObject()
	{
		return this.storyPatternObject;
	}

	public Object getInstanceObject()
	{
		return this.instanceObject;
	}

	public Feature getFeature()
	{
		return this.feature;
	}

	public Object getFeatureValue()
	{
		return this.featureValue;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getStoryPatternObject();
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.ATTRIBUTE_VALUE_SET;
	}

}

package org.storydriven.modeling.interpreter.notifications;

import java.io.OutputStream;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.modeling.interpreter.facade.StoryDrivenMetamodelFacadeFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.notifications.OutputStreamNotificationReceiver;

public class StoryDrivenOutputStreamNotificationReceiver
		extends
		OutputStreamNotificationReceiver<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenOutputStreamNotificationReceiver(OutputStream outputStream)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, outputStream);
	}

	public StoryDrivenOutputStreamNotificationReceiver()
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE);
	}

}

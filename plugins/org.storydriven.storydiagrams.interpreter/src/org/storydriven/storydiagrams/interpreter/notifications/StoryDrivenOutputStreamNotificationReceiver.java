package org.storydriven.storydiagrams.interpreter.notifications;

import java.io.OutputStream;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.storydiagrams.interpreter.facade.StoryDrivenMetamodelFacadeFactory;

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

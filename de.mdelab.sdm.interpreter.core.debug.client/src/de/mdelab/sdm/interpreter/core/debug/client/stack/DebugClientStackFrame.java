package de.mdelab.sdm.interpreter.core.debug.client.stack;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class DebugClientStackFrame<StoryDiagramElement extends EObject>
{

	private final StoryDiagramElement					storyDiagramElement;

	private final int									stackFrameIndex;

	private final Map<String, Variable<EClassifier>>	variables;

	private final NotificationTypeEnum					lastNotificationType;

	public DebugClientStackFrame(StoryDiagramElement storyDiagramElement, int stackFrameIndex,
			Map<String, Variable<EClassifier>> variables, NotificationTypeEnum lastNotificationType)
	{
		super();
		this.storyDiagramElement = storyDiagramElement;
		this.stackFrameIndex = stackFrameIndex;
		this.variables = variables;
		this.lastNotificationType = lastNotificationType;
	}

	public StoryDiagramElement getStoryDiagramElement()
	{
		return this.storyDiagramElement;
	}

	public int getStackFrameIndex()
	{
		return this.stackFrameIndex;
	}

	public Map<String, Variable<EClassifier>> getVariables()
	{
		return this.variables;
	}

	public NotificationTypeEnum getLastNotificationType()
	{
		return this.lastNotificationType;
	}
}

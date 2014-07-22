package de.mdelab.sdm.interpreter.code.debug.ui.storyDiagramEditor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorInput;

import de.hpi.sam.storyDiagramEcore.NamedElement;
import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;
import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;

public abstract class SDEditorManager<StoryDiagramElement extends EObject>
{
	private final SDDebugTarget<StoryDiagramElement, ?>	debugTarget;

	private final Color									CREATED_COLOR		= new Color(null, 0, 164, 29);		// dark
	private final Color									DESTROYED_COLOR		= new Color(null, 164, 29, 0);		// dark
	private final Color									SUCCESSFUL_COLOR	= new Color(null, 129, 244, 44);	// green
	private final Color									FAILED_COLOR		= new Color(null, 255, 44, 0);		// red
	private final Color									VISITED_COLOR		= new Color(null, 42, 144, 244);	// blue

	public SDEditorManager(SDDebugTarget<StoryDiagramElement, ?> debugTarget)
	{
		this.debugTarget = debugTarget;
	}

	public SDDebugTarget<StoryDiagramElement, ?> getDebugTarget()
	{
		return this.debugTarget;
	}

	public abstract void highlightStoryDiagramElement(final StoryDiagramElement element, final NotificationTypeEnum notification);
	
	public abstract void focusDiagramElement(NamedElement element);

	protected Color getColorForNotification(NotificationTypeEnum notification)
	{
		switch (notification)
		{
			case INSTANCE_LINK_CREATED:
			case INSTANCE_OBJECT_CREATED:
				return this.CREATED_COLOR;

			case INSTANCE_LINK_DESTROYED:
			case INSTANCE_OBJECT_DESTROYED:
				return this.DESTROYED_COLOR;

			case LINK_CHECK_SUCCESSFUL:
			case STORY_PATTERN_CONSTRAINT_HOLDS:
			case STORY_PATTERN_MATCHING_SUCCESSFUL:
			case STORY_PATTERN_OBJECT_BOUND:
			case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
				return this.SUCCESSFUL_COLOR;

			case LINK_CHECK_FAILED:
			case STORY_PATTERN_CONSTRAINT_VIOLATED:
			case STORY_PATTERN_MATCHING_FAILED:
			case STORY_PATTERN_OBJECT_BINDING_REVOKED:
			case STORY_PATTERN_OBJECT_NOT_BOUND:
			case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
				return this.FAILED_COLOR;

			default:
				return this.VISITED_COLOR;
		}
	}

	public abstract void closeAllStoryDiagramEditors();

	public abstract IEditorInput getEditorInput(StoryDiagramElement element);

}

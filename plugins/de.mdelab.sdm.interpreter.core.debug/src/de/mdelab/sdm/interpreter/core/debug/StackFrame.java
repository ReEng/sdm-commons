package de.mdelab.sdm.interpreter.core.debug;

import org.eclipse.emf.ecore.EClassifier;

import de.mdelab.sdm.interpreter.core.notifications.InterpreterNotification;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class StackFrame<StoryDiagramElement>
{
	private StoryDiagramElement									storyDiagramElement;

	private VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?>	variablesScope;

	private InterpreterNotification<EClassifier>				lastNotification;

	public void setStoryDiagramElement(StoryDiagramElement storyDiagramElement)
	{
		this.storyDiagramElement = storyDiagramElement;
	}

	public StoryDiagramElement getStoryDiagramElement()
	{
		return this.storyDiagramElement;
	}

	public void setVariablesScope(VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		this.variablesScope = variablesScope;
	}

	public VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> getVariablesScope()
	{
		return this.variablesScope;
	}

	public InterpreterNotification<EClassifier> getLastNotification()
	{
		return this.lastNotification;
	}

	public void setLastNotification(InterpreterNotification<EClassifier> lastNotification)
	{
		this.lastNotification = lastNotification;
	}

}

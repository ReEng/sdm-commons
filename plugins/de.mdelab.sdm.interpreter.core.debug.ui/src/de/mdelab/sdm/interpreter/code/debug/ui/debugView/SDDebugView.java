package de.mdelab.sdm.interpreter.code.debug.ui.debugView;

import org.eclipse.debug.internal.ui.views.launch.LaunchView;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.actions.DebugCommandAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;

import de.mdelab.sdm.interpreter.code.debug.ui.stepCommands.StepBackOverCommandAction;

public class SDDebugView extends LaunchView
{
	// private static final String ANIMATE = "animate";
	// private static final String REWIND = "rewind";
	// private static final String STEP_BACK_INTO = "step_back_into";
	private static final String	STEP_BACK_OVER	= "step_back_over";
	// private static final String STEP_BACK_RETURN = "step_back_return";
	private static final String	stepBackGroup	= "stepBackGroup";

	@Override
	protected void configureToolBar(IToolBarManager tbm)
	{
		super.configureToolBar(tbm);

		// delete unused item
		tbm.remove("org.eclipse.debug.ui.debugview.toolbar.dropToFrame"); // can
																			// change
																			// in
																			// the
																			// next
																			// version
																			// of
																			// the
																			// eclipse
																			// debugger
																			// plugin
		tbm.remove("org.eclipse.debug.ui.actions.ToggleStepFilters");
		tbm.remove(IDebugUIConstants.EMPTY_STEP_GROUP);
		tbm.remove(IDebugUIConstants.RENDER_GROUP);

		tbm.add(new Separator(stepBackGroup));
		// tbm.appendToGroup(stepBackGroup, getAction(REWIND));
		// tbm.appendToGroup(stepBackGroup, getAction(STEP_BACK_INTO));
		tbm.appendToGroup(stepBackGroup, this.getAction(STEP_BACK_OVER));
		// tbm.appendToGroup(stepBackGroup, getAction(STEP_BACK_RETURN));

		// tbm.prependToGroup(IDebugUIConstants.STEP_INTO_GROUP,
		// this.getAction(ANIMATE));
	}

	@Override
	protected void createActions()
	{
		super.createActions();
		// DebugCommandAction command = new RewindCommandAction();
		// command.init(this);
		// setAction(REWIND, command);

		// command = new StepBackIntoCommandAction();
		// command.init(this);
		// setAction(STEP_BACK_INTO, command);

		DebugCommandAction command = new StepBackOverCommandAction();
		command.init(this);
		this.setAction(STEP_BACK_OVER, command);

		// command = new StepBackReturnCommandAction();
		// command.init(this);
		// setAction(STEP_BACK_RETURN, command);

		// command = new AnimateCommandAction();
		// command.init(this);
		// this.setAction(ANIMATE, command);
	}
}

package de.mdelab.sdm.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * A conditional breakpoint can be used to suspend the story diagram execution
 * when a certain condition is fulfilled. A conditional breakpoint can be
 * attached to an element of the story diagram or can have a textual expression,
 * or both. If the breakpoint is attached to an element, the debugger is
 * suspended whenever that element is executed and the expression holds (if
 * there is an expression). If there is only an expression, the execution is
 * suspended whenever the expression can be parsed and evaluated in the context
 * of the currently executed element and it is evaluated to true.
 * 
 * TODO: If it is an OCL expression that cannot be parsed and evaluated in the
 * context of the currently executed element, the OCL interpreter emits a stack
 * trace on the console. However, the thrown exception is caught and ignored by
 * the breakpoint.
 * 
 * @author Stephan Hildebrandt
 * @param <StoryDiagramElement>
 * 
 */
public class ConditionalBreakpoint<StoryDiagramElement extends EObject, Expression> extends Breakpoint<StoryDiagramElement>
{
	private Expression												expression;

	private SDDebugger<StoryDiagramElement, ?, ?, ?, Expression>	debugger;

	public ConditionalBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, Expression> debugger, String elementUUID)
	{
		this(debugger, elementUUID, null);
	}

	public ConditionalBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, Expression> debugger, String elementUUID,
			Expression expression)
	{
		super(debugger, elementUUID != null ? elementUUID : Breakpoint.ANY_ELEMENT_UUID);

		if (expression != null)
		{
			this.expression = expression;
		}

		this.debugger = debugger;
	}

	@Override
	public boolean evaluate(StoryDiagramElement currentlyExecutedElement, VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		assert currentlyExecutedElement != null;

		/*
		 * Evaluate condition
		 */
		if (this.expression != null)
		{
			try
			{
				/*
				 * Deactivate processing of notifications because the evaluation
				 * of this expression has nothing to do with the execution of
				 * the story diagram.
				 */
				this.getDebugger().setProcessNotifications(false);

				@SuppressWarnings("unchecked")
				Variable<EClassifier> result = this.debugger
						.getInterpreter()
						.getExpressionInterpreterManager()
						.evaluateExpression(this.expression, null, null,
								(VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression>) variablesScope);

				if (result.getValue() instanceof Boolean)
				{
					return (Boolean) result.getValue();
				}
				else
				{
					throw new RuntimeException("Expression '" + this.expression + "' did not yield a boolean result.");
				}
			}
			catch (SDMException e)
			{
				/*
				 * Silently ignore exceptions. If not all variables are
				 * available, parsing an expression may not be possible.
				 */

				return false;
			}
			finally
			{
				this.getDebugger().setProcessNotifications(true);
			}
		}
		else
		{
			return true;
		}
	}
}

package de.mdelab.sdm.interpreter.core.debug.protocol.indications;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectSerializer;
import de.mdelab.sdm.interpreter.core.debug.EDebuggerState;
import de.mdelab.sdm.interpreter.core.debug.SDDebugger;
import de.mdelab.sdm.interpreter.core.debug.StackFrame;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class GetExecutionStackCommandIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandIndicationWithResponse<StoryDiagramElement>
{

	public GetExecutionStackCommandIndication(SignalProtocol<?> protocol, SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.GET_EXECUTION_STACK, debuggingInterpreter);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		// Do nothing

		assert this.getDebugger().getDebuggerState() != EDebuggerState.RUNNING;
	}

	@Override
	protected void responding(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send number of stack frames. The topmost stack element may not have a
		 * story diagram element. Skip it.
		 */
		if (this.getDebugger().getExecutionStack().peek().getStoryDiagramElement() == null)
		{
			out.writeObject(this.getDebugger().getExecutionStack().size() - 1);
		}
		else
		{
			out.writeObject(this.getDebugger().getExecutionStack().size());
		}

		ObjectSerializer objectSerializer = new ObjectSerializer(this.getDebugger().getSynchronizerAdapter());

		/*
		 * for each stack frame
		 */
		for (StackFrame<StoryDiagramElement> stackFrame : this.getDebugger().getExecutionStack())
		{
			if (stackFrame.getStoryDiagramElement() != null)
			{
				/*
				 * Send the UUID of the corresponding story diagram element
				 */
				out.writeObject(this.getDebugger().getSynchronizerAdapter().getEObjectUUIDManager()
						.getUuid(stackFrame.getStoryDiagramElement()));

				/*
				 * Send the number of variables
				 */
				out.writeObject(stackFrame.getVariablesScope().getVariables().size());

				/*
				 * for each variable
				 */
				for (Variable<EClassifier> variable : stackFrame.getVariablesScope().getVariables())
				{
					/*
					 * Send the variable's name
					 */
					out.writeObject(variable.getName());

					/*
					 * Send the variable's classifier
					 */
					out.writeObject(objectSerializer.serializeObjectAsProxy(variable.getClassifier(), variable.getClassifier().eClass()));

					/*
					 * Send the variable's value
					 */
					if (variable.getValue() == null)
					{
						out.writeObject(null);
					}
					else
					{
						out.writeObject(objectSerializer.serializeObjectAsProxy(variable.getValue(), variable.getClassifier()));
					}
				}

				/*
				 * send the last notification type
				 */
				out.writeObject(stackFrame.getLastNotification().getNotificationType());
			}
		}
	}
}

package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectDeserializer;
import de.mdelab.resourceSetSynchronizer.protocols.serialization.SerializedObject;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;
import de.mdelab.sdm.interpreter.core.notifications.NotificationTypeEnum;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class GetExecutionStackCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Stack<DebugClientStackFrame<StoryDiagramElement>>>
{

	public GetExecutionStackCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.GET_EXECUTION_STACK, debugClient);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

	@Override
	protected Stack<DebugClientStackFrame<StoryDiagramElement>> confirming(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Read number of stack frames
		 */
		int numberOfStackFrames = (Integer) in.readObject();

		Stack<DebugClientStackFrame<StoryDiagramElement>> stackFrames = new Stack<DebugClientStackFrame<StoryDiagramElement>>();

		assert !this.getDebugClient().getSynchronizerAdapter().getRemoteAdapterAddresses().isEmpty();

		ObjectDeserializer deserializer = new ObjectDeserializer(this.getDebugClient().getSynchronizerAdapter(), this.getDebugClient()
				.getSynchronizerAdapter().getRemoteAdapterAddresses().keySet().iterator().next());

		/*
		 * for each stack frame
		 */
		for (int i = 0; i < numberOfStackFrames; i++)
		{
			/*
			 * Receive the story diagram element's UUID
			 */
			String elementUUID = (String) in.readObject();

			/*
			 * Get the corresponding story diagram element
			 */
			@SuppressWarnings("unchecked")
			StoryDiagramElement storyDiagramElement = (StoryDiagramElement) deserializer.getEObjectForUUID(elementUUID);

			assert storyDiagramElement != null;

			/*
			 * Receive the number of variables
			 */
			int numberOfVariables = (Integer) in.readObject();

			Map<String, Variable<EClassifier>> variables = new HashMap<String, Variable<EClassifier>>(numberOfVariables);

			/*
			 * for each variable
			 */
			for (int j = 0; j < numberOfVariables; j++)
			{
				/*
				 * Receive the variable's name
				 */
				String variableName = (String) in.readObject();

				/*
				 * Receive the variable's classifier
				 */
				SerializedObject serializedClassifier = (SerializedObject) in.readObject(this.getClass().getClassLoader());
				EClassifier classifier = (EClassifier) deserializer.deserializeObject(serializedClassifier);

				assert classifier != null;

				/*
				 * Receive the variable's value
				 */
				SerializedObject serializedObject = (SerializedObject) in.readObject(this.getClass().getClassLoader());

				Object value = null;

				if (serializedObject != null)
				{
					value = deserializer.deserializeObject(serializedObject);
				}

				variables.put(variableName, new Variable<EClassifier>(variableName, classifier, value));
			}

			/*
			 * Receive the last notification type
			 */
			NotificationTypeEnum notificationType = (NotificationTypeEnum) in.readObject(this.getClass().getClassLoader());

			/*
			 * create stack frame
			 */
			DebugClientStackFrame<StoryDiagramElement> stackFrame = new DebugClientStackFrame<StoryDiagramElement>(storyDiagramElement, i,
					variables, notificationType);

			stackFrames.push(stackFrame);
		}

		return stackFrames;
	}
}

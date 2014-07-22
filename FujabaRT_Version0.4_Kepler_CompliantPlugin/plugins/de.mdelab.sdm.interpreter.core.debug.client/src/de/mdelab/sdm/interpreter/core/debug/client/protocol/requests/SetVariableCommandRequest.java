package de.mdelab.sdm.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.protocols.serialization.ObjectSerializer;
import de.mdelab.sdm.interpreter.core.debug.client.SDDebugClient;
import de.mdelab.sdm.interpreter.core.debug.client.stack.DebugClientStackFrame;
import de.mdelab.sdm.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class SetVariableCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Exception>
{

	private final String										variableName;

	private final Object										variableValue;

	private final DebugClientStackFrame<StoryDiagramElement>	stackFrame;

	public SetVariableCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient, String variableName,
			DebugClientStackFrame<StoryDiagramElement> stackFrame, Object variableValue)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.SET_VARIABLE, debugClient);

		assert variableName != null;
		assert !"".equals(variableName);

		assert stackFrame != null;
		assert stackFrame.getVariables().containsKey(variableName);

		assert variableValue == null || !(variableValue instanceof EObject);
		assert stackFrame.getVariables().get(variableName).getClassifier() instanceof EDataType
				&& ((EDataType) stackFrame.getVariables().get(variableName).getClassifier()).isSerializable();

		this.variableName = variableName;
		this.stackFrame = stackFrame;
		this.variableValue = variableValue;

	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send stackFrameIndex
		 */
		out.writeInt(this.stackFrame.getStackFrameIndex());

		/*
		 * Send variable name
		 */
		out.writeString(this.variableName);

		/*
		 * Send serialized variable value
		 */
		ObjectSerializer serializer = new ObjectSerializer(this.getDebugClient().getSynchronizerAdapter());

		out.writeObject(serializer.serializePrimitive(this.variableValue, (EDataType) this.stackFrame.getVariables().get(this.variableName)
				.getClassifier()));
	}

	@Override
	protected Exception confirming(ExtendedDataInputStream in) throws Exception
	{
		return (Exception) in.readObject(this.getClass().getClassLoader());
	}

}

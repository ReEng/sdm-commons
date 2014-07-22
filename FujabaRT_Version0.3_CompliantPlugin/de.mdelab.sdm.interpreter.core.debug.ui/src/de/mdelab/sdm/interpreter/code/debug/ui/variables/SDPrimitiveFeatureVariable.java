package de.mdelab.sdm.interpreter.code.debug.ui.variables;

import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugTarget;

public class SDPrimitiveFeatureVariable<StoryDiagramElement extends EObject> extends SDFeatureVariable<StoryDiagramElement>
{

	private final EDataType	type;
	private Object			value;

	public SDPrimitiveFeatureVariable(SDDebugTarget<StoryDiagramElement, ?> target, String variableName, EObject containingEObject,
			EStructuralFeature containingFeature, EDataType type, Object value)
	{
		super(target, variableName, containingEObject, containingFeature);

		assert type != null;

		this.type = type;
		this.value = value;
	}

	@Override
	public IValue getValue() throws DebugException
	{
		return new SDPrimitiveValue<StoryDiagramElement>(this.getSDDebugTarget(), this.type, this.value);
	}

	@Override
	public boolean hasValueChanged() throws DebugException
	{
		// TODO
		return false;
	}

	@Override
	public void setValue(String expression) throws DebugException
	{
		/*
		 * Parse the value
		 */
		final Object newValue = this.type.getEPackage().getEFactoryInstance().createFromString(this.type, expression);

		/*
		 * Set the value
		 */
		if (!this.getContainingFeature().isMany())
		{
			this.getSDDebugTarget().getInstanceGraphEditor().getEditingDomain().getCommandStack().execute(new AbstractCommand()
			{

				@Override
				public void execute()
				{
					SDPrimitiveFeatureVariable.this.getContainingEObject().eSet(SDPrimitiveFeatureVariable.this.getContainingFeature(),
							newValue);
				}

				@Override
				public void redo()
				{
					this.execute();
				}

				@Override
				public boolean canUndo()
				{
					// TODO Make undoable
					return false;
				}

				@Override
				protected boolean prepare()
				{
					return true;
				}
			});

		}
		else
		{
			@SuppressWarnings("unchecked")
			final List<Object> values = (List<Object>) this.getContainingEObject().eGet(this.getContainingFeature());

			assert values.contains(this.value);

			this.getSDDebugTarget().getInstanceGraphEditor().getEditingDomain().getCommandStack().execute(new AbstractCommand()
			{

				@Override
				public void execute()
				{
					values.set(values.indexOf(SDPrimitiveFeatureVariable.this.value), newValue);
				}

				@Override
				public void redo()
				{
					this.execute();
				}

				@Override
				public boolean canUndo()
				{
					// TODO Make undoable
					return false;
				}

				@Override
				protected boolean prepare()
				{
					return true;
				}
			});
		}

		this.value = newValue;

		this.fireChangeEvent(org.eclipse.debug.core.DebugEvent.CONTENT);
	}

	@Override
	public void setValue(IValue value) throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean supportsValueModification()
	{
		return this.type.isSerializable() && this.getContainingFeature().isChangeable();
	}

	@Override
	public boolean verifyValue(String expression) throws DebugException
	{
		/*
		 * Try to parse the value
		 */
		try
		{
			this.type.getEPackage().getEFactoryInstance().createFromString(this.type, expression);

			return true;
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean verifyValue(IValue value) throws DebugException
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}

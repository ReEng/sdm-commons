package de.mdelab.sdm.interpreter.ocl.environment;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * A customized OCL evaluation environment that does not store variables locally
 * but retrieves them from a variables scope.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEvaluationEnvironment extends EcoreEvaluationEnvironment
{
	private final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?>	variablesScope;

	/*
	 * This map stores temporary variables like 'self'.
	 */
	private final Map<String, Object>									localValues;

	/**
	 * 
	 * @param variablesScope
	 *            The adapter of the variables manager from where variables are
	 *            retrieved.
	 */
	public CustomOCLEvaluationEnvironment(VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		this.localValues = new HashMap<String, Object>();

		this.variablesScope = variablesScope;
	}

	@Override
	public void add(String name, Object value)
	{
		this.localValues.put(name, value);
	}

	@Override
	public Object remove(String name)
	{
		return this.localValues.remove(name);
	}

	@Override
	public Object getValueOf(String name)
	{
		assert this.variablesScope != null;

		if (this.localValues.containsKey(name))
		{
			return this.localValues.get(name);
		}

		de.mdelab.sdm.interpreter.core.variables.Variable<EClassifier> variable = this.variablesScope.getVariable(name);

		if (variable == null && AbstractOCLAnalyzer.isEscaped(name))
		{
			variable = this.variablesScope.getVariable(AbstractOCLAnalyzer.unescape(name));
		}

		if (variable == null)
		{
			return null;
		}
		else
		{
			return variable.getValue();
		}
	}

	@Override
	public void replace(String name, Object value)
	{
		this.localValues.put(name, value);
	}
}

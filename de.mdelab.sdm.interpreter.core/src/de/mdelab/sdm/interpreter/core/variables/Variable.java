package de.mdelab.sdm.interpreter.core.variables;

/**
 * A variable is a triple of a variable name, classifier, and value.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public class Variable<Classifier>
{
	private final String		name;
	private final Classifier	classifier;
	private Object				value;

	public Variable(String name, Classifier classifier, Object value)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifier != null;

		this.name = name;
		this.classifier = classifier;
		this.value = value;
	}

	public String getName()
	{
		return this.name;
	}

	public Classifier getClassifier()
	{
		return this.classifier;
	}

	public Object getValue()
	{
		return this.value;
	}

	/**
	 * Set the value of the variable to a new value. This method should only be
	 * called by a VariablesScope, which emits proper notifications.
	 * 
	 * @param value
	 */
	protected void setValue(Object value)
	{
		this.value = value;
	}
}

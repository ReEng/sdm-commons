package org.storydriven.storydiagrams.interpreter.calls;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.storydriven.core.expressions.ArithmeticExpression;
import org.storydriven.core.expressions.BinaryLogicExpression;
import org.storydriven.core.expressions.ComparisonExpression;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.LiteralExpression;
import org.storydriven.core.expressions.NotExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.interpreter.StoryDrivenInterpreter;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreter;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

public class CallsInterpreter extends ExpressionInterpreter<Expression, EClassifier>
{
	private final List<EDataType>	classifierSizeList;

	public CallsInterpreter()
	{
		super();

		this.classifierSizeList = new ArrayList<EDataType>();

		this.classifierSizeList.add(EcorePackage.Literals.ESHORT);
		this.classifierSizeList.add(EcorePackage.Literals.ESHORT_OBJECT);
		this.classifierSizeList.add(EcorePackage.Literals.EBYTE);
		this.classifierSizeList.add(EcorePackage.Literals.EBYTE_OBJECT);
		this.classifierSizeList.add(EcorePackage.Literals.EINT);
		this.classifierSizeList.add(EcorePackage.Literals.EINTEGER_OBJECT);
		this.classifierSizeList.add(EcorePackage.Literals.EFLOAT);
		this.classifierSizeList.add(EcorePackage.Literals.EFLOAT_OBJECT);
		this.classifierSizeList.add(EcorePackage.Literals.ELONG);
		this.classifierSizeList.add(EcorePackage.Literals.ELONG_OBJECT);
		this.classifierSizeList.add(EcorePackage.Literals.EDOUBLE);
		this.classifierSizeList.add(EcorePackage.Literals.EDOUBLE_OBJECT);
	}

	@Override
	public Variable<EClassifier> evaluateExpression(Expression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		assert expression != null;

		if (expression instanceof ArithmeticExpression)
		{
			return this.evaluate((ArithmeticExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof AttributeValueExpression)
		{
			return this.evaluate((AttributeValueExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof BinaryLogicExpression)
		{
			return this.evaluate((BinaryLogicExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof ComparisonExpression)
		{
			return this.evaluate((ComparisonExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof LiteralExpression)
		{
			return this.evaluate((LiteralExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof MethodCallExpression)
		{
			return this.evaluate((MethodCallExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof NotExpression)
		{
			return this.evaluate((NotExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else if (expression instanceof ObjectVariableExpression)
		{
			return this.evaluate((ObjectVariableExpression) expression, contextClassifier, contextInstance, variablesScope);
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}

	private Variable<EClassifier> evaluate(ArithmeticExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		assert expression.getLeftExpression() != null;
		assert expression.getRightExpression() != null;

		/*
		 * Evaluate left expression
		 */
		Variable<EClassifier> leftVariable = getExpressionInterpreterManager().evaluateExpression(expression.getLeftExpression(),
				contextClassifier, contextInstance, variablesScope);

		/*
		 * Evaluate right expression
		 */
		Variable<EClassifier> rightVariable = getExpressionInterpreterManager().evaluateExpression(expression.getRightExpression(),
				contextClassifier, contextInstance, variablesScope);

		/*
		 * Map everything to BigDecimal
		 */
		BigDecimal operand1 = new BigDecimal(leftVariable.getValue().toString());
		BigDecimal operand2 = new BigDecimal(rightVariable.getValue().toString());

		BigDecimal result;

		/*
		 * perform the operation
		 */
		switch (expression.getOperator())
		{
			case PLUS:
			{
				result = operand1.add(operand2);
				break;
			}
			case MINUS:
			{
				result = operand1.subtract(operand2);
				break;
			}
			case TIMES:
			{
				result = operand1.multiply(operand2);
				break;
			}
			case DIVIDE:
			{
				result = operand1.divide(operand2);
				break;
			}
			case MODULO:
			{
				result = operand1.remainder(operand2);
				break;
			}
			case EXP:
			{
				result = operand1.pow(operand2.intValueExact());
				break;
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}

		/*
		 * The return classifier is the largest of the two operand classifiers
		 */
		EClassifier classifier = this.classifierSizeList.get(Math.max(this.classifierSizeList.indexOf(leftVariable.getClassifier()),
				this.classifierSizeList.indexOf(rightVariable.getClassifier())));

		Object finalResult;

		if (classifier == EcorePackage.Literals.EBYTE || classifier == EcorePackage.Literals.EBYTE_OBJECT)
		{
			finalResult = result.byteValue();
		}
		else if (classifier == EcorePackage.Literals.EINT || classifier == EcorePackage.Literals.EINTEGER_OBJECT)
		{
			finalResult = result.intValue();
		}
		else if (classifier == EcorePackage.Literals.EDOUBLE || classifier == EcorePackage.Literals.EDOUBLE_OBJECT)
		{
			finalResult = result.doubleValue();
		}
		else if (classifier == EcorePackage.Literals.EFLOAT || classifier == EcorePackage.Literals.EFLOAT_OBJECT)
		{
			finalResult = result.floatValue();
		}
		else if (classifier == EcorePackage.Literals.ELONG || classifier == EcorePackage.Literals.ELONG_OBJECT)
		{
			finalResult = result.longValue();
		}
		else if (classifier == EcorePackage.Literals.ESHORT || classifier == EcorePackage.Literals.ESHORT_OBJECT)
		{
			finalResult = result.shortValue();
		}
		else
		{
			throw new UnsupportedOperationException();
		}

		return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, classifier, finalResult);
	}

	private Variable<EClassifier> evaluate(BinaryLogicExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		/*
		 * Evaluate left expression
		 */
		Variable<EClassifier> leftVariable = getExpressionInterpreterManager().evaluateExpression(expression.getLeftExpression(),
				contextClassifier, contextInstance, variablesScope);

		assert leftVariable != null;

		/*
		 * Evaluate right expression
		 */
		Variable<EClassifier> rightVariable = getExpressionInterpreterManager().evaluateExpression(expression.getRightExpression(),
				contextClassifier, contextInstance, variablesScope);

		assert rightVariable != null;

		boolean operand1 = (Boolean) leftVariable.getValue();
		boolean operand2 = (Boolean) rightVariable.getValue();

		/*
		 * Compare values
		 */
		boolean result = false;

		switch (expression.getOperator())
		{
			case AND:
			{
				result = operand1 && operand2;
				break;
			}
			case OR:
			{
				result = operand1 || operand2;
				break;
			}
			case EQUIVALENT:
			{
				result = operand1 && operand2 || !operand1 && !operand2;
				break;
			}
			case IMPLY:
			{
				result = operand1 && operand2 || !operand1;
				break;
			}
			case XOR:
			{
				result = operand1 && !operand2 || !operand1 && operand2;
				break;
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}

		return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, EcorePackage.Literals.EBOOLEAN, result);
	}

	private Variable<EClassifier> evaluate(AttributeValueExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		try
		{

			Object result = null;

			if (contextInstance != null)
			{
				EAttribute attribute = expression.getAttribute();

				Variable<EClassifier> var = variablesScope.getVariable(expression.getObject().getName());

				if (var != null)
				{
					result = ((EObject) var.getValue()).eGet(attribute);
				}
				else
				{
					// e.g. for negative object variables
					result = ((EObject) contextInstance).eGet(attribute);
				}
			}
			else
			{
				result = expression.getAttribute();
			}

			return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, EcorePackage.Literals.EJAVA_OBJECT, result);
		}
		catch (Exception e)
		{
			e.printStackTrace();

			throw new SDMException("Could not evaluate AttributeValueExpression.", e);
		}
	}

	private Variable<EClassifier> evaluate(ObjectVariableExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope)
	{
		String name = expression.getObject().getName();

		Variable<EClassifier> var = variablesScope.getVariable(name);

		if (var == null)
		{
			var = new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, expression.getType(), null);
		}

		return var;
	}

	private Variable<EClassifier> evaluate(MethodCallExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		assert expression.getCallee() != null;

		try
		{
			/*
			 * Handle opaque callables
			 */
			if (expression.getCallee() instanceof OpaqueCallable)
			{
				OpaqueCallable opaqueCallable = (OpaqueCallable) expression.getCallee();

				/*
				 * The name of the opaque callable is the fully qualified method
				 * name. Split it into class and method name.
				 */
				String s = opaqueCallable.getName();

				String className = s.substring(0, s.lastIndexOf('.'));

				String methodName = s.substring(s.lastIndexOf('.') + 1, s.length());

				/*
				 * Get the input parameters of the callable
				 */
				Class<?>[] parameterTypes = new Class<?>[expression.getOpaqueCallable().getInParameters().size()];
				Object[] parameterValues = new Object[expression.getOpaqueCallable().getInParameters().size()];

				int index = 0;

				for (EParameter p : opaqueCallable.getInParameters())
				{
					parameterTypes[index] = p.getEType().getInstanceClass();

					/*
					 * Get the value bound to this parameter
					 */
					parameterValues[index] = getParameterValue(p, expression.getOwnedParameterBindings(), contextClassifier,
							contextInstance, variablesScope);
					index++;
				}

				/*
				 * Get the return type
				 */
				assert opaqueCallable.getOutParameters().size() == 1;

				// IClassifierAdapter returnTypeAdapter =
				// variableScope.getInterpreterManager().getMainAdapterFactory().getM3AdapterFactory()
				// .getClassifierAdapter(opaqueCallable.getOutParameters().get(0).getEType());

				/*
				 * Get the Class object
				 */
				Class<?> clazz = Class.forName(className, true, getExpressionInterpreterManager().getClassLoader());

				Method method = clazz.getMethod(methodName, parameterTypes);

				/*
				 * Get the instance object
				 */
				Object instanceObject = null;

				if (expression.getTarget() != null)
				{
					Variable<EClassifier> targetVariable = getExpressionInterpreterManager().evaluateExpression(expression.getTarget(),
							contextClassifier, contextInstance, variablesScope);

					assert targetVariable != null;

					instanceObject = targetVariable.getValue();

				}

				Object returnValue = method.invoke(instanceObject, parameterValues);

				if (!opaqueCallable.getOutParameters().get(0).getEType().isInstance(returnValue))
				{
					throw new SDMException("The return value '" + returnValue + "' is not an instance of the expected return type '"
							+ opaqueCallable.getOutParameters().get(0).getEType() + "'.");
				}

				return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, opaqueCallable.getOutParameters().get(0)
						.getEType(), returnValue);
			}
			else if (expression.getCallee() instanceof Activity)
			{
				Activity activity = (Activity) expression.getCallee();

				/*
				 * Compile list of parameters
				 */
				List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();

				for (ParameterBinding parameterBinding : expression.getOwnedParameterBindings())
				{
					assert parameterBinding.getValueExpression() != null;

					Variable<EClassifier> v = getExpressionInterpreterManager().evaluateExpression(parameterBinding.getValueExpression(),
							contextClassifier, contextInstance, variablesScope);

					assert v != null;

					v = new Variable<EClassifier>(parameterBinding.getParameter().getName(), parameterBinding.getParameter().getEType(),
							v.getValue());

					parameters.add(v);
				}

				/*
				 * Get the instance object
				 */
				if (expression.getTarget() != null)
				{
					Variable<EClassifier> targetVariable = getExpressionInterpreterManager().evaluateExpression(expression.getTarget(),
							contextClassifier, contextInstance, variablesScope);

					assert targetVariable != null;

					Variable<EClassifier> thisParameter = new Variable<EClassifier>("this", targetVariable.getClassifier(),
							targetVariable.getValue());

					parameters.add(thisParameter);
				}

				/*
				 * Execute the activity
				 */
				@SuppressWarnings("unchecked")
				StoryDrivenInterpreter sdi = new StoryDrivenInterpreter(
						(ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>) getExpressionInterpreterManager(),
						(NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>) getExpressionInterpreterManager()
								.getNotificationEmitter());

				Map<String, Variable<EClassifier>> returnValues = sdi.executeActivity(activity, parameters);

				Variable<EClassifier> returnVariable = returnValues.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME);

				if (returnVariable != null)
				{
					return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, returnVariable.getClassifier(),
							returnVariable.getValue());
				}
				else
				{
					return null;
				}
			}
			else
			{
				throw new UnsupportedOperationException();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();

			throw new SDMException("Could not evaluate MethodCallExpression.", e);
		}
	}

	private Object getParameterValue(EParameter p, Collection<ParameterBinding> parameterBindings, EClassifier contextClassifier,
			Object contextInstance, VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		/*
		 * Iterate through parameter bindings
		 */
		for (ParameterBinding b : parameterBindings)
		{
			if (b.getParameter() == p)
			{
				Variable<EClassifier> var = getExpressionInterpreterManager().evaluateExpression(b.getValueExpression(), contextClassifier,
						contextInstance, variablesScope);

				assert var != null;

				return var.getValue();
			}
		}

		throw new SDMException("There is no parameter binding for parameter '" + p.getName() + "'.");
	}

	@SuppressWarnings("unchecked")
	private Variable<EClassifier> evaluate(ComparisonExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		/*
		 * Evaluate left expression
		 */
		Variable<EClassifier> leftVariable = getExpressionInterpreterManager().evaluateExpression(expression.getLeftExpression(),
				contextClassifier, contextInstance, variablesScope);

		/*
		 * Evaluate right expression
		 */
		Variable<EClassifier> rightVariable = getExpressionInterpreterManager().evaluateExpression(expression.getRightExpression(),
				contextClassifier, contextInstance, variablesScope);

		/*
		 * Compare values
		 */
		Object operand1 = leftVariable.getValue();
		Object operand2 = rightVariable.getValue();

		boolean result = false;

		/*
		 * TODO: Is there a more elegant solution?
		 */
		int i;

		if (operand1 instanceof Number && operand2 instanceof Number)
		{
			/*
			 * If both operands are numbers, cast them to BigDecimals and
			 * compare them
			 */
			i = new BigDecimal(operand1.toString()).compareTo(new BigDecimal(operand2.toString()));

		}
		else if (operand1.getClass() == operand2.getClass())
		{
			/*
			 * Otherwise, we can only compare Comparables of the same type, e.g.
			 * String and String.
			 */
			i = ((Comparable) operand1).compareTo(operand2);
		}
		else
		{
			throw new SDMException("Cannot compare '" + operand1 + "' and '" + operand2 + "'.");
		}

		switch (expression.getOperator())
		{
			case EQUAL:
			{
				result = i == 0;
				break;
			}
			case LESS:
			{
				result = i < 0;
				break;
			}
			case LESS_OR_EQUAL:
			{
				result = i <= 0;
				break;
			}
			case GREATER:
			{
				result = i > 0;
				break;
			}
			case GREATER_OR_EQUAL:
			{
				result = i >= 0;
				break;
			}
			case UNEQUAL:
			{
				result = i != 0;
				break;
			}
			case REGULAR_EXPRESSION:
			{
				result = operand1.toString().matches(operand2.toString());
				break;
			}
			default:
			{
				throw new UnsupportedOperationException();
			}
		}

		return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, EcorePackage.Literals.EBOOLEAN, result);
	}

	private Variable<EClassifier> evaluate(LiteralExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope)
	{
		assert expression.getValue() != null;
		assert !"".equals(expression.getValue());
		assert expression.getValueType() != null;

		/*
		 * Let EcoreFactory create an Object of the appropriate primitive type
		 */
		Object value = expression.getValueType().getEPackage().getEFactoryInstance()
				.createFromString(expression.getValueType(), expression.getValue());

		return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, expression.getValueType(), value);
	}

	private Variable<EClassifier> evaluate(NotExpression expression, EClassifier contextClassifier, Object contextInstance,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		assert expression.getNegatedExpression() != null;

		Variable<EClassifier> result = getExpressionInterpreterManager().evaluateExpression(expression.getNegatedExpression(),
				contextClassifier, contextInstance, variablesScope);

		assert result.getValue() instanceof Boolean;

		return new Variable<EClassifier>(SDMInterpreterConstants.INTERNAL_VAR_NAME, EcorePackage.Literals.EBOOLEAN,
				!(Boolean) result.getValue());
	}

}

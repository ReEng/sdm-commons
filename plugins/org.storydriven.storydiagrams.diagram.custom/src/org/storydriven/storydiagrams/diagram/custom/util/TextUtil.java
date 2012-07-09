/**
 * Copyright 2012 Aljoschability. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Aljoscha Hark - initial API and implementation.
 */
package org.storydriven.storydiagrams.diagram.custom.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.StringLiteralExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.calls.ParameterExtension;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.expressions.ParameterExpression;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.CollectionSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public final class TextUtil {
	private static final String STEREOTYPE_PREFIX = "«"; //$NON-NLS-1$
	private static final String STEREOTYPE_SUFFIX = "»"; //$NON-NLS-1$
	private static final String EMPTY = ""; //$NON-NLS-1$

	private TextUtil() {
		// hide constructor
	}

	public static String getText(InitialNode InitialNode) {
		return append(new StringBuilder(), InitialNode).toString();
	}

	private static StringBuilder append(StringBuilder builder, InitialNode InitialNode) {
		Activity activity = ActivityUtil.getActivity(InitialNode);
		EOperation operation = ActivityUtil.getEOperation(activity);
		if (operation != null) {
			EcoreTextUtil.append(builder, operation);
		} else {
			builder.append(activity.getName());

			// in parameters
			builder.append('(');
			List<EParameter> in = activity.getInParameters();
			if (!in.isEmpty()) {
				for (int i = 0; i < in.size(); i++) {
					builder.append(in.get(i).getName());
					builder.append(':');
					builder.append(' ');
					EcoreTextUtil.append(builder, in.get(i).getEType());
					if (i < in.size() - 1) {
						builder.append(',');
						builder.append(' ');
					}
				}
			}
			builder.append(')');
			builder.append(':');
			builder.append(' ');

			// out parameters
			List<EParameter> out = activity.getOutParameters();
			if (out.isEmpty()) {
				builder.append("void");
			} else {
				if (out.size() > 1) {
					builder.append('<');
				}
				for (int i = 0; i < out.size(); i++) {
					builder.append(out.get(i).getName());
					builder.append(':');
					builder.append(' ');
					EcoreTextUtil.append(builder, out.get(i).getEType());
					if (i < out.size() - 1) {
						builder.append(',');
						builder.append(' ');
					}
				}
				if (out.size() > 1) {
					builder.append('>');
				}
			}
		}
		return builder;
	}

	public static String getText(MatchingStoryNode element) {
		Activity activity = ActivityUtil.getActivity(element);

		StringBuilder builder = new StringBuilder();

		append(builder, activity);
		builder.append(' ');
		builder.append(STEREOTYPE_SUFFIX);
		builder.append(' ');
		builder.append(element.getName());

		return builder.toString();
	}

	public static String getText(Callable callable) {

		if (callable == null) {
			return EMPTY;
		}
		if (callable instanceof Activity) {
			return getText((Activity) callable);
		}

		return String.valueOf(callable);
	}

	public static String getText(Activity activity) {
		return append(new StringBuilder(), activity).toString();
	}

	private static StringBuilder append(StringBuilder builder, Activity activity) {

		builder.append(activity.getName());

		// in parameters
		builder.append('(');
		List<EParameter> in = activity.getInParameters();
		if (!in.isEmpty()) {
			for (int i = 0; i < in.size(); i++) {
				EcoreTextUtil.append(builder, in.get(i).getEType());
				if (i < in.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
		}
		builder.append(')');

		// out parameters
		List<EParameter> out = activity.getOutParameters();
		if (!out.isEmpty()) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			if (out.size() > 1) {
				builder.append('<');
			}
			for (int i = 0; i < out.size(); i++) {
				EcoreTextUtil.append(builder, out.get(i).getEType());
				if (i < out.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
			if (out.size() > 1) {
				builder.append('>');
			}
		}

		return builder;
	}

	public static String getText(Constraint element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, Constraint element) {
		return append(builder, element.getConstraintExpression());
	}

	public static String getText(ActivityFinalNode ActivityFinalNode) {
		if (!ActivityFinalNode.getReturnValues().isEmpty()) {
			StringBuilder builder = new StringBuilder();
			List<Expression> values = ActivityFinalNode.getReturnValues();
			for (int i = 0; i < values.size(); i++) {
				append(builder, values.get(i));
				if (i < values.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
			return builder.toString();
		}
		return null;
	}

	public static String getText(ActivityCallNode node) {
		if (node.getCallee() != null) {
			// map parameter -> expression
			Map<EParameter, Expression> map = new LinkedHashMap<EParameter, Expression>();
			for (ParameterBinding binding : node.getOwnedParameterBindings()) {
				map.put(binding.getParameter(), binding.getValueExpression());
			}

			StringBuilder builder = new StringBuilder();

			// out parameters
			List<EParameter> out = node.getCallee().getOutParameters();
			for (int i = 0; i < out.size(); i++) {
				builder.append(getText(map.get(out.get(i))));
				if (i < out.size() - 1) {
					builder.append(',');
					builder.append(' ');
				} else {
					builder.append(' ');
					builder.append(':');
					builder.append('=');
					builder.append(' ');
				}
			}

			if (node.getCallee() instanceof Activity) {
				builder.append(((Activity) node.getCallee()).getName());
			}

			builder.append('(');

			// in parameters
			List<EParameter> in = node.getCallee().getInParameters();
			for (int i = 0; i < in.size(); i++) {
				builder.append(getText(map.get(in.get(i))));
				if (i < in.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}

			builder.append(')');

			return builder.toString();
		}
		return STEREOTYPE_PREFIX + "no callee" + STEREOTYPE_SUFFIX;
	}

	public static String getText(Expression expression) {
		return append(new StringBuilder(), expression).toString();
	}

	public static StringBuilder append(StringBuilder builder, Expression expression) {
		if (expression == null) {
			return builder.append(expression);
		}

		boolean isRoot = !(expression.eContainer() instanceof Expression);
		boolean isNegated = expression.eContainer() instanceof UnaryExpression;

		// literal expression
		if (expression instanceof LiteralExpression) {
			LiteralExpression le = (LiteralExpression) expression;
			String value = le.getValue();

			if (expression instanceof StringLiteralExpression) {
				// string
				builder.append('"');
				builder.append(value);
				builder.append('"');
			} else {
				builder.append(value);
			}

			return builder;
		}

		// textual expression
		if (expression instanceof TextualExpression) {
			TextualExpression te = (TextualExpression) expression;

			if (isRoot) {
				return builder.append(te.getExpressionText());
			}

			builder.append('{');
			builder.append(' ');
			builder.append(te.getExpressionText());
			builder.append(' ');
			builder.append('}');

			return builder;
		}

		// not expression
		if (expression instanceof UnaryExpression) {
			UnaryExpression ne = (UnaryExpression) expression;

			builder.append("not");
			builder.append('(');
			append(builder, ne.getEnclosedExpression());
			builder.append(')');

			return builder;
		}

		// arithmetic expression
		if (expression instanceof ArithmeticExpression) {
			ArithmeticExpression ae = (ArithmeticExpression) expression;

			if (!isRoot && !isNegated) {
				builder.append('(');
			}

			append(builder, ae.getLeftExpression());
			builder.append(' ');
			append(builder, ae.getOperator());
			builder.append(' ');
			append(builder, ae.getRightExpression());

			if (!isRoot && !isNegated) {
				builder.append(')');
			}

			return builder;
		}

		// logic expression
		if (expression instanceof LogicExpression) {
			LogicExpression ble = (LogicExpression) expression;

			if (!isRoot && !isNegated) {
				builder.append('(');
			}

			append(builder, ble.getLeftExpression());
			builder.append(' ');
			append(builder, ble.getOperator());
			builder.append(' ');
			append(builder, ble.getRightExpression());

			if (!isRoot && !isNegated) {
				builder.append(')');
			}

			return builder;
		}

		// comparison expression
		if (expression instanceof ComparisonExpression) {
			ComparisonExpression ce = (ComparisonExpression) expression;

			if (!isRoot && !isNegated) {
				builder.append('(');
			}

			append(builder, ce.getLeftExpression());
			builder.append(' ');
			append(builder, ce.getOperator());
			builder.append(' ');
			append(builder, ce.getRightExpression());

			if (!isRoot && !isNegated) {
				builder.append(')');
			}
			return builder;
		}

		// object variable expression
		if (expression instanceof ObjectVariableExpression) {
			ObjectVariableExpression ove = (ObjectVariableExpression) expression;
			if (ove.getObject() == null) {
				return builder.append(ove.getObject());
			}
			return builder.append(((ObjectVariableExpression) expression).getObject().getName());
		}

		// primitive variable expression
		if (expression instanceof PrimitiveVariableExpression) {
			PrimitiveVariableExpression ove = (PrimitiveVariableExpression) expression;
			if (ove.getPrimitiveVariable() == null) {
				return builder.append(ove.getPrimitiveVariable());
			}
			return builder.append(((PrimitiveVariableExpression) expression).getPrimitiveVariable().getName());
		}

		// attribute value expression
		if (expression instanceof AttributeValueExpression) {
			AttributeValueExpression ave = (AttributeValueExpression) expression;
			if (ave.getObject() == null) {
				builder.append(ave.getObject());
			} else {
				builder.append(ave.getObject().getName());
			}
			builder.append('.');
			if (ave.getAttribute() == null) {
				builder.append(ave.getAttribute());
			} else {
				builder.append(ave.getAttribute().getName());
			}
			return builder;
		}

		// method call expression
		if (expression instanceof MethodCallExpression) {
			// TODO: check for usable string representation
			MethodCallExpression mce = (MethodCallExpression) expression;
			return append(builder, mce.getOpaqueCallable());
		}

		// method call expression
		if (expression instanceof ParameterExpression) {
			ParameterExpression pe = (ParameterExpression) expression;

			return append(builder, pe.getParameter());
		}

		// collection size expression
		if (expression instanceof CollectionSizeExpression) {
			CollectionSizeExpression cse = (CollectionSizeExpression) expression;

			if (cse.getSet() == null) {
				return builder.append(cse.getSet());
			}

			return builder.append(cse.getSet().getName());
		}

		// exception variable expression
		if (expression instanceof ExceptionVariableExpression) {
			ExceptionVariableExpression eve = (ExceptionVariableExpression) expression;

			if (eve.getExceptionVariable() == null) {
				return builder.append(eve.getExceptionVariable());
			}

			return builder.append(eve.getExceptionVariable().getName());
		}

		return builder.append(expression);
	}

	public static String getText(ArithmeticOperator operator) {
		return append(new StringBuilder(), operator).toString();
	}

	private static StringBuilder append(StringBuilder builder, ArithmeticOperator operator) {
		switch (operator) {
		case PLUS:
			return builder.append('+');
		case MINUS:
			return builder.append('-');
		case TIMES:
			return builder.append('*');
		case DIVIDE:
			return builder.append('/');
		case MODULO:
			return builder.append('%');
		default:
			return builder.append(operator);
		}
	}

	public static String getText(LogicOperator operator) {
		return append(new StringBuilder(), operator).toString();
	}

	private static StringBuilder append(StringBuilder builder, LogicOperator operator) {
		switch (operator) {
		case AND:
			return builder.append("AND");
		case EQUIVALENT:
			return builder.append("EQUIV");
		case IMPLY:
			return builder.append("IMPLY");
		case OR:
			return builder.append("OR");
		case XOR:
			return builder.append("XOR");
		default:
			return builder.append(operator);
		}
	}

	public static String getText(ComparingOperator operator) {
		return append(new StringBuilder(), operator).toString();
	}

	private static StringBuilder append(StringBuilder builder, ComparingOperator operator) {
		switch (operator) {
		case EQUAL:
			return builder.append('=');
		case GREATER:
			return builder.append('>');
		case GREATER_OR_EQUAL:
			return builder.append("\u2265");
		case LESS:
			return builder.append('<');
		case LESS_OR_EQUAL:
			return builder.append("\u2264");
		case REGULAR_EXPRESSION:
			return builder.append("regex");
		case UNEQUAL:
			return builder.append("\u2260");
		default:
			return builder;
		}
	}

	private static StringBuilder append(StringBuilder builder, OpaqueCallable callable) {
		if (callable == null) {
			return builder.append(callable);
		}

		builder.append(callable.getName());

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, ParameterExtension parameter) {
		if (parameter == null) {
			return builder.append(parameter);
		}

		return EcoreTextUtil.append(builder, parameter.getParameter());
	}

	public static String getText(AttributeAssignment element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, AttributeAssignment element) {
		if (element.getAttribute() == null) {
			builder.append(element.getAttribute());
		} else {
			builder.append(element.getAttribute().getName());
		}
		builder.append(' ');
		builder.append(':');
		builder.append('=');
		builder.append(' ');
		builder.append(element.getValueExpression());

		return builder;
	}

	public static String getText(AbstractVariable element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, AbstractVariable element) {
		builder.append(element.getName());

		if (!BindingState.BOUND.equals(element.getBindingState())) {
			if (BindingState.MAYBE_BOUND.equals(element.getBindingState())) {
				builder.append('?');
			}
			builder.append(' ');
			builder.append(':');
			builder.append(' ');

			if (element instanceof ObjectVariable) {
				EcoreTextUtil.append(builder, ((ObjectVariable) element).getClassifier());
			} else if (element instanceof PrimitiveVariable) {
				EcoreTextUtil.append(builder, ((PrimitiveVariable) element).getClassifier());
			}
		}

		return builder;
	}

	public static String getText(EdgeGuard guard) {
		switch (guard) {
		case BOOL:
			return "[BOOL]";
		case EACH_TIME:
			return "[EACH_TIME]";
		case ELSE:
			return "[ELSE]";
		case END:
			return "[END]";
		case EXCEPTION:
			return "[EXCEPTION]";
		case FAILURE:
			return "[FAILURE]";
		case FINALLY:
			return "[FINALLY]";
		case SUCCESS:
			return "[SUCCESS]";
		default:
			return null;
		}
	}

	public static String getText(LinkVariable link) {
		if (link.getTargetEnd() != null) {
			return link.getTargetEnd().getName();
		}
		return String.valueOf(link.getName());
	}
}

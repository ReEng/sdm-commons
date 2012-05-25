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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.core.expressions.ComparingOperator;
import org.storydriven.core.expressions.ComparisonExpression;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.LiteralExpression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.ParameterBinding;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public final class TextUtil {
	private static final String STEREOTYPE_PREFIX = "«"; //$NON-NLS-1$
	private static final String STEREOTYPE_SUFFIX = "»"; //$NON-NLS-1$
	private static final String EMPTY = ""; //$NON-NLS-1$

	private TextUtil() {
		// hide constructor
	}

	public static String getText(StartNode startNode) {
		return append(new StringBuilder(), startNode).toString();
	}

	private static StringBuilder append(StringBuilder builder, StartNode startNode) {
		Activity activity = ActivityUtil.getActivity(startNode);
		EOperation operation = ActivityUtil.getEOperation(activity);
		if (operation != null) {
			EcoreTextUtil.append(builder, operation);
		} else {
			append(builder, activity);
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

	public static String getText(Constraint element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, Constraint element) {
		return append(builder, element.getConstraintExpression());
	}

	public static String getText(StopNode stopNode) {
		if (!stopNode.getReturnValues().isEmpty()) {
			StringBuilder builder = new StringBuilder();
			List<Expression> values = stopNode.getReturnValues();
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

	private static StringBuilder append(StringBuilder builder, Expression expression) {
		if (expression instanceof AttributeValueExpression) {
			AttributeValueExpression ave = (AttributeValueExpression) expression;
			if (ave.getAttribute() != null) {
				builder.append(ave.getAttribute().getName());
			} else {
				builder.append(ave.getAttribute());
			}
		} else if (expression instanceof LiteralExpression) {
			LiteralExpression le = (LiteralExpression) expression;
			builder.append(le.getValue());
		} else if (expression instanceof TextualExpression) {
			TextualExpression te = (TextualExpression) expression;
			builder.append(te.getExpressionText());
		} else if (expression instanceof ComparisonExpression) {
			append(builder, ((ComparisonExpression) expression).getLeftExpression());
			builder.append(' ');
			append(builder, ((ComparisonExpression) expression).getOperator());
			builder.append(' ');
			append(builder, ((ComparisonExpression) expression).getRightExpression());
		} else {
			builder.append(expression);
		}

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, ComparingOperator operator) {
		switch (operator) {
		case EQUAL:
			return builder.append('=');
		case GREATER:
			return builder.append('>');
		case GREATER_OR_EQUAL:
			return builder.append('X');
		case LESS:
			return builder.append('<');
		case LESS_OR_EQUAL:
			return builder.append('X');
		case REGULAR_EXPRESSION:
			return builder.append('X');
		case UNEQUAL:
			return builder.append('X');
		default:
			return builder;
		}
	}

	public static String getStereotype(ActivityNode element) {
		if (element instanceof ActivityCallNode) {
			return wrapStereotype("call");
		}
		if (element instanceof ModifyingStoryNode) {
			return wrapStereotype("story");
		}
		if (element instanceof MatchingStoryNode) {
			return wrapStereotype("match");
		}
		if (element instanceof StatementNode) {
			return wrapStereotype("statement");
		}
		if (element instanceof StructuredNode) {
			return wrapStereotype("structure");
		}
		return null;
	}

	public static String wrapStereotype(String text) {
		return STEREOTYPE_PREFIX + text + STEREOTYPE_SUFFIX;
	}

	public static String getText(ActivityCallNode node) {
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

	public static String getText(Expression expression) {
		if (expression instanceof ComparisonExpression) {
			return getText((ComparisonExpression) expression);
		}
		if (expression instanceof AttributeValueExpression) {
			return getText((AttributeValueExpression) expression);
		}
		if (expression instanceof PrimitiveVariableExpression) {
			return getText((PrimitiveVariableExpression) expression);
		}
		if (expression instanceof LiteralExpression) {
			return getText((LiteralExpression) expression);
		}
		if (expression instanceof TextualExpression) {
			return getText((TextualExpression) expression);
		}

		return String.valueOf(expression);
	}

	private static String getText(ComparisonExpression expression) {
		StringBuilder text = new StringBuilder();

		text.append(getText(expression.getLeftExpression()));
		text.append(" ");
		text.append(getText(expression.getOperator()));
		text.append(" ");
		text.append(getText(expression.getRightExpression()));

		return text.toString();
	}

	private static String getText(ComparingOperator operator) {
		switch (operator) {
		case EQUAL:
			return "=";
		case GREATER:
			return ">";
		case GREATER_OR_EQUAL:
			return ">=";
		case LESS:
			return "<";
		case LESS_OR_EQUAL:
			return "<=";
		case REGULAR_EXPRESSION:
			return "RegEx";
		case UNEQUAL:
			return "!=";
		default:
			return "UNKNOWN_OPERATOR";
		}
	}

	private static String getText(AttributeValueExpression expression) {
		if (expression.getAttribute() != null) {
			return EcoreTextUtil.getText(expression.getAttribute());
		} else {
			return String.valueOf(null);
		}
	}

	private static String getText(PrimitiveVariableExpression expression) {
		if (expression.getType() != null) {
			return EcoreTextUtil.getText(expression.getType());
		} else {
			return String.valueOf(null);
		}
	}

	private static String getText(LiteralExpression expression) {
		return expression.getValue();
	}

	private static String getText(TextualExpression expression) {
		return expression.getExpressionText();
	}

	public static String getText(AbstractVariable element) {
		StringBuilder text = new StringBuilder();

		text.append(element.getName());

		if (!element.getBindingState().equals(BindingState.BOUND)) {
			if (element.getBindingState().equals(BindingState.MAYBE_BOUND)) {
				text.append("?");
			}
			text.append(' ');
			text.append(':');
			text.append(' ');

			if (element instanceof ObjectVariable) {
				EClass type = ((ObjectVariable) element).getClassifier();
				text.append(EcoreTextUtil.getText(type));
			} else if (element instanceof PrimitiveVariable) {
				EDataType type = ((PrimitiveVariable) element).getClassifier();
				if (type == null) {
					text.append(type);
				} else {
					text.append(type.getName());
				}
			}
		}

		return text.toString();
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

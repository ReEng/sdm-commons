package org.storydriven.storydiagrams.ui.interpreter.util;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypeParameter;
import org.storydriven.core.NamedElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.activities.expressions.ExceptionVariableExpression;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.ParameterExtension;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.expressions.ParameterExpression;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.CollectionSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public final class TextUtil {
	private TextUtil() {
		// hide constructor
	}

	public static StringBuilder get(Object element) {
		StringBuilder builder = new StringBuilder();

		// activities
		if (element instanceof Activity) {
			return append(builder, (Activity) element);
		}

		if (element instanceof ActivityCallNode) {
			return append(builder, (ActivityCallNode) element);
		}
		if (element instanceof ModifyingStoryNode) {
			return append(builder, (ModifyingStoryNode) element, "Modifying Story Node");
		}
		if (element instanceof MatchingStoryNode) {
			return append(builder, (MatchingStoryNode) element, "Matching Story Node");
		}
		if (element instanceof StatementNode) {
			return append(builder, (StatementNode) element, "Statement Node");
		}
		if (element instanceof StructuredNode) {
			return append(builder, (StructuredNode) element, "Structured Node");
		}
		if (element instanceof ActivityEdge) {
			return append(builder, (ActivityEdge) element);
		}
		if (element instanceof InitialNode) {
			return append(builder, (InitialNode) element, "Initial Node");
		}
		if (element instanceof JunctionNode) {
			return append(builder, (JunctionNode) element, "Junction Node");
		}
		if (element instanceof ActivityFinalNode) {
			return append(builder, (ActivityFinalNode) element);
		}

		// expressions
		if (element instanceof Expression) {
			return append(builder, (Expression) element);
		}

		// patterns
		if (element instanceof StoryPattern) {
			return append(builder, (StoryPattern) element);
		}

		if (element instanceof ObjectVariable) {
			if (element instanceof CollectionVariable) {
				return append(builder, (ObjectVariable) element, "Collection Variable");
			}
			return append(builder, (ObjectVariable) element, "Object Variable");
		}
		if (element instanceof PrimitiveVariable) {
			return append(builder, (PrimitiveVariable) element, "Primitive Variable");
		}
		if (element instanceof LinkVariable) {
			return append(builder, (LinkVariable) element);
		}

		// rest
		if (element instanceof EObject) {
			// TODO: implement adapter factory label provider
			// return builder.append(AFLP.getText(element));
		}

		return builder.append(String.valueOf(element));
	}

	private static StringBuilder append(StringBuilder builder, Activity element) {
		// name
		builder.append("Activity");
		builder.append(' ');
		builder.append('\'');
		builder.append(element.getName());

		// in parameters
		builder.append('(');
		List<EParameter> in = element.getInParameters();
		for (int i = 0; i < in.size(); i++) {
			append(builder, in.get(i).getEType());
			if (i < in.size() - 1) {
				builder.append(',');
				builder.append(' ');
			}
		}
		builder.append(')');
		builder.append(':');
		builder.append(' ');

		// out parameters
		List<EParameter> out = element.getOutParameters();
		if (out.isEmpty()) {
			builder.append("void"); //$NON-NLS-1$
		} else {
			for (int i = 0; i < out.size(); i++) {
				append(builder, out.get(i).getEType());
				if (i < out.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
		}

		builder.append('\'');

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, Expression expression) {
		if (expression == null) {
			return builder.append(expression);
		}

		boolean isRoot = !(expression.eContainer() instanceof Expression);
		boolean isNegated = expression.eContainer() instanceof UnaryExpression;

		// literal expression
		if (expression instanceof LiteralExpression) {
			LiteralExpression le = (LiteralExpression) expression;

			builder.append(le.getValue());

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
		if (expression instanceof LogicalExpression) {
			LogicalExpression ble = (LogicalExpression) expression;

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

	private static StringBuilder append(StringBuilder builder, ParameterExtension parameter) {
		if (parameter == null) {
			return builder.append(parameter);
		}

		return append(builder, parameter.getParameter());
	}

	private static StringBuilder append(StringBuilder builder, EParameter element) {
		builder.append(element.getName());

		builder.append(' ');
		builder.append(':');
		builder.append(' ');

		append(builder, element.getEType());

		return builder;
	}

	public static String getText(Activity element) {
		return append2(new StringBuilder(), element).toString();
	}

	private static StringBuilder append2(StringBuilder builder, Activity element) {
		builder.append(element.getName());

		// in parameters
		builder.append('(');
		List<EParameter> in = element.getInParameters();
		if (!in.isEmpty()) {
			for (int i = 0; i < in.size(); i++) {
				append(builder, in.get(i).getEType());
				if (i < in.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
		}
		builder.append(')');

		// out parameters
		builder.append(':');
		builder.append(' ');
		List<EParameter> out = element.getOutParameters();
		if (!out.isEmpty()) {
			if (out.size() > 1) {
				builder.append('<');
			}
			for (int i = 0; i < out.size(); i++) {
				append(builder, out.get(i).getEType());
				if (i < out.size() - 1) {
					builder.append(',');
					builder.append(' ');
				}
			}
			if (out.size() > 1) {
				builder.append('>');
			}
		} else {
			builder.append("void");
		}

		return builder;
	}

	public static String getText(EClassifier element) {
		return append(new StringBuilder(), element).toString();
	}

	public static String getText(EParameter element) {
		StringBuilder builder = new StringBuilder();

		builder.append(element.getName());
		builder.append(':');
		builder.append(' ');

		append(builder, element.getEType());

		return builder.toString();
	}

	public static StringBuilder append(StringBuilder builder, EClassifier eClassifier) {
		if (eClassifier != null) {
			// append name
			builder.append(eClassifier.getName());

			// append type parameters
			List<ETypeParameter> typeParameters = eClassifier.getETypeParameters();
			if (!typeParameters.isEmpty()) {
				builder.append('<');
				for (int index = 0; index < typeParameters.size(); index++) {
					builder.append(typeParameters.get(index).getName());
					if (index < typeParameters.size() - 1) {
						builder.append(',');
						builder.append(' ');
					}
				}
				builder.append('>');
			}
		} else {
			builder.append(eClassifier);
		}

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, ActivityCallNode element) {
		// TODO Auto-generated method stub
		return append(builder, element, "Activity Call Node");
	}

	private static StringBuilder append(StringBuilder builder, ActivityFinalNode element) {
		append(builder, element, "Stop Node");
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, LinkVariable element) {
		builder.append('\'');
		if (element.getTargetEnd() != null) {
			builder.append(element.getTargetEnd().getName());
		} else {
			builder.append(element);
		}
		builder.append('\'');
		builder.append(' ');

		builder.append("from");
		builder.append(' ');
		append(builder, element.getSource());
		builder.append(' ');

		builder.append("to");
		builder.append(' ');
		append(builder, element.getTarget());
		builder.append(' ');

		return builder;
	}

	private static StringBuilder append(StringBuilder builder, AbstractVariable element) {
		if (element instanceof ObjectVariable) {
			return append(builder, (ObjectVariable) element);
		}

		if (element instanceof PrimitiveVariable) {
			return append(builder, (PrimitiveVariable) element, "Primitive Variable");
		}
		return builder.append(element);
	}

	private static StringBuilder append(StringBuilder builder, ObjectVariable element) {
		if (element instanceof CollectionVariable) {
			append(builder, element, "Collection Variable");
		} else {
			append(builder, element, "Object Variable");
		}
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, NamedElement element, String prefix) {
		builder.append(prefix);

		if (element.getName() != null && !element.getName().trim().isEmpty()) {
			builder.append(' ');
			builder.append('\'');
			builder.append(element.getName());
			builder.append('\'');
		}
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, ActivityEdge element) {
		builder.append("Activity Edge");
		builder.append(' ');
		builder.append('[');
		builder.append(element.getGuard());
		if (EdgeGuard.BOOL.equals(element.getGuard())) {
			builder.append(':');
			builder.append(' ');
			builder.append(element.getGuardExpression());
		}
		builder.append(']');

		return builder;
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

	private static String get(Expression element) {
		if (element instanceof ComparisonExpression) {
			return get((ComparisonExpression) element);
		}
		if (element instanceof AttributeValueExpression) {
			return get((AttributeValueExpression) element);
		}
		if (element instanceof PrimitiveVariableExpression) {
			return get((PrimitiveVariableExpression) element);
		}
		if (element instanceof LiteralExpression) {
			return get((LiteralExpression) element);
		}
		if (element instanceof TextualExpression) {
			return get((TextualExpression) element);
		}

		return String.valueOf(element);
	}

	private static String get(ComparisonExpression element) {
		StringBuilder text = new StringBuilder();

		text.append(get(element.getLeftExpression()));
		text.append(' ');
		append(text, element.getOperator());
		text.append(' ');
		text.append(get(element.getRightExpression()));

		return text.toString();
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

	private static StringBuilder append(StringBuilder builder, StoryPattern element) {
		switch (element.getBindingSemantics()) {
		case MANDATORY:
			builder.append("mandatory");
			break;
		case NEGATIVE:
			builder.append("negative");
			break;
		case OPTIONAL:
			builder.append("optional");
			break;
		default:
			break;
		}

		builder.append(' ');
		builder.append("pattern");

		return builder;
	}
}

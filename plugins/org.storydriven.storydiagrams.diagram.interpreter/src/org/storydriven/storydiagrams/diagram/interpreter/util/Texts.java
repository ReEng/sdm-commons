package org.storydriven.storydiagrams.diagram.interpreter.util;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;
import org.storydriven.core.expressions.ComparingOperator;
import org.storydriven.core.expressions.ComparisonExpression;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.LiteralExpression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.MatchingStoryNode;
import org.storydriven.storydiagrams.activities.ModifyingStoryNode;
import org.storydriven.storydiagrams.activities.StartNode;
import org.storydriven.storydiagrams.activities.StatementNode;
import org.storydriven.storydiagrams.activities.StopNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.util.EcoreTextUtil;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.ContainerVariable;
import org.storydriven.storydiagrams.patterns.ContainmentRelation;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.ObjectSetVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public class Texts {
	private static final ComposedAdapterFactoryLabelProvider AFLP = new ComposedAdapterFactoryLabelProvider();

	private Texts() {
		// hide constructor
	}

	public static String get(Object element) {
		// general
		if (element instanceof String) {
			return (String) element;
		}

		// activities
		if (element instanceof Activity) {
			return get((Activity) element);
		}
		if (element instanceof ActivityNode) {
			if (element instanceof ActivityCallNode) {
				return get((ActivityCallNode) element);
			}
			if (element instanceof JunctionNode) {
				return get((JunctionNode) element);
			}
			if (element instanceof StartNode) {
				return get((StartNode) element);
			}
			if (element instanceof StatementNode) {
				return get((StatementNode) element);
			}
			if (element instanceof StopNode) {
				return get((StopNode) element);
			}
			if (element instanceof StoryNode) {
				if (element instanceof MatchingStoryNode) {
					return get((MatchingStoryNode) element);
				}
				if (element instanceof ModifyingStoryNode) {
					return get((ModifyingStoryNode) element);
				}
			}
			if (element instanceof StructuredNode) {
				return get((StructuredNode) element);
			}
		}
		if (element instanceof ActivityEdge) {
			return get((ActivityEdge) element);
		}

		// patterns
		if (element instanceof StoryPattern) {
			if (element instanceof MatchingPattern) {
				return get((MatchingPattern) element);
			}
			return get((StoryPattern) element);
		}
		if (element instanceof AbstractVariable) {
			if (element instanceof ObjectVariable) {
				if (element instanceof ContainerVariable) {
					return get((ContainerVariable) element);
				}
				if (element instanceof ObjectSetVariable) {
					return get((ObjectSetVariable) element);
				}
				return get((ObjectVariable) element);
			}
			if (element instanceof PrimitiveVariable) {
				return get((PrimitiveVariable) element);
			}
		}
		if (element instanceof AbstractLinkVariable) {
			if (element instanceof ContainmentRelation) {
				return get(element);
			}
			if (element instanceof LinkVariable) {
				return get((LinkVariable) element);
			}
			if (element instanceof Path) {
				return get(element);
			}
		}
		if (element instanceof Constraint) {
			return get((Constraint) element);
		}
		if (element instanceof AttributeAssignment) {
			return get((AttributeAssignment) element);
		}

		// expressions
		if (element instanceof Expression) {
			return get((Expression) element);
		}

		// ecore
		if (element instanceof EClassifier) {
			return get((EClassifier) element);
		}
		if (element instanceof EParameter) {
			return get((EParameter) element);
		}
		if (element instanceof EOperation) {
			return get((EOperation) element);
		}
		if (element instanceof EReference) {
			return get((EReference) element);
		}

		// other
		if (element instanceof EObject) {
			return AFLP.getText(element);
		}

		return String.valueOf(element);
	}

	private static String get(Activity activity) {
		StringBuilder builder = new StringBuilder();

		builder.append("Activity '");
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

		builder.append('\'');

		return builder.toString();
	}

	private static String get(ActivityCallNode element) {
		return name("Activity Call Node", element);
	}

	private static String get(JunctionNode element) {
		return name("Junction Node", element);
	}

	private static String get(StartNode element) {
		return name("Start Node", element);
	}

	private static String get(StatementNode element) {
		return name("Statement Node", element);
	}

	private static String get(StopNode element) {
		return name("Stop Node", element);
	}

	private static String get(MatchingStoryNode element) {
		return name("Matching Story Node", element);
	}

	private static String get(ModifyingStoryNode element) {
		return name("Modifying Story Node", element);
	}

	private static String get(StructuredNode element) {
		return name("Structured Node", element);
	}

	private static String name(String type, NamedElement element) {
		if (element.getName() == null || element.getName().trim().isEmpty()) {
			return type;
		}

		StringBuilder builder = new StringBuilder();

		builder.append(type);
		builder.append(' ');
		builder.append('\'');
		builder.append(element.getName());
		builder.append('\'');

		return builder.toString();
	}

	private static String get(ActivityEdge element) {
		StringBuilder builder = new StringBuilder();

		builder.append("Activity Edge");
		builder.append(' ');
		builder.append('[');
		builder.append(element.getGuard());
		builder.append(']');

		return builder.toString();
	}

	private static String get(MatchingPattern element) {
		return comment("Matching Pattern", element);
	}

	private static String get(StoryPattern element) {
		return comment("Story Pattern", element);
	}

	private static String comment(String type, CommentableElement element) {
		if (element.getComment() == null
				|| element.getComment().equals(CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT.getDefaultValue())
				|| element.getComment().trim().isEmpty()) {
			return type;
		}

		StringBuilder builder = new StringBuilder();

		builder.append(type);
		builder.append(' ');
		builder.append('(');
		builder.append(element.getComment());
		builder.append(')');

		return builder.toString();
	}

	private static String get(AbstractVariable element) {
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

	private static String get(LinkVariable element) {
		if (element.getTargetEnd() != null) {
			return element.getTargetEnd().getName();
		}
		return String.valueOf(element.getName());
	}

	private static String get(Constraint element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, Constraint element) {
		return append(builder, element.getConstraintExpression());
	}

	private static StringBuilder append(StringBuilder builder, Expression element) {
		if (element instanceof AttributeValueExpression) {
			AttributeValueExpression ave = (AttributeValueExpression) element;
			if (ave.getAttribute() != null) {
				builder.append(ave.getAttribute().getName());
			} else {
				builder.append(ave.getAttribute());
			}
		} else if (element instanceof LiteralExpression) {
			builder.append(((LiteralExpression) element).getValue());
		} else if (element instanceof TextualExpression) {
			builder.append(((TextualExpression) element).getExpressionText());
		} else if (element instanceof ComparisonExpression) {
			append(builder, ((ComparisonExpression) element).getLeftExpression());
			builder.append(' ');
			append(builder, ((ComparisonExpression) element).getOperator());
			builder.append(' ');
			append(builder, ((ComparisonExpression) element).getRightExpression());
		} else {
			builder.append(element);
		}

		return builder;
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

	private static StringBuilder append(StringBuilder builder, ComparingOperator element) {
		switch (element) {
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
			return builder.append("regex");
		case UNEQUAL:
			return builder.append('X');
		default:
			return builder;
		}
	}

	private static String get(AttributeAssignment element) {
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

	private static String get(AttributeValueExpression element) {
		if (element.getAttribute() != null) {
			return get(element.getAttribute());
		} else {
			return String.valueOf(null);
		}
	}

	private static String get(EAttribute element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, EAttribute attribute) {
		builder.append(attribute.getName());
		EClassifier eType = attribute.getEType();
		if (eType != null) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	private static String get(PrimitiveVariableExpression element) {
		if (element.getType() != null) {
			return get(element.getType());
		} else {
			return String.valueOf(null);
		}
	}

	private static String get(EClassifier element) {
		return append(new StringBuilder(), element).toString();
	}

	private static String get(EParameter element) {
		StringBuilder builder = new StringBuilder();

		builder.append(element.getName());
		builder.append(' ');
		builder.append(':');
		builder.append(' ');
		append(builder, element.getEType());
		return builder.toString();
	}

	private static String get(EOperation element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, EOperation element) {
		EClass eContainingClass = element.getEContainingClass();
		if (eContainingClass != null) {
			append(builder, eContainingClass);
			builder.append(':');
			builder.append(':');
		}

		builder.append(element.getName());

		EClassifier eType = element.getEType();
		if (eType != null) {
			builder.append(':');
			builder.append(' ');
			builder.append(eType.getName());
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	private static String get(EReference element) {
		return append(new StringBuilder(), element).toString();
	}

	private static StringBuilder append(StringBuilder builder, EReference eReference) {
		builder.append(eReference.getName());
		EClassifier eType = eReference.getEType();
		if (eType != null) {
			builder.append(' ');
			builder.append(':');
			builder.append(' ');
			append(builder, eType);
		}
		return builder;
	}

	private static StringBuilder append(StringBuilder builder, EClassifier element) {
		if (element != null) {
			// append name
			builder.append(element.getName());

			// append type parameters
			List<ETypeParameter> typeParameters = element.getETypeParameters();
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
			builder.append(element);
		}

		return builder;
	}

	private static String get(LiteralExpression element) {
		return element.getValue();
	}

	private static String get(TextualExpression element) {
		return element.getExpressionText();
	}
}

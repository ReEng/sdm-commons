package org.storydriven.storydiagrams.diagram.custom.util;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;

public final class LabelUtil {
	private LabelUtil() {
		// hide constructor
	}

	public static String getText(ActivityEdge bo) {
		EdgeGuard guard = bo.getGuard();
		if (guard != null && !EdgeGuard.NONE.equals(guard)) {
			StringBuilder builder = new StringBuilder();

			builder.append('[');
			builder.append(' ');
			if (EdgeGuard.BOOL.equals(guard)) {
				append(builder, bo.getGuardExpression());
			} else {
				builder.append(guard);
			}
			builder.append(' ');
			builder.append(']');

			return builder.toString();
		}
		return null;
	}

	private static void append(StringBuilder builder, Expression expression) {
		TextUtil.append(builder, expression);
	}
}

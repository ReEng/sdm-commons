package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;

public class CommentableElementCommentSection extends AbstractTextSection {
	@Override
	protected boolean isMultiLine() {
		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT;
	}

	@Override
	protected String getLabelText() {
		return "Comment";
	}
}

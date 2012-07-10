package org.storydriven.storydiagrams.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

/**
 * @generated
 */
public class StorydiagramsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityCallNodeEditPart.VISUAL_ID:
				return new ActivityCallNodeEditPart(view);

			case ActivityCallNodeNameEditPart.VISUAL_ID:
				return new ActivityCallNodeNameEditPart(view);

			case ActivityCallNodeCalleeLabelEditPart.VISUAL_ID:
				return new ActivityCallNodeCalleeLabelEditPart(view);

			case StatementNodeEditPart.VISUAL_ID:
				return new StatementNodeEditPart(view);

			case StatementNodeNameEditPart.VISUAL_ID:
				return new StatementNodeNameEditPart(view);

			case StatementNodeExpressionLabelEditPart.VISUAL_ID:
				return new StatementNodeExpressionLabelEditPart(view);

			case ModifyingStoryNodeEditPart.VISUAL_ID:
				return new ModifyingStoryNodeEditPart(view);

			case ModifyingStoryNodeNameEditPart.VISUAL_ID:
				return new ModifyingStoryNodeNameEditPart(view);

			case MatchingStoryNodeEditPart.VISUAL_ID:
				return new MatchingStoryNodeEditPart(view);

			case MatchingStoryNodeNameEditPart.VISUAL_ID:
				return new MatchingStoryNodeNameEditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case InitialNodeLabelEditPart.VISUAL_ID:
				return new InitialNodeLabelEditPart(view);

			case JunctionNodeEditPart.VISUAL_ID:
				return new JunctionNodeEditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new ActivityFinalNodeEditPart(view);

			case ActivityFinalNodeLabelEditPart.VISUAL_ID:
				return new ActivityFinalNodeLabelEditPart(view);

			case FlowFinalNodeEditPart.VISUAL_ID:
				return new FlowFinalNodeEditPart(view);

			case StoryPatternEditPart.VISUAL_ID:
				return new StoryPatternEditPart(view);

			case ObjectVariableEditPart.VISUAL_ID:
				return new ObjectVariableEditPart(view);

			case ObjectVariableOperatorEditPart.VISUAL_ID:
				return new ObjectVariableOperatorEditPart(view);

			case ObjectVariableNameEditPart.VISUAL_ID:
				return new ObjectVariableNameEditPart(view);

			case ObjectVariableTypeLabelEditPart.VISUAL_ID:
				return new ObjectVariableTypeLabelEditPart(view);

			case AttributeAssignmentEditPart.VISUAL_ID:
				return new AttributeAssignmentEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case CollectionVariableEditPart.VISUAL_ID:
				return new CollectionVariableEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case CollectionVariableNameLabelEditPart.VISUAL_ID:
				return new CollectionVariableNameLabelEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case Constraint2EditPart.VISUAL_ID:
				return new Constraint2EditPart(view);

			case MatchingPatternEditPart.VISUAL_ID:
				return new MatchingPatternEditPart(view);

			case ModifyingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
				return new ModifyingStoryNodeStoryNodePatternCompartmentEditPart(view);

			case StoryPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new StoryPatternStoryPatternContentCompartmentEditPart(view);

			case StoryPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
				return new StoryPatternStoryPatternConstraintsCompartmentEditPart(view);

			case ObjectVariableObjectVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new ObjectVariableObjectVariableConstraintsCompartmentEditPart(view);

			case ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new ObjectVariableObjectVariableAttributeAssignmentsCompartmentEditPart(view);

			case CollectionVariableCollectionVariableConstraintsCompartmentEditPart.VISUAL_ID:
				return new CollectionVariableCollectionVariableConstraintsCompartmentEditPart(view);

			case CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new CollectionVariableCollectionVariableAttributeAssignmentsCompartmentEditPart(view);

			case MatchingStoryNodeStoryNodePatternCompartmentEditPart.VISUAL_ID:
				return new MatchingStoryNodeStoryNodePatternCompartmentEditPart(view);

			case MatchingPatternStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new MatchingPatternStoryPatternContentCompartmentEditPart(view);

			case MatchingPatternStoryPatternConstraintsCompartmentEditPart.VISUAL_ID:
				return new MatchingPatternStoryPatternConstraintsCompartmentEditPart(view);

			case ActivityEdgeEditPart.VISUAL_ID:
				return new ActivityEdgeEditPart(view);

			case ActivityEdgeGuardLabelEditPart.VISUAL_ID:
				return new ActivityEdgeGuardLabelEditPart(view);

			case LinkVariableEditPart.VISUAL_ID:
				return new LinkVariableEditPart(view);

			case LinkVariableSourceEndLabelEditPart.VISUAL_ID:
				return new LinkVariableSourceEndLabelEditPart(view);

			case LinkVariableOperatorLabelEditPart.VISUAL_ID:
				return new LinkVariableOperatorLabelEditPart(view);

			case LinkVariableTargetEndLabelEditPart.VISUAL_ID:
				return new LinkVariableTargetEndLabelEditPart(view);

			case InclusionLinkEditPart.VISUAL_ID:
				return new InclusionLinkEditPart(view);

			case ContainmentRelationOperatorLabelEditPart.VISUAL_ID:
				return new ContainmentRelationOperatorLabelEditPart(view);

			case MaybeLinkEditPart.VISUAL_ID:
				return new MaybeLinkEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}

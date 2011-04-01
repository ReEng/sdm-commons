package org.storydriven.modeling.diagram.edit.parts;

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
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

/**
 * @generated
 */
public class SDMEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SDMVisualIDRegistry.getVisualID(view)) {

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case StartNodeEditPart.VISUAL_ID:
				return new StartNodeEditPart(view);

			case StopNodeEditPart.VISUAL_ID:
				return new StopNodeEditPart(view);

			case JunctionNodeEditPart.VISUAL_ID:
				return new JunctionNodeEditPart(view);

			case StatementNodeEditPart.VISUAL_ID:
				return new StatementNodeEditPart(view);

			case StatementNodeNameEditPart.VISUAL_ID:
				return new StatementNodeNameEditPart(view);

			case StructuredNodeEditPart.VISUAL_ID:
				return new StructuredNodeEditPart(view);

			case StructuredNodeNameEditPart.VISUAL_ID:
				return new StructuredNodeNameEditPart(view);

			case MatchingStoryNodeEditPart.VISUAL_ID:
				return new MatchingStoryNodeEditPart(view);

			case MatchingStoryNodeNameEditPart.VISUAL_ID:
				return new MatchingStoryNodeNameEditPart(view);

			case ModifyingStoryNodeEditPart.VISUAL_ID:
				return new ModifyingStoryNodeEditPart(view);

			case ModifyingStoryNodeNameEditPart.VISUAL_ID:
				return new ModifyingStoryNodeNameEditPart(view);

			case JunctionNode2EditPart.VISUAL_ID:
				return new JunctionNode2EditPart(view);

			case StartNode2EditPart.VISUAL_ID:
				return new StartNode2EditPart(view);

			case StopNode2EditPart.VISUAL_ID:
				return new StopNode2EditPart(view);

			case StatementNode2EditPart.VISUAL_ID:
				return new StatementNode2EditPart(view);

			case StatementNodeName2EditPart.VISUAL_ID:
				return new StatementNodeName2EditPart(view);

			case StructuredNode2EditPart.VISUAL_ID:
				return new StructuredNode2EditPart(view);

			case StructuredNodeName2EditPart.VISUAL_ID:
				return new StructuredNodeName2EditPart(view);

			case MatchingStoryNode2EditPart.VISUAL_ID:
				return new MatchingStoryNode2EditPart(view);

			case MatchingStoryNodeName2EditPart.VISUAL_ID:
				return new MatchingStoryNodeName2EditPart(view);

			case MatchingPatternEditPart.VISUAL_ID:
				return new MatchingPatternEditPart(view);

			case ObjectVariableEditPart.VISUAL_ID:
				return new ObjectVariableEditPart(view);

			case ObjectVariableNameEditPart.VISUAL_ID:
				return new ObjectVariableNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ObjectVariableBindingOperatorEditPart.VISUAL_ID:
				return new ObjectVariableBindingOperatorEditPart(view);

			case ModifyingStoryNode2EditPart.VISUAL_ID:
				return new ModifyingStoryNode2EditPart(view);

			case ModifyingStoryNodeName2EditPart.VISUAL_ID:
				return new ModifyingStoryNodeName2EditPart(view);

			case StoryPatternEditPart.VISUAL_ID:
				return new StoryPatternEditPart(view);

			case ObjectVariable2EditPart.VISUAL_ID:
				return new ObjectVariable2EditPart(view);

			case ObjectVariableName2EditPart.VISUAL_ID:
				return new ObjectVariableName2EditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case StructuredNodeStructuredNodeCompartmentEditPart.VISUAL_ID:
				return new StructuredNodeStructuredNodeCompartmentEditPart(view);

			case StructuredNodeStructuredNodeCompartment2EditPart.VISUAL_ID:
				return new StructuredNodeStructuredNodeCompartment2EditPart(
						view);

			case MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart.VISUAL_ID:
				return new MatchingStoryNodeMatchingStoryNodeContentCompartmentEditPart(
						view);

			case MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart.VISUAL_ID:
				return new MatchingStoryNodeMatchingStoryNodeConstraintsCompartmentEditPart(
						view);

			case MatchingPatternStoryPatternCompartementEditPart.VISUAL_ID:
				return new MatchingPatternStoryPatternCompartementEditPart(view);

			case ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart.VISUAL_ID:
				return new ModifyingStoryNodeModifyingStoryNodeConstraintsCompartmentEditPart(
						view);

			case ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart.VISUAL_ID:
				return new ModifyingStoryNodeModifyingStoryNodeContentCompartmentEditPart(
						view);

			case StoryPatternStoryPatternCompartementEditPart.VISUAL_ID:
				return new StoryPatternStoryPatternCompartementEditPart(view);

			case MatchingStoryNodeMatchingStoryNodeContentCompartment2EditPart.VISUAL_ID:
				return new MatchingStoryNodeMatchingStoryNodeContentCompartment2EditPart(
						view);

			case MatchingStoryNodeMatchingStoryNodeConstraintsCompartment2EditPart.VISUAL_ID:
				return new MatchingStoryNodeMatchingStoryNodeConstraintsCompartment2EditPart(
						view);

			case ModifyingStoryNodeModifyingStoryNodeConstraintsCompartment2EditPart.VISUAL_ID:
				return new ModifyingStoryNodeModifyingStoryNodeConstraintsCompartment2EditPart(
						view);

			case ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart.VISUAL_ID:
				return new ModifyingStoryNodeModifyingStoryNodeContentCompartment2EditPart(
						view);

			case ActivityEdgeEditPart.VISUAL_ID:
				return new ActivityEdgeEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
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
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
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
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}

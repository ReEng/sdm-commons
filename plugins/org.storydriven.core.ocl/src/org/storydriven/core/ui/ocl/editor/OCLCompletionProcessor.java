package org.storydriven.core.ui.ocl.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ChoiceKind;
import org.eclipse.swt.graphics.Image;

public class OCLCompletionProcessor implements IContentAssistProcessor {
	private static final Object NAME_SELF = "self"; //$NON-NLS-1$
	private static char[] ACTIVATION = { '.', ':' /* :: */, '>' /* -> */, '^', ' ' };
	private static char[] NO_CHARS = {};
	private static ICompletionProposal[] NO_COMPLETIONS = {};

	private static IContextInformation[] NO_CONTEXTS = {};

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {

		OCLDocument doc = (OCLDocument) viewer.getDocument();

		int replacementOffset = offset;

		try {
			if (offset > 0 && doc.getChar(offset - 1) == '>') {
				// check that this is an arrow
				if (offset < 2 || doc.getChar(offset - 2) != '-') {
					return NO_COMPLETIONS;
				}
			}

			if (offset > 0 && doc.getChar(offset - 1) == ':') {
				// check that this is a double-colon
				if (offset < 2 || doc.getChar(offset - 2) != ':') {
					return NO_COMPLETIONS;
				}
			}

			loop: while (replacementOffset > 0) {
				char trigger = doc.getChar(--replacementOffset);
				switch (trigger) {
				case '.':
				case '>':
				case ':':
				case '^':
				case ' ':
				case '\t':
				case '\n':
				case '\r':
				case '(':
				case '[':
				case '{':
					replacementOffset++;
					break loop;
				}
			}
		} catch (BadLocationException e) {
			// just don't return any proposal
			return NO_COMPLETIONS;
		}

		List<Choice> choices = doc.getOCLChoices(offset);

		return createCompletions(choices, replacementOffset, offset
				- replacementOffset);
	}

	private ICompletionProposal[] createCompletions(List<Choice> choices,
			int replacementOffset, int replacementLength) {

		List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();

		sortChoices(choices);

		for (Choice choice : choices) {
			String text = choice.getName();
			int cursor;
			Image image = getImage(choice);
			String display;

			switch (choice.getKind()) {
			case OPERATION:
			case SIGNAL:
				// the description is already complete
				text = text + "()"; //$NON-NLS-1$
				display = choice.getDescription();
				cursor = text.length() - 1; // between the ()
				break;
			case PROPERTY:
			case ENUMERATION_LITERAL:
			case VARIABLE:
			case ASSOCIATION_CLASS:
				display = text + " : " + choice.getDescription(); //$NON-NLS-1$
				cursor = text.length();
				break;
			default:
				display = text;
				cursor = text.length();
				break;
			}

			result.add(new CompletionProposal(text, replacementOffset,
					replacementLength, cursor, image, display, null, null));
		}

		return result.toArray(new ICompletionProposal[result.size()]);
	}

	private void sortChoices(List<Choice> choices) {
		Collections.sort(choices, new Comparator<Choice>() {
			@Override
			public int compare(Choice o1, Choice o2) {
				int result = getRank(o1) - getRank(o2);

				if (result == 0) {
					// do not sort (normal) variables
					if (!ChoiceKind.VARIABLE.equals(o1.getKind())
							&& !ChoiceKind.VARIABLE.equals(o2.getKind())) {
						result = o1.getName().compareTo(o2.getName());
					}
				}

				return result;
			}

		});
	}

	private static Image getImage(Choice choice) {
		if (choice.getElement() instanceof Variable) {
			Variable variable = (Variable) choice.getElement();
			if (NAME_SELF.equals(variable.getName())) {
				return null;
			}
		}

		switch (choice.getKind()) {
		// TODO: import images
		// case PROPERTY:
		// return DiagramImages.getImage(DiagramImages.EATTRIBUTE);
		// case OPERATION:
		// return DiagramImages.getImage(DiagramImages.EOPERATION);
		// case VARIABLE:
		// return OCLImages.getImage(OCLImages.VARIABLE);
		// case PACKAGE:
		// return DiagramImages.getImage(DiagramImages.EPACKAGE);
		// case TYPE:
		// if (choice.getElement() instanceof EClass) {
		// return DiagramImages.getImage(DiagramImages.ECLASS);
		// }
		//
		// if (choice.getElement() instanceof EDataType) {
		// if (choice.getElement() instanceof EEnum) {
		// return DiagramImages.getImage(DiagramImages.EENUM);
		// }
		// return DiagramImages.getImage(DiagramImages.EDATA_TYPE);
		// }
		//
		// return null;
		// case ENUMERATION_LITERAL:
		// return DiagramImages.getImage(DiagramImages.EENUM_LITERAL);
		case STATE:
			return OCLImages.getImage(OCLImages.STATE);
		case ASSOCIATION_CLASS:
			return OCLImages.getImage(OCLImages.ASSOCIATION_CLASS);
		case SIGNAL:
			return OCLImages.getImage(OCLImages.SIGNAL);
		default:
			return null;
		}
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		return NO_CONTEXTS;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return ACTIVATION;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return NO_CHARS;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	private static int getRank(Choice choice) {
		if (choice.getElement() instanceof Variable) {
			Variable variable = (Variable) choice.getElement();
			if (NAME_SELF.equals(variable.getName())) {
				return Integer.MAX_VALUE;
			}
		}

		switch (choice.getKind()) {
		case VARIABLE:
			return 0;
		case PROPERTY:
			return 1;
		case OPERATION:
			return 2;
		case PACKAGE:
			return 3;
		case TYPE:
			return 4;
		case ENUMERATION_LITERAL:
			return 5;
		case STATE:
			return 6;
		case ASSOCIATION_CLASS:
			return 7;
		case SIGNAL:
			return 8;
		default:
			return Integer.MAX_VALUE;
		}
	}
}

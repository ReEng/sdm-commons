package org.storydriven.core.ui.ocl.editor;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ConstraintKind;

public class OCLDocument extends Document {
	private OCL ocl;
	private Helper oclHelper;
	private EClassifier contextClassifier;

	public OCLDocument() {
		super();

		ocl = OCL.newInstance();

		oclHelper = ocl.createOCLHelper();

		IDocumentPartitioner partitioner = new FastPartitioner(new OCLPartitionScanner(),
				new String[] { OCLPartitionScanner.OCL_COMMENT });

		partitioner.connect(this);
		setDocumentPartitioner(partitioner);
	}

	public void setOCLContextInformation(Map<String, EClassifier> contextInformation) {
		for (String string : contextInformation.keySet()) {
			Variable<EClassifier, EParameter> var = ocl.getEnvironment().getOCLFactory().createVariable();
			var.setName(string);
			var.setType(getOclType(contextInformation.get(string), ocl));

			ocl.getEnvironment().addElement(string, var, true);
		}
	}

	/**
	 * Return the proper OCL type for primitive types.
	 * 
	 * @param classifier
	 * @return
	 */
	private EClassifier getOclType(EClassifier classifier, OCL ocl) {
		// TODO: Add support for other primitive types.
		// @see org.storydriven.storydiagrams.diagram.custom.util.TypeUtil.getType(classifier) for help

		return classifier;
	}

	public EClassifier getOCLContext() {
		return contextClassifier;
	}

	public Collection<Variable<EClassifier, EParameter>> getOCLContextInformation() {
		return ocl.getEnvironment().getVariables();
	}

	public List<Choice> getOCLChoices(int offset) {
		if (contextClassifier == null) {
			setOCLContext(EcorePackage.Literals.EOBJECT);
			List<Choice> l = getOCLChoices(offset);
			setOCLContext(null);

			return l;
		}

		try {
			String text = get(0, offset);

			return oclHelper.getSyntaxHelp(ConstraintKind.INVARIANT, text);
		} catch (Exception e) {
			// just don't provide proposals
			return Collections.emptyList();
		}
	}

	public void setOCLContext(EClassifier context) {
		contextClassifier = context;
		oclHelper.setContext(context);
	}
}

package org.storydriven.storydiagrams.diagram.interpreter.wizards;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.Wizard;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.interpreter.util.TypeUtil;

import de.mdelab.sdm.interpreter.core.variables.Variable;

public class InterpreteActivityWizard extends Wizard {
	private Activity activity;

	private final Map<EParameter, Object> bindings;

	private Resource resource;

	private ResourceSet resourceSet;

	private Map<String, Variable<EClassifier>> results;

	private boolean saveResource;

	public InterpreteActivityWizard(Activity activity) {
		resourceSet = new ResourceSetImpl();

		// initialize (empty) bindings
		bindings = new LinkedHashMap<EParameter, Object>();
		for (EParameter parameter : activity.getInParameters()) {
			switch (TypeUtil.getType(parameter)) {
			case BOOLEAN:
				bindings.put(parameter, false);
				break;
			case BYTE:
			case SHORT:
			case INTEGER:
			case FLOAT:
			case LONG:
			case DOUBLE:
				bindings.put(parameter, 0);
				break;
			case ENUM:
				bindings.put(parameter, TypeUtil.getFirstLiteral(parameter));
				break;
			case STRING:
				bindings.put(parameter, "");
				break;
			case CHAR:
				bindings.put(parameter, 'a');
				break;
			case UNKNOWN:
			default:
				bindings.put(parameter, null);
				break;
			}
		}

		this.activity = activity;

		setHelpAvailable(false);
		setWindowTitle("Interpret Activity");
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		addPage(new SelectInputWizardPage());
		addPage(new InterpreteWizardPage());
		addPage(new ResultWizardPage());
	}

	public Activity getActivity() {
		return activity;
	}

	public Map<EParameter, Object> getBindings() {
		return bindings;
	}

	public Set<EParameter> getParameters() {
		return bindings.keySet();
	}

	public Resource getResource() {
		return resource;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public Map<String, Variable<EClassifier>> getResults() {
		return results;
	}

	@Override
	public boolean performFinish() {
		// save resource
		if (saveResource) {
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		return true;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public void setResults(Map<String, Variable<EClassifier>> results) {
		this.results = results;
	}

	public void setSaveResource(boolean saveResource) {
		this.saveResource = saveResource;
	}
}

package org.storydriven.storydiagrams.interpreter.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.interpreter.eclipse.StoryDrivenEclipseInterpreter;
import org.storydriven.storydiagrams.interpreter.notifications.StoryDrivenNotificationEmitter;
import org.storydriven.storydiagrams.interpreter.notifications.StoryDrivenOutputStreamNotificationReceiver;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public abstract class AbstractTests {
	private ResourceSet resourceSet;
	private StoryDrivenEclipseInterpreter interpreter;

	private static final String ROOT = "org.storydriven.storydiagrams.interpreter.tests"; //$NON-NLS-1$

	private static final String RESOURCES = ROOT + "/resources/"; //$NON-NLS-1$

	protected static final String RESULT = SDMInterpreterConstants.RETURN_VALUE_VAR_NAME;

	@Before
	public void setUp() throws Exception {
		StoryDrivenNotificationEmitter emitter = new StoryDrivenNotificationEmitter();
		emitter.addNotificationReceiver(new StoryDrivenOutputStreamNotificationReceiver());

		resourceSet = new ResourceSetImpl();
		interpreter = new StoryDrivenEclipseInterpreter(getClass().getClassLoader(), emitter);
	}

	@After
	public void tearDown() throws Exception {
		interpreter = null;
		resourceSet = null;
	}

	protected Map<String, Variable<EClassifier>> assertResultEquals(Activity activity, Object expected) {
		Map<String, Object> arguments = Collections.emptyMap();
		return assertResultEquals(activity, arguments, expected);
	}

	protected Map<String, Variable<EClassifier>> assertResultTrue(Activity activity) {
		Map<String, Object> arguments = Collections.emptyMap();
		return assertResultTrue(activity, arguments);
	}

	protected Map<String, Variable<EClassifier>> assertResultTrue(Activity activity, Map<String, Object> arguments) {
		return assertResultEquals(activity, arguments, true);
	}

	protected Map<String, Variable<EClassifier>> assertResultEquals(Activity activity, Map<String, Object> arguments,
			Object expected) {
		// execute
		Map<String, Variable<EClassifier>> result = execute(activity, arguments);

		// check for existing result
		assertNotNull("The result is null.", result);

		// check for existing result variable
		assertNotNull("The result variable is null.", result.get(RESULT));

		// check for equal values
		assertEquals("The result is wrong.", expected, result.get(RESULT).getValue());

		return result;
	}

	protected Map<String, Variable<EClassifier>> execute(Activity activity) {
		Map<String, Object> arguments = Collections.emptyMap();
		return execute(activity, arguments);
	}

	protected Map<String, Variable<EClassifier>> execute(Activity activity, Map<String, Object> arguments) {
		try {
			return interpreter.executeActivity(activity, bind(activity, arguments));
		} catch (SDMException e) {
			e.printStackTrace();
		}
		fail("The execution throwed an exception.");
		return null;
	}

	private List<Variable<EClassifier>> bind(Activity activity, Map<String, Object> arguments) {
		List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();

		for (EParameter parameter : activity.getInParameters()) {
			Object value = arguments.get(parameter.getName());
			parameters.add(new Variable<EClassifier>(parameter.getName(), parameter.getEType(), value));
		}

		return parameters;
	}

	protected Activity getActivity(String path) {
		Resource resource = getResource(path);
		for (EObject content : resource.getContents()) {
			if (content instanceof Activity) {
				return (Activity) content;
			}
		}
		return null;
	}

	protected Resource getResource(String path) {
		URI uri = URI.createPlatformPluginURI(RESOURCES + getPath() + path, true);
		return resourceSet.getResource(uri, true);
	}

	protected abstract String getPath();

	protected Map<String, Object> getArguments() {
		return Collections.emptyMap();
	}
}

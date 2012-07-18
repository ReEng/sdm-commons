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
	private static final String RESOURCES = "org.storydriven.storydiagrams.interpreter.tests/resources/"; //$NON-NLS-1$

	/**
	 * A shorthand for {@link SDMInterpreterConstants#RETURN_VALUE_VAR_NAME} to get the resulting variable of an
	 * executed activity.
	 */
	protected static final String RESULT = SDMInterpreterConstants.RETURN_VALUE_VAR_NAME;

	private ResourceSet resourceSet;
	private StoryDrivenEclipseInterpreter interpreter;

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

	/**
	 * Asserts that the result is equal to {@link Boolean#TRUE} and returns the result for further inspection.
	 * 
	 * @param activity The activity to be interpreted.
	 * @return See {@link #execute(Activity, Map)} for details.
	 * @see #assertResultTrue(Activity, Map)
	 * @see #assertResultEquals(Activity, Object)
	 * @see #assertResultEquals(Activity, Map, Object)
	 * @see #execute(Activity)
	 * @see #execute(Activity, Map)
	 */
	protected Map<String, Variable<EClassifier>> assertResultTrue(Activity activity) {
		Map<String, Object> arguments = Collections.emptyMap();
		return assertResultTrue(activity, arguments);
	}

	/**
	 * Asserts that the result is equal to {@link Boolean#TRUE} and returns the result for further inspection.
	 * 
	 * @param activity The activity to be interpreted.
	 * @param arguments See {@link #execute(Activity, Map)} for details.
	 * @return See {@link #execute(Activity, Map)} for details.
	 * @see #assertResultTrue(Activity)
	 * @see #assertResultEquals(Activity, Object)
	 * @see #assertResultEquals(Activity, Map, Object)
	 * @see #execute(Activity)
	 * @see #execute(Activity, Map)
	 */
	protected Map<String, Variable<EClassifier>> assertResultTrue(Activity activity, Map<String, Object> arguments) {
		return assertResultEquals(activity, arguments, Boolean.TRUE);
	}

	/**
	 * Asserts that the result is equal to the expected value and returns the result for further inspection.
	 * 
	 * @param activity The activity to be interpreted.
	 * @param expected The expected return value.
	 * @return See {@link #execute(Activity, Map)} for details.
	 * @see #assertResultTrue(Activity)
	 * @see #assertResultTrue(Activity, Map)
	 * @see #assertResultEquals(Activity, Map, Object)
	 * @see #execute(Activity)
	 * @see #execute(Activity, Map)
	 */
	protected Map<String, Variable<EClassifier>> assertResultEquals(Activity activity, Object expected) {
		Map<String, Object> arguments = Collections.emptyMap();
		return assertResultEquals(activity, arguments, expected);
	}

	/**
	 * Asserts that the result is equal to the expected value and returns the result for further inspection.
	 * 
	 * @param activity The activity to be interpreted.
	 * @param arguments See {@link #execute(Activity, Map)} for details.
	 * @param expected The expected return value.
	 * @return See {@link #execute(Activity, Map)} for details.
	 * @see #assertResultTrue(Activity)
	 * @see #assertResultTrue(Activity, Map)
	 * @see #assertResultEquals(Activity, Object)
	 * @see #execute(Activity)
	 * @see #execute(Activity, Map)
	 */
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

	/**
	 * Tries to execute the activity without any arguments directly on the interpreter.
	 * 
	 * @param activity The activity to be interpreted.
	 * @return See {@link #execute(Activity, Map)} for details.
	 * @see #assertResultTrue(Activity)
	 * @see #assertResultTrue(Activity, Map)
	 * @see #assertResultEquals(Activity, Object)
	 * @see #assertResultEquals(Activity, Map, Object)
	 * @see #execute(Activity, Map)
	 */
	protected Map<String, Variable<EClassifier>> execute(Activity activity) {
		Map<String, Object> arguments = Collections.emptyMap();
		return execute(activity, arguments);
	}

	/**
	 * Tries to execute the activity with the given arguments directly on the interpreter.
	 * 
	 * @param activity The activity to be interpreted.
	 * @param arguments A map containing the arguments for the activity in the form [parameter name (String)] -->
	 *            [argument value (Object)].
	 * @return Returns a map containing all variables of the activity, when the execution is finished. The return value
	 *         of the activity is available under the key {@link #RESULT}.
	 * 
	 * @see #assertResultTrue(Activity)
	 * @see #assertResultTrue(Activity, Map)
	 * @see #assertResultEquals(Activity, Object)
	 * @see #assertResultEquals(Activity, Map, Object)
	 * @see #execute(Activity)
	 * @see org.storydriven.storydiagrams.interpreter.eclipse.StoryDrivenEclipseInterpreter
	 */
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

	/**
	 * Loads the resource under the given path and returns the first {@link Activity} inside its contents.
	 * 
	 * @param path The last part of the URI - normally the file name.
	 * @return Returns the activity inside the resource under the path, or <code>null</code>.
	 * @see #getPath()
	 */
	protected Activity getActivity(String path) {
		Resource resource = getResource(path);
		for (EObject content : resource.getContents()) {
			if (content instanceof Activity) {
				return (Activity) content;
			}
		}
		return null;
	}

	/**
	 * Loads the resource under the given path on demand.
	 * 
	 * @param path The last part of the URI - normally the file name.
	 * @return Returns the {@link Resource} under the given path.
	 */
	protected Resource getResource(String path) {
		URI uri = URI.createPlatformPluginURI(RESOURCES + getPath() + path, true);
		return resourceSet.getResource(uri, true);
	}

	/**
	 * Implement this in a sub class by returning the folder part of all test resources. Example: when your models are
	 * inside <code>resources/path/subpart/</code>, you must return <code>path/subpart/</code>.
	 * 
	 * @return Should return the folder part the resources for the test case.
	 */
	protected abstract String getPath();
}

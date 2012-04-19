package org.storydriven.storydiagrams.interpreter.tests;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.OperationExtension;
import org.storydriven.storydiagrams.interpreter.eclipse.StoryDrivenEclipseInterpreter;
import org.storydriven.storydiagrams.interpreter.notifications.StoryDrivenNotificationEmitter;
import org.storydriven.storydiagrams.interpreter.notifications.StoryDrivenOutputStreamNotificationReceiver;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public abstract class TestBase extends TestCase
{
	public TestBase(String name)
	{
		super(name);
	}

	/**
	 * The fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryDrivenEclipseInterpreter	fixture	= null;

	/**
	 * Sets the fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(StoryDrivenEclipseInterpreter fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EMF Classifier Handler test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryDrivenEclipseInterpreter getFixture()
	{
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		StoryDrivenNotificationEmitter emitter = new StoryDrivenNotificationEmitter();

		emitter.addNotificationReceiver(new StoryDrivenOutputStreamNotificationReceiver());

		setFixture(new StoryDrivenEclipseInterpreter(this.getClass().getClassLoader(), emitter));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
		// TODO delete created operation extensions
	}

	protected abstract String getModelFolder();

	public Activity loadActivityDiagram(String modelName) throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();

		Resource r = rs.createResource(URI.createPlatformPluginURI(getModelFolder() + modelName, true));

		r.load(Collections.EMPTY_MAP);

		Activity activity = (Activity) r.getContents().get(0);

		createOperationExtension(activity, modelName);

		return activity;
	}

	public EClass loadClassDiagram(String modelName) throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();

		Resource r = rs.createResource(URI.createPlatformPluginURI(getModelFolder() + modelName, true));

		r.load(Collections.EMPTY_MAP);

		EClass clazz = (EClass) ((EPackage) r.getContents().get(0)).getEClassifiers().get(0);

		return clazz;
	}

	private OperationExtension createOperationExtension(Activity activity, String modelName)
	{

		EcoreFactory f = EcoreFactory.eINSTANCE;
		EOperation method = f.createEOperation();

		String name = modelName.split("\\.")[0];
		method.setName(name);
		// method.setEType(value) // TODO

		OperationExtension operation = ActivitiesFactory.eINSTANCE.createOperationExtension();
		operation.setOwnedActivity(activity);
		operation.setOperation(method);

		// TODO
		// activity.getInParameters().addAll(method.getEParameters());
		// if(!operation.getOutParameters().isEmpty())
		// {
		// operation.getOutParameters().get(0).setName("methodReturnValue");
		// activity.getOutParameters().addAll(operation.getOutParameters());
		// }

		return operation;
	}

	protected String getClassModelName()
	{
		return "/org.storydriven.modeling.interpreter.adapter.tests/models/testclassmodels/testClassmodel.ecore";
	}

	protected Map<String, Variable<EClassifier>> executeActivityNode(ActivityNode activityNode, List<Variable<EClassifier>> parameter)
			throws SDMException
	{
		Map<String, Variable<EClassifier>> vars = getFixture().executeActivity((Activity) activityNode.eContainer(), parameter);

		assertNoAdapters(activityNode);

		return vars;
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Variable<EClassifier>> executeActivityNode(ActivityNode activityNode) throws SDMException
	{
		return this.executeActivityNode(activityNode, Collections.EMPTY_LIST);
	}

	protected void assertNoAdapters(ActivityNode activityNode)
	{
		assertTrue(activityNode.eAdapters().size() <= 1);

		TreeIterator<EObject> it = activityNode.eAllContents();

		while (it.hasNext())
		{
			EObject eObject = it.next();

			assertTrue(eObject.eAdapters().size() <= 1);
		}
	}

	protected void booleanTest(String testName) throws IOException, SDMException
	{
		System.out.println("\n\n\nExecuting '" + testName + "'.");

		Activity a = loadActivityDiagram(testName + ".sdm");

		ActivityNode an = a.getOwnedActivityNodes().get(0);

		Map<String, Variable<EClassifier>> vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));

		vars = this.executeActivityNode(an);

		assertTrue(vars.get(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME).getValue().equals(Boolean.TRUE));
	}
}

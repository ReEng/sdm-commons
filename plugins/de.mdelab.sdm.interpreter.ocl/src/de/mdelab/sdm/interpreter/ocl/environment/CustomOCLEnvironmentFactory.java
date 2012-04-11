package de.mdelab.sdm.interpreter.ocl.environment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * A customized OCL environment factory. It produces OCL environments and
 * evaluation environments that do not store variables locally but retrieve them
 * from a variables scope.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEnvironmentFactory extends EcoreEnvironmentFactory
{
	private final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?>	variablesScope;

	public CustomOCLEnvironmentFactory(VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		this.variablesScope = variablesScope;
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createEnvironment()
	{
		CustomOCLEnvironment environment = new CustomOCLEnvironment(this.variablesScope);
		environment.setFactory(this);
		return environment;
	}

	@Override
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment()
	{
		return new CustomOCLEvaluationEnvironment(this.variablesScope);
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createEnvironment(
			Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> parent)
	{
		CustomOCLEnvironment environment = new CustomOCLEnvironment(this.variablesScope);
		environment.setParent(parent);
		environment.setFactory(this);

		return environment;
	}
}

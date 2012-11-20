/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Constraint Violated</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType> extends
		StoryPatternConstraintEvaluationImpl<StoryPatternType, ExpressionType> implements
		StoryPatternConstraintViolated<StoryPatternType, ExpressionType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternConstraintViolatedImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutionTracePackage.Literals.STORY_PATTERN_CONSTRAINT_VIOLATED;
	}

} // StoryPatternConstraintViolatedImpl

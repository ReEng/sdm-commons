/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Object Constraint Evaluation</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation#getConstraint
 * <em>Constraint</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectConstraintEvaluation()
 * @model abstract="true"
 * @generated
 */
public interface StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType> extends
		StoryPatternObjectExecution<StoryPatternObjectType>
{
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectConstraintEvaluation_Constraint()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ExpressionType getConstraint();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation#getConstraint
	 * <em>Constraint</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ExpressionType value);

} // StoryPatternObjectConstraintEvaluation

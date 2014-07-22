/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution#getStoryPattern
 * <em>Story Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternExecution()
 * @model abstract="true"
 * @generated
 */
public interface StoryPatternExecution<StoryPatternType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Story Pattern</em>' reference.
	 * @see #setStoryPattern(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternExecution_StoryPattern()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternType getStoryPattern();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution#getStoryPattern
	 * <em>Story Pattern</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Story Pattern</em>' reference.
	 * @see #getStoryPattern()
	 * @generated
	 */
	void setStoryPattern(StoryPatternType value);

} // StoryPatternExecution

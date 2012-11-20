/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Object Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution#getStoryPatternObject
 * <em>Story Pattern Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectExecution()
 * @model abstract="true"
 * @generated
 */
public interface StoryPatternObjectExecution<StoryPatternObjectType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Story Pattern Object</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern Object</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Story Pattern Object</em>' reference.
	 * @see #setStoryPatternObject(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectExecution_StoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution#getStoryPatternObject
	 * <em>Story Pattern Object</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Story Pattern Object</em>'
	 *            reference.
	 * @see #getStoryPatternObject()
	 * @generated
	 */
	void setStoryPatternObject(StoryPatternObjectType value);

} // StoryPatternObjectExecution

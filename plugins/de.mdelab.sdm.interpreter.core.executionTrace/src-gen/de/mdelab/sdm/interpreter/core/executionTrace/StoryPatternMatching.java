/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Matching</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching#isSuccessful
 * <em>Successful</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternMatching()
 * @model
 * @generated
 */
public interface StoryPatternMatching<StoryPatternType> extends StoryPatternExecution<StoryPatternType>
{
	/**
	 * Returns the value of the '<em><b>Successful</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Successful</em>' attribute.
	 * @see #setSuccessful(boolean)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternMatching_Successful()
	 * @model
	 * @generated
	 */
	boolean isSuccessful();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching#isSuccessful
	 * <em>Successful</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Successful</em>' attribute.
	 * @see #isSuccessful()
	 * @generated
	 */
	void setSuccessful(boolean value);

} // StoryPatternMatching

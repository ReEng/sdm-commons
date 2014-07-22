/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Object Binding Revoked</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked#getPreviousValue
 * <em>Previous Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectBindingRevoked()
 * @model
 * @generated
 */
public interface StoryPatternObjectBindingRevoked<StoryPatternObjectType> extends StoryPatternObjectExecution<StoryPatternObjectType>
{
	/**
	 * Returns the value of the '<em><b>Previous Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Previous Value</em>' attribute.
	 * @see #setPreviousValue(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternObjectBindingRevoked_PreviousValue()
	 * @model required="true"
	 * @generated
	 */
	String getPreviousValue();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked#getPreviousValue
	 * <em>Previous Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Previous Value</em>' attribute.
	 * @see #getPreviousValue()
	 * @generated
	 */
	void setPreviousValue(String value);

} // StoryPatternObjectBindingRevoked

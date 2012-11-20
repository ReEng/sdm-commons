/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Link Check</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck#getTargetObject
 * <em>Target Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getLinkCheck()
 * @model abstract="true"
 * @generated
 */
public interface LinkCheck<StoryPatternLinkType, StoryPatternObjectType> extends
		StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * Returns the value of the '<em><b>Target Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Object</em>' attribute.
	 * @see #setTargetObject(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getLinkCheck_TargetObject()
	 * @model
	 * @generated
	 */
	String getTargetObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck#getTargetObject
	 * <em>Target Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Object</em>' attribute.
	 * @see #getTargetObject()
	 * @generated
	 */
	void setTargetObject(String value);

} // LinkCheck

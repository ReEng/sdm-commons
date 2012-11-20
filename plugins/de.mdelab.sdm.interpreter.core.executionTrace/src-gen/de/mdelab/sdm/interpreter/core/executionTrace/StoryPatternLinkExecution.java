/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Link Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getStoryPatternLink
 * <em>Story Pattern Link</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getSourceStoryPatternObject
 * <em>Source Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getTargetStoryPatternObject
 * <em>Target Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getSourceObject
 * <em>Source Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternLinkExecution()
 * @model abstract="true"
 * @generated
 */
public interface StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern Link</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Story Pattern Link</em>' reference.
	 * @see #setStoryPatternLink(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternLinkExecution_StoryPatternLink()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternLinkType getStoryPatternLink();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getStoryPatternLink
	 * <em>Story Pattern Link</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Story Pattern Link</em>' reference.
	 * @see #getStoryPatternLink()
	 * @generated
	 */
	void setStoryPatternLink(StoryPatternLinkType value);

	/**
	 * Returns the value of the '<em><b>Source Story Pattern Object</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Story Pattern Object</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Story Pattern Object</em>'
	 *         reference.
	 * @see #setSourceStoryPatternObject(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternLinkExecution_SourceStoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getSourceStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getSourceStoryPatternObject
	 * <em>Source Story Pattern Object</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Story Pattern Object</em>'
	 *            reference.
	 * @see #getSourceStoryPatternObject()
	 * @generated
	 */
	void setSourceStoryPatternObject(StoryPatternObjectType value);

	/**
	 * Returns the value of the '<em><b>Target Story Pattern Object</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Story Pattern Object</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Story Pattern Object</em>'
	 *         reference.
	 * @see #setTargetStoryPatternObject(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternLinkExecution_TargetStoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getTargetStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getTargetStoryPatternObject
	 * <em>Target Story Pattern Object</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Story Pattern Object</em>'
	 *            reference.
	 * @see #getTargetStoryPatternObject()
	 * @generated
	 */
	void setTargetStoryPatternObject(StoryPatternObjectType value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Object</em>' attribute.
	 * @see #setSourceObject(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getStoryPatternLinkExecution_SourceObject()
	 * @model required="true"
	 * @generated
	 */
	String getSourceObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution#getSourceObject
	 * <em>Source Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Object</em>' attribute.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(String value);

} // StoryPatternLinkExecution

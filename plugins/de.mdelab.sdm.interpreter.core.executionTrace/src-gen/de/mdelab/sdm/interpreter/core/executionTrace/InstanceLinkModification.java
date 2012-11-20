/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Instance Link Modification</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getStoryPatternLink
 * <em>Story Pattern Link</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getSourceStoryPatternObject
 * <em>Source Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getTargetStoryPatternObject
 * <em>Target Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getSourceInstanceObject
 * <em>Source Instance Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getTargetInstanceObject
 * <em>Target Instance Object</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification()
 * @model abstract="true"
 * @generated
 */
public interface InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType> extends Execution
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
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification_StoryPatternLink()
	 * @model kind="reference"
	 * @generated
	 */
	StoryPatternLinkType getStoryPatternLink();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getStoryPatternLink
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
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification_SourceStoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getSourceStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getSourceStoryPatternObject
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
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification_TargetStoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getTargetStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getTargetStoryPatternObject
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
	 * Returns the value of the '<em><b>Source Instance Object</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Instance Object</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Instance Object</em>' attribute.
	 * @see #setSourceInstanceObject(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification_SourceInstanceObject()
	 * @model required="true"
	 * @generated
	 */
	String getSourceInstanceObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getSourceInstanceObject
	 * <em>Source Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Instance Object</em>'
	 *            attribute.
	 * @see #getSourceInstanceObject()
	 * @generated
	 */
	void setSourceInstanceObject(String value);

	/**
	 * Returns the value of the '<em><b>Target Instance Object</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Instance Object</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Instance Object</em>' attribute.
	 * @see #setTargetInstanceObject(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getInstanceLinkModification_TargetInstanceObject()
	 * @model required="true"
	 * @generated
	 */
	String getTargetInstanceObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification#getTargetInstanceObject
	 * <em>Target Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Instance Object</em>'
	 *            attribute.
	 * @see #getTargetInstanceObject()
	 * @generated
	 */
	void setTargetInstanceObject(String value);

} // InstanceLinkModification

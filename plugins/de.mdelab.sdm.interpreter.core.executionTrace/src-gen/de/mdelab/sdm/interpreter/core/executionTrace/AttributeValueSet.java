/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Attribute Value Set</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getStoryPatternObject
 * <em>Story Pattern Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getFeature
 * <em>Feature</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getInstanceObject
 * <em>Instance Object</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getNewValue
 * <em>New Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getAttributeValueSet()
 * @model
 * @generated
 */
public interface AttributeValueSet<StoryPatternObjectType, FeatureType> extends Execution
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
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getAttributeValueSet_StoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getStoryPatternObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getStoryPatternObject
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

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getAttributeValueSet_Feature()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	FeatureType getFeature();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getFeature
	 * <em>Feature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureType value);

	/**
	 * Returns the value of the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instance Object</em>' attribute.
	 * @see #setInstanceObject(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getAttributeValueSet_InstanceObject()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceObject();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getInstanceObject
	 * <em>Instance Object</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Instance Object</em>' attribute.
	 * @see #getInstanceObject()
	 * @generated
	 */
	void setInstanceObject(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getAttributeValueSet_NewValue()
	 * @model required="true"
	 * @generated
	 */
	String getNewValue();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet#getNewValue
	 * <em>New Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(String value);

} // AttributeValueSet

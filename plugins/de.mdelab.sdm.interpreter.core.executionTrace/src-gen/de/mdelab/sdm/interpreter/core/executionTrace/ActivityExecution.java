/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Activity Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution#getActivity
 * <em>Activity</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution#getInParameterValues
 * <em>In Parameter Values</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution#getOutParameterValues
 * <em>Out Parameter Values</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityExecution()
 * @model
 * @generated
 */
public interface ActivityExecution<ActivityType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityExecution_Activity()
	 * @model kind="reference"
	 * @generated
	 */
	ActivityType getActivity();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution#getActivity
	 * <em>Activity</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityType value);

	/**
	 * Returns the value of the '<em><b>In Parameter Values</b></em>' map. The
	 * key is of type {@link KeyType}, and the value is of type
	 * {@link ValueType}, <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameter Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>In Parameter Values</em>' map.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityExecution_InParameterValues()
	 * @model mapType=
	 *        "de.mdelab.sdm.interpreter.core.executionTrace.MapEntry<KeyType, ValueType>"
	 * @generated
	 */
	EMap<String, String> getInParameterValues();

	/**
	 * Returns the value of the '<em><b>Out Parameter Values</b></em>' map. The
	 * key is of type {@link KeyType}, and the value is of type
	 * {@link ValueType}, <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameter Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Out Parameter Values</em>' map.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityExecution_OutParameterValues()
	 * @model mapType=
	 *        "de.mdelab.sdm.interpreter.core.executionTrace.MapEntry<KeyType, ValueType>"
	 * @generated
	 */
	EMap<String, String> getOutParameterValues();

} // ActivityExecution

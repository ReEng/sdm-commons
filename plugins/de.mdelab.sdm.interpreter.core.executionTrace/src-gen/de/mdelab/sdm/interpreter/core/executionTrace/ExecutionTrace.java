/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Execution Trace</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace#getExecutions
 * <em>Executions</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace#getTotalExecutionTime
 * <em>Total Execution Time</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace#getTotalExecutionTimeMsec
 * <em>Total Execution Time Msec</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecutionTrace()
 * @model
 * @generated
 */
public interface ExecutionTrace extends EObject
{
	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Executions</em>' containment reference
	 *         list.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecutionTrace_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecutionTrace_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Total Execution Time</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The sum of the execution
	 * times of all contained executions in nanoseconds. Convert this to other
	 * time units using the utility functions in TimeUnits.NANOTIME. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Total Execution Time</em>' attribute.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecutionTrace_TotalExecutionTime()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getTotalExecutionTime();

	/**
	 * Returns the value of the '<em><b>Total Execution Time Msec</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The sum of the execution
	 * times of all contained executions in nanoseconds. Convert this to other
	 * time units using the utility functions in TimeUnits.NANOTIME. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Total Execution Time Msec</em>' attribute.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecutionTrace_TotalExecutionTimeMsec()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getTotalExecutionTimeMsec();

} // ExecutionTrace

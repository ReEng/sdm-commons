/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionStartedTimeStamp
 * <em>Execution Started Time Stamp</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionFinishedTimeStamp
 * <em>Execution Finished Time Stamp</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionTime
 * <em>Execution Time</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionTimeMsec
 * <em>Execution Time Msec</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getElements
 * <em>Elements</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getContainer
 * <em>Container</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution()
 * @model abstract="true"
 * @generated
 */
public interface Execution extends EObject
{
	/**
	 * Returns the value of the '<em><b>Execution Started Time Stamp</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Started Time Stamp</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Execution Started Time Stamp</em>'
	 *         attribute.
	 * @see #setExecutionStartedTimeStamp(long)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_ExecutionStartedTimeStamp()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getExecutionStartedTimeStamp();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionStartedTimeStamp
	 * <em>Execution Started Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Execution Started Time Stamp</em>'
	 *            attribute.
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 */
	void setExecutionStartedTimeStamp(long value);

	/**
	 * Returns the value of the '<em><b>Execution Finished Time Stamp</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Finished Time Stamp</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Execution Finished Time Stamp</em>'
	 *         attribute.
	 * @see #setExecutionFinishedTimeStamp(long)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_ExecutionFinishedTimeStamp()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getExecutionFinishedTimeStamp();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getExecutionFinishedTimeStamp
	 * <em>Execution Finished Time Stamp</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Execution Finished Time Stamp</em>'
	 *            attribute.
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 */
	void setExecutionFinishedTimeStamp(long value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute. The
	 * default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The execution time in
	 * nanoseconds. Convert this to other time units using the utility functions
	 * in TimeUnits.NANOTIME. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_ExecutionTime()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getExecutionTime();

	/**
	 * Returns the value of the '<em><b>Execution Time Msec</b></em>' attribute.
	 * The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time Msec</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Execution Time Msec</em>' attribute.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_ExecutionTimeMsec()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getExecutionTimeMsec();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution}. It is
	 * bidirectional and its opposite is '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getContainer
	 * <em>Container</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_Elements()
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.Execution#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Execution> getElements();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getElements
	 * <em>Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Execution)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getExecution_Container()
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.Execution#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Execution getContainer();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution#getContainer
	 * <em>Container</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Execution value);

} // Execution

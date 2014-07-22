/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Activity Node Execution</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution#getActivityNode
 * <em>Activity Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityNodeExecution()
 * @model
 * @generated
 */
public interface ActivityNodeExecution<ActivityNodeType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Activity Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity Node</em>' reference.
	 * @see #setActivityNode(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityNodeExecution_ActivityNode()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ActivityNodeType getActivityNode();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution#getActivityNode
	 * <em>Activity Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Activity Node</em>' reference.
	 * @see #getActivityNode()
	 * @generated
	 */
	void setActivityNode(ActivityNodeType value);

} // ActivityNodeExecution

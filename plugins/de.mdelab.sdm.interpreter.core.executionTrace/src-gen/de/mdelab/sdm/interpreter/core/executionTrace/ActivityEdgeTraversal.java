/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Activity Edge Traversal</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal#getActivityEdge
 * <em>Activity Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityEdgeTraversal()
 * @model
 * @generated
 */
public interface ActivityEdgeTraversal<ActivityEdgeType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Activity Edge</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity Edge</em>' reference.
	 * @see #setActivityEdge(Object)
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#getActivityEdgeTraversal_ActivityEdge()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ActivityEdgeType getActivityEdge();

	/**
	 * Sets the value of the '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal#getActivityEdge
	 * <em>Activity Edge</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Activity Edge</em>' reference.
	 * @see #getActivityEdge()
	 * @generated
	 */
	void setActivityEdge(ActivityEdgeType value);

} // ActivityEdgeTraversal

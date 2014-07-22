/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage
 * @generated
 */
public interface ExecutionTraceFactory extends EFactory
{
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ExecutionTraceFactory	eINSTANCE	= de.mdelab.sdm.interpreter.core.executionTrace.impl.ExecutionTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Execution Trace</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Execution Trace</em>'.
	 * @generated
	 */
	ExecutionTrace createExecutionTrace();

	/**
	 * Returns a new object of class '<em>Activity Execution</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Activity Execution</em>'.
	 * @generated
	 */
	<ActivityType> ActivityExecution<ActivityType> createActivityExecution();

	/**
	 * Returns a new object of class '<em>Activity Node Execution</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Activity Node Execution</em>'.
	 * @generated
	 */
	<ActivityNodeType> ActivityNodeExecution<ActivityNodeType> createActivityNodeExecution();

	/**
	 * Returns a new object of class '<em>Activity Edge Traversal</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Activity Edge Traversal</em>'.
	 * @generated
	 */
	<ActivityEdgeType> ActivityEdgeTraversal<ActivityEdgeType> createActivityEdgeTraversal();

	/**
	 * Returns a new object of class '<em>Story Pattern Initialization</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Initialization</em>'.
	 * @generated
	 */
	<StoryPatternType> StoryPatternInitialization<StoryPatternType> createStoryPatternInitialization();

	/**
	 * Returns a new object of class '<em>Story Pattern Matching</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Matching</em>'.
	 * @generated
	 */
	<StoryPatternType> StoryPatternMatching<StoryPatternType> createStoryPatternMatching();

	/**
	 * Returns a new object of class '<em>Story Pattern Application</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Application</em>'.
	 * @generated
	 */
	<StoryPatternType> StoryPatternApplication<StoryPatternType> createStoryPatternApplication();

	/**
	 * Returns a new object of class '<em>Story Pattern Object Bound</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Object Bound</em>'.
	 * @generated
	 */
	<StoryPatternObjectType> StoryPatternObjectBound<StoryPatternObjectType> createStoryPatternObjectBound();

	/**
	 * Returns a new object of class '<em>Story Pattern Object Not Bound</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Object Not Bound</em>'.
	 * @generated
	 */
	<StoryPatternObjectType> StoryPatternObjectNotBound<StoryPatternObjectType> createStoryPatternObjectNotBound();

	/**
	 * Returns a new object of class '
	 * <em>Story Pattern Object Binding Revoked</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '
	 *         <em>Story Pattern Object Binding Revoked</em>'.
	 * @generated
	 */
	<StoryPatternObjectType> StoryPatternObjectBindingRevoked<StoryPatternObjectType> createStoryPatternObjectBindingRevoked();

	/**
	 * Returns a new object of class '<em>Traversing Link</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Traversing Link</em>'.
	 * @generated
	 */
	<StoryPatternLinkType, StoryPatternObjectType> TraversingLink<StoryPatternLinkType, StoryPatternObjectType> createTraversingLink();

	/**
	 * Returns a new object of class '<em>Link Check Successful</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Link Check Successful</em>'.
	 * @generated
	 */
	<StoryPatternLinkType, StoryPatternObjectType> LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckSuccessful();

	/**
	 * Returns a new object of class '<em>Link Check Failed</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Link Check Failed</em>'.
	 * @generated
	 */
	<StoryPatternLinkType, StoryPatternObjectType> LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckFailed();

	/**
	 * Returns a new object of class '<em>Expression Evaluation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Expression Evaluation</em>'.
	 * @generated
	 */
	<ExpressionType> ExpressionEvaluation<ExpressionType> createExpressionEvaluation();

	/**
	 * Returns a new object of class '<em>Instance Object Creation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Object Creation</em>'.
	 * @generated
	 */
	<StoryPatternObjectType> InstanceObjectCreation<StoryPatternObjectType> createInstanceObjectCreation();

	/**
	 * Returns a new object of class '<em>Instance Object Deletion</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Object Deletion</em>'.
	 * @generated
	 */
	<StoryPatternObjectType> InstanceObjectDeletion<StoryPatternObjectType> createInstanceObjectDeletion();

	/**
	 * Returns a new object of class '<em>Instance Link Creation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Link Creation</em>'.
	 * @generated
	 */
	<StoryPatternLinkType, StoryPatternObjectType> InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkCreation();

	/**
	 * Returns a new object of class '<em>Instance Link Deletion</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Link Deletion</em>'.
	 * @generated
	 */
	<StoryPatternLinkType, StoryPatternObjectType> InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkDeletion();

	/**
	 * Returns a new object of class '<em>Attribute Value Set</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribute Value Set</em>'.
	 * @generated
	 */
	<StoryPatternObjectType, FeatureType> AttributeValueSet<StoryPatternObjectType, FeatureType> createAttributeValueSet();

	/**
	 * Returns a new object of class '<em>Variable Created</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Variable Created</em>'.
	 * @generated
	 */
	<ClassifierType> VariableCreated<ClassifierType> createVariableCreated();

	/**
	 * Returns a new object of class '<em>Variable Deleted</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Variable Deleted</em>'.
	 * @generated
	 */
	<ClassifierType> VariableDeleted<ClassifierType> createVariableDeleted();

	/**
	 * Returns a new object of class '<em>Variable Changed</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Variable Changed</em>'.
	 * @generated
	 */
	<ClassifierType> VariableChanged<ClassifierType> createVariableChanged();

	/**
	 * Returns a new object of class '
	 * <em>Story Pattern Object Constraint Holds</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '
	 *         <em>Story Pattern Object Constraint Holds</em>'.
	 * @generated
	 */
	<StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintHolds();

	/**
	 * Returns a new object of class '
	 * <em>Story Pattern Object Constraint Violated</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '
	 *         <em>Story Pattern Object Constraint Violated</em>'.
	 * @generated
	 */
	<StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintViolated();

	/**
	 * Returns a new object of class '<em>Story Pattern Constraint Holds</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Constraint Holds</em>'.
	 * @generated
	 */
	<StoryPatternType, ExpressionType> StoryPatternConstraintHolds<StoryPatternType, ExpressionType> createStoryPatternConstraintHolds();

	/**
	 * Returns a new object of class '<em>Story Pattern Constraint Violated</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Story Pattern Constraint Violated</em>
	 *         '.
	 * @generated
	 */
	<StoryPatternType, ExpressionType> StoryPatternConstraintViolated<StoryPatternType, ExpressionType> createStoryPatternConstraintViolated();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExecutionTracePackage getExecutionTracePackage();

} // ExecutionTraceFactory

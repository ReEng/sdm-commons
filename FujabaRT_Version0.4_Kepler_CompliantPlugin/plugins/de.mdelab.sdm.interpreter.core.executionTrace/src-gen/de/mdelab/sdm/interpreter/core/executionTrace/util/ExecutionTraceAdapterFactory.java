/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet;
import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectModification;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckSuccessful;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternApplication;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternInitialization;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBound;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectNotBound;
import de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableCreated;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableDeleted;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableModification;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage
 * @generated
 */
public class ExecutionTraceAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ExecutionTracePackage	modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecutionTraceAdapterFactory()
	{
		if (ExecutionTraceAdapterFactory.modelPackage == null)
		{
			ExecutionTraceAdapterFactory.modelPackage = ExecutionTracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object)
	{
		if (object == ExecutionTraceAdapterFactory.modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject) object).eClass().getEPackage() == ExecutionTraceAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecutionTraceSwitch<Adapter>	modelSwitch	= new ExecutionTraceSwitch<Adapter>()
														{
															@Override
															public <KeyType, ValueType> Adapter caseMapEntry(
																	final Map.Entry<KeyType, ValueType> object)
															{
																return ExecutionTraceAdapterFactory.this.createMapEntryAdapter();
															}

															@Override
															public Adapter caseExecutionTrace(final ExecutionTrace object)
															{
																return ExecutionTraceAdapterFactory.this.createExecutionTraceAdapter();
															}

															@Override
															public Adapter caseExecution(final Execution object)
															{
																return ExecutionTraceAdapterFactory.this.createExecutionAdapter();
															}

															@Override
															public <ActivityType> Adapter caseActivityExecution(
																	final ActivityExecution<ActivityType> object)
															{
																return ExecutionTraceAdapterFactory.this.createActivityExecutionAdapter();
															}

															@Override
															public <ActivityNodeType> Adapter caseActivityNodeExecution(
																	final ActivityNodeExecution<ActivityNodeType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createActivityNodeExecutionAdapter();
															}

															@Override
															public <ActivityEdgeType> Adapter caseActivityEdgeTraversal(
																	final ActivityEdgeTraversal<ActivityEdgeType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createActivityEdgeTraversalAdapter();
															}

															@Override
															public <StoryPatternType> Adapter caseStoryPatternExecution(
																	final StoryPatternExecution<StoryPatternType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternExecutionAdapter();
															}

															@Override
															public <StoryPatternType> Adapter caseStoryPatternInitialization(
																	final StoryPatternInitialization<StoryPatternType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternInitializationAdapter();
															}

															@Override
															public <StoryPatternType> Adapter caseStoryPatternMatching(
																	final StoryPatternMatching<StoryPatternType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternMatchingAdapter();
															}

															@Override
															public <StoryPatternType> Adapter caseStoryPatternApplication(
																	final StoryPatternApplication<StoryPatternType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternApplicationAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseStoryPatternObjectExecution(
																	final StoryPatternObjectExecution<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectExecutionAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseStoryPatternObjectBound(
																	final StoryPatternObjectBound<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectBoundAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseStoryPatternObjectNotBound(
																	final StoryPatternObjectNotBound<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectNotBoundAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseStoryPatternObjectBindingRevoked(
																	final StoryPatternObjectBindingRevoked<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectBindingRevokedAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseStoryPatternLinkExecution(
																	final StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternLinkExecutionAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseTraversingLink(
																	final TraversingLink<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this.createTraversingLinkAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheck(
																	final LinkCheck<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this.createLinkCheckAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheckSuccessful(
																	final LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this.createLinkCheckSuccessfulAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheckFailed(
																	final LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this.createLinkCheckFailedAdapter();
															}

															@Override
															public <ExpressionType> Adapter caseExpressionEvaluation(
																	final ExpressionEvaluation<ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createExpressionEvaluationAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseInstanceObjectModification(
																	final InstanceObjectModification<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceObjectModificationAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseInstanceObjectCreation(
																	final InstanceObjectCreation<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceObjectCreationAdapter();
															}

															@Override
															public <StoryPatternObjectType> Adapter caseInstanceObjectDeletion(
																	final InstanceObjectDeletion<StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceObjectDeletionAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkModification(
																	final InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceLinkModificationAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkCreation(
																	final InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceLinkCreationAdapter();
															}

															@Override
															public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkDeletion(
																	final InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createInstanceLinkDeletionAdapter();
															}

															@Override
															public <StoryPatternObjectType, FeatureType> Adapter caseAttributeValueSet(
																	final AttributeValueSet<StoryPatternObjectType, FeatureType> object)
															{
																return ExecutionTraceAdapterFactory.this.createAttributeValueSetAdapter();
															}

															@Override
															public <ClassifierType> Adapter caseVariableModification(
																	final VariableModification<ClassifierType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createVariableModificationAdapter();
															}

															@Override
															public <ClassifierType> Adapter caseVariableCreated(
																	final VariableCreated<ClassifierType> object)
															{
																return ExecutionTraceAdapterFactory.this.createVariableCreatedAdapter();
															}

															@Override
															public <ClassifierType> Adapter caseVariableDeleted(
																	final VariableDeleted<ClassifierType> object)
															{
																return ExecutionTraceAdapterFactory.this.createVariableDeletedAdapter();
															}

															@Override
															public <ClassifierType> Adapter caseVariableChanged(
																	final VariableChanged<ClassifierType> object)
															{
																return ExecutionTraceAdapterFactory.this.createVariableChangedAdapter();
															}

															@Override
															public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintEvaluation(
																	final StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectConstraintEvaluationAdapter();
															}

															@Override
															public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintHolds(
																	final StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectConstraintHoldsAdapter();
															}

															@Override
															public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintViolated(
																	final StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternObjectConstraintViolatedAdapter();
															}

															@Override
															public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintEvaluation(
																	final StoryPatternConstraintEvaluation<StoryPatternType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternConstraintEvaluationAdapter();
															}

															@Override
															public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintHolds(
																	final StoryPatternConstraintHolds<StoryPatternType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternConstraintHoldsAdapter();
															}

															@Override
															public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintViolated(
																	final StoryPatternConstraintViolated<StoryPatternType, ExpressionType> object)
															{
																return ExecutionTraceAdapterFactory.this
																		.createStoryPatternConstraintViolatedAdapter();
															}

															@Override
															public Adapter defaultCase(final EObject object)
															{
																return ExecutionTraceAdapterFactory.this.createEObjectAdapter();
															}
														};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target)
	{
		return this.modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry
	 * <em>Map Entry</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createMapEntryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace
	 * <em>Execution Trace</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace
	 * @generated
	 */
	public Adapter createExecutionTraceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.Execution
	 * <em>Execution</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution
	 * <em>Activity Execution</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution
	 * @generated
	 */
	public Adapter createActivityExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution
	 * <em>Activity Node Execution</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution
	 * @generated
	 */
	public Adapter createActivityNodeExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal
	 * <em>Activity Edge Traversal</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal
	 * @generated
	 */
	public Adapter createActivityEdgeTraversalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution
	 * <em>Story Pattern Execution</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternExecution
	 * @generated
	 */
	public Adapter createStoryPatternExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternInitialization
	 * <em>Story Pattern Initialization</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternInitialization
	 * @generated
	 */
	public Adapter createStoryPatternInitializationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching
	 * <em>Story Pattern Matching</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching
	 * @generated
	 */
	public Adapter createStoryPatternMatchingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternApplication
	 * <em>Story Pattern Application</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternApplication
	 * @generated
	 */
	public Adapter createStoryPatternApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution
	 * <em>Story Pattern Object Execution</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectExecution
	 * @generated
	 */
	public Adapter createStoryPatternObjectExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBound
	 * <em>Story Pattern Object Bound</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBound
	 * @generated
	 */
	public Adapter createStoryPatternObjectBoundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectNotBound
	 * <em>Story Pattern Object Not Bound</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectNotBound
	 * @generated
	 */
	public Adapter createStoryPatternObjectNotBoundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked
	 * <em>Story Pattern Object Binding Revoked</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked
	 * @generated
	 */
	public Adapter createStoryPatternObjectBindingRevokedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution
	 * <em>Story Pattern Link Execution</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternLinkExecution
	 * @generated
	 */
	public Adapter createStoryPatternLinkExecutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink
	 * <em>Traversing Link</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink
	 * @generated
	 */
	public Adapter createTraversingLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck
	 * <em>Link Check</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.LinkCheck
	 * @generated
	 */
	public Adapter createLinkCheckAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckSuccessful
	 * <em>Link Check Successful</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckSuccessful
	 * @generated
	 */
	public Adapter createLinkCheckSuccessfulAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed
	 * <em>Link Check Failed</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed
	 * @generated
	 */
	public Adapter createLinkCheckFailedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation
	 * <em>Expression Evaluation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation
	 * @generated
	 */
	public Adapter createExpressionEvaluationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectModification
	 * <em>Instance Object Modification</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectModification
	 * @generated
	 */
	public Adapter createInstanceObjectModificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectCreation
	 * <em>Instance Object Creation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectCreation
	 * @generated
	 */
	public Adapter createInstanceObjectCreationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion
	 * <em>Instance Object Deletion</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion
	 * @generated
	 */
	public Adapter createInstanceObjectDeletionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification
	 * <em>Instance Link Modification</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkModification
	 * @generated
	 */
	public Adapter createInstanceLinkModificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation
	 * <em>Instance Link Creation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation
	 * @generated
	 */
	public Adapter createInstanceLinkCreationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkDeletion
	 * <em>Instance Link Deletion</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkDeletion
	 * @generated
	 */
	public Adapter createInstanceLinkDeletionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet
	 * <em>Attribute Value Set</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet
	 * @generated
	 */
	public Adapter createAttributeValueSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.VariableModification
	 * <em>Variable Modification</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.VariableModification
	 * @generated
	 */
	public Adapter createVariableModificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.VariableCreated
	 * <em>Variable Created</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.VariableCreated
	 * @generated
	 */
	public Adapter createVariableCreatedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.VariableDeleted
	 * <em>Variable Deleted</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.VariableDeleted
	 * @generated
	 */
	public Adapter createVariableDeletedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged
	 * <em>Variable Changed</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged
	 * @generated
	 */
	public Adapter createVariableChangedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation
	 * <em>Story Pattern Object Constraint Evaluation</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintEvaluationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintHolds
	 * <em>Story Pattern Object Constraint Holds</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintHolds
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintHoldsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated
	 * <em>Story Pattern Object Constraint Violated</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintViolatedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintEvaluation
	 * <em>Story Pattern Constraint Evaluation</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintEvaluation
	 * @generated
	 */
	public Adapter createStoryPatternConstraintEvaluationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintHolds
	 * <em>Story Pattern Constraint Holds</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintHolds
	 * @generated
	 */
	public Adapter createStoryPatternConstraintHoldsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated
	 * <em>Story Pattern Constraint Violated</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated
	 * @generated
	 */
	public Adapter createStoryPatternConstraintViolatedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} // ExecutionTraceAdapterFactory

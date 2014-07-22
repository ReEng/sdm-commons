/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTraceFactory;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.ExpressionEvaluation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectCreation;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckSuccessful;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternApplication;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternInitialization;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternMatching;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBindingRevoked;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectBound;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintHolds;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintViolated;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectNotBound;
import de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableChanged;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableCreated;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableDeleted;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ExecutionTraceFactoryImpl extends EFactoryImpl implements ExecutionTraceFactory
{
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExecutionTraceFactory init()
	{
		try
		{
			final ExecutionTraceFactory theExecutionTraceFactory = (ExecutionTraceFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.mdelab.de/sdm/interpreter/core/executionTrace/1.0");
			if (theExecutionTraceFactory != null)
			{
				return theExecutionTraceFactory;
			}
		}
		catch (final Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutionTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecutionTraceFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ExecutionTracePackage.MAP_ENTRY:
				return (EObject) this.createMapEntry();
			case ExecutionTracePackage.EXECUTION_TRACE:
				return this.createExecutionTrace();
			case ExecutionTracePackage.ACTIVITY_EXECUTION:
				return this.createActivityExecution();
			case ExecutionTracePackage.ACTIVITY_NODE_EXECUTION:
				return this.createActivityNodeExecution();
			case ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL:
				return this.createActivityEdgeTraversal();
			case ExecutionTracePackage.STORY_PATTERN_INITIALIZATION:
				return this.createStoryPatternInitialization();
			case ExecutionTracePackage.STORY_PATTERN_MATCHING:
				return this.createStoryPatternMatching();
			case ExecutionTracePackage.STORY_PATTERN_APPLICATION:
				return this.createStoryPatternApplication();
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BOUND:
				return this.createStoryPatternObjectBound();
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_NOT_BOUND:
				return this.createStoryPatternObjectNotBound();
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED:
				return this.createStoryPatternObjectBindingRevoked();
			case ExecutionTracePackage.TRAVERSING_LINK:
				return this.createTraversingLink();
			case ExecutionTracePackage.LINK_CHECK_SUCCESSFUL:
				return this.createLinkCheckSuccessful();
			case ExecutionTracePackage.LINK_CHECK_FAILED:
				return this.createLinkCheckFailed();
			case ExecutionTracePackage.EXPRESSION_EVALUATION:
				return this.createExpressionEvaluation();
			case ExecutionTracePackage.INSTANCE_OBJECT_CREATION:
				return this.createInstanceObjectCreation();
			case ExecutionTracePackage.INSTANCE_OBJECT_DELETION:
				return this.createInstanceObjectDeletion();
			case ExecutionTracePackage.INSTANCE_LINK_CREATION:
				return this.createInstanceLinkCreation();
			case ExecutionTracePackage.INSTANCE_LINK_DELETION:
				return this.createInstanceLinkDeletion();
			case ExecutionTracePackage.ATTRIBUTE_VALUE_SET:
				return this.createAttributeValueSet();
			case ExecutionTracePackage.VARIABLE_CREATED:
				return this.createVariableCreated();
			case ExecutionTracePackage.VARIABLE_DELETED:
				return this.createVariableDeleted();
			case ExecutionTracePackage.VARIABLE_CHANGED:
				return this.createVariableChanged();
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
				return this.createStoryPatternObjectConstraintHolds();
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
				return this.createStoryPatternObjectConstraintViolated();
			case ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_HOLDS:
				return this.createStoryPatternConstraintHolds();
			case ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_VIOLATED:
				return this.createStoryPatternConstraintViolated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public <KeyType, ValueType> Map.Entry<KeyType, ValueType> createMapEntry()
	{
		final MapEntryImpl<KeyType, ValueType> mapEntry = new MapEntryImpl<KeyType, ValueType>();
		return mapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ExecutionTrace createExecutionTrace()
	{
		final ExecutionTraceImpl executionTrace = new ExecutionTraceImpl();
		return executionTrace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ActivityType> ActivityExecution<ActivityType> createActivityExecution()
	{
		final ActivityExecutionImpl<ActivityType> activityExecution = new ActivityExecutionImpl<ActivityType>();
		return activityExecution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ActivityNodeType> ActivityNodeExecution<ActivityNodeType> createActivityNodeExecution()
	{
		final ActivityNodeExecutionImpl<ActivityNodeType> activityNodeExecution = new ActivityNodeExecutionImpl<ActivityNodeType>();
		return activityNodeExecution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ActivityEdgeType> ActivityEdgeTraversal<ActivityEdgeType> createActivityEdgeTraversal()
	{
		final ActivityEdgeTraversalImpl<ActivityEdgeType> activityEdgeTraversal = new ActivityEdgeTraversalImpl<ActivityEdgeType>();
		return activityEdgeTraversal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternType> StoryPatternInitialization<StoryPatternType> createStoryPatternInitialization()
	{
		final StoryPatternInitializationImpl<StoryPatternType> storyPatternInitialization = new StoryPatternInitializationImpl<StoryPatternType>();
		return storyPatternInitialization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternType> StoryPatternMatching<StoryPatternType> createStoryPatternMatching()
	{
		final StoryPatternMatchingImpl<StoryPatternType> storyPatternMatching = new StoryPatternMatchingImpl<StoryPatternType>();
		return storyPatternMatching;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternType> StoryPatternApplication<StoryPatternType> createStoryPatternApplication()
	{
		final StoryPatternApplicationImpl<StoryPatternType> storyPatternApplication = new StoryPatternApplicationImpl<StoryPatternType>();
		return storyPatternApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType> StoryPatternObjectBound<StoryPatternObjectType> createStoryPatternObjectBound()
	{
		final StoryPatternObjectBoundImpl<StoryPatternObjectType> storyPatternObjectBound = new StoryPatternObjectBoundImpl<StoryPatternObjectType>();
		return storyPatternObjectBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType> StoryPatternObjectNotBound<StoryPatternObjectType> createStoryPatternObjectNotBound()
	{
		final StoryPatternObjectNotBoundImpl<StoryPatternObjectType> storyPatternObjectNotBound = new StoryPatternObjectNotBoundImpl<StoryPatternObjectType>();
		return storyPatternObjectNotBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType> StoryPatternObjectBindingRevoked<StoryPatternObjectType> createStoryPatternObjectBindingRevoked()
	{
		final StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType> storyPatternObjectBindingRevoked = new StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType>();
		return storyPatternObjectBindingRevoked;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternLinkType, StoryPatternObjectType> TraversingLink<StoryPatternLinkType, StoryPatternObjectType> createTraversingLink()
	{
		final TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType> traversingLink = new TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return traversingLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternLinkType, StoryPatternObjectType> LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckSuccessful()
	{
		final LinkCheckSuccessfulImpl<StoryPatternLinkType, StoryPatternObjectType> linkCheckSuccessful = new LinkCheckSuccessfulImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return linkCheckSuccessful;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternLinkType, StoryPatternObjectType> LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckFailed()
	{
		final LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType> linkCheckFailed = new LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return linkCheckFailed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ExpressionType> ExpressionEvaluation<ExpressionType> createExpressionEvaluation()
	{
		final ExpressionEvaluationImpl<ExpressionType> expressionEvaluation = new ExpressionEvaluationImpl<ExpressionType>();
		return expressionEvaluation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType> InstanceObjectCreation<StoryPatternObjectType> createInstanceObjectCreation()
	{
		final InstanceObjectCreationImpl<StoryPatternObjectType> instanceObjectCreation = new InstanceObjectCreationImpl<StoryPatternObjectType>();
		return instanceObjectCreation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType> InstanceObjectDeletion<StoryPatternObjectType> createInstanceObjectDeletion()
	{
		final InstanceObjectDeletionImpl<StoryPatternObjectType> instanceObjectDeletion = new InstanceObjectDeletionImpl<StoryPatternObjectType>();
		return instanceObjectDeletion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternLinkType, StoryPatternObjectType> InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkCreation()
	{
		final InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType> instanceLinkCreation = new InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return instanceLinkCreation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternLinkType, StoryPatternObjectType> InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkDeletion()
	{
		final InstanceLinkDeletionImpl<StoryPatternLinkType, StoryPatternObjectType> instanceLinkDeletion = new InstanceLinkDeletionImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return instanceLinkDeletion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType, FeatureType> AttributeValueSet<StoryPatternObjectType, FeatureType> createAttributeValueSet()
	{
		final AttributeValueSetImpl<StoryPatternObjectType, FeatureType> attributeValueSet = new AttributeValueSetImpl<StoryPatternObjectType, FeatureType>();
		return attributeValueSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ClassifierType> VariableCreated<ClassifierType> createVariableCreated()
	{
		final VariableCreatedImpl<ClassifierType> variableCreated = new VariableCreatedImpl<ClassifierType>();
		return variableCreated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ClassifierType> VariableDeleted<ClassifierType> createVariableDeleted()
	{
		final VariableDeletedImpl<ClassifierType> variableDeleted = new VariableDeletedImpl<ClassifierType>();
		return variableDeleted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <ClassifierType> VariableChanged<ClassifierType> createVariableChanged()
	{
		final VariableChangedImpl<ClassifierType> variableChanged = new VariableChangedImpl<ClassifierType>();
		return variableChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintHolds()
	{
		final StoryPatternObjectConstraintHoldsImpl<StoryPatternObjectType, ExpressionType> storyPatternObjectConstraintHolds = new StoryPatternObjectConstraintHoldsImpl<StoryPatternObjectType, ExpressionType>();
		return storyPatternObjectConstraintHolds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintViolated()
	{
		final StoryPatternObjectConstraintViolatedImpl<StoryPatternObjectType, ExpressionType> storyPatternObjectConstraintViolated = new StoryPatternObjectConstraintViolatedImpl<StoryPatternObjectType, ExpressionType>();
		return storyPatternObjectConstraintViolated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternType, ExpressionType> StoryPatternConstraintHolds<StoryPatternType, ExpressionType> createStoryPatternConstraintHolds()
	{
		final StoryPatternConstraintHoldsImpl<StoryPatternType, ExpressionType> storyPatternConstraintHolds = new StoryPatternConstraintHoldsImpl<StoryPatternType, ExpressionType>();
		return storyPatternConstraintHolds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public <StoryPatternType, ExpressionType> StoryPatternConstraintViolated<StoryPatternType, ExpressionType> createStoryPatternConstraintViolated()
	{
		final StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType> storyPatternConstraintViolated = new StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType>();
		return storyPatternConstraintViolated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ExecutionTracePackage getExecutionTracePackage()
	{
		return (ExecutionTracePackage) this.getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutionTracePackage getPackage()
	{
		return ExecutionTracePackage.eINSTANCE;
	}

} // ExecutionTraceFactoryImpl

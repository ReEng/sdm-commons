/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ActivityEdgeTraversal;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.ActivityNodeExecution;
import de.mdelab.sdm.interpreter.core.executionTrace.AttributeValueSet;
import de.mdelab.sdm.interpreter.core.executionTrace.Execution;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTrace;
import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTraceFactory;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ExecutionTracePackageImpl extends EPackageImpl implements ExecutionTracePackage
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	mapEntryEClass									= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	executionTraceEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	executionEClass									= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	activityExecutionEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	activityNodeExecutionEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	activityEdgeTraversalEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternExecutionEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternInitializationEClass				= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternMatchingEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternApplicationEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectExecutionEClass				= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectBoundEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectNotBoundEClass				= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectBindingRevokedEClass			= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternLinkExecutionEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	traversingLinkEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	linkCheckEClass									= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	linkCheckSuccessfulEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	linkCheckFailedEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	expressionEvaluationEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceObjectModificationEClass				= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceObjectCreationEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceObjectDeletionEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceLinkModificationEClass					= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceLinkCreationEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	instanceLinkDeletionEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	attributeValueSetEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	variableModificationEClass						= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	variableCreatedEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	variableDeletedEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	variableChangedEClass							= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectConstraintEvaluationEClass	= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectConstraintHoldsEClass			= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternObjectConstraintViolatedEClass		= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternConstraintEvaluationEClass			= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternConstraintHoldsEClass				= null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass	storyPatternConstraintViolatedEClass			= null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionTracePackageImpl()
	{
		super(ExecutionTracePackage.eNS_URI, ExecutionTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean	isInited	= false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ExecutionTracePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionTracePackage init()
	{
		if (ExecutionTracePackageImpl.isInited)
		{
			return (ExecutionTracePackage) EPackage.Registry.INSTANCE.getEPackage(ExecutionTracePackage.eNS_URI);
		}

		// Obtain or create and register package
		final ExecutionTracePackageImpl theExecutionTracePackage = (ExecutionTracePackageImpl) (EPackage.Registry.INSTANCE
				.get(ExecutionTracePackage.eNS_URI) instanceof ExecutionTracePackageImpl ? EPackage.Registry.INSTANCE
				.get(ExecutionTracePackage.eNS_URI) : new ExecutionTracePackageImpl());

		ExecutionTracePackageImpl.isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExecutionTracePackage.createPackageContents();

		// Initialize created meta-data
		theExecutionTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionTracePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionTracePackage.eNS_URI, theExecutionTracePackage);
		return theExecutionTracePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getMapEntry()
	{
		return this.mapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Key()
	{
		return (EAttribute) this.mapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Value()
	{
		return (EAttribute) this.mapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getExecutionTrace()
	{
		return this.executionTraceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getExecutionTrace_Executions()
	{
		return (EReference) this.executionTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecutionTrace_Description()
	{
		return (EAttribute) this.executionTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecutionTrace_TotalExecutionTime()
	{
		return (EAttribute) this.executionTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecutionTrace_TotalExecutionTimeMsec()
	{
		return (EAttribute) this.executionTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getExecution()
	{
		return this.executionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecution_ExecutionStartedTimeStamp()
	{
		return (EAttribute) this.executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecution_ExecutionFinishedTimeStamp()
	{
		return (EAttribute) this.executionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecution_ExecutionTime()
	{
		return (EAttribute) this.executionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExecution_ExecutionTimeMsec()
	{
		return (EAttribute) this.executionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getExecution_Elements()
	{
		return (EReference) this.executionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getExecution_Container()
	{
		return (EReference) this.executionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getActivityExecution()
	{
		return this.activityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getActivityExecution_Activity()
	{
		return (EReference) this.activityExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getActivityExecution_InParameterValues()
	{
		return (EReference) this.activityExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getActivityExecution_OutParameterValues()
	{
		return (EReference) this.activityExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getActivityNodeExecution()
	{
		return this.activityNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getActivityNodeExecution_ActivityNode()
	{
		return (EReference) this.activityNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getActivityEdgeTraversal()
	{
		return this.activityEdgeTraversalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getActivityEdgeTraversal_ActivityEdge()
	{
		return (EReference) this.activityEdgeTraversalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternExecution()
	{
		return this.storyPatternExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternExecution_StoryPattern()
	{
		return (EReference) this.storyPatternExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternInitialization()
	{
		return this.storyPatternInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternMatching()
	{
		return this.storyPatternMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getStoryPatternMatching_Successful()
	{
		return (EAttribute) this.storyPatternMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternApplication()
	{
		return this.storyPatternApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectExecution()
	{
		return this.storyPatternObjectExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternObjectExecution_StoryPatternObject()
	{
		return (EReference) this.storyPatternObjectExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectBound()
	{
		return this.storyPatternObjectBoundEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getStoryPatternObjectBound_Value()
	{
		return (EAttribute) this.storyPatternObjectBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectNotBound()
	{
		return this.storyPatternObjectNotBoundEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectBindingRevoked()
	{
		return this.storyPatternObjectBindingRevokedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getStoryPatternObjectBindingRevoked_PreviousValue()
	{
		return (EAttribute) this.storyPatternObjectBindingRevokedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternLinkExecution()
	{
		return this.storyPatternLinkExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternLinkExecution_StoryPatternLink()
	{
		return (EReference) this.storyPatternLinkExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternLinkExecution_SourceStoryPatternObject()
	{
		return (EReference) this.storyPatternLinkExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternLinkExecution_TargetStoryPatternObject()
	{
		return (EReference) this.storyPatternLinkExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getStoryPatternLinkExecution_SourceObject()
	{
		return (EAttribute) this.storyPatternLinkExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getTraversingLink()
	{
		return this.traversingLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLinkCheck()
	{
		return this.linkCheckEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getLinkCheck_TargetObject()
	{
		return (EAttribute) this.linkCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLinkCheckSuccessful()
	{
		return this.linkCheckSuccessfulEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLinkCheckFailed()
	{
		return this.linkCheckFailedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getExpressionEvaluation()
	{
		return this.expressionEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getExpressionEvaluation_Expression()
	{
		return (EReference) this.expressionEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getExpressionEvaluation_Result()
	{
		return (EAttribute) this.expressionEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceObjectModification()
	{
		return this.instanceObjectModificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInstanceObjectModification_StoryPatternObject()
	{
		return (EReference) this.instanceObjectModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getInstanceObjectModification_InstanceObject()
	{
		return (EAttribute) this.instanceObjectModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceObjectCreation()
	{
		return this.instanceObjectCreationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceObjectDeletion()
	{
		return this.instanceObjectDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceLinkModification()
	{
		return this.instanceLinkModificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInstanceLinkModification_StoryPatternLink()
	{
		return (EReference) this.instanceLinkModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInstanceLinkModification_SourceStoryPatternObject()
	{
		return (EReference) this.instanceLinkModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInstanceLinkModification_TargetStoryPatternObject()
	{
		return (EReference) this.instanceLinkModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getInstanceLinkModification_SourceInstanceObject()
	{
		return (EAttribute) this.instanceLinkModificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getInstanceLinkModification_TargetInstanceObject()
	{
		return (EAttribute) this.instanceLinkModificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceLinkCreation()
	{
		return this.instanceLinkCreationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInstanceLinkDeletion()
	{
		return this.instanceLinkDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAttributeValueSet()
	{
		return this.attributeValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAttributeValueSet_StoryPatternObject()
	{
		return (EReference) this.attributeValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAttributeValueSet_Feature()
	{
		return (EReference) this.attributeValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttributeValueSet_InstanceObject()
	{
		return (EAttribute) this.attributeValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttributeValueSet_NewValue()
	{
		return (EAttribute) this.attributeValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getVariableModification()
	{
		return this.variableModificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getVariableModification_VariableName()
	{
		return (EAttribute) this.variableModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getVariableModification_Classifier()
	{
		return (EReference) this.variableModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getVariableModification_Value()
	{
		return (EAttribute) this.variableModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getVariableCreated()
	{
		return this.variableCreatedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getVariableDeleted()
	{
		return this.variableDeletedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getVariableChanged()
	{
		return this.variableChangedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getVariableChanged_OldValue()
	{
		return (EAttribute) this.variableChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectConstraintEvaluation()
	{
		return this.storyPatternObjectConstraintEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternObjectConstraintEvaluation_Constraint()
	{
		return (EReference) this.storyPatternObjectConstraintEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectConstraintHolds()
	{
		return this.storyPatternObjectConstraintHoldsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternObjectConstraintViolated()
	{
		return this.storyPatternObjectConstraintViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternConstraintEvaluation()
	{
		return this.storyPatternConstraintEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStoryPatternConstraintEvaluation_Constraint()
	{
		return (EReference) this.storyPatternConstraintEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternConstraintHolds()
	{
		return this.storyPatternConstraintHoldsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStoryPatternConstraintViolated()
	{
		return this.storyPatternConstraintViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ExecutionTraceFactory getExecutionTraceFactory()
	{
		return (ExecutionTraceFactory) this.getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean	isCreated	= false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents()
	{
		if (this.isCreated)
		{
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.mapEntryEClass = this.createEClass(ExecutionTracePackage.MAP_ENTRY);
		this.createEAttribute(this.mapEntryEClass, ExecutionTracePackage.MAP_ENTRY__KEY);
		this.createEAttribute(this.mapEntryEClass, ExecutionTracePackage.MAP_ENTRY__VALUE);

		this.executionTraceEClass = this.createEClass(ExecutionTracePackage.EXECUTION_TRACE);
		this.createEReference(this.executionTraceEClass, ExecutionTracePackage.EXECUTION_TRACE__EXECUTIONS);
		this.createEAttribute(this.executionTraceEClass, ExecutionTracePackage.EXECUTION_TRACE__DESCRIPTION);
		this.createEAttribute(this.executionTraceEClass, ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME);
		this.createEAttribute(this.executionTraceEClass, ExecutionTracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC);

		this.executionEClass = this.createEClass(ExecutionTracePackage.EXECUTION);
		this.createEAttribute(this.executionEClass, ExecutionTracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP);
		this.createEAttribute(this.executionEClass, ExecutionTracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP);
		this.createEAttribute(this.executionEClass, ExecutionTracePackage.EXECUTION__EXECUTION_TIME);
		this.createEAttribute(this.executionEClass, ExecutionTracePackage.EXECUTION__EXECUTION_TIME_MSEC);
		this.createEReference(this.executionEClass, ExecutionTracePackage.EXECUTION__ELEMENTS);
		this.createEReference(this.executionEClass, ExecutionTracePackage.EXECUTION__CONTAINER);

		this.activityExecutionEClass = this.createEClass(ExecutionTracePackage.ACTIVITY_EXECUTION);
		this.createEReference(this.activityExecutionEClass, ExecutionTracePackage.ACTIVITY_EXECUTION__ACTIVITY);
		this.createEReference(this.activityExecutionEClass, ExecutionTracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
		this.createEReference(this.activityExecutionEClass, ExecutionTracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);

		this.activityNodeExecutionEClass = this.createEClass(ExecutionTracePackage.ACTIVITY_NODE_EXECUTION);
		this.createEReference(this.activityNodeExecutionEClass, ExecutionTracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE);

		this.activityEdgeTraversalEClass = this.createEClass(ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL);
		this.createEReference(this.activityEdgeTraversalEClass, ExecutionTracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE);

		this.storyPatternExecutionEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_EXECUTION);
		this.createEReference(this.storyPatternExecutionEClass, ExecutionTracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN);

		this.storyPatternInitializationEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_INITIALIZATION);

		this.storyPatternMatchingEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_MATCHING);
		this.createEAttribute(this.storyPatternMatchingEClass, ExecutionTracePackage.STORY_PATTERN_MATCHING__SUCCESSFUL);

		this.storyPatternApplicationEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_APPLICATION);

		this.storyPatternObjectExecutionEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION);
		this.createEReference(this.storyPatternObjectExecutionEClass,
				ExecutionTracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT);

		this.storyPatternObjectBoundEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_BOUND);
		this.createEAttribute(this.storyPatternObjectBoundEClass, ExecutionTracePackage.STORY_PATTERN_OBJECT_BOUND__VALUE);

		this.storyPatternObjectNotBoundEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_NOT_BOUND);

		this.storyPatternObjectBindingRevokedEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED);
		this.createEAttribute(this.storyPatternObjectBindingRevokedEClass,
				ExecutionTracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE);

		this.storyPatternLinkExecutionEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION);
		this.createEReference(this.storyPatternLinkExecutionEClass, ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK);
		this.createEReference(this.storyPatternLinkExecutionEClass,
				ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT);
		this.createEReference(this.storyPatternLinkExecutionEClass,
				ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT);
		this.createEAttribute(this.storyPatternLinkExecutionEClass, ExecutionTracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT);

		this.traversingLinkEClass = this.createEClass(ExecutionTracePackage.TRAVERSING_LINK);

		this.linkCheckEClass = this.createEClass(ExecutionTracePackage.LINK_CHECK);
		this.createEAttribute(this.linkCheckEClass, ExecutionTracePackage.LINK_CHECK__TARGET_OBJECT);

		this.linkCheckSuccessfulEClass = this.createEClass(ExecutionTracePackage.LINK_CHECK_SUCCESSFUL);

		this.linkCheckFailedEClass = this.createEClass(ExecutionTracePackage.LINK_CHECK_FAILED);

		this.expressionEvaluationEClass = this.createEClass(ExecutionTracePackage.EXPRESSION_EVALUATION);
		this.createEReference(this.expressionEvaluationEClass, ExecutionTracePackage.EXPRESSION_EVALUATION__EXPRESSION);
		this.createEAttribute(this.expressionEvaluationEClass, ExecutionTracePackage.EXPRESSION_EVALUATION__RESULT);

		this.instanceObjectModificationEClass = this.createEClass(ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION);
		this.createEReference(this.instanceObjectModificationEClass,
				ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT);
		this.createEAttribute(this.instanceObjectModificationEClass, ExecutionTracePackage.INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT);

		this.instanceObjectCreationEClass = this.createEClass(ExecutionTracePackage.INSTANCE_OBJECT_CREATION);

		this.instanceObjectDeletionEClass = this.createEClass(ExecutionTracePackage.INSTANCE_OBJECT_DELETION);

		this.instanceLinkModificationEClass = this.createEClass(ExecutionTracePackage.INSTANCE_LINK_MODIFICATION);
		this.createEReference(this.instanceLinkModificationEClass, ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK);
		this.createEReference(this.instanceLinkModificationEClass,
				ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT);
		this.createEReference(this.instanceLinkModificationEClass,
				ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT);
		this.createEAttribute(this.instanceLinkModificationEClass, ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT);
		this.createEAttribute(this.instanceLinkModificationEClass, ExecutionTracePackage.INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT);

		this.instanceLinkCreationEClass = this.createEClass(ExecutionTracePackage.INSTANCE_LINK_CREATION);

		this.instanceLinkDeletionEClass = this.createEClass(ExecutionTracePackage.INSTANCE_LINK_DELETION);

		this.attributeValueSetEClass = this.createEClass(ExecutionTracePackage.ATTRIBUTE_VALUE_SET);
		this.createEReference(this.attributeValueSetEClass, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT);
		this.createEReference(this.attributeValueSetEClass, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__FEATURE);
		this.createEAttribute(this.attributeValueSetEClass, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT);
		this.createEAttribute(this.attributeValueSetEClass, ExecutionTracePackage.ATTRIBUTE_VALUE_SET__NEW_VALUE);

		this.variableModificationEClass = this.createEClass(ExecutionTracePackage.VARIABLE_MODIFICATION);
		this.createEAttribute(this.variableModificationEClass, ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME);
		this.createEReference(this.variableModificationEClass, ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER);
		this.createEAttribute(this.variableModificationEClass, ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE);

		this.variableCreatedEClass = this.createEClass(ExecutionTracePackage.VARIABLE_CREATED);

		this.variableDeletedEClass = this.createEClass(ExecutionTracePackage.VARIABLE_DELETED);

		this.variableChangedEClass = this.createEClass(ExecutionTracePackage.VARIABLE_CHANGED);
		this.createEAttribute(this.variableChangedEClass, ExecutionTracePackage.VARIABLE_CHANGED__OLD_VALUE);

		this.storyPatternObjectConstraintEvaluationEClass = this
				.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION);
		this.createEReference(this.storyPatternObjectConstraintEvaluationEClass,
				ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT);

		this.storyPatternObjectConstraintHoldsEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS);

		this.storyPatternObjectConstraintViolatedEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED);

		this.storyPatternConstraintEvaluationEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_EVALUATION);
		this.createEReference(this.storyPatternConstraintEvaluationEClass,
				ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT);

		this.storyPatternConstraintHoldsEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_HOLDS);

		this.storyPatternConstraintViolatedEClass = this.createEClass(ExecutionTracePackage.STORY_PATTERN_CONSTRAINT_VIOLATED);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean	isInitialized	= false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (this.isInitialized)
		{
			return;
		}
		this.isInitialized = true;

		// Initialize package
		this.setName(ExecutionTracePackage.eNAME);
		this.setNsPrefix(ExecutionTracePackage.eNS_PREFIX);
		this.setNsURI(ExecutionTracePackage.eNS_URI);

		// Obtain other dependent packages
		final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		final ETypeParameter mapEntryEClass_KeyType = this.addETypeParameter(this.mapEntryEClass, "KeyType");
		final ETypeParameter mapEntryEClass_ValueType = this.addETypeParameter(this.mapEntryEClass, "ValueType");
		final ETypeParameter activityExecutionEClass_ActivityType = this.addETypeParameter(this.activityExecutionEClass, "ActivityType");
		final ETypeParameter activityNodeExecutionEClass_ActivityNodeType = this.addETypeParameter(this.activityNodeExecutionEClass,
				"ActivityNodeType");
		final ETypeParameter activityEdgeTraversalEClass_ActivityEdgeType = this.addETypeParameter(this.activityEdgeTraversalEClass,
				"ActivityEdgeType");
		final ETypeParameter storyPatternExecutionEClass_StoryPatternType = this.addETypeParameter(this.storyPatternExecutionEClass,
				"StoryPatternType");
		final ETypeParameter storyPatternInitializationEClass_StoryPatternType = this.addETypeParameter(
				this.storyPatternInitializationEClass, "StoryPatternType");
		final ETypeParameter storyPatternMatchingEClass_StoryPatternType = this.addETypeParameter(this.storyPatternMatchingEClass,
				"StoryPatternType");
		final ETypeParameter storyPatternApplicationEClass_StoryPatternType = this.addETypeParameter(this.storyPatternApplicationEClass,
				"StoryPatternType");
		final ETypeParameter storyPatternObjectExecutionEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectExecutionEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectBoundEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectBoundEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectNotBoundEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectNotBoundEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectBindingRevokedEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectBindingRevokedEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternLinkExecutionEClass_StoryPatternLinkType = this.addETypeParameter(
				this.storyPatternLinkExecutionEClass, "StoryPatternLinkType");
		final ETypeParameter storyPatternLinkExecutionEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternLinkExecutionEClass, "StoryPatternObjectType");
		final ETypeParameter traversingLinkEClass_StoryPatternLinkType = this.addETypeParameter(this.traversingLinkEClass,
				"StoryPatternLinkType");
		final ETypeParameter traversingLinkEClass_StoryPatternObjectType = this.addETypeParameter(this.traversingLinkEClass,
				"StoryPatternObjectType");
		final ETypeParameter linkCheckEClass_StoryPatternLinkType = this.addETypeParameter(this.linkCheckEClass, "StoryPatternLinkType");
		final ETypeParameter linkCheckEClass_StoryPatternObjectType = this
				.addETypeParameter(this.linkCheckEClass, "StoryPatternObjectType");
		final ETypeParameter linkCheckSuccessfulEClass_StoryPatternLinkType = this.addETypeParameter(this.linkCheckSuccessfulEClass,
				"StoryPatternLinkType");
		final ETypeParameter linkCheckSuccessfulEClass_StoryPatternObjectType = this.addETypeParameter(this.linkCheckSuccessfulEClass,
				"StoryPatternObjectType");
		final ETypeParameter linkCheckFailedEClass_StoryPatternLinkType = this.addETypeParameter(this.linkCheckFailedEClass,
				"StoryPatternLinkType");
		final ETypeParameter linkCheckFailedEClass_StoryPatternObjectType = this.addETypeParameter(this.linkCheckFailedEClass,
				"StoryPatternObjectType");
		final ETypeParameter expressionEvaluationEClass_ExpressionType = this.addETypeParameter(this.expressionEvaluationEClass,
				"ExpressionType");
		final ETypeParameter instanceObjectModificationEClass_StoryPatternObjectType = this.addETypeParameter(
				this.instanceObjectModificationEClass, "StoryPatternObjectType");
		final ETypeParameter instanceObjectCreationEClass_StoryPatternObjectType = this.addETypeParameter(
				this.instanceObjectCreationEClass, "StoryPatternObjectType");
		final ETypeParameter instanceObjectDeletionEClass_StoryPatternObjectType = this.addETypeParameter(
				this.instanceObjectDeletionEClass, "StoryPatternObjectType");
		final ETypeParameter instanceLinkModificationEClass_StoryPatternLinkType = this.addETypeParameter(
				this.instanceLinkModificationEClass, "StoryPatternLinkType");
		final ETypeParameter instanceLinkModificationEClass_StoryPatternObjectType = this.addETypeParameter(
				this.instanceLinkModificationEClass, "StoryPatternObjectType");
		final ETypeParameter instanceLinkCreationEClass_StoryPatternLinkType = this.addETypeParameter(this.instanceLinkCreationEClass,
				"StoryPatternLinkType");
		final ETypeParameter instanceLinkCreationEClass_StoryPatternObjectType = this.addETypeParameter(this.instanceLinkCreationEClass,
				"StoryPatternObjectType");
		final ETypeParameter instanceLinkDeletionEClass_StoryPatternLinkType = this.addETypeParameter(this.instanceLinkDeletionEClass,
				"StoryPatternLinkType");
		final ETypeParameter instanceLinkDeletionEClass_StoryPatternObjectType = this.addETypeParameter(this.instanceLinkDeletionEClass,
				"StoryPatternObjectType");
		final ETypeParameter attributeValueSetEClass_StoryPatternObjectType = this.addETypeParameter(this.attributeValueSetEClass,
				"StoryPatternObjectType");
		final ETypeParameter attributeValueSetEClass_FeatureType = this.addETypeParameter(this.attributeValueSetEClass, "FeatureType");
		final ETypeParameter variableModificationEClass_ClassifierType = this.addETypeParameter(this.variableModificationEClass,
				"ClassifierType");
		final ETypeParameter variableCreatedEClass_ClassifierType = this.addETypeParameter(this.variableCreatedEClass, "ClassifierType");
		final ETypeParameter variableDeletedEClass_ClassifierType = this.addETypeParameter(this.variableDeletedEClass, "ClassifierType");
		final ETypeParameter variableChangedEClass_ClassifierType = this.addETypeParameter(this.variableChangedEClass, "ClassifierType");
		final ETypeParameter storyPatternObjectConstraintEvaluationEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectConstraintEvaluationEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectConstraintEvaluationEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternObjectConstraintEvaluationEClass, "ExpressionType");
		final ETypeParameter storyPatternObjectConstraintHoldsEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectConstraintHoldsEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectConstraintHoldsEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternObjectConstraintHoldsEClass, "ExpressionType");
		final ETypeParameter storyPatternObjectConstraintViolatedEClass_StoryPatternObjectType = this.addETypeParameter(
				this.storyPatternObjectConstraintViolatedEClass, "StoryPatternObjectType");
		final ETypeParameter storyPatternObjectConstraintViolatedEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternObjectConstraintViolatedEClass, "ExpressionType");
		final ETypeParameter storyPatternConstraintEvaluationEClass_StoryPatternType = this.addETypeParameter(
				this.storyPatternConstraintEvaluationEClass, "StoryPatternType");
		final ETypeParameter storyPatternConstraintEvaluationEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternConstraintEvaluationEClass, "ExpressionType");
		final ETypeParameter storyPatternConstraintHoldsEClass_StoryPatternType = this.addETypeParameter(
				this.storyPatternConstraintHoldsEClass, "StoryPatternType");
		final ETypeParameter storyPatternConstraintHoldsEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternConstraintHoldsEClass, "ExpressionType");
		final ETypeParameter storyPatternConstraintViolatedEClass_StoryPatternType = this.addETypeParameter(
				this.storyPatternConstraintViolatedEClass, "StoryPatternType");
		final ETypeParameter storyPatternConstraintViolatedEClass_ExpressionType = this.addETypeParameter(
				this.storyPatternConstraintViolatedEClass, "ExpressionType");

		// Set bounds for type parameters

		// Add supertypes to classes
		this.activityExecutionEClass.getESuperTypes().add(this.getExecution());
		this.activityNodeExecutionEClass.getESuperTypes().add(this.getExecution());
		this.activityEdgeTraversalEClass.getESuperTypes().add(this.getExecution());
		this.storyPatternExecutionEClass.getESuperTypes().add(this.getExecution());
		EGenericType g1 = this.createEGenericType(this.getStoryPatternExecution());
		EGenericType g2 = this.createEGenericType(storyPatternInitializationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		this.storyPatternInitializationEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternExecution());
		g2 = this.createEGenericType(storyPatternMatchingEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		this.storyPatternMatchingEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternExecution());
		g2 = this.createEGenericType(storyPatternApplicationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		this.storyPatternApplicationEClass.getEGenericSuperTypes().add(g1);
		this.storyPatternObjectExecutionEClass.getESuperTypes().add(this.getExecution());
		g1 = this.createEGenericType(this.getStoryPatternObjectExecution());
		g2 = this.createEGenericType(storyPatternObjectBoundEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectBoundEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternObjectExecution());
		g2 = this.createEGenericType(storyPatternObjectNotBoundEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectNotBoundEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternObjectExecution());
		g2 = this.createEGenericType(storyPatternObjectBindingRevokedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectBindingRevokedEClass.getEGenericSuperTypes().add(g1);
		this.storyPatternLinkExecutionEClass.getESuperTypes().add(this.getExecution());
		g1 = this.createEGenericType(this.getStoryPatternLinkExecution());
		g2 = this.createEGenericType(traversingLinkEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(traversingLinkEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.traversingLinkEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternLinkExecution());
		g2 = this.createEGenericType(linkCheckEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(linkCheckEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.linkCheckEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getLinkCheck());
		g2 = this.createEGenericType(linkCheckSuccessfulEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(linkCheckSuccessfulEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.linkCheckSuccessfulEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getLinkCheck());
		g2 = this.createEGenericType(linkCheckFailedEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(linkCheckFailedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.linkCheckFailedEClass.getEGenericSuperTypes().add(g1);
		this.expressionEvaluationEClass.getESuperTypes().add(this.getExecution());
		this.instanceObjectModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = this.createEGenericType(this.getInstanceObjectModification());
		g2 = this.createEGenericType(instanceObjectCreationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.instanceObjectCreationEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getInstanceObjectModification());
		g2 = this.createEGenericType(instanceObjectDeletionEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.instanceObjectDeletionEClass.getEGenericSuperTypes().add(g1);
		this.instanceLinkModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = this.createEGenericType(this.getInstanceLinkModification());
		g2 = this.createEGenericType(instanceLinkCreationEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(instanceLinkCreationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.instanceLinkCreationEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getInstanceLinkModification());
		g2 = this.createEGenericType(instanceLinkDeletionEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(instanceLinkDeletionEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.instanceLinkDeletionEClass.getEGenericSuperTypes().add(g1);
		this.attributeValueSetEClass.getESuperTypes().add(this.getExecution());
		this.variableModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = this.createEGenericType(this.getVariableModification());
		g2 = this.createEGenericType(variableCreatedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		this.variableCreatedEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getVariableModification());
		g2 = this.createEGenericType(variableDeletedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		this.variableDeletedEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getVariableModification());
		g2 = this.createEGenericType(variableChangedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		this.variableChangedEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternObjectExecution());
		g2 = this.createEGenericType(storyPatternObjectConstraintEvaluationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectConstraintEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternObjectConstraintEvaluation());
		g2 = this.createEGenericType(storyPatternObjectConstraintHoldsEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(storyPatternObjectConstraintHoldsEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectConstraintHoldsEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternObjectConstraintEvaluation());
		g2 = this.createEGenericType(storyPatternObjectConstraintViolatedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(storyPatternObjectConstraintViolatedEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		this.storyPatternObjectConstraintViolatedEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternExecution());
		g2 = this.createEGenericType(storyPatternConstraintEvaluationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		this.storyPatternConstraintEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternConstraintEvaluation());
		g2 = this.createEGenericType(storyPatternConstraintHoldsEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(storyPatternConstraintHoldsEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		this.storyPatternConstraintHoldsEClass.getEGenericSuperTypes().add(g1);
		g1 = this.createEGenericType(this.getStoryPatternConstraintEvaluation());
		g2 = this.createEGenericType(storyPatternConstraintViolatedEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(storyPatternConstraintViolatedEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		this.storyPatternConstraintViolatedEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		this.initEClass(this.mapEntryEClass, Map.Entry.class, "MapEntry", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				!EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(mapEntryEClass_KeyType);
		this.initEAttribute(this.getMapEntry_Key(), g1, "key", null, 1, 1, Map.Entry.class, !EPackageImpl.IS_TRANSIENT,
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(mapEntryEClass_ValueType);
		this.initEAttribute(this.getMapEntry_Value(), g1, "value", null, 0, 1, Map.Entry.class, !EPackageImpl.IS_TRANSIENT,
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.executionTraceEClass, ExecutionTrace.class, "ExecutionTrace", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEReference(this.getExecutionTrace_Executions(), this.getExecution(), null, "executions", null, 0, -1,
				ExecutionTrace.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecutionTrace_Description(), theEcorePackage.getEString(), "description", null, 0, 1,
				ExecutionTrace.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecutionTrace_TotalExecutionTime(), theEcorePackage.getELong(), "totalExecutionTime", "0", 0, 1,
				ExecutionTrace.class, EPackageImpl.IS_TRANSIENT, EPackageImpl.IS_VOLATILE, !EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecutionTrace_TotalExecutionTimeMsec(), theEcorePackage.getELong(), "totalExecutionTimeMsec", "0", 0,
				1, ExecutionTrace.class, EPackageImpl.IS_TRANSIENT, EPackageImpl.IS_VOLATILE, !EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.executionEClass, Execution.class, "Execution", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getExecution_ExecutionStartedTimeStamp(), theEcorePackage.getELong(), "executionStartedTimeStamp", "0", 1,
				1, Execution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecution_ExecutionFinishedTimeStamp(), theEcorePackage.getELong(), "executionFinishedTimeStamp", "0",
				1, 1, Execution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecution_ExecutionTime(), theEcorePackage.getELong(), "executionTime", "0", 0, 1, Execution.class,
				EPackageImpl.IS_TRANSIENT, EPackageImpl.IS_VOLATILE, !EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExecution_ExecutionTimeMsec(), theEcorePackage.getELong(), "executionTimeMsec", "0", 0, 1,
				Execution.class, EPackageImpl.IS_TRANSIENT, EPackageImpl.IS_VOLATILE, !EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEReference(this.getExecution_Elements(), this.getExecution(), this.getExecution_Container(), "elements", null, 0, -1,
				Execution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEReference(this.getExecution_Container(), this.getExecution(), this.getExecution_Elements(), "container", null, 0, 1,
				Execution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.activityExecutionEClass, ActivityExecution.class, "ActivityExecution", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(activityExecutionEClass_ActivityType);
		this.initEReference(this.getActivityExecution_Activity(), g1, null, "activity", null, 0, 1, ActivityExecution.class,
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(this.getMapEntry());
		g2 = this.createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		this.initEReference(this.getActivityExecution_InParameterValues(), g1, null, "inParameterValues", null, 0, -1,
				ActivityExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(this.getMapEntry());
		g2 = this.createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = this.createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		this.initEReference(this.getActivityExecution_OutParameterValues(), g1, null, "outParameterValues", null, 0, -1,
				ActivityExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.activityNodeExecutionEClass, ActivityNodeExecution.class, "ActivityNodeExecution", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(activityNodeExecutionEClass_ActivityNodeType);
		this.initEReference(this.getActivityNodeExecution_ActivityNode(), g1, null, "activityNode", null, 1, 1,
				ActivityNodeExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.activityEdgeTraversalEClass, ActivityEdgeTraversal.class, "ActivityEdgeTraversal", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(activityEdgeTraversalEClass_ActivityEdgeType);
		this.initEReference(this.getActivityEdgeTraversal_ActivityEdge(), g1, null, "activityEdge", null, 1, 1,
				ActivityEdgeTraversal.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternExecutionEClass, StoryPatternExecution.class, "StoryPatternExecution", EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(storyPatternExecutionEClass_StoryPatternType);
		this.initEReference(this.getStoryPatternExecution_StoryPattern(), g1, null, "storyPattern", null, 1, 1,
				StoryPatternExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternInitializationEClass, StoryPatternInitialization.class, "StoryPatternInitialization",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternMatchingEClass, StoryPatternMatching.class, "StoryPatternMatching", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getStoryPatternMatching_Successful(), theEcorePackage.getEBoolean(), "successful", null, 0, 1,
				StoryPatternMatching.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternApplicationEClass, StoryPatternApplication.class, "StoryPatternApplication",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternObjectExecutionEClass, StoryPatternObjectExecution.class, "StoryPatternObjectExecution",
				EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(storyPatternObjectExecutionEClass_StoryPatternObjectType);
		this.initEReference(this.getStoryPatternObjectExecution_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1,
				StoryPatternObjectExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternObjectBoundEClass, StoryPatternObjectBound.class, "StoryPatternObjectBound",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getStoryPatternObjectBound_Value(), theEcorePackage.getEString(), "value", null, 1, 1,
				StoryPatternObjectBound.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternObjectNotBoundEClass, StoryPatternObjectNotBound.class, "StoryPatternObjectNotBound",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternObjectBindingRevokedEClass, StoryPatternObjectBindingRevoked.class,
				"StoryPatternObjectBindingRevoked", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getStoryPatternObjectBindingRevoked_PreviousValue(), theEcorePackage.getEString(), "previousValue", null,
				1, 1, StoryPatternObjectBindingRevoked.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE,
				EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternLinkExecutionEClass, StoryPatternLinkExecution.class, "StoryPatternLinkExecution",
				EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(storyPatternLinkExecutionEClass_StoryPatternLinkType);
		this.initEReference(this.getStoryPatternLinkExecution_StoryPatternLink(), g1, null, "storyPatternLink", null, 1, 1,
				StoryPatternLinkExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(storyPatternLinkExecutionEClass_StoryPatternObjectType);
		this.initEReference(this.getStoryPatternLinkExecution_SourceStoryPatternObject(), g1, null, "sourceStoryPatternObject", null, 1, 1,
				StoryPatternLinkExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(storyPatternLinkExecutionEClass_StoryPatternObjectType);
		this.initEReference(this.getStoryPatternLinkExecution_TargetStoryPatternObject(), g1, null, "targetStoryPatternObject", null, 1, 1,
				StoryPatternLinkExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getStoryPatternLinkExecution_SourceObject(), theEcorePackage.getEString(), "sourceObject", null, 1, 1,
				StoryPatternLinkExecution.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.traversingLinkEClass, TraversingLink.class, "TraversingLink", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.linkCheckEClass, LinkCheck.class, "LinkCheck", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getLinkCheck_TargetObject(), theEcorePackage.getEString(), "targetObject", null, 0, 1, LinkCheck.class,
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.linkCheckSuccessfulEClass, LinkCheckSuccessful.class, "LinkCheckSuccessful", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.linkCheckFailedEClass, LinkCheckFailed.class, "LinkCheckFailed", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.expressionEvaluationEClass, ExpressionEvaluation.class, "ExpressionEvaluation", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(expressionEvaluationEClass_ExpressionType);
		this.initEReference(this.getExpressionEvaluation_Expression(), g1, null, "expression", null, 0, 1, ExpressionEvaluation.class,
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getExpressionEvaluation_Result(), theEcorePackage.getEString(), "result", null, 1, 1,
				ExpressionEvaluation.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.instanceObjectModificationEClass, InstanceObjectModification.class, "InstanceObjectModification",
				EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(instanceObjectModificationEClass_StoryPatternObjectType);
		this.initEReference(this.getInstanceObjectModification_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1,
				InstanceObjectModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getInstanceObjectModification_InstanceObject(), theEcorePackage.getEString(), "instanceObject", null, 1,
				1, InstanceObjectModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.instanceObjectCreationEClass, InstanceObjectCreation.class, "InstanceObjectCreation",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.instanceObjectDeletionEClass, InstanceObjectDeletion.class, "InstanceObjectDeletion",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.instanceLinkModificationEClass, InstanceLinkModification.class, "InstanceLinkModification",
				EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(instanceLinkModificationEClass_StoryPatternLinkType);
		this.initEReference(this.getInstanceLinkModification_StoryPatternLink(), g1, null, "storyPatternLink", null, 0, 1,
				InstanceLinkModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(instanceLinkModificationEClass_StoryPatternObjectType);
		this.initEReference(this.getInstanceLinkModification_SourceStoryPatternObject(), g1, null, "sourceStoryPatternObject", null, 1, 1,
				InstanceLinkModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(instanceLinkModificationEClass_StoryPatternObjectType);
		this.initEReference(this.getInstanceLinkModification_TargetStoryPatternObject(), g1, null, "targetStoryPatternObject", null, 1, 1,
				InstanceLinkModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getInstanceLinkModification_SourceInstanceObject(), theEcorePackage.getEString(), "sourceInstanceObject",
				null, 1, 1, InstanceLinkModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE,
				EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getInstanceLinkModification_TargetInstanceObject(), theEcorePackage.getEString(), "targetInstanceObject",
				null, 1, 1, InstanceLinkModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE,
				EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.instanceLinkCreationEClass, InstanceLinkCreation.class, "InstanceLinkCreation", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.instanceLinkDeletionEClass, InstanceLinkDeletion.class, "InstanceLinkDeletion", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.attributeValueSetEClass, AttributeValueSet.class, "AttributeValueSet", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(attributeValueSetEClass_StoryPatternObjectType);
		this.initEReference(this.getAttributeValueSet_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1,
				AttributeValueSet.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(attributeValueSetEClass_FeatureType);
		this.initEReference(this.getAttributeValueSet_Feature(), g1, null, "feature", null, 1, 1, AttributeValueSet.class,
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getAttributeValueSet_InstanceObject(), theEcorePackage.getEString(), "instanceObject", null, 1, 1,
				AttributeValueSet.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getAttributeValueSet_NewValue(), theEcorePackage.getEString(), "newValue", null, 1, 1,
				AttributeValueSet.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.variableModificationEClass, VariableModification.class, "VariableModification", EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getVariableModification_VariableName(), theEcorePackage.getEString(), "variableName", null, 1, 1,
				VariableModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		g1 = this.createEGenericType(variableModificationEClass_ClassifierType);
		this.initEReference(this.getVariableModification_Classifier(), g1, null, "classifier", null, 1, 1, VariableModification.class,
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		this.initEAttribute(this.getVariableModification_Value(), theEcorePackage.getEString(), "value", null, 1, 1,
				VariableModification.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.variableCreatedEClass, VariableCreated.class, "VariableCreated", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.variableDeletedEClass, VariableDeleted.class, "VariableDeleted", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.variableChangedEClass, VariableChanged.class, "VariableChanged", !EPackageImpl.IS_ABSTRACT,
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		this.initEAttribute(this.getVariableChanged_OldValue(), theEcorePackage.getEString(), "oldValue", null, 1, 1,
				VariableChanged.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternObjectConstraintEvaluationEClass, StoryPatternObjectConstraintEvaluation.class,
				"StoryPatternObjectConstraintEvaluation", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(storyPatternObjectConstraintEvaluationEClass_ExpressionType);
		this.initEReference(this.getStoryPatternObjectConstraintEvaluation_Constraint(), g1, null, "constraint", null, 1, 1,
				StoryPatternObjectConstraintEvaluation.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE,
				EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternObjectConstraintHoldsEClass, StoryPatternObjectConstraintHolds.class,
				"StoryPatternObjectConstraintHolds", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternObjectConstraintViolatedEClass, StoryPatternObjectConstraintViolated.class,
				"StoryPatternObjectConstraintViolated", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternConstraintEvaluationEClass, StoryPatternConstraintEvaluation.class,
				"StoryPatternConstraintEvaluation", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		g1 = this.createEGenericType(storyPatternConstraintEvaluationEClass_ExpressionType);
		this.initEReference(this.getStoryPatternConstraintEvaluation_Constraint(), g1, null, "constraint", null, 1, 1,
				StoryPatternConstraintEvaluation.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		this.initEClass(this.storyPatternConstraintHoldsEClass, StoryPatternConstraintHolds.class, "StoryPatternConstraintHolds",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.storyPatternConstraintViolatedEClass, StoryPatternConstraintViolated.class, "StoryPatternConstraintViolated",
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		this.createResource(ExecutionTracePackage.eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		this.createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/GenModel</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		final String source = "http://www.eclipse.org/emf/2002/GenModel";
		this.addAnnotation(
				this.getExecutionTrace_TotalExecutionTime(),
				source,
				new String[]
				{
						"documentation",
						"The sum of the execution times of all contained executions in nanoseconds.\r\nConvert this to other time units using the utility functions in \r\nTimeUnits.NANOTIME."
				});
		this.addAnnotation(
				this.getExecutionTrace_TotalExecutionTimeMsec(),
				source,
				new String[]
				{
						"documentation",
						"The sum of the execution times of all contained executions in nanoseconds.\r\nConvert this to other time units using the utility functions in \r\nTimeUnits.NANOTIME."
				});
		this.addAnnotation(this.getExecution_ExecutionTime(), source, new String[]
		{
				"documentation",
				"The execution time in nanoseconds. Convert this to other time units using the\r\nutility functions in TimeUnits.NANOTIME."
		});
	}

} // ExecutionTracePackageImpl

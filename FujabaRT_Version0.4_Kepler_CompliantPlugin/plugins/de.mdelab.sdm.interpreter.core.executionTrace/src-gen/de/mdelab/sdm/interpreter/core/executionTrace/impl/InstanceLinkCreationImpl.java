/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceLinkCreation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Creation</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceLinkCreationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutionTracePackage.Literals.INSTANCE_LINK_CREATION;
	}

} // InstanceLinkCreationImpl

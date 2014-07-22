/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.InstanceObjectDeletion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Object Deletion</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstanceObjectDeletionImpl<StoryPatternObjectType> extends InstanceObjectModificationImpl<StoryPatternObjectType> implements
		InstanceObjectDeletion<StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceObjectDeletionImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_OBJECT_DELETION;
	}

} // InstanceObjectDeletionImpl

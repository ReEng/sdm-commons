/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.LinkCheckFailed;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Link Check Failed</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		LinkCheckImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LinkCheckFailedImpl()
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
		return ExecutionTracePackage.Literals.LINK_CHECK_FAILED;
	}

} // LinkCheckFailedImpl

/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.TraversingLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Traversing Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		StoryPatternLinkExecutionImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		TraversingLink<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TraversingLinkImpl()
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
		return ExecutionTracePackage.Literals.TRAVERSING_LINK;
	}

} // TraversingLinkImpl

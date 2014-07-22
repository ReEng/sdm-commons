/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.StoryPatternObjectConstraintEvaluation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Constraint Evaluation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.StoryPatternObjectConstraintEvaluationImpl#getConstraint
 * <em>Constraint</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class StoryPatternObjectConstraintEvaluationImpl<StoryPatternObjectType, ExpressionType> extends
		StoryPatternObjectExecutionImpl<StoryPatternObjectType> implements
		StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType>
{
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType	constraint;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternObjectConstraintEvaluationImpl()
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
		return ExecutionTracePackage.Literals.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ExpressionType getConstraint()
	{
		if ((this.constraint != null) && ((EObject) this.constraint).eIsProxy())
		{
			final InternalEObject oldConstraint = (InternalEObject) this.constraint;
			this.constraint = (ExpressionType) this.eResolveProxy(oldConstraint);
			if (this.constraint != oldConstraint)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT, oldConstraint, this.constraint));
				}
			}
		}
		return this.constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionType basicGetConstraint()
	{
		return this.constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setConstraint(final ExpressionType newConstraint)
	{
		final ExpressionType oldConstraint = this.constraint;
		this.constraint = newConstraint;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT, oldConstraint, this.constraint));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT:
				if (resolve)
				{
					return this.getConstraint();
				}
				return this.basicGetConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT:
				this.setConstraint((ExpressionType) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT:
				this.setConstraint((ExpressionType) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID)
	{
		switch (featureID)
		{
			case ExecutionTracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT:
				return this.constraint != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryPatternObjectConstraintEvaluationImpl

/**
 */
package de.mdelab.sdm.interpreter.core.executionTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.mdelab.sdm.interpreter.core.executionTrace.ExecutionTracePackage;
import de.mdelab.sdm.interpreter.core.executionTrace.VariableModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.VariableModificationImpl#getVariableName
 * <em>Variable Name</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.VariableModificationImpl#getClassifier
 * <em>Classifier</em>}</li>
 * <li>
 * {@link de.mdelab.sdm.interpreter.core.executionTrace.impl.VariableModificationImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class VariableModificationImpl<ClassifierType> extends ExecutionImpl implements VariableModification<ClassifierType>
{
	/**
	 * The default value of the '{@link #getVariableName()
	 * <em>Variable Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String	VARIABLE_NAME_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getVariableName()
	 * <em>Variable Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String				variableName			= VariableModificationImpl.VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ClassifierType		classifier;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	VALUE_EDEFAULT			= null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String				value					= VariableModificationImpl.VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableModificationImpl()
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
		return ExecutionTracePackage.Literals.VARIABLE_MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getVariableName()
	{
		return this.variableName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setVariableName(final String newVariableName)
	{
		final String oldVariableName = this.variableName;
		this.variableName = newVariableName;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME,
					oldVariableName, this.variableName));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ClassifierType getClassifier()
	{
		if ((this.classifier != null) && ((EObject) this.classifier).eIsProxy())
		{
			final InternalEObject oldClassifier = (InternalEObject) this.classifier;
			this.classifier = (ClassifierType) this.eResolveProxy(oldClassifier);
			if (this.classifier != oldClassifier)
			{
				if (this.eNotificationRequired())
				{
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER,
							oldClassifier, this.classifier));
				}
			}
		}
		return this.classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassifierType basicGetClassifier()
	{
		return this.classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setClassifier(final ClassifierType newClassifier)
	{
		final ClassifierType oldClassifier = this.classifier;
		this.classifier = newClassifier;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER,
					oldClassifier, this.classifier));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getValue()
	{
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValue(final String newValue)
	{
		final String oldValue = this.value;
		this.value = newValue;
		if (this.eNotificationRequired())
		{
			this.eNotify(new ENotificationImpl(this, Notification.SET, ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE, oldValue,
					this.value));
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
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				return this.getVariableName();
			case ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				if (resolve)
				{
					return this.getClassifier();
				}
				return this.basicGetClassifier();
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE:
				return this.getValue();
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
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				this.setVariableName((String) newValue);
				return;
			case ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				this.setClassifier((ClassifierType) newValue);
				return;
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE:
				this.setValue((String) newValue);
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
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				this.setVariableName(VariableModificationImpl.VARIABLE_NAME_EDEFAULT);
				return;
			case ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				this.setClassifier((ClassifierType) null);
				return;
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE:
				this.setValue(VariableModificationImpl.VALUE_EDEFAULT);
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
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				return VariableModificationImpl.VARIABLE_NAME_EDEFAULT == null ? this.variableName != null
						: !VariableModificationImpl.VARIABLE_NAME_EDEFAULT.equals(this.variableName);
			case ExecutionTracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				return this.classifier != null;
			case ExecutionTracePackage.VARIABLE_MODIFICATION__VALUE:
				return VariableModificationImpl.VALUE_EDEFAULT == null ? this.value != null : !VariableModificationImpl.VALUE_EDEFAULT
						.equals(this.value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (this.eIsProxy())
		{
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variableName: ");
		result.append(this.variableName);
		result.append(", value: ");
		result.append(this.value);
		result.append(')');
		return result.toString();
	}

} // VariableModificationImpl

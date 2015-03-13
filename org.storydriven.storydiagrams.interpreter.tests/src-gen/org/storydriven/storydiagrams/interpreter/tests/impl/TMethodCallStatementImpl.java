/**
 */
package org.storydriven.storydiagrams.interpreter.tests.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TMethod Call Statement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl#getText <em>Text</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TMethodCallStatementImpl#getAccessedTarget <em>
 * Accessed Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TMethodCallStatementImpl extends MinimalEObjectImpl.Container implements TMethodCallStatement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessedTarget() <em>Accessed Target</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getAccessedTarget()
	 * @generated
	 * @ordered
	 */
	protected TMethod accessedTarget;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TMethodCallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.TMETHOD_CALL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TMETHOD_CALL_STATEMENT__TEXT, oldText,
					text));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMethod getAccessedTarget() {
		if (accessedTarget != null && accessedTarget.eIsProxy()) {
			InternalEObject oldAccessedTarget = (InternalEObject) accessedTarget;
			accessedTarget = (TMethod) eResolveProxy(oldAccessedTarget);
			if (accessedTarget != oldAccessedTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET, oldAccessedTarget, accessedTarget));
			}
		}
		return accessedTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TMethod basicGetAccessedTarget() {
		return accessedTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAccessedTarget(TMethod newAccessedTarget) {
		TMethod oldAccessedTarget = accessedTarget;
		accessedTarget = newAccessedTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET,
					oldAccessedTarget, accessedTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestsPackage.TMETHOD_CALL_STATEMENT__TEXT:
			return getText();
		case TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET:
			if (resolve)
				return getAccessedTarget();
			return basicGetAccessedTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestsPackage.TMETHOD_CALL_STATEMENT__TEXT:
			setText((String) newValue);
			return;
		case TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET:
			setAccessedTarget((TMethod) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestsPackage.TMETHOD_CALL_STATEMENT__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET:
			setAccessedTarget((TMethod) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestsPackage.TMETHOD_CALL_STATEMENT__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case TestsPackage.TMETHOD_CALL_STATEMENT__ACCESSED_TARGET:
			return accessedTarget != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: "); //$NON-NLS-1$
		result.append(text);
		result.append(')');
		return result.toString();
	}

} // TMethodCallStatementImpl

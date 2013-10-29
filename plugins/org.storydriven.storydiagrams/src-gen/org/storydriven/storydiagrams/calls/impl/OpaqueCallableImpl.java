/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.calls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.OpaqueCallable;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.calls.expressions.MethodCallExpression;
import org.storydriven.storydiagrams.calls.util.CallsValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Opaque Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl#getCallExpression <em>Call Expression</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl#getInParameters <em>In Parameter</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.calls.impl.OpaqueCallableImpl#getOutParameters <em>Out Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueCallableImpl extends CallableImpl implements OpaqueCallable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueCallableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.OPAQUE_CALLABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallsPackage.OPAQUE_CALLABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectResolvingEList<EParameter>(
					EParameter.class, this,
					CallsPackage.OPAQUE_CALLABLE__IN_PARAMETER);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInParameters() {
		return inParameters != null && !inParameters.isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getOutParameters() {
		if (outParameters == null) {
			outParameters = new EObjectResolvingEList<EParameter>(
					EParameter.class, this,
					CallsPackage.OPAQUE_CALLABLE__OUT_PARAMETER);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutParameters() {
		return outParameters != null && !outParameters.isEmpty();
	}

	/**
	 * The cached OCL expression body for the '{@link #NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.oclAsType(Callable).out->size() <= 1";
	/**
	 * The cached OCL invariant for the '{@link #NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression getCallExpression() {
		if (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION)
			return null;
		return (MethodCallExpression) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression basicGetCallExpression() {
		if (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION)
			return null;
		return (MethodCallExpression) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallExpression(
			MethodCallExpression newCallExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCallExpression,
				CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallExpression(MethodCallExpression newCallExpression) {
		if (newCallExpression != eInternalContainer()
				|| (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION && newCallExpression != null)) {
			if (EcoreUtil.isAncestor(this, newCallExpression))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCallExpression != null)
				msgs = ((InternalEObject) newCallExpression)
						.eInverseAdd(
								this,
								CallsExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE,
								MethodCallExpression.class, msgs);
			msgs = basicSetCallExpression(newCallExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION,
					newCallExpression, newCallExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NumberOfOutParams(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CallsPackage.Literals.OPAQUE_CALLABLE);
			try {
				NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
				NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				this)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
						CallsValidator.DIAGNOSTIC_SOURCE,
						CallsValidator.OPAQUE_CALLABLE__NUMBER_OF_OUT_PARAMS,
						EcorePlugin.INSTANCE.getString(
								"_UI_GenericInvariant_diagnostic",
								new Object[] {
										"NumberOfOutParams",
										EObjectValidator.getObjectLabel(this,
												context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCallExpression((MethodCallExpression) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			return basicSetCallExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			return eInternalContainer()
					.eInverseRemove(
							this,
							CallsExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE,
							MethodCallExpression.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__NAME:
			return getName();
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			if (resolve)
				return getCallExpression();
			return basicGetCallExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__NAME:
			setName((String) newValue);
			return;
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			setCallExpression((MethodCallExpression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			setCallExpression((MethodCallExpression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CallsPackage.OPAQUE_CALLABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
			return basicGetCallExpression() != null;
		case CallsPackage.OPAQUE_CALLABLE__IN_PARAMETER:
			return isSetInParameters();
		case CallsPackage.OPAQUE_CALLABLE__OUT_PARAMETER:
			return isSetOutParameters();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case CallsPackage.OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
			return NumberOfOutParams((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} // OpaqueCallableImpl

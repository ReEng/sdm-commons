/**
 */
package org.storydriven.storydiagrams.interpreter.tests.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TInheritanceType;
import org.storydriven.storydiagrams.interpreter.tests.TModifyable;
import org.storydriven.storydiagrams.interpreter.tests.TType;
import org.storydriven.storydiagrams.interpreter.tests.TVisibilityType;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TField</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#getName <em>Name</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#getVisibility <em>Visibility</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#getInheritance <em>Inheritance</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#isStatic <em>Static</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#isTransient <em>Transient</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#isNative <em>Native</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#isStrictfp <em>Strictfp</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#isSynchronized <em>Synchronized</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#getType <em>Type</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TFieldImpl#getContainingType <em>Containing Type
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TFieldImpl extends MinimalEObjectImpl.Container implements TField {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final TVisibilityType VISIBILITY_EDEFAULT = TVisibilityType.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected TVisibilityType visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final TInheritanceType INHERITANCE_EDEFAULT = TInheritanceType.DEFAULT;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected TInheritanceType inheritance = INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICTFP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected boolean strictfp_ = STRICTFP_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TType type;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.TFIELD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TVisibilityType getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVisibility(TVisibilityType newVisibility) {
		TVisibilityType oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__VISIBILITY, oldVisibility,
					visibility));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TInheritanceType getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInheritance(TInheritanceType newInheritance) {
		TInheritanceType oldInheritance = inheritance;
		inheritance = newInheritance == null ? INHERITANCE_EDEFAULT : newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__INHERITANCE, oldInheritance,
					inheritance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__TRANSIENT, oldTransient,
					transient_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__NATIVE, oldNative, native_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isStrictfp() {
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStrictfp(boolean newStrictfp) {
		boolean oldStrictfp = strictfp_;
		strictfp_ = newStrictfp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__STRICTFP, oldStrictfp, strictfp_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__SYNCHRONIZED, oldSynchronized,
					synchronized_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (TType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestsPackage.TFIELD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(TType newType) {
		TType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TType getContainingType() {
		if (eContainerFeatureID() != TestsPackage.TFIELD__CONTAINING_TYPE)
			return null;
		return (TType) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainingType(TType newContainingType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainingType, TestsPackage.TFIELD__CONTAINING_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingType(TType newContainingType) {
		if (newContainingType != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.TFIELD__CONTAINING_TYPE && newContainingType != null)) {
			if (EcoreUtil.isAncestor(this, newContainingType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingType != null)
				msgs = ((InternalEObject) newContainingType).eInverseAdd(this, TestsPackage.TTYPE__FIELDS, TType.class,
						msgs);
			msgs = basicSetContainingType(newContainingType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TFIELD__CONTAINING_TYPE,
					newContainingType, newContainingType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingType((TType) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			return basicSetContainingType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TTYPE__FIELDS, TType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestsPackage.TFIELD__NAME:
			return getName();
		case TestsPackage.TFIELD__VISIBILITY:
			return getVisibility();
		case TestsPackage.TFIELD__INHERITANCE:
			return getInheritance();
		case TestsPackage.TFIELD__STATIC:
			return isStatic();
		case TestsPackage.TFIELD__TRANSIENT:
			return isTransient();
		case TestsPackage.TFIELD__NATIVE:
			return isNative();
		case TestsPackage.TFIELD__STRICTFP:
			return isStrictfp();
		case TestsPackage.TFIELD__SYNCHRONIZED:
			return isSynchronized();
		case TestsPackage.TFIELD__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			return getContainingType();
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
		case TestsPackage.TFIELD__NAME:
			setName((String) newValue);
			return;
		case TestsPackage.TFIELD__VISIBILITY:
			setVisibility((TVisibilityType) newValue);
			return;
		case TestsPackage.TFIELD__INHERITANCE:
			setInheritance((TInheritanceType) newValue);
			return;
		case TestsPackage.TFIELD__STATIC:
			setStatic((Boolean) newValue);
			return;
		case TestsPackage.TFIELD__TRANSIENT:
			setTransient((Boolean) newValue);
			return;
		case TestsPackage.TFIELD__NATIVE:
			setNative((Boolean) newValue);
			return;
		case TestsPackage.TFIELD__STRICTFP:
			setStrictfp((Boolean) newValue);
			return;
		case TestsPackage.TFIELD__SYNCHRONIZED:
			setSynchronized((Boolean) newValue);
			return;
		case TestsPackage.TFIELD__TYPE:
			setType((TType) newValue);
			return;
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			setContainingType((TType) newValue);
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
		case TestsPackage.TFIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestsPackage.TFIELD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case TestsPackage.TFIELD__INHERITANCE:
			setInheritance(INHERITANCE_EDEFAULT);
			return;
		case TestsPackage.TFIELD__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case TestsPackage.TFIELD__TRANSIENT:
			setTransient(TRANSIENT_EDEFAULT);
			return;
		case TestsPackage.TFIELD__NATIVE:
			setNative(NATIVE_EDEFAULT);
			return;
		case TestsPackage.TFIELD__STRICTFP:
			setStrictfp(STRICTFP_EDEFAULT);
			return;
		case TestsPackage.TFIELD__SYNCHRONIZED:
			setSynchronized(SYNCHRONIZED_EDEFAULT);
			return;
		case TestsPackage.TFIELD__TYPE:
			setType((TType) null);
			return;
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			setContainingType((TType) null);
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
		case TestsPackage.TFIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestsPackage.TFIELD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case TestsPackage.TFIELD__INHERITANCE:
			return inheritance != INHERITANCE_EDEFAULT;
		case TestsPackage.TFIELD__STATIC:
			return static_ != STATIC_EDEFAULT;
		case TestsPackage.TFIELD__TRANSIENT:
			return transient_ != TRANSIENT_EDEFAULT;
		case TestsPackage.TFIELD__NATIVE:
			return native_ != NATIVE_EDEFAULT;
		case TestsPackage.TFIELD__STRICTFP:
			return strictfp_ != STRICTFP_EDEFAULT;
		case TestsPackage.TFIELD__SYNCHRONIZED:
			return synchronized_ != SYNCHRONIZED_EDEFAULT;
		case TestsPackage.TFIELD__TYPE:
			return type != null;
		case TestsPackage.TFIELD__CONTAINING_TYPE:
			return getContainingType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TModifyable.class) {
			switch (derivedFeatureID) {
			case TestsPackage.TFIELD__VISIBILITY:
				return TestsPackage.TMODIFYABLE__VISIBILITY;
			case TestsPackage.TFIELD__INHERITANCE:
				return TestsPackage.TMODIFYABLE__INHERITANCE;
			case TestsPackage.TFIELD__STATIC:
				return TestsPackage.TMODIFYABLE__STATIC;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TModifyable.class) {
			switch (baseFeatureID) {
			case TestsPackage.TMODIFYABLE__VISIBILITY:
				return TestsPackage.TFIELD__VISIBILITY;
			case TestsPackage.TMODIFYABLE__INHERITANCE:
				return TestsPackage.TFIELD__INHERITANCE;
			case TestsPackage.TMODIFYABLE__STATIC:
				return TestsPackage.TFIELD__STATIC;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(", inheritance: "); //$NON-NLS-1$
		result.append(inheritance);
		result.append(", static: "); //$NON-NLS-1$
		result.append(static_);
		result.append(", transient: "); //$NON-NLS-1$
		result.append(transient_);
		result.append(", native: "); //$NON-NLS-1$
		result.append(native_);
		result.append(", strictfp: "); //$NON-NLS-1$
		result.append(strictfp_);
		result.append(", synchronized: "); //$NON-NLS-1$
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

} // TFieldImpl

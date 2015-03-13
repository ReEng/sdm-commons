/**
 */
package org.storydriven.storydiagrams.interpreter.tests.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.storydiagrams.interpreter.tests.TClass;
import org.storydriven.storydiagrams.interpreter.tests.TField;
import org.storydriven.storydiagrams.interpreter.tests.TInheritanceType;
import org.storydriven.storydiagrams.interpreter.tests.TInterface;
import org.storydriven.storydiagrams.interpreter.tests.TMethod;
import org.storydriven.storydiagrams.interpreter.tests.TModifyable;
import org.storydriven.storydiagrams.interpreter.tests.TPackage;
import org.storydriven.storydiagrams.interpreter.tests.TType;
import org.storydriven.storydiagrams.interpreter.tests.TVisibilityType;
import org.storydriven.storydiagrams.interpreter.tests.TestsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TClass</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getName <em>Name</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getVisibility <em>Visibility</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getInheritance <em>Inheritance</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#isStatic <em>Static</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getContainingPackage <em>Containing
 * Package</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getContainingType <em>Containing Type
 * </em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getExtendedInterfaces <em>Extended
 * Interfaces</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getTypes <em>Types</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getFields <em>Fields</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getMethods <em>Methods</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.impl.TClassImpl#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TClassImpl extends MinimalEObjectImpl.Container implements TClass {
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
	 * The cached value of the '{@link #getExtendedInterfaces() <em>Extended Interfaces</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExtendedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> extendedInterfaces;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TType> types;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TField> fields;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethod> methods;

	/**
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected TClass extendedClass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.Literals.TCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__VISIBILITY, oldVisibility,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__INHERITANCE, oldInheritance,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TPackage getContainingPackage() {
		if (eContainerFeatureID() != TestsPackage.TCLASS__CONTAINING_PACKAGE)
			return null;
		return (TPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainingPackage(TPackage newContainingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainingPackage, TestsPackage.TCLASS__CONTAINING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingPackage(TPackage newContainingPackage) {
		if (newContainingPackage != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.TCLASS__CONTAINING_PACKAGE && newContainingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newContainingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingPackage != null)
				msgs = ((InternalEObject) newContainingPackage).eInverseAdd(this, TestsPackage.TPACKAGE__TYPES,
						TPackage.class, msgs);
			msgs = basicSetContainingPackage(newContainingPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__CONTAINING_PACKAGE,
					newContainingPackage, newContainingPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TType getContainingType() {
		if (eContainerFeatureID() != TestsPackage.TCLASS__CONTAINING_TYPE)
			return null;
		return (TType) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainingType(TType newContainingType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainingType, TestsPackage.TCLASS__CONTAINING_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingType(TType newContainingType) {
		if (newContainingType != eInternalContainer()
				|| (eContainerFeatureID() != TestsPackage.TCLASS__CONTAINING_TYPE && newContainingType != null)) {
			if (EcoreUtil.isAncestor(this, newContainingType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingType != null)
				msgs = ((InternalEObject) newContainingType).eInverseAdd(this, TestsPackage.TTYPE__TYPES, TType.class,
						msgs);
			msgs = basicSetContainingType(newContainingType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__CONTAINING_TYPE,
					newContainingType, newContainingType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TInterface> getExtendedInterfaces() {
		if (extendedInterfaces == null) {
			extendedInterfaces = new EObjectResolvingEList<TInterface>(TInterface.class, this,
					TestsPackage.TCLASS__EXTENDED_INTERFACES);
		}
		return extendedInterfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<TType>(TType.class, this, TestsPackage.TCLASS__TYPES,
					TestsPackage.TTYPE__CONTAINING_TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<TField>(TField.class, this, TestsPackage.TCLASS__FIELDS,
					TestsPackage.TFIELD__CONTAINING_TYPE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<TMethod>(TMethod.class, this,
					TestsPackage.TCLASS__METHODS, TestsPackage.TMETHOD__CONTAINING_TYPE);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TClass getExtendedClass() {
		if (extendedClass != null && extendedClass.eIsProxy()) {
			InternalEObject oldExtendedClass = (InternalEObject) extendedClass;
			extendedClass = (TClass) eResolveProxy(oldExtendedClass);
			if (extendedClass != oldExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestsPackage.TCLASS__EXTENDED_CLASS,
							oldExtendedClass, extendedClass));
			}
		}
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TClass basicGetExtendedClass() {
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExtendedClass(TClass newExtendedClass) {
		TClass oldExtendedClass = extendedClass;
		extendedClass = newExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.TCLASS__EXTENDED_CLASS,
					oldExtendedClass, extendedClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingPackage((TPackage) otherEnd, msgs);
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainingType((TType) otherEnd, msgs);
		case TestsPackage.TCLASS__TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTypes()).basicAdd(otherEnd, msgs);
		case TestsPackage.TCLASS__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case TestsPackage.TCLASS__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
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
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			return basicSetContainingPackage(null, msgs);
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			return basicSetContainingType(null, msgs);
		case TestsPackage.TCLASS__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case TestsPackage.TCLASS__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case TestsPackage.TCLASS__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
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
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TPACKAGE__TYPES, TPackage.class, msgs);
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			return eInternalContainer().eInverseRemove(this, TestsPackage.TTYPE__TYPES, TType.class, msgs);
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
		case TestsPackage.TCLASS__NAME:
			return getName();
		case TestsPackage.TCLASS__VISIBILITY:
			return getVisibility();
		case TestsPackage.TCLASS__INHERITANCE:
			return getInheritance();
		case TestsPackage.TCLASS__STATIC:
			return isStatic();
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			return getContainingPackage();
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			return getContainingType();
		case TestsPackage.TCLASS__EXTENDED_INTERFACES:
			return getExtendedInterfaces();
		case TestsPackage.TCLASS__TYPES:
			return getTypes();
		case TestsPackage.TCLASS__FIELDS:
			return getFields();
		case TestsPackage.TCLASS__METHODS:
			return getMethods();
		case TestsPackage.TCLASS__EXTENDED_CLASS:
			if (resolve)
				return getExtendedClass();
			return basicGetExtendedClass();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestsPackage.TCLASS__NAME:
			setName((String) newValue);
			return;
		case TestsPackage.TCLASS__VISIBILITY:
			setVisibility((TVisibilityType) newValue);
			return;
		case TestsPackage.TCLASS__INHERITANCE:
			setInheritance((TInheritanceType) newValue);
			return;
		case TestsPackage.TCLASS__STATIC:
			setStatic((Boolean) newValue);
			return;
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			setContainingPackage((TPackage) newValue);
			return;
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			setContainingType((TType) newValue);
			return;
		case TestsPackage.TCLASS__EXTENDED_INTERFACES:
			getExtendedInterfaces().clear();
			getExtendedInterfaces().addAll((Collection<? extends TInterface>) newValue);
			return;
		case TestsPackage.TCLASS__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends TType>) newValue);
			return;
		case TestsPackage.TCLASS__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends TField>) newValue);
			return;
		case TestsPackage.TCLASS__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends TMethod>) newValue);
			return;
		case TestsPackage.TCLASS__EXTENDED_CLASS:
			setExtendedClass((TClass) newValue);
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
		case TestsPackage.TCLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestsPackage.TCLASS__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case TestsPackage.TCLASS__INHERITANCE:
			setInheritance(INHERITANCE_EDEFAULT);
			return;
		case TestsPackage.TCLASS__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			setContainingPackage((TPackage) null);
			return;
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			setContainingType((TType) null);
			return;
		case TestsPackage.TCLASS__EXTENDED_INTERFACES:
			getExtendedInterfaces().clear();
			return;
		case TestsPackage.TCLASS__TYPES:
			getTypes().clear();
			return;
		case TestsPackage.TCLASS__FIELDS:
			getFields().clear();
			return;
		case TestsPackage.TCLASS__METHODS:
			getMethods().clear();
			return;
		case TestsPackage.TCLASS__EXTENDED_CLASS:
			setExtendedClass((TClass) null);
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
		case TestsPackage.TCLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestsPackage.TCLASS__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case TestsPackage.TCLASS__INHERITANCE:
			return inheritance != INHERITANCE_EDEFAULT;
		case TestsPackage.TCLASS__STATIC:
			return static_ != STATIC_EDEFAULT;
		case TestsPackage.TCLASS__CONTAINING_PACKAGE:
			return getContainingPackage() != null;
		case TestsPackage.TCLASS__CONTAINING_TYPE:
			return getContainingType() != null;
		case TestsPackage.TCLASS__EXTENDED_INTERFACES:
			return extendedInterfaces != null && !extendedInterfaces.isEmpty();
		case TestsPackage.TCLASS__TYPES:
			return types != null && !types.isEmpty();
		case TestsPackage.TCLASS__FIELDS:
			return fields != null && !fields.isEmpty();
		case TestsPackage.TCLASS__METHODS:
			return methods != null && !methods.isEmpty();
		case TestsPackage.TCLASS__EXTENDED_CLASS:
			return extendedClass != null;
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
			case TestsPackage.TCLASS__VISIBILITY:
				return TestsPackage.TMODIFYABLE__VISIBILITY;
			case TestsPackage.TCLASS__INHERITANCE:
				return TestsPackage.TMODIFYABLE__INHERITANCE;
			case TestsPackage.TCLASS__STATIC:
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
				return TestsPackage.TCLASS__VISIBILITY;
			case TestsPackage.TMODIFYABLE__INHERITANCE:
				return TestsPackage.TCLASS__INHERITANCE;
			case TestsPackage.TMODIFYABLE__STATIC:
				return TestsPackage.TCLASS__STATIC;
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
		result.append(')');
		return result.toString();
	}

} // TClassImpl

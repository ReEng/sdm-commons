/**
 */
package org.storydriven.storydiagrams.interpreter.tests;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TTyped</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isTransient <em>Transient</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isNative <em>Native</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isStrictfp <em>Strictfp</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isSynchronized <em>Synchronized</em>}</li>
 * <li>{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TTyped extends TNamed, TModifyable {
	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped_Transient()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isTransient
	 * <em>Transient</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped_Native()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isNative <em>Native</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Strictfp</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strictfp</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strictfp</em>' attribute.
	 * @see #setStrictfp(boolean)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped_Strictfp()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isStrictfp();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isStrictfp
	 * <em>Strictfp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Strictfp</em>' attribute.
	 * @see #isStrictfp()
	 * @generated
	 */
	void setStrictfp(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped_Synchronized()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#isSynchronized
	 * <em>Synchronized</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TType)
	 * @see org.storydriven.storydiagrams.interpreter.tests.TestsPackage#getTTyped_Type()
	 * @model required="true"
	 * @generated
	 */
	TType getType();

	/**
	 * Sets the value of the '{@link org.storydriven.storydiagrams.interpreter.tests.TTyped#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TType value);

} // TTyped

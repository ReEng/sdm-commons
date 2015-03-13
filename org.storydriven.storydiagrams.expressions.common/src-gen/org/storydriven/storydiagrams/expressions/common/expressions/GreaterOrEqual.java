/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.storydiagrams.expressions.common.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Or Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.expressions.common.expressions.GreaterOrEqual#getLeft <em>Left</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.expressions.common.expressions.GreaterOrEqual#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.storydiagrams.expressions.common.expressions.ExpressionsPackage#getGreaterOrEqual()
 * @model
 * @generated
 */
public interface GreaterOrEqual extends CExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SomeValue)
   * @see org.storydriven.storydiagrams.expressions.common.expressions.ExpressionsPackage#getGreaterOrEqual_Left()
   * @model containment="true"
   * @generated
   */
  SomeValue getLeft();

  /**
   * Sets the value of the '{@link org.storydriven.storydiagrams.expressions.common.expressions.GreaterOrEqual#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SomeValue value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SomeValue)
   * @see org.storydriven.storydiagrams.expressions.common.expressions.ExpressionsPackage#getGreaterOrEqual_Right()
   * @model containment="true"
   * @generated
   */
  SomeValue getRight();

  /**
   * Sets the value of the '{@link org.storydriven.storydiagrams.expressions.common.expressions.GreaterOrEqual#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SomeValue value);

} // GreaterOrEqual

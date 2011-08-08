/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.common.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.BooleanValue#isValue <em>Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.BooleanValue#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends LExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getBooleanValue_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.common.expressions.BooleanValue#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage#getBooleanValue_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.storydriven.modeling.expressions.common.expressions.BooleanValue#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

} // BooleanValue

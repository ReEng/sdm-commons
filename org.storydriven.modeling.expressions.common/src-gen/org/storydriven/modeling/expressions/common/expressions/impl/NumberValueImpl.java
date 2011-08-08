/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.common.expressions.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.expressions.common.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.common.expressions.NumberValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.impl.NumberValueImpl#getNumValue <em>Num Value</em>}</li>
 *   <li>{@link org.storydriven.modeling.expressions.common.expressions.impl.NumberValueImpl#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberValueImpl extends AExpressionImpl implements NumberValue
{
  /**
   * The default value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal NUM_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected BigDecimal numValue = NUM_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExpressionsPackage.Literals.NUMBER_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getNumValue()
  {
    return numValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumValue(BigDecimal newNumValue)
  {
    BigDecimal oldNumValue = numValue;
    numValue = newNumValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.NUMBER_VALUE__NUM_VALUE, oldNumValue, numValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.NUMBER_VALUE__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpressionsPackage.NUMBER_VALUE__NUM_VALUE:
        return getNumValue();
      case ExpressionsPackage.NUMBER_VALUE__VAR_NAME:
        return getVarName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionsPackage.NUMBER_VALUE__NUM_VALUE:
        setNumValue((BigDecimal)newValue);
        return;
      case ExpressionsPackage.NUMBER_VALUE__VAR_NAME:
        setVarName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExpressionsPackage.NUMBER_VALUE__NUM_VALUE:
        setNumValue(NUM_VALUE_EDEFAULT);
        return;
      case ExpressionsPackage.NUMBER_VALUE__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExpressionsPackage.NUMBER_VALUE__NUM_VALUE:
        return NUM_VALUE_EDEFAULT == null ? numValue != null : !NUM_VALUE_EDEFAULT.equals(numValue);
      case ExpressionsPackage.NUMBER_VALUE__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numValue: ");
    result.append(numValue);
    result.append(", varName: ");
    result.append(varName);
    result.append(')');
    return result.toString();
  }

} //NumberValueImpl

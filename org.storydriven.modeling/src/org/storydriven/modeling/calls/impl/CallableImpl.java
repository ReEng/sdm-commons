/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.calls.impl.CallableImpl#getInParameters <em>In Parameter</em>}</li>
 *   <li>{@link org.storydriven.modeling.calls.impl.CallableImpl#getOutParameters <em>Out Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallableImpl extends CommentableElementImpl implements Callable
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected CallableImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return CallsPackage.Literals.CALLABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract EList<EParameter> getInParameters ();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract EList<EParameter> getOutParameters ();

} // CallableImpl

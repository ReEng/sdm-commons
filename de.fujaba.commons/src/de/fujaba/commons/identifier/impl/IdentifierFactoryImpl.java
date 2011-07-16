/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.commons.identifier.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.fujaba.commons.identifier.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierFactoryImpl extends EFactoryImpl implements IdentifierFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static IdentifierFactory init()
   {
      try
      {
         IdentifierFactory theIdentifierFactory = (IdentifierFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.org/ns/identifier"); //$NON-NLS-1$ 
         if (theIdentifierFactory != null)
         {
            return theIdentifierFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new IdentifierFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IdentifierFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IdentifierPackage getIdentifierPackage()
   {
      return (IdentifierPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static IdentifierPackage getPackage()
   {
      return IdentifierPackage.eINSTANCE;
   }

} //IdentifierFactoryImpl

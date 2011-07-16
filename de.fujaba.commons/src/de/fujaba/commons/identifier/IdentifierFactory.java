/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.commons.identifier;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fujaba.commons.identifier.IdentifierPackage
 * @generated
 */
public interface IdentifierFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   IdentifierFactory eINSTANCE = de.fujaba.commons.identifier.impl.IdentifierFactoryImpl.init();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   IdentifierPackage getIdentifierPackage();

} //IdentifierFactory

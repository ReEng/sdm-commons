/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   PatternFactory eINSTANCE = org.storydriven.modeling.pattern.impl.PatternFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Attribute Expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Attribute Expression</em>'.
    * @generated
    */
   AttributeExpression createAttributeExpression ();

   /**
    * Returns a new object of class '<em>Link</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Link</em>'.
    * @generated
    */
   Link createLink ();

   /**
    * Returns a new object of class '<em>Multi Link</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Multi Link</em>'.
    * @generated
    */
   MultiLink createMultiLink ();

   /**
    * Returns a new object of class '<em>Object Pattern</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Object Pattern</em>'.
    * @generated
    */
   ObjectPattern createObjectPattern ();

   /**
    * Returns a new object of class '<em>Story Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Story Node</em>'.
    * @generated
    */
   StoryNode createStoryNode ();

   /**
    * Returns a new object of class '<em>Path</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Path</em>'.
    * @generated
    */
   Path createPath ();

   /**
    * Returns a new object of class '<em>Object</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Object</em>'.
    * @generated
    */
   Object createObject ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   PatternPackage getPatternPackage ();

} //PatternFactory

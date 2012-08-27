/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.templates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.templates.TemplatesPackage
 * @generated
 */
public interface TemplatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatesFactory eINSTANCE = org.storydriven.storydiagrams.templates.impl.TemplatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Binding</em>'.
	 * @generated
	 */
	TemplateBinding createTemplateBinding();

	/**
	 * Returns a new object of class '<em>Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Binding</em>'.
	 * @generated
	 */
	PropertyBinding createPropertyBinding();

	/**
	 * Returns a new object of class '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Signature</em>'.
	 * @generated
	 */
	TemplateSignature createTemplateSignature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemplatesPackage getTemplatesPackage();

} //TemplatesFactory

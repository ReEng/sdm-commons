/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for the whole story diagram model. The ExtendableElement specifies the extension mechanism that can be used to extend an object by an Extension containing additional attributes and references.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.ExtendableElement#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link org.storydriven.core.ExtendableElement#getExtensions <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.CorePackage#getExtendableElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtendableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.storydriven.core.CorePackage#getExtendableElement_Annotation()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<EAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.Extension}.
	 * It is bidirectional and its opposite is '{@link org.storydriven.core.Extension#getExtendableBase <em>Extendable Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see org.storydriven.core.CorePackage#getExtendableElement_Extension()
	 * @see org.storydriven.core.Extension#getExtendableBase
	 * @model opposite="extendableBase" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.getExtension(this, type);'"
	 * @generated
	 */
	Extension getExtension(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.provideExtension(this, type);'"
	 * @generated
	 */
	Extension provideExtension(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" sourceRequired="true" sourceOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.getAnnotation(this, source);'"
	 * @generated
	 */
	EAnnotation getAnnotation(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" sourceRequired="true" sourceOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.provideAnnotation(this, source);'"
	 * @generated
	 */
	EAnnotation provideAnnotation(String source);

} // ExtendableElement

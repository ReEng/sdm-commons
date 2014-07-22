/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all meta-model elements that may carry a comment in form of a string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.core.CommentableElement#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.core.CorePackage#getCommentableElement()
 * @model abstract="true"
 * @generated
 */
public interface CommentableElement extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * The default value is <code>"\"no comment provided\""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comment string that can be used to attach arbitrary information to CommentableElements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.storydriven.core.CorePackage#getCommentableElement_Comment()
	 * @model default="\"no comment provided\"" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.storydriven.core.CommentableElement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // CommentableElement

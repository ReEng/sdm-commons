/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.expressions.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface BinaryLogicExpressionPropertiesEditionPart {

	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);


	/**
	 * @return the operator
	 * 
	 */
	public Enumerator getOperator();

	/**
	 * Init the operator
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initOperator(EEnum eenum, Enumerator current);

	/**
	 * Defines a new operator
	 * @param newValue the new operator to set
	 * 
	 */
	public void setOperator(Enumerator newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}

/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory;


/**
 * 
 * 
 */
public class PatternsEEFAdapterFactory extends PatternsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createObjectVariableAdapter()
	 * 
	 */
	public Adapter createObjectVariableAdapter() {
		return new ObjectVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createConstraintAdapter()
	 * 
	 */
	public Adapter createConstraintAdapter() {
		return new ConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createLinkConstraintAdapter()
	 * 
	 */
	public Adapter createLinkConstraintAdapter() {
		return new LinkConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createAttributeAssignmentAdapter()
	 * 
	 */
	public Adapter createAttributeAssignmentAdapter() {
		return new AttributeAssignmentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createObjectSetVariableAdapter()
	 * 
	 */
	public Adapter createObjectSetVariableAdapter() {
		return new ObjectSetVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createPrimitiveVariableAdapter()
	 * 
	 */
	public Adapter createPrimitiveVariableAdapter() {
		return new PrimitiveVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createPathAdapter()
	 * 
	 */
	public Adapter createPathAdapter() {
		return new PathPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createLinkVariableAdapter()
	 * 
	 */
	public Adapter createLinkVariableAdapter() {
		return new LinkVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createContainmentRelationAdapter()
	 * 
	 */
	public Adapter createContainmentRelationAdapter() {
		return new ContainmentRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createStoryPatternAdapter()
	 * 
	 */
	public Adapter createStoryPatternAdapter() {
		return new StoryPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createMatchingPatternAdapter()
	 * 
	 */
	public Adapter createMatchingPatternAdapter() {
		return new MatchingPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.storydiagrams.patterns.util.PatternsAdapterFactory#createContainerVariableAdapter()
	 * 
	 */
	public Adapter createContainerVariableAdapter() {
		return new ContainerVariablePropertiesEditionProvider();
	}

}

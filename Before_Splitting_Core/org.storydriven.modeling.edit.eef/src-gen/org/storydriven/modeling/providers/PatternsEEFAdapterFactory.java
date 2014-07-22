/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.patterns.providers.AttributeAssignmentPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.ConstraintPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.ContainerVariablePropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.ContainmentRelationPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.LinkConstraintPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.LinkVariablePropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.MatchingPatternPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.ObjectSetVariablePropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.ObjectVariablePropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.PathPropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.PrimitiveVariablePropertiesEditionProvider;
import org.storydriven.modeling.patterns.providers.StoryPatternPropertiesEditionProvider;
import org.storydriven.modeling.patterns.util.PatternsAdapterFactory;


/**
 * 
 * 
 */
public class PatternsEEFAdapterFactory extends PatternsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createObjectVariableAdapter()
	 * 
	 */
	public Adapter createObjectVariableAdapter() {
		return new ObjectVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createConstraintAdapter()
	 * 
	 */
	public Adapter createConstraintAdapter() {
		return new ConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createLinkConstraintAdapter()
	 * 
	 */
	public Adapter createLinkConstraintAdapter() {
		return new LinkConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createAttributeAssignmentAdapter()
	 * 
	 */
	public Adapter createAttributeAssignmentAdapter() {
		return new AttributeAssignmentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createObjectSetVariableAdapter()
	 * 
	 */
	public Adapter createObjectSetVariableAdapter() {
		return new ObjectSetVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createPrimitiveVariableAdapter()
	 * 
	 */
	public Adapter createPrimitiveVariableAdapter() {
		return new PrimitiveVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createPathAdapter()
	 * 
	 */
	public Adapter createPathAdapter() {
		return new PathPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createLinkVariableAdapter()
	 * 
	 */
	public Adapter createLinkVariableAdapter() {
		return new LinkVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createContainmentRelationAdapter()
	 * 
	 */
	public Adapter createContainmentRelationAdapter() {
		return new ContainmentRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createStoryPatternAdapter()
	 * 
	 */
	public Adapter createStoryPatternAdapter() {
		return new StoryPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createMatchingPatternAdapter()
	 * 
	 */
	public Adapter createMatchingPatternAdapter() {
		return new MatchingPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.patterns.util.PatternsAdapterFactory#createContainerVariableAdapter()
	 * 
	 */
	public Adapter createContainerVariableAdapter() {
		return new ContainerVariablePropertiesEditionProvider();
	}

}

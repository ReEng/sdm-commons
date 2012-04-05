/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.activities.providers.ActivityCallNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.ActivityEdgePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.ActivityPropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.ExceptionVariablePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.JunctionNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.MatchingStoryNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.ModifyingStoryNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.OperationExtensionPropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.StartNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.StatementNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.StopNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.providers.StructuredNodePropertiesEditionProvider;
import org.storydriven.modeling.activities.util.ActivitiesAdapterFactory;


/**
 * 
 * 
 */
public class ActivitiesEEFAdapterFactory extends ActivitiesAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createExceptionVariableAdapter()
	 * 
	 */
	public Adapter createExceptionVariableAdapter() {
		return new ExceptionVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createActivityEdgeAdapter()
	 * 
	 */
	public Adapter createActivityEdgeAdapter() {
		return new ActivityEdgePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createCommentableElementAdapter()
	 * 
	 */
	public Adapter createCommentableElementAdapter() {
		return new CommentableElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createActivityAdapter()
	 * 
	 */
	public Adapter createActivityAdapter() {
		return new ActivityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createOperationExtensionAdapter()
	 * 
	 */
	public Adapter createOperationExtensionAdapter() {
		return new OperationExtensionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createMatchingStoryNodeAdapter()
	 * 
	 */
	public Adapter createMatchingStoryNodeAdapter() {
		return new MatchingStoryNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createStructuredNodeAdapter()
	 * 
	 */
	public Adapter createStructuredNodeAdapter() {
		return new StructuredNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createJunctionNodeAdapter()
	 * 
	 */
	public Adapter createJunctionNodeAdapter() {
		return new JunctionNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createStartNodeAdapter()
	 * 
	 */
	public Adapter createStartNodeAdapter() {
		return new StartNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createStatementNodeAdapter()
	 * 
	 */
	public Adapter createStatementNodeAdapter() {
		return new StatementNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createStopNodeAdapter()
	 * 
	 */
	public Adapter createStopNodeAdapter() {
		return new StopNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createActivityCallNodeAdapter()
	 * 
	 */
	public Adapter createActivityCallNodeAdapter() {
		return new ActivityCallNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.storydriven.modeling.activities.util.ActivitiesAdapterFactory#createModifyingStoryNodeAdapter()
	 * 
	 */
	public Adapter createModifyingStoryNodeAdapter() {
		return new ModifyingStoryNodePropertiesEditionProvider();
	}

}

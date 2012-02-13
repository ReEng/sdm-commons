/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.providers;

import org.eclipse.emf.common.notify.Adapter;
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

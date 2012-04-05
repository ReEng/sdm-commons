/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.activities.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.activities.parts.ActivitiesViewsRepository;
import org.storydriven.modeling.activities.parts.forms.ActivityCallNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.ActivityEdgePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.ActivityPropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.ExceptionVariablePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.JunctionNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.MatchingStoryNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.ModifyingStoryNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.OperationExtensionPropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.StartNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.StatementNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.StopNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.forms.StructuredNodePropertiesEditionPartForm;
import org.storydriven.modeling.activities.parts.impl.ActivityCallNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.ActivityEdgePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.ActivityPropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.ExceptionVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.JunctionNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.MatchingStoryNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.ModifyingStoryNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.OperationExtensionPropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.StartNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.StatementNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.StopNodePropertiesEditionPartImpl;
import org.storydriven.modeling.activities.parts.impl.StructuredNodePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ActivitiesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ActivitiesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ActivitiesViewsRepository.ExceptionVariable.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new ExceptionVariablePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new ExceptionVariablePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.ActivityEdge.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new ActivityEdgePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new ActivityEdgePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.Activity.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new ActivityPropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new ActivityPropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.OperationExtension.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new OperationExtensionPropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new OperationExtensionPropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.MatchingStoryNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new MatchingStoryNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new MatchingStoryNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.StructuredNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new StructuredNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new StructuredNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.JunctionNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new JunctionNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new JunctionNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.StartNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new StartNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new StartNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.StatementNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new StatementNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new StatementNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.StopNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new StopNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new StopNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.ActivityCallNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new ActivityCallNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new ActivityCallNodePropertiesEditionPartForm(component);
		}
		if (key == ActivitiesViewsRepository.ModifyingStoryNode.class) {
			if (kind == ActivitiesViewsRepository.SWT_KIND)
				return new ModifyingStoryNodePropertiesEditionPartImpl(component);
			if (kind == ActivitiesViewsRepository.FORM_KIND)
				return new ModifyingStoryNodePropertiesEditionPartForm(component);
		}
		return null;
	}

}

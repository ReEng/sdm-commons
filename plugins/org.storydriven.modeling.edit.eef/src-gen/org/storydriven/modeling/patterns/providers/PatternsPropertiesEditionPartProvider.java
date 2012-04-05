/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.parts.forms.AttributeAssignmentPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.ConstraintPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.ContainerVariablePropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.ContainmentRelationPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.LinkConstraintPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.LinkVariablePropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.MatchingPatternPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.ObjectSetVariablePropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.ObjectVariablePropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.PathPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.PrimitiveVariablePropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.forms.StoryPatternPropertiesEditionPartForm;
import org.storydriven.modeling.patterns.parts.impl.AttributeAssignmentPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.ConstraintPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.ContainerVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.ContainmentRelationPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.LinkConstraintPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.LinkVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.MatchingPatternPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.ObjectSetVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.ObjectVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.PathPropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.PrimitiveVariablePropertiesEditionPartImpl;
import org.storydriven.modeling.patterns.parts.impl.StoryPatternPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class PatternsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == PatternsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == PatternsViewsRepository.ObjectVariable.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new ObjectVariablePropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new ObjectVariablePropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.Constraint.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new ConstraintPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new ConstraintPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.LinkConstraint.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new LinkConstraintPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new LinkConstraintPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.AttributeAssignment.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new AttributeAssignmentPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new AttributeAssignmentPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.ObjectSetVariable.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new ObjectSetVariablePropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new ObjectSetVariablePropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.PrimitiveVariable.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new PrimitiveVariablePropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new PrimitiveVariablePropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.Path.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new PathPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new PathPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.LinkVariable.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new LinkVariablePropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new LinkVariablePropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.ContainmentRelation.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new ContainmentRelationPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new ContainmentRelationPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.MatchingPattern.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new MatchingPatternPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new MatchingPatternPropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.ContainerVariable.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new ContainerVariablePropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new ContainerVariablePropertiesEditionPartForm(component);
		}
		if (key == PatternsViewsRepository.StoryPattern.class) {
			if (kind == PatternsViewsRepository.SWT_KIND)
				return new StoryPatternPropertiesEditionPartImpl(component);
			if (kind == PatternsViewsRepository.FORM_KIND)
				return new StoryPatternPropertiesEditionPartForm(component);
		}
		return null;
	}

}

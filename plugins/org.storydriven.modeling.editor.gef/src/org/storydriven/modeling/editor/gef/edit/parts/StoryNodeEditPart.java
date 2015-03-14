/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityDeleteEditPolicy;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityNodeEditPolicy;
import org.storydriven.modeling.editor.gef.edit.policies.StoryPatternLayoutEditPolicy;
import org.storydriven.modeling.editor.gef.figures.UMLActivityChopboxAnchor;
import org.storydriven.modeling.editor.gef.figures.UMLStoryActivityFigure;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.PatternsPackage;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StoryNodeEditPart extends AbstractDiagramEditPart
{
   
   /**
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      UMLStoryActivityFigure figure = new UMLStoryActivityFigure();
      figure.setName(getLabelName());
      this.anchor = new UMLActivityChopboxAnchor(figure);
      return figure;
   }

   protected String getLabelName()
   {
      return getRealModel().getName();
   }

   /**
    * @see de.uni_paderborn.fujaba4eclipse.edit.editparts.AbstractBoundedASGEditPart#refreshVisuals()
    */
   @Override
   protected void refreshVisuals()
   {
      UMLStoryActivityFigure fig = (UMLStoryActivityFigure) getFigure();
      fig.setIsForEach(getRealModel().isForEach());
      fig.setName(getLabelName());
      super.refreshVisuals();
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActivityDeleteEditPolicy());
      installEditPolicy(EditPolicy.LAYOUT_ROLE, new StoryPatternLayoutEditPolicy());
      installEditPolicy(EditPolicy.NODE_ROLE, new ActivityNodeEditPolicy());
   }

   @Override
   public StoryNode getRealModel()
   {
      return (StoryNode) super.getRealModel();
   }

   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if(featureID == ActivitiesPackage.MODIFYING_STORY_NODE__FOR_EACH
            || featureID == ActivitiesPackage.MODIFYING_STORY_NODE__NAME
            || featureID == ActivitiesPackage.MODIFYING_STORY_NODE__STORY_PATTERN
            || featureID == ActivitiesPackage.MODIFYING_STORY_NODE__COMMENT)
      {
         refreshVisuals();
      }
      else if(featureID == PatternsPackage.STORY_PATTERN__LINK_VARIABLE
            || featureID == PatternsPackage.STORY_PATTERN__VARIABLE)
      {
         refresh();
      }
      else
      {
         super.notifyChanged(notification);
      }
   }

   @Override
   public void activate()
   {
      super.activate();
      getRealModel().getStoryPattern().eAdapters().add(getModelAdapter());
   }

   @Override
   public void deactivate()
   {
      getRealModel().getStoryPattern().eAdapters().remove(getModelAdapter());
      super.deactivate();
   }

}

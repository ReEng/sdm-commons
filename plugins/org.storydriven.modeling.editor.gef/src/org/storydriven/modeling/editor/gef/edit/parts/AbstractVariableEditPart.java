package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.fujaba.commons.edit.parts.AbstractDiagramEditPart;
import org.fujaba.commons.edit.parts.AbstractNodeViewEditPart;
import org.fujaba.commons.figures.LabelFigure;
import org.fujaba.commons.figures.UMLObjectFigure;
import org.storydriven.modeling.editor.gef.edit.policies.AbstractVariableLayoutEditPolicy;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityDeleteEditPolicy;
import org.storydriven.modeling.editor.gef.edit.policies.StoryPatternNodeEditPolicy;
import org.storydriven.modeling.editor.gef.figures.UMLObjectChopboxAnchor;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.PatternsPackage;


public class AbstractVariableEditPart extends AbstractDiagramEditPart
{
   /**
    * @return No description provided
    * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
    */
   @Override
   protected IFigure createFigure()
   {
      UMLObjectFigure figure = new UMLObjectFigure(null);
      anchor = new UMLObjectChopboxAnchor(figure);
      updateVisuals(figure);
      
      return figure;
   }

   protected void updateVisuals(UMLObjectFigure figure)
   {
      String name = getRealModel().getName();
      if (!"this".equals(name)
            && getRealModel().getBindingState() == BindingState.UNBOUND)
      {
      // add the type only if it is not bound yet
         if(getRealModel().getType() != null)
         {
            name += " : " + getRealModel().getType().getName();
         }
         else
         {
            name += " : null"; 
         }
      }
      figure.setName(name);
      
      
      figure.setBorderColor(ColorConstants.black);
      figure.getNameLabel().setForegroundColor(ColorConstants.black);
      figure.getCreateOrDeleteLabel().setName("");
      figure.getCreateOrDeleteLabel().setForegroundColor(ColorConstants.white);
      figure.setCreateOrDeleteLableVisible(false);
   }

   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActivityDeleteEditPolicy());
      installEditPolicy(EditPolicy.LAYOUT_ROLE, new AbstractVariableLayoutEditPolicy());
      installEditPolicy(EditPolicy.NODE_ROLE, new StoryPatternNodeEditPolicy());
   }

   @Override
   public AbstractVariable getRealModel()
   {
      return (AbstractVariable) super.getRealModel();
   }

   @Override
   protected void refreshVisuals()
   {
      updateVisuals((UMLObjectFigure) getFigure());
      getFigure().revalidate();
      super.refreshVisuals();
      
   }
   
   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(AbstractVariable.class);
      if(featureID == PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION
            || featureID == PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINT)
      {
         refreshChildren();
      }
      super.notifyChanged(notification);
   }
   
   @Override
   protected void addChildVisual(EditPart child, int index)
   {
      EObject model = ((AbstractNodeViewEditPart) child).getRealModel();
      LabelFigure figure = (LabelFigure) ((AbstractGraphicalEditPart) child)
            .getFigure();

      addConstraint(figure, model);
   }


   @Override
   protected void removeChildVisual(EditPart child)
   {
      EObject model = ((AbstractNodeViewEditPart) child).getRealModel();
      LabelFigure figure = (LabelFigure) ((AbstractGraphicalEditPart) child)
            .getFigure();

      removeConstraint(figure, model);
   }
   
   /**
    * @param figure
    * @param model
    */
   private void removeConstraint(LabelFigure child, EObject childModel)
   {
      UMLObjectFigure figure = (UMLObjectFigure) getFigure();

      if (childModel.eContainer() == null
            || childModel instanceof Constraint)
      {
         figure.removeFromAttributes(child);
      }
   }


   /**
    * Adds the given child to the node container.
    * 
    * @param child The child figure to add.
    * @param childModel The model element.
    */
   public void addConstraint(LabelFigure child, EObject childModel)
   {
      UMLObjectFigure figure = (UMLObjectFigure) getFigure();

      if (getRealModel().getBindingExpression() == childModel
            || childModel instanceof Constraint)
      {
         figure.addToAttributes(child);
      }
   }
}

/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.fujaba.commons.figures.UMLObjectFigure;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.CollectionVariable;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PatternsPackage;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ObjectVariableEditPart extends AbstractVariableEditPart
{
   private final static String LABEL_CREATE = "<<create>>";
   private final static String LABEL_DESTROY = "<<destroy>>";

   @Override
   protected void updateVisuals(UMLObjectFigure figure)
   {     
      super.updateVisuals(figure);
      if(getRealModel().getBindingOperator() == BindingOperator.CREATE)
      {
         figure.setBorderColor(ColorConstants.darkGreen);
         figure.getNameLabel().setForegroundColor(ColorConstants.darkGreen);
         figure.getCreateOrDeleteLabel().setName(LABEL_CREATE);
         figure.getCreateOrDeleteLabel().setForegroundColor(
               ColorConstants.darkGreen);
         figure.setCreateOrDeleteLableVisible(true);
         figure.setIsNegative(false);
      }
      else if(getRealModel().getBindingOperator() == BindingOperator.DESTROY)
      {
         figure.setBorderColor(ColorConstants.red);
         figure.getNameLabel().setForegroundColor(ColorConstants.red);
         figure.getCreateOrDeleteLabel().setName(LABEL_DESTROY);
         figure.getCreateOrDeleteLabel().setForegroundColor(ColorConstants.red);
         figure.setCreateOrDeleteLableVisible(true);
         figure.setIsNegative(false);
      }
      else if(getRealModel().getBindingSemantics() == BindingSemantics.NEGATIVE)
      {
         figure.setBorderColor(ColorConstants.black);
         figure.getNameLabel().setForegroundColor(ColorConstants.black);
         figure.getCreateOrDeleteLabel().setName("");
         figure.getCreateOrDeleteLabel().setForegroundColor(
               ColorConstants.white);
         figure.setCreateOrDeleteLableVisible(false);
         figure.setIsNegative(true);
      }
      else
      {
         figure.setBorderColor(ColorConstants.black);
         figure.getNameLabel().setForegroundColor(ColorConstants.black);
         figure.getCreateOrDeleteLabel().setName("");
         figure.getCreateOrDeleteLabel().setForegroundColor(
               ColorConstants.white);
         figure.setCreateOrDeleteLableVisible(false);
         figure.setIsNegative(false);
      }
      
      if(this.getRealModel() instanceof CollectionVariable)
      {
         figure.setIsSet(true);
      }
   }
   
   
   @Override
   public ObjectVariable getRealModel()
   {
      return (ObjectVariable) super.getRealModel();
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(AbstractVariable.class);
      if(featureID == PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT
            || featureID == PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR
            || featureID == PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS
            || featureID == PatternsPackage.OBJECT_VARIABLE__BINDING_STATE
            || featureID == PatternsPackage.OBJECT_VARIABLE__CLASSIFIER
            || featureID == PatternsPackage.OBJECT_VARIABLE__NAME
            || featureID == PatternsPackage.COLLECTION_VARIABLE__ATTRIBUTE_ASSIGNMENT
            || featureID == PatternsPackage.COLLECTION_VARIABLE__BINDING_OPERATOR
            || featureID == PatternsPackage.COLLECTION_VARIABLE__BINDING_SEMANTICS
            || featureID == PatternsPackage.COLLECTION_VARIABLE__BINDING_STATE
            || featureID == PatternsPackage.COLLECTION_VARIABLE__CLASSIFIER
            || featureID == PatternsPackage.COLLECTION_VARIABLE__NAME)
      {
         refreshVisuals();
      }

      super.notifyChanged(notification);
   }

}

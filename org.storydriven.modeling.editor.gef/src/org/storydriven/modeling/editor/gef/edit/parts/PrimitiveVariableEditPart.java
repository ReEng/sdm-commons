/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.fujaba.commons.figures.UMLObjectFigure;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.PatternsPackage;



/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class PrimitiveVariableEditPart extends AbstractVariableEditPart
{

   @Override
   protected void updateVisuals(UMLObjectFigure figure)
   {
      super.updateVisuals(figure);
      
      String name = getRealModel().getName();
      String type = getRealModel().getType() != null ? getRealModel().getType().getName() : "no Type";
      
      name = type + " : " + name;
      Expression expr = getRealModel().getBindingExpression();
      if (expr != null)
      {
         name += " := " + Expr2String.toString(expr);
      }
      
      figure.setName(name);
   }

   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if(featureID == PatternsPackage.PRIMITIVE_VARIABLE__BINDING_EXPRESSION
            || featureID == PatternsPackage.PRIMITIVE_VARIABLE__BINDING_STATE
            || featureID == PatternsPackage.PRIMITIVE_VARIABLE__CLASSIFIER
            || featureID == PatternsPackage.PRIMITIVE_VARIABLE__CONSTRAINT
            || featureID == PatternsPackage.PRIMITIVE_VARIABLE__NAME)
      {
         refreshVisuals();
      }
      else
      {
         super.notifyChanged(notification);
      }
   }


}

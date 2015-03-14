/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.fujaba.commons.edit.parts.AbstractEdgeEditPart;
import org.fujaba.commons.figures.CrossFigure;
import org.fujaba.commons.figures.DoublePolylineConnection;
import org.fujaba.commons.figures.utils.ConnectionDecorationFactory;
import org.fujaba.commons.notation.Edge;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.Path;
import org.storydriven.storydiagrams.patterns.PatternsPackage;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class LinkVariableEditPart extends AbstractEdgeEditPart
{
   public static final String LABEL_FRENCH_QUOTES_LEFT = "\u00ab"; // guillements
   
   public static final String LABEL_FRENCH_QUOTES_RIGHT = "\u00bb"; // guillements

   public static final String LABEL_CREATE = LABEL_FRENCH_QUOTES_LEFT
         + "create" + LABEL_FRENCH_QUOTES_RIGHT;
   
   public static final String LABEL_DESTROY = LABEL_FRENCH_QUOTES_LEFT
         + "destroy" + LABEL_FRENCH_QUOTES_RIGHT;

   public static final String LABEL_DELETE = LABEL_FRENCH_QUOTES_LEFT
         + "delete" + LABEL_FRENCH_QUOTES_RIGHT;
   
   
   private CrossFigure crossFigure = null;
   private ConnectionLocator crossLocator = null;
   
   @Override
   protected IFigure createFigure()
   {
      if(getRealModel() instanceof Path)
      {
         this.connection = new DoublePolylineConnection();
      }
      else
      {
         connection = new PolylineConnection();
      }   
      
      connection.setTargetDecoration(ConnectionDecorationFactory.createDecoration(ConnectionDecorationFactory.OPEN_ARROW));
      
      setFigure(connection);
      
      updateFigure();
      return figure;
   }

   @Override
   public AbstractLinkVariable getRealModel()
   {
      return (AbstractLinkVariable) super.getRealModel();
   }
   
   protected void updateFigure()
   {
      AbstractLinkVariable var = getRealModel();
      
      
      
      if (var.getBindingSemantics() == BindingSemantics.OPTIONAL)
      {
        connection.setLineStyle(SWT.LINE_DASH);
      }
      else
      {
        connection.setLineStyle(SWT.LINE_SOLID);
      }
      
      
      if (var.getBindingOperator() == BindingOperator.CREATE)
      {
         Color c = ColorConstants.darkGreen;
         connection.setForegroundColor(c);
         this.placeReadingDirectionArrow(true, c, c);
         this.placeLabel(LABEL_CREATE + "\n" + this.getLinkName());
      }
      else if (var.getBindingOperator() == BindingOperator.DESTROY)
      {
         Color c = ColorConstants.red;
         connection.setForegroundColor(c);
         this.placeReadingDirectionArrow(true, c, c);
         this.placeLabel(LABEL_DESTROY + "\n" + this.getLinkName());
      }
      else
      {
         connection.setForegroundColor(ColorConstants.black);
         this.placeReadingDirectionArrow(true);
         this.placeLabel(this.getLinkName());
      }

      
      if (var.getBindingSemantics() == BindingSemantics.NEGATIVE)
      {
       if (crossFigure == null)
       {
          crossFigure = new CrossFigure();
          crossLocator = new ConnectionLocator (
                  connection, ConnectionLocator.MIDDLE);
       }
         connection.add(crossFigure, crossLocator, -1);
      }
      else if (crossFigure != null && crossFigure.getParent() == connection)
      {
       connection.remove(crossFigure);
      }
   }
   
   /**
    * Get the linkName attribute of the UMLConnectionEditPart object
    *
    * @return   The linkName value
    */
   protected String getLinkName()
   {
      String name = getRealModel().getName();
      if(getRealModel() instanceof LinkVariable)
      {
         LinkVariable var = (LinkVariable) getRealModel();
         if(var.getTargetEnd() != null)
         {
            name = "ERef: " + var.getTargetEnd().getName();
         }
         else
         {
            name = "ERef: null, Name: " + name;
         }

         if (var.getQualifierExpression() != null)
         {
            name += "[" + Expr2String.toString(var.getQualifierExpression()) + "]";
         }
      }

      return  name;
   }
   
   @Override
   public void notifyChanged(Notification notification)
   {
      int featureID = notification.getFeatureID(Edge.class);
      if (featureID == PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR
            || featureID == PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS
            || featureID == PatternsPackage.LINK_VARIABLE__NAME
            || featureID == PatternsPackage.LINK_VARIABLE__FIRST_LINK_CONSTRAINT
            || featureID == PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION
            || featureID == PatternsPackage.LINK_VARIABLE__SECOND_LINK_CONSTRAINT
            || featureID == PatternsPackage.LINK_VARIABLE__SOURCE_END
            || featureID == PatternsPackage.LINK_VARIABLE__TARGET_END)
      {
         refresh();
         updateFigure();
      }
   }
}

/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.storydriven.modeling.editor.gef.figures.RhombChopboxAnchor;
import org.storydriven.modeling.editor.gef.figures.UMLNopActivityFigure;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class JunctionNodeEditPart extends ActivityNodeEditPart
{

   @Override
   protected IFigure createFigure()
   {
      UMLNopActivityFigure figure = new UMLNopActivityFigure();
      anchor = new RhombChopboxAnchor (figure);
      return figure;
   }
   
   /**
    * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
    */
   @Override
   protected void createEditPolicies()
   {
      super.createEditPolicies();
   }

}

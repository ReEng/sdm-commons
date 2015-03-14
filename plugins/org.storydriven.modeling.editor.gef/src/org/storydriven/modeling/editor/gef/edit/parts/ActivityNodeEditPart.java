/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.fujaba.commons.edit.parts.AbstractNodeEditPart;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityDeleteEditPolicy;
import org.storydriven.modeling.editor.gef.edit.policies.ActivityNodeEditPolicy;
import org.storydriven.storydiagrams.activities.ActivityNode;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class ActivityNodeEditPart extends AbstractNodeEditPart
{
   @Override
   public ActivityNode getRealModel()
   {
      return (ActivityNode) super.getRealModel();
   }

   @Override
   protected void createEditPolicies()
   {
      installEditPolicy(EditPolicy.NODE_ROLE, new ActivityNodeEditPolicy());
      installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActivityDeleteEditPolicy());
   }
}

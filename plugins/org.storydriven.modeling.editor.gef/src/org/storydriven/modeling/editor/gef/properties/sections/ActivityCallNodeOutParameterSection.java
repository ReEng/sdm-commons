/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ActivityCallNodeOutParameterSection extends AbstractActivityCallNodeParameterSection
{
   private final static String LABEL = "Out Parameters";

   @Override
   public void refresh()
   {
      super.refresh();
      // fill viewer
      if (hasCallee())
      {
         getViewer().setInput(getElement().getCallee().getOutParameters());
      }
   }

   
   @Override
   protected String getLabelText()
   {
      return LABEL;
   }
}

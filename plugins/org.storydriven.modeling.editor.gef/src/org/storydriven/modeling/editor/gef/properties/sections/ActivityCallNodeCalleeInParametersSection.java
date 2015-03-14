package org.storydriven.modeling.editor.gef.properties.sections;




/**
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public class ActivityCallNodeCalleeInParametersSection extends AbstractActivityCallNodeParameterSection
{
   private final static String LABEL = "In Parameters";
   
   @Override
   public void refresh()
   {
      super.refresh();
      
      // fill viewer
      if (hasCallee())
      {
         getViewer().setInput(getElement().getCallee().getInParameters());
      }
   }
   
   
   @Override
   protected String getLabelText()
   {
      return LABEL;
   }
}

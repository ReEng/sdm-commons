/*
* generated by Xtext
*/
package org.storydriven.storydiagrams.expressions.common.ui.labeling;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class ExpressionsDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

   @Override
   public Object text(IEObjectDescription element)
   {
      return element.getEClass().getName() + super.text(element);
   }

/*
	//Labels and icons can be computed like this:
	
	String text(IEObjectDescription ele) {
	  return "my "+ele.getName();
	}
	 
    String image(IEObjectDescription ele) {
      return ele.getEClass().getName() + ".gif";
    }	 
*/

}

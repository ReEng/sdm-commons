/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.fujaba.commons.properties.section.AbstractTextSection;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.TextualExpression;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
abstract public class ExpressionSection extends AbstractTextSection
{

   abstract protected Expression getExpression();
   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getErrorMessage()
    */
   @Override
   protected String getErrorMessage()
   {
      return null;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getFeatureAsString()
    */
   @Override
   protected String getFeatureAsString()
   {
      Expression expr = getExpression();
      if(expr == null)
      {
         return "";
      }
      String string = Expr2String.toString(expr);
      if (string == null)
      {
         return ""; //$NON-NLS-1$
      }
      return string;
   }


   @Override
   protected boolean isTextValid()
   {
      return true;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getNewFeatureValue(java.lang.String)
    */
   @Override
   protected Object getNewFeatureValue(String text)
   {
      Expression expression = getExpression();
      if(expression instanceof TextualExpression)
      {
         TextualExpression te = (TextualExpression) expression;
         if(te.getExpressionText() != null && te.getExpressionText().equals(text))
         {
            //same value
            return te;
         }
      }
      
      if("".equals(text))
      {
         return null;
      }
      
      TextualExpression expr = ExpressionsFactory.eINSTANCE.createTextualExpression();
      expr.setExpressionText(text);
      expr.setLanguage("OCL");
      return expr;
   }

   

   @Override
   public void refresh()
   {
      super.refresh();
      
      if(getExpression() != null 
            && !(getExpression() instanceof TextualExpression))
      {
         setErrorMessage("Editing of non-OCL expressions is not supported.");
         getText().setEnabled(false);
      }
   }
   @Override
   protected EStructuralFeature getFeature()
   {
      // TODO Auto-generated method stub
      return null;
   }
   @Override
   protected String getLabelText()
   {
      // TODO Auto-generated method stub
      return null;
   }
   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getOldFeatureValue()
    */
   @Override
   protected Object getOldFeatureValue()
   {
      return getExpression();
   }
}

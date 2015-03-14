/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.storydiagrams.patterns.Constraint;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class ConstraintExpressionSection extends ExpressionSection
{

   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getElement()
    */
   @Override
   protected Constraint getElement()
   {
      return (Constraint) super.getElement();
   }

   
   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getNewFeatureValue(java.lang.String)
    */
   @Override
   protected Object getNewFeatureValue(String text)
   {
      Expression expression = getElement() == null ? null : (Expression) getElement().getConstraintExpression();
      if(expression instanceof TextualExpression)
      {
         TextualExpression te = (TextualExpression) expression;
         if(te.getExpressionText() != null && te.getExpressionText().equals(text))
         {
            //same value
            return te;
         }
      }
      
      String exprString = Expr2String.toString(expression);
      if(expression != null && exprString != null && exprString.equals(text))
      {
         return expression;
      }
      
      if("".equals(text))
      {
         text = null;
      }
      
      TextualExpression expr = ExpressionsFactory.eINSTANCE.createTextualExpression();
      expr.setExpressionText(text);
      expr.setLanguage("OCL");
      return expr;
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getOldFeatureValue()
    */
   @Override
   protected Object getOldFeatureValue()
   {
      return getElement().getConstraintExpression();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractTextSection#getTooltip()
    */
   @Override
   protected String getTooltip()
   {
      return "OCL constraint expression";
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getFeature()
    */
   @Override
   protected EStructuralFeature getFeature()
   {
      return PatternsPackage.eINSTANCE.getConstraint_ConstraintExpression();
   }


   /**
    * @see org.fujaba.commons.properties.section.AbstractSection#getLabelText()
    */
   @Override
   protected String getLabelText()
   {
      return "OCL Constraint";
   }


   @Override
   protected Expression getExpression()
   {
      return getElement().getConstraintExpression();
   }

}

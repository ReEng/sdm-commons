package org.storydriven.modeling.editor.gef.utils;

import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.BinaryExpression;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.common.UnaryOperator;
import org.storydriven.storydiagrams.calls.expressions.ParameterExpression;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.CollectionSizeExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;

public abstract class Expr2String
{
   public static String toString(Expression e)
   {
      if(e instanceof AttributeValueExpression)
      {
         return attrValueExpr((AttributeValueExpression)e);
      }
      else if(e instanceof BinaryExpression)
      {
         return binExpr((BinaryExpression)e);
      }
      else if(e instanceof LiteralExpression)
      {
         return litExpr((LiteralExpression)e);
      }
      else if(e instanceof UnaryExpression)
      {
         return unaryExpr((UnaryExpression) e);
      }
      else if(e instanceof CollectionSizeExpression)
      {
         return objSetExpr((CollectionSizeExpression)e);
      }
      else if(e instanceof ObjectVariableExpression)
      {
         return objExpr((ObjectVariableExpression)e);
      }
      else if(e instanceof PrimitiveVariableExpression)
      {
         return primExpr((PrimitiveVariableExpression)e);
      }
      else if(e instanceof ParameterExpression)
      {
         return paramExpr((ParameterExpression)e);
      }
      else if(e instanceof TextualExpression)
      {
         return textExpr((TextualExpression)e);
      }
      return "some Expression";
   }

   private static String primExpr(PrimitiveVariableExpression e)
   {
      return e.getPrimitiveVariable().getName();
   }

   private static String textExpr(TextualExpression e)
   {
      return e.getExpressionText();
   }

   private static String paramExpr(ParameterExpression e)
   {
      return e.getParameter().getParameter().getName();
   }

   private static String objExpr(ObjectVariableExpression e)
   {
      return e.getObject().getName();
   }

   private static String objSetExpr(CollectionSizeExpression e)
   {
      return e.getSet().getName();
   }

   private static String litExpr(LiteralExpression e)
   {
      return e.getValue();
   }

   private static String binExpr(BinaryExpression e)
   {
      if(e instanceof ArithmeticExpression)
      {
         return arithExpr((ArithmeticExpression)e);
      }
      else if(e instanceof LogicalExpression)
      {
         return binLogExpr((LogicalExpression)e);
      }
      else if(e instanceof ComparisonExpression)
      {
         return compExpr((ComparisonExpression)e);
      }
      return null;
   }

   private static String compExpr(ComparisonExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(ComparingOperator.EQUAL))
      {
         operator = "==";
      }
      else if(e.getOperator().equals(ComparingOperator.GREATER))
      {
         operator = ">";
      }
      else if(e.getOperator().equals(ComparingOperator.GREATER_OR_EQUAL))
      {
         operator = ">=";
      } 
      else if(e.getOperator().equals(ComparingOperator.LESS))
      {
         operator = "<";
      } 
      else if(e.getOperator().equals(ComparingOperator.LESS_OR_EQUAL))
      {
         operator = "<=";
      }
      else if(e.getOperator().equals(ComparingOperator.UNEQUAL))
      {
         operator = "!=";
      }
      else if(e.getOperator().equals(ComparingOperator.REGULAR_EXPRESSION))
      {
         operator = " ->regex-> ";
      }
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }

   private static String binLogExpr(LogicalExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(LogicOperator.AND))
      {
         operator = "AND";
      }
      else if(e.getOperator().equals(LogicOperator.EQUIVALENT))
      {
         operator = "EQUALS";
      }
      else if(e.getOperator().equals(LogicOperator.IMPLY))
      {
         operator = "IMPLY";
      }
      else if(e.getOperator().equals(LogicOperator.OR))
      {
         operator = "OR";
      } 
      else if(e.getOperator().equals(LogicOperator.XOR))
      {
         operator = "XOR";
      } 
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }

   private static String arithExpr(ArithmeticExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(ArithmeticOperator.DIVIDE))
      {
         operator = "/";
      }
//      else if(e.getOperator().equals(ArithmeticOperator.EXP))
//      {
//         operator = "^";
//      }
      else if(e.getOperator().equals(ArithmeticOperator.MINUS))
      {
         operator = "-";
      }
      else if(e.getOperator().equals(ArithmeticOperator.MODULO))
      {
         operator = "%";
      } 
      else if(e.getOperator().equals(ArithmeticOperator.PLUS))
      {
         operator = "+";
      }
      else if(e.getOperator().equals(ArithmeticOperator.TIMES))
      {
         operator = "*";
      }
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }
   
   private static String unaryExpr(UnaryExpression e)
   {
		String operator = null;
		if (e.getOperator().equals(UnaryOperator.NOT))
		{
			operator = "NOT";
		}
		else if (e.getOperator().equals(UnaryOperator.PLUS))
		{
			operator = "+";
		} else if (e.getOperator().equals(UnaryOperator.MINUS))
		{
			operator = "-";
		}
		return operator + "(" + toString(e.getEnclosedExpression()) + ")";
   }

   private static String attrValueExpr(AttributeValueExpression e)
   {
      return e.getObject().getName() + "." + e.getAttribute().getName();
   }
}

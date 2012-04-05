/**
 * 
 */
package org.storydriven.modeling.editor.gef.utils;

import org.fujaba.commons.utils.Class2EClassRegistry;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.impl.ActivityCallNodeImpl;
import org.storydriven.modeling.activities.impl.ActivityEdgeImpl;
import org.storydriven.modeling.activities.impl.JunctionNodeImpl;
import org.storydriven.modeling.activities.impl.ModifyingStoryNodeImpl;
import org.storydriven.modeling.activities.impl.StartNodeImpl;
import org.storydriven.modeling.activities.impl.StatementNodeImpl;
import org.storydriven.modeling.activities.impl.StopNodeImpl;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.impl.TextualExpressionImpl;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.impl.ConstraintImpl;
import org.storydriven.modeling.patterns.impl.LinkVariableImpl;
import org.storydriven.modeling.patterns.impl.ObjectSetVariableImpl;
import org.storydriven.modeling.patterns.impl.ObjectVariableImpl;
import org.storydriven.modeling.patterns.impl.PathImpl;
import org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class ModelRegistrator
{
   public static void initialize()
   {
      ActivitiesPackage pack = ActivitiesPackage.eINSTANCE;
      Class2EClassRegistry.registerClass(ModifyingStoryNodeImpl.class, pack.getModifyingStoryNode());
      Class2EClassRegistry.registerClass(ActivityCallNodeImpl.class, pack.getActivityCallNode());
      Class2EClassRegistry.registerClass(ActivityEdgeImpl.class, pack.getActivityEdge());
      Class2EClassRegistry.registerClass(JunctionNodeImpl.class, pack.getJunctionNode());
      Class2EClassRegistry.registerClass(StartNodeImpl.class, pack.getStartNode());
      Class2EClassRegistry.registerClass(StopNodeImpl.class, pack.getStopNode());
      Class2EClassRegistry.registerClass(StatementNodeImpl.class, pack.getStatementNode());
      
      PatternsPackage pack2 = PatternsPackage.eINSTANCE;
      Class2EClassRegistry.registerClass(LinkVariableImpl.class, pack2.getLinkVariable());
      Class2EClassRegistry.registerClass(ObjectSetVariableImpl.class, pack2.getObjectSetVariable());
      Class2EClassRegistry.registerClass(ObjectVariableImpl.class, pack2.getObjectVariable());
      Class2EClassRegistry.registerClass(PathImpl.class, pack2.getPath());
      Class2EClassRegistry.registerClass(PrimitiveVariableImpl.class, pack2.getPrimitiveVariable());
      Class2EClassRegistry.registerClass(ConstraintImpl.class, pack2.getConstraint());
      
      ExpressionsPackage pack3 = ExpressionsPackage.eINSTANCE;
      Class2EClassRegistry.registerClass(TextualExpressionImpl.class, pack3.getTextualExpression());
   }
}

/**
 * 
 */
package org.storydriven.modeling.editor.gef.utils;

import org.fujaba.commons.utils.Class2EClassRegistry;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.impl.TextualExpressionImpl;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.impl.ActivityCallNodeImpl;
import org.storydriven.storydiagrams.activities.impl.ActivityEdgeImpl;
import org.storydriven.storydiagrams.activities.impl.ActivityFinalNodeImpl;
import org.storydriven.storydiagrams.activities.impl.InitialNodeImpl;
import org.storydriven.storydiagrams.activities.impl.JunctionNodeImpl;
import org.storydriven.storydiagrams.activities.impl.ModifyingStoryNodeImpl;
import org.storydriven.storydiagrams.activities.impl.StatementNodeImpl;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.impl.CollectionVariableImpl;
import org.storydriven.storydiagrams.patterns.impl.ConstraintImpl;
import org.storydriven.storydiagrams.patterns.impl.LinkVariableImpl;
import org.storydriven.storydiagrams.patterns.impl.ObjectVariableImpl;
import org.storydriven.storydiagrams.patterns.impl.PathImpl;
import org.storydriven.storydiagrams.patterns.impl.PrimitiveVariableImpl;

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
      Class2EClassRegistry.registerClass(InitialNodeImpl.class, pack.getInitialNode());
      Class2EClassRegistry.registerClass(ActivityFinalNodeImpl.class, pack.getActivityFinalNode());
      Class2EClassRegistry.registerClass(StatementNodeImpl.class, pack.getStatementNode());
      
      PatternsPackage pack2 = PatternsPackage.eINSTANCE;
      Class2EClassRegistry.registerClass(LinkVariableImpl.class, pack2.getLinkVariable());
      Class2EClassRegistry.registerClass(CollectionVariableImpl.class, pack2.getCollectionVariable());
      Class2EClassRegistry.registerClass(ObjectVariableImpl.class, pack2.getObjectVariable());
      Class2EClassRegistry.registerClass(PathImpl.class, pack2.getPath());
      Class2EClassRegistry.registerClass(PrimitiveVariableImpl.class, pack2.getPrimitiveVariable());
      Class2EClassRegistry.registerClass(ConstraintImpl.class, pack2.getConstraint());
      
      ExpressionsPackage pack3 = ExpressionsPackage.eINSTANCE;
      Class2EClassRegistry.registerClass(TextualExpressionImpl.class, pack3.getTextualExpression());
   }
}

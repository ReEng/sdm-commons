/**
 * 
 */
package org.storydriven.modeling.editor.gef.edit.commands;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.notation.NotationFactory;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.InitialNode;
import org.storydriven.storydiagrams.activities.OperationExtension;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class CreateActivityCommand extends Command
{
   private EOperation operation;
   private OperationExtension oExtension;
   private Resource diagramResource;
   
   private Activity activity;
   private HierarchicalNode newActivityView;
   private InitialNode start;
   private HierarchicalNode newStartView;
  
   
   
   /**
    * @param catalog the PSCatalog that will contain the pattern specification
    * @param diagramResource Resource that will contain the diagram
    */
   public CreateActivityCommand(EOperation operation, Resource diagramResource)
   {
      super("create new pattern specification");
      this.diagramResource = diagramResource;
      this.operation = operation;
   }


   @Override
   public void execute()
   {
      redo();
   }

   @Override
   public void redo()
   {      
      if(oExtension == null)
      {
         oExtension = ActivitiesFactory.eINSTANCE.createOperationExtension();
      }
      oExtension.setOperation(operation);
      

      if(activity == null)
      {
         activity = ActivitiesFactory.eINSTANCE.createActivity();
      }
      activity.setOwningOperation(oExtension);
      
      activity.getOutParameters();
      
      if(start == null)
      {
         start = ActivitiesFactory.eINSTANCE.createInitialNode();
      }
      start.setOwningActivity(activity);


      // create view level
      if(newActivityView == null)
      {
         newActivityView = NotationFactory.eINSTANCE.createHierarchicalNode();
      }
      newActivityView.setModel(activity);

      if(newStartView == null)
      {
         newStartView = NotationFactory.eINSTANCE.createHierarchicalNode();
      }
      newStartView.setModel(start);
      newStartView.setPersistent(true);
      newStartView.setVisible(true);
      newStartView.setHeight(30);
      newStartView.setWidth(30);
      newStartView.setX(60);
      newStartView.setY(40);
      newStartView.setParent(newActivityView);
      
      diagramResource.getContents().add(newActivityView);
   }

   @Override
   public void undo()
   {
      oExtension.setOperation(null);
      diagramResource.getContents().remove(newActivityView);
   }
}

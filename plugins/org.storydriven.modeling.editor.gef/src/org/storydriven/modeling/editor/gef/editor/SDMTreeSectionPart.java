/**
 * 
 */
package org.storydriven.modeling.editor.gef.editor;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.overviewpage.NestedDiagramsTreeSectionPart;
import org.fujaba.commons.properties.TreeNodeLabelProvider;
import org.storydriven.modeling.editor.gef.edit.commands.CreateActivityCommand;
import org.storydriven.modeling.editor.gef.edit.commands.CreateMethodWithActivityCommand;
import org.storydriven.modeling.editor.gef.utils.ModelHelper;
import org.storydriven.storydiagrams.activities.Activity;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMTreeSectionPart extends NestedDiagramsTreeSectionPart
{
   private Resource root;

   private SDMTreeSectionPart(SDMEditor editor,
         Composite parent, FormToolkit toolkit)
   {
      super(editor, parent, toolkit);

      // set section data
      getSection().setText("Packages, classes, and operations with corresponding story diagrams (activities)");
   }


   public SDMTreeSectionPart(SDMEditor editor, IManagedForm mForm)
   {
      this(editor, mForm.getForm().getBody(), mForm.getToolkit());
   }


   @Override
   protected TreeNode createNode(EObject type, TreeNode parent)
   {
      // create node
      TreeNode node = new TreeNode(type);

      // set the nodes parent
      node.setParent(parent);

      // get children
      List<EObject> children = new ArrayList<EObject>();
      if (type instanceof EPackage)
      {
         EPackage p = (EPackage) type;
         children.addAll(p.getESubpackages());
         children.addAll(p.getEClassifiers());
      }
      else if (type instanceof EClass)
      {
         EClass c = (EClass) type;
         children.addAll(c.getEOperations());
      }
      else if (type instanceof EOperation) {
    	  Activity activity = ModelHelper.getActivityOfEOperation((EOperation) type);
    	  if (activity != null)
    	  {
    		  children.add(activity); // add the story diagram
    	  }
      }

      // create children array
      TreeNode[] childrenNodes = new TreeNode[children.size()];

      // collect the children
      int i = 0;
      for (EObject child : children)
      {
         childrenNodes[i] = createNode(child, node);
         i++;
      }

      // set the children
      node.setChildren(childrenNodes);

      return node;
   }


   @Override
   protected TreeNode[] getInput()
   {
      // create root node list
      List<TreeNode> roots = new ArrayList<TreeNode>();

      
      // go through the patterns
      for (EObject o : root.getContents())
      {
            // add the pattern node
         roots.add(createNode(o, null));
      }

      // set settings
      return roots.toArray(new TreeNode[roots.size()]);
   }


   @Override
   public void notifyChanged(Notification notification)
   {
      // get feature
      Object feature = notification.getFeature();
      if (feature != null)
      {
         // check for changing feature
         refresh();
      }
   }


   @Override
   public boolean setFormInput(Object input)
   {
      if (input instanceof Resource)
      {
         // remove existing listeners
         if (root != null)
         {
            // remove from catalog
            root.eAdapters().remove(this);
            TreeIterator<EObject> i = root.getAllContents();
            while(i.hasNext())
            {
               EObject o = i.next();
               if(o instanceof EPackage || o instanceof EClass
                     || o instanceof EOperation)
               {
                  if(o.eAdapters().contains(this))
                  {
                     o.eAdapters().remove(this);
                  }
               }
            }
         }

         // set new model
         root = (Resource)input;

         // add listeners
         if (!root.eAdapters().contains(this))
         {
            // add to catalog
            root.eAdapters().add(this);
         }
         TreeIterator<EObject> i = root.getAllContents();
         while(i.hasNext())
         {
            EObject o = i.next();
            if(o instanceof EPackage || o instanceof EClass
                  || o instanceof EOperation)
            {
               if(!o.eAdapters().contains(this))
               {
                  o.eAdapters().add(this);
               }
            }
         }

         return true;
      }

      return super.setFormInput(input);
   }

   
   /**
    * @see org.fujaba.commons.editor.overviewpage.AbstractDiagramsSectionPart#addButtonPressed(org.eclipse.swt.events.SelectionEvent)
    */
   @Override
   protected void addButtonPressed(SelectionEvent e)
   {
      EObject[] selected = getSelection();
      if(selected.length == 0)
      {
         return;
      }
      
      if(selected[0] instanceof EClass)
      {
         InputDialog dialog = new InputDialog(getSection().getShell(), "Choose a name for the new Operation", this.chooseANameMsg,
               this.newDiagramDefaultName, null);
         int pressed = dialog.open();
         if (pressed == InputDialog.OK)
         {
            this.executeCommand(createAddDiagramCommand(dialog.getValue()));
         }
      }
      else if(selected[0] instanceof EOperation)
      {
         this.executeCommand(createAddDiagramCommand(null));
      }
      
      openDiagramFor(selected[0]);
   }

   @Override
   protected Command createAddDiagramCommand(String newName)
   {
      EObject o = getSelection()[0];
      Command cmd = null;
      if(o instanceof EClass)
      {
         cmd = new CreateMethodWithActivityCommand((EClass) o, editor.getDiagramResource(),
               newName);
      }
      else if(o instanceof EOperation)
      {
         cmd = new CreateActivityCommand((EOperation) o, editor.getDiagramResource());
      }
      return cmd;
   }


   @Override
   protected Command createDeleteDiagramCommandFor(EObject diagramRoot)
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   protected void openDiagramFor(EObject diagramRoot)
   {

      if (diagramRoot instanceof EOperation)
      {
         EOperation eop = (EOperation) diagramRoot;
         Activity activity = ModelHelper.getActivityOfEOperation(eop);
         if (activity != null)
         {
            ((SDMEditor) this.editor).addPageFor(activity);
         }
         else
         {
            MessageDialog.openInformation(this.getManagedForm().getForm().getShell(), "No story diagram found",
                  "The selected EOperation is not formalized by a story diagram.");
         }
      }
      else if (diagramRoot instanceof Activity)
      {
    	  Activity activity = (Activity) diagramRoot;
    	  ((SDMEditor) this.editor).addPageFor(activity);
      }
   }
   

   @Override
   protected IBaseLabelProvider getLabelProvider()
   {
      return new TreeNodeLabelProvider(((SDMEditor)this.editor).getEditingDomain().getAdapterFactory());
   }


   @Override
   protected IContentProvider getContentProvider()
   {
      return new TreeNodeContentProvider();
   }
}

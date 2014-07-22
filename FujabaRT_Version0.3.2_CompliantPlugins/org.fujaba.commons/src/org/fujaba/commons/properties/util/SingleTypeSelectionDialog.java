package org.fujaba.commons.properties.util;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.FujabaCommonsPlugin;
import org.fujaba.commons.properties.TreeNodeLabelProvider;


public class SingleTypeSelectionDialog extends Dialog
{
   private static final CamelCaseFilter FILTER = new CamelCaseFilter();


   private static void addChild(TreeNode node, TreeNode child)
   {
      // get old children
      TreeNode[] oldChildren = node.getChildren();

      // create new children
      if (oldChildren != null)
      {
         TreeNode[] newChildren = new TreeNode[oldChildren.length + 1];
         for (int i = 0; i < oldChildren.length; i++)
         {
            if (oldChildren[i].equals(child))
            {
               return;
            }

            newChildren[i] = oldChildren[i];
         }

         // add the new child
         newChildren[oldChildren.length] = child;

         // set the new children
         node.setChildren(newChildren);
      }
      else
      {
         // set the new children
         node.setChildren(new TreeNode[] { child });
      }
   }


   private String title;

   private Text filterText;

   private TreeViewer viewer;

   private CLabel infoboxHeader;

   private Text infoboxText;

   private EClassifier selected;

   private TreeNode[] input;

   private TreeNode currentNode;


   public SingleTypeSelectionDialog()
   {
      super(PlatformUI.getWorkbench().getDisplay().getActiveShell());
   }


   @Override
   protected void configureShell(Shell shell)
   {
      // configure
      super.configureShell(shell);

      // set title
      shell.setText(title);
   }


   @Override
   protected Control createDialogArea(Composite parent)
   {
      // get dialog composite
      Composite main = (Composite) super.createDialogArea(parent);

      // add label
      Label hint = new Label(main, SWT.LEAD);
      hint.setText("&Enter type name prefix or pattern (*, ?, or camel case):");

      // add filter field
      int style = SWT.SINGLE | SWT.LEAD | SWT.BORDER | SWT.SEARCH;
      filterText = new Text(main, style);
      GridDataFactory.fillDefaults().grab(true, false).applyTo(filterText);

      Label filtered = new Label(main, SWT.LEAD);
      filtered.setText("&Matching types:");

      // add viewer
      viewer = new TreeViewer(main, SWT.BORDER | SWT.V_SCROLL);
      viewer.setContentProvider(new TreeNodeContentProvider());
      viewer.setLabelProvider(new TreeNodeLabelProvider(
            new EcoreItemProviderAdapterFactory()));
      viewer.setComparator(new ViewerComparator());
      viewer.setAutoExpandLevel(2);
      viewer.addFilter(FILTER);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(viewer.getTree());

      // info box header
      infoboxHeader = new CLabel(main, SWT.LEAD);
      GridDataFactory.fillDefaults().grab(true, false).applyTo(infoboxHeader);

      infoboxText = new Text(main, SWT.LEAD | SWT.READ_ONLY | SWT.MULTI
            | SWT.WRAP);
      infoboxText.setText(""); //$NON-NLS-1$
      GridDataFactory.fillDefaults().grab(true, false).applyTo(infoboxText);

      // hook listeners
      hookListeners();

      // reset filter
      FILTER.setQuery(null);

      // fill viewer
      viewer.setInput(input);

      // set selection
      viewer.setSelection(new StructuredSelection(currentNode));

      return main;
   }


   private TreeNode createNode(EClassifier type, TreeNode parent,
         Collection<? extends EClassifier> types)
   {
      // create node
      TreeNode node = new TreeNode(type);

      // check if it is the current selection
      if (selected.equals(type) && currentNode == null)
      {
         currentNode = node;
      }

      // set the nodes parent
      node.setParent(parent);

      // add it to the parent
      addChild(parent, node);

      // collect children
      for (EClassifier other : types)
      {
         if(other instanceof EClass)
         {
            if (((EClass)other).getESuperTypes().contains(type))
            {
               TreeNode child = createNode(other, node, types);
               addChild(node, child);
            }
         }
      }

      return node;
   }


   @Override
   protected IDialogSettings getDialogBoundsSettings()
   {
      // get settings root
      IDialogSettings root = FujabaCommonsPlugin.getDefault().getDialogSettings();

      // get the settings
      IDialogSettings settings = root.getSection(getClass().getName());

      // create when nothing exists
      if (settings == null)
      {
         settings = root.addNewSection(getClass().getName());
         settings.put("DIALOG_X_ORIGIN", 50); //$NON-NLS-1$
         settings.put("DIALOG_Y_ORIGIN", 50); //$NON-NLS-1$
         settings.put("DIALOG_WIDTH", 430); //$NON-NLS-1$
         settings.put("DIALOG_HEIGHT", 500); //$NON-NLS-1$
      }

      // return settings;
      return settings;
   }


   public EClassifier getSelected()
   {
      return selected;
   }


   protected void handleSelection(StructuredSelection selection)
   {
      // get node
      final TreeNode node = (TreeNode) selection.getFirstElement();

      // set selection
      selected = null;
      if (node.getValue() instanceof EClass)
      {
         // save selection
         selected = (EClass) node.getValue();
      }


      // refresh info box
      if (node.getValue() instanceof ENamedElement)
      {
         // get element
         final ENamedElement element = (ENamedElement) node.getValue();

         PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
         {
            @Override
            public void run()
            {
               // create header text
               String header = element.getName();
               if (element instanceof EClass)
               {
                  header = ((EClass) element).getInstanceTypeName();
               }

               // create image
               Image image = ((TreeNodeLabelProvider) viewer.getLabelProvider())
                     .getImage(node);

               // set them
               infoboxHeader.setImage(image);
               infoboxHeader.setText(header);

               // get documentation
               String info = EcoreUtil.getDocumentation((EModelElement) node
                     .getValue());
               if (info == null || info.trim().isEmpty())
               {
                  info = "No further documentation available.";
               }

               infoboxText.setText(info);
               infoboxText.getParent().layout();
            }
         });
      }

      // hide OK button
      Button okay = getButton(IDialogConstants.OK_ID);
      if (okay != null)
      {
         okay.setEnabled(selected != null);
      }
   }


   private void hookListeners()
   {
      // modify listener on filter text
      filterText.addModifyListener(new ModifyListener()
      {
         @Override
         public void modifyText(ModifyEvent e)
         {
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable()
            {
               @Override
               public void run()
               {
                  // edit filter
                  FILTER.setQuery(filterText.getText());

                  // refresh viewer
                  if (viewer != null && viewer.getTree() != null
                        && !viewer.getTree().isDisposed())
                  {
                     viewer.refresh();
                     viewer.expandAll();
                  }
               }
            });
         }
      });

      // viewer selection handler
      viewer.addPostSelectionChangedListener(new ISelectionChangedListener()
      {
         @Override
         public void selectionChanged(SelectionChangedEvent event)
         {
            if (!event.getSelection().isEmpty()
                  && event.getSelection() instanceof StructuredSelection)
            {
               handleSelection((StructuredSelection) event.getSelection());
            }
         }
      });

      // viewer double click
      viewer.addDoubleClickListener(new IDoubleClickListener()
      {
         @Override
         public void doubleClick(DoubleClickEvent event)
         {
            // handle the selection
            if (!event.getSelection().isEmpty()
                  && event.getSelection() instanceof StructuredSelection)
            {
               handleSelection((StructuredSelection) event.getSelection());
            }

            // check for correct selection
            if (selected != null)
            {
               okPressed();
            }
         }
      });
   }


   @Override
   protected boolean isResizable()
   {
      return true;
   }


   public void setInput(Collection<? extends EClassifier> input, EClassifier current)
   {
      // set current type selection
      this.selected = current;
      currentNode = null;

      // collect packages
      Collection<EPackage> packages = new ArrayList<EPackage>();
      for (EClassifier type : input)
      {
         // add the package to cache
         if (!packages.contains(type.getEPackage()))
         {
            packages.add(type.getEPackage());
         }
      }

      // create root node list
      List<TreeNode> roots = new ArrayList<TreeNode>();

      // go through the packages
      for (EPackage pack : packages)
      {
         // create package node
         TreeNode packNode = new TreeNode(pack);

         // go through the types
         for (EClassifier type : pack.getEClassifiers())
         {
            // check
            if (type instanceof EClass)
            {
               // check if any super type of it will show it
               boolean add = true;

               // go through super patterns and check it
               for (EClass parent : ((EClass) type).getESuperTypes())
               {
                  if (parent.getEPackage().equals(pack))
                  {
                     add = false;
                     break;
                  }
               }

               // add it when ok
               if (add)
               {
                  // create type node
                  createNode((EClassifier) type, packNode, input);
               }
            }
         }

         // add the package node
         roots.add(packNode);
      }

      // set settings
      this.input = roots.toArray(new TreeNode[roots.size()]);
   }


   public void setTitle(String title)
   {
      this.title = title;
   }
}

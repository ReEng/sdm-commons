package org.fujaba.commons.properties.util;


import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.FujabaCommonsPlugin;


public class SingleAttributeSelectionDialog extends Dialog
{
   private class PSAttributeLabelProvider extends LabelProvider
   {
      private AdapterFactoryLabelProvider imageProvider;


      public PSAttributeLabelProvider()
      {
         imageProvider = new AdapterFactoryLabelProvider(
               new EcoreItemProviderAdapterFactory());
      }


      @Override
      public Image getImage(Object element)
      {
         return imageProvider.getImage(element);
      }


      public String getQualifiedText(Object element)
      {
         // get element
         EAttribute reference = (EAttribute) element;

         // create string
         StringBuilder text = new StringBuilder();

         text.append(reference.getEContainingClass().getName());
         text.append("."); //$NON-NLS-1$
         text.append(reference.getName());

         return text.toString();
      }


      @Override
      public String getText(Object element)
      {
         // get element
         EAttribute reference = (EAttribute) element;

         // create string
         StringBuilder text = new StringBuilder();

         text.append(reference.getName());
         text.append(": "); //$NON-NLS-1$
         text.append(reference.getEAttributeType().getName());

         return text.toString();
      }
   }

   private String title;

   private TableViewer viewer;

   private CLabel infoboxHeader;

   private Text infoboxText;

   private EAttribute selected;


   private Collection<EAttribute> input;


   public SingleAttributeSelectionDialog()
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

      // available label
      Label filtered = new Label(main, SWT.LEAD);
      filtered.setText("&Available attributes:");

      // add viewer
      viewer = new TableViewer(main, SWT.BORDER | SWT.V_SCROLL);
      viewer.setContentProvider(new ArrayContentProvider());
      viewer.setLabelProvider(new PSAttributeLabelProvider());
      viewer.setComparator(new ViewerComparator());
      GridDataFactory.fillDefaults().grab(true, true)
            .applyTo(viewer.getTable());

      // info box header
      infoboxHeader = new CLabel(main, SWT.LEAD);
      GridDataFactory.fillDefaults().grab(true, false).applyTo(infoboxHeader);

      infoboxText = new Text(main, SWT.LEAD | SWT.READ_ONLY | SWT.MULTI
            | SWT.WRAP);
      infoboxText.setText(""); //$NON-NLS-1$
      GridDataFactory.fillDefaults().grab(true, false).applyTo(infoboxText);

      // hook listeners
      hookListeners();

      // fill viewer
      viewer.setInput(input);

      // set selection
      viewer.setSelection(new StructuredSelection(selected));

      return main;
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


   public EAttribute getSelected()
   {
      return selected;
   }


   protected void handleSelection(StructuredSelection selection)
   {
      // get reference
      selected = (EAttribute) selection.getFirstElement();

      // refresh info fields
      PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
      {
         @Override
         public void run()
         {
            // create header text
            String header = ((PSAttributeLabelProvider) viewer
                  .getLabelProvider()).getQualifiedText(selected);

            // create image
            Image image = ((PSAttributeLabelProvider) viewer.getLabelProvider())
                  .getImage(selected);

            // set them
            infoboxHeader.setImage(image);
            infoboxHeader.setText(header);

            // get documentation
            String info = EcoreUtil.getDocumentation(selected);
            if (info == null || info.trim().isEmpty())
            {
               info = "No further documentation available.";
            }

            infoboxText.setText(info);
            infoboxText.getParent().layout();
         }
      });

      // hide OK button
      Button okay = getButton(IDialogConstants.OK_ID);
      if (okay != null)
      {
         okay.setEnabled(selected != null);
      }
   }


   private void hookListeners()
   {
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


   public void setInput(Collection<EAttribute> input, EAttribute current)
   {
      // set current type selection
      selected = current;

      // set input
      this.input = input;
   }


   public void setTitle(String title)
   {
      this.title = title;
   }
}

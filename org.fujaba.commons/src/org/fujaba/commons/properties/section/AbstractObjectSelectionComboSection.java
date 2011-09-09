package org.fujaba.commons.properties.section;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.fujaba.commons.FujabaCommonsImages;


public abstract class AbstractObjectSelectionComboSection extends
      AbstractSection
{
   private CLabel label;

   protected Combo list;

   private Button advanced;

   private Map<String, Object> elements;


   public AbstractObjectSelectionComboSection()
   {
      elements = new HashMap<String, Object>();
   }


   @Override
   protected void createWidgets(Composite composite)
   {
      // create combo
      list = new Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

      // create label
      label = getWidgetFactory().createCLabel(composite, getLabelText(),
            SWT.TRAIL);

      // create button
      if (showAdvancedButton())
      {
         advanced = getWidgetFactory().createButton(composite,
               getAdvancedButtonText(), SWT.PUSH | SWT.CENTER);

         advanced.setImage(getAdvancedButtonImage());
      }
   }


   protected Image getAdvancedButtonImage()
   {
      return FujabaCommonsImages.getImage(FujabaCommonsImages.IMAGE_HELP);
   }


   protected String getAdvancedButtonText()
   {
      return "Details";
   }


   protected abstract Object getCurrentValue();


   private String[] getItems()
   {
      // get possible elements
      Collection<? extends Object> possible = getPossibilities();

      // clear current
      elements.clear();

      // go through possible elements
      String[] items = new String[possible.size()];
      int i = 0;
      for (Object element : possible)
      {
         // get text
         String text = getValueText(element);

         // add it to ui texts
         items[i] = text;
         elements.put(text, element);
         i++;
      }

      return items;
   }


   protected Object getObject(String text)
   {
      return elements.get(text);
   }


   protected abstract Collection<? extends Object> getPossibilities();


   protected abstract String getValueText(Object element);


   protected void handleAdvancedButtonClicked()
   {
      // do nothing by default
   }


   protected void handleSelection(SelectionEvent e)
   {
      if (e.getSource().equals(list))
      {
         createCommand(getCurrentValue(), elements.get(list.getText()));
      }
   }


   @Override
   protected void hookListeners()
   {
      // add list selection listener
      list.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            handleSelection(e);
         }
      });

      if (advanced != null)
      {
         // add button selection listener
         advanced.addSelectionListener(new SelectionAdapter()
         {
            @Override
            public void widgetSelected(SelectionEvent e)
            {
               handleAdvancedButtonClicked();
            }
         });
      }
   }


   @Override
   public void refresh()
   {
      list.select(list.indexOf(getValueText(getCurrentValue())));
   }


   @Override
   public void setInput(IWorkbenchPart part, ISelection selection)
   {
      super.setInput(part, selection);

      // fill combo
      list.setItems(getItems());
   }


   @Override
   protected void setSectionData(Composite composite)
   {
      // button
      FormData data = new FormData();
      if (advanced != null)
      {
         data.right = new FormAttachment(100, 0);
         data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
         data.bottom = new FormAttachment(100, 0);
         advanced.setLayoutData(data);
      }

      // combo
      data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(composite,
            new String[] { getLabelText() }));
      if (advanced != null)
      {
         data.right = new FormAttachment(advanced,
               -ITabbedPropertyConstants.HSPACE);
      }
      else
      {
         data.right = new FormAttachment(100, 0);
      }
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      data.bottom = new FormAttachment(100, 0);
      list.setLayoutData(data);

      // label
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(list, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(list, 0, SWT.TOP);
      label.setLayoutData(data);
   }


   protected boolean showAdvancedButton()
   {
      return false;
   }
}

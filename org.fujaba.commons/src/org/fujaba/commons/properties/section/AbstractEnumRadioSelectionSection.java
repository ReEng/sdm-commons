package org.fujaba.commons.properties.section;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;


public abstract class AbstractEnumRadioSelectionSection extends AbstractSection
{
   private Map<Button, Object> buttons;

   private CLabel label;

   private Composite group;


   public AbstractEnumRadioSelectionSection()
   {
      buttons = new HashMap<Button, Object>();
   }


   @Override
   protected void createWidgets(Composite composite)
   {
      // get possible literals
      List<? extends Object> literals = getLiterals();

      // create group
      group = getWidgetFactory().createComposite(composite);
      GridLayoutFactory.fillDefaults().numColumns(literals.size())
            .applyTo(group);

      // create buttons for the literals
      int style = SWT.RADIO | SWT.LEAD;
      for (Object literal : literals)
      {
         // create the button
         Button button = getWidgetFactory().createButton(group,
               getLiteralText(literal), style);

         // add default layout to it
         GridDataFactory.fillDefaults().applyTo(button);

         // add a listener
         button.addSelectionListener(new SelectionAdapter()
         {
            @Override
            public void widgetSelected(SelectionEvent e)
            {
               handleSelection(e);
            }
         });

         // add the button
         buttons.put(button, literal);
      }

      // create label
      label = getWidgetFactory().createCLabel(composite, getLabelText(),
            SWT.TRAIL);
   }


   protected Collection<Button> getButtons()
   {
      return buttons.keySet();
   }


   protected abstract List<? extends Object> getLiterals();


   protected abstract String getLiteralText(Object literal);


   protected Object getObject(Button button)
   {
      return buttons.get(button);
   }


   protected abstract Object getValue();


   protected void handleSelection(SelectionEvent e)
   {
      if (e.getSource() instanceof Button)
      {
         createCommand(getValue(), getObject((Button) e.getSource()));
      }
   }


   @Override
   public void refresh()
   {
      // get current
      Object current = getValue();

      // refresh selections
      for (Button button : buttons.keySet())
      {
         if (buttons.get(button).equals(current))
         {
            button.setSelection(true);
         }
         else
         {
            button.setSelection(false);
         }
      }
   }


   @Override
   protected void setSectionData(Composite composite)
   {
      // format group
      FormData data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(composite,
            new String[] { getLabelText() }));
      data.right = new FormAttachment(100, 0);
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      data.bottom = new FormAttachment(100, 0);
      group.setLayoutData(data);

      // format label
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(group, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(group, 0, SWT.TOP);
      data.bottom = new FormAttachment(100, 0);
      label.setLayoutData(data);
   }
}

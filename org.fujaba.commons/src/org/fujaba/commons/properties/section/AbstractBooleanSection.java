package org.fujaba.commons.properties.section;


import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;


public abstract class AbstractBooleanSection extends AbstractSection
{
   private CLabel label;

   private Button button;


   @Override
   protected void createWidgets(Composite composite)
   {
      // create label
      label = getWidgetFactory().createCLabel(composite, "", SWT.TRAIL); //$NON-NLS-1$

      // create button
      button = getWidgetFactory().createButton(composite, "", SWT.CHECK); //$NON-NLS-1$
   }


   protected boolean getFeatureValue()
   {
      Object bool = getElement().eGet(getFeature());
      if (bool == null || !(bool instanceof Boolean))
      {
         return false;
      }

      return ((Boolean) bool).booleanValue();
   }


   protected void handleCheckButtonModified()
   {
      createCommand(Boolean.valueOf(getFeatureValue()),
            Boolean.valueOf(button.getSelection()));
   }


   @Override
   protected void hookListeners()
   {
      // add label listener
      label.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mouseDown(MouseEvent e)
         {
            button.setSelection(!button.getSelection());
            handleCheckButtonModified();
         }
      });

      // add button listener
      button.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            handleCheckButtonModified();
         }
      });
   }


   @Override
   public void refresh()
   {
      button.setSelection(getFeatureValue());
      label.setText(getLabelText());
   }


   @Override
   protected void setSectionData(Composite parent)
   {
      // format check button
      FormData data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(parent, "")); //$NON-NLS-1$
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      button.setLayoutData(data);

      // format label
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(button, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(button, 0, SWT.CENTER);
      label.setLayoutData(data);
   }
}

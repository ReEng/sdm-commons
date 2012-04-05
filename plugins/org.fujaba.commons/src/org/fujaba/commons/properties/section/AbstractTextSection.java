package org.fujaba.commons.properties.section;


import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.fujaba.commons.properties.util.ColorRegistry;
import org.fujaba.commons.properties.util.TextChangeListener;


/**
 * An abstract implementation of a section with a text field.
 */
public abstract class AbstractTextSection extends AbstractSection
{

   /**
    * The text control for the section.
    */
   private Text text;

   /**
    * The label used with to identify the Section.
    */
   private CLabel label;

   /**
    * A helper to listen for events that indicate that a text field has been changed.
    */
   private TextChangeListener listener;


   @Override
   protected void createWidgets(Composite composite)
   {
      // create text
      text = getWidgetFactory().createText(composite, "", getStyle()); //$NON-NLS-1$

      if (getFeature() != null)
      {
         boolean isChangeable = getFeature().isChangeable();

         text.setEditable(isChangeable);
         text.setEnabled(isChangeable);
      }

      // create label
      label = getWidgetFactory().createCLabel(composite, getLabelText(),
            SWT.TRAIL);

      // set tool tip
      String tooltip = getTooltip();
      if (tooltip != null && !tooltip.isEmpty())
      {
         label.setToolTipText(tooltip);
      }
      else
      {
         label.setToolTipText(null);
      }
   }


   /**
    * Handle action when the focus is gained. Default action is to do nothing. Clients may override
    * this method if they desire a particular action to be executed when the text control gain the
    * focus.
    */
   protected void focusIn()
   {
      // do nothing
   }


   /**
    * Handle action when the focus is lost. Default action is to do nothing. Clients may override
    * this method if they desire a particular action to be executed when the text control lost the
    * focus.
    */
   protected void focusOut()
   {
      // do nothing
   }


   protected abstract String getErrorMessage();


   /**
    * Get the value of the feature as text for the text field for the section.
    * 
    * @return Should return the value of the feature as text.
    */
   protected abstract String getFeatureAsString();


   /**
    * Get the new value of the feature from the text field of the section.
    * 
    * @param newText the new value of the feature as a string.
    * @return the new value of the feature.
    */
   protected abstract Object getNewFeatureValue(String newText);


   /**
    * Returns the feature value from the model as an object type.
    * 
    * @return the feature object
    */
   protected abstract Object getOldFeatureValue();


   /**
    * Get the style of the text widget. By default, this is a single line text.
    * 
    * @return Returns the style.
    */
   protected int getStyle()
   {
      return SWT.SINGLE;
   }


   /**
    * @return Returns the text.
    */
   protected Text getText()
   {
      return text;
   }


   protected abstract String getTooltip();


   /**
    * Handle the text modified event. When there is any problem while creating and executing the
    * command, the view will be only refreshed
    */
   protected void handleTextModified()
   {
      if (isTextValid())
      {
         createCommand(getOldFeatureValue(), getNewFeatureValue(getText()
               .getText()));
      }
      else
      {
         refresh();
      }
   }


   @Override
   protected void hookListeners()
   {
      // add label click listener
      label.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mouseDown(MouseEvent e)
         {
            text.setFocus();
            int end = text.getText().length();
            text.setSelection(0, end);
         }
      });

      listener = new TextChangeListener()
      {
         @Override
         public void focusIn(Control control)
         {
            AbstractTextSection.this.focusIn();
         }


         @Override
         public void focusOut(Control control)
         {
            AbstractTextSection.this.focusOut();
         }


         @Override
         public void textChanged(Control control)
         {
            handleTextModified();
         }
      };

      listener.startListeningTo(text);

      // handle multi line widget
      if ((getStyle() & SWT.MULTI) == 0)
      {
         listener.startListeningForEnter(text);
      }

      text.addListener(SWT.Modify, new Listener()
      {
         @Override
         public void handleEvent(Event e)
         {
            verifyField(e);
         }
      });
   }


   /**
    * Check whether the text entered is valid or not. Subclasses should override this method to
    * provide their own check. By default, return true.
    * 
    * @return Returns <code>true</code> if the text entered is valid.
    */
   protected boolean isTextValid()
   {
      return true;
   }


   @Override
   public void refresh()
   {
      getText().setEnabled(!isReadOnly());
      getText().setText(getFeatureAsString());
   }


   @Override
   protected void setSectionData(Composite composite)
   {
      FormData data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(composite,
            new String[] { getLabelText() }));
      data.right = new FormAttachment(100, 0);
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      data.bottom = new FormAttachment(100, 0);
      text.setLayoutData(data);

      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(text, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(text, 0, SWT.TOP);
      label.setLayoutData(data);
   }


   /**
    * Subclasses may provide their own checker on the text that is entered by the user and update
    * the 'doit' flag of the Event in consequence.
    * 
    * @param e the Event that is sent when the Text is modified
    */
   protected void verifyField(Event e)
   {
      String value = getText().getText();
      if (value == null || value.isEmpty() || isTextValid())
      {
         setErrorMessage(null);
         getText().setBackground(null);
         e.doit = true;
      }
      else
      {
         setErrorMessage(getErrorMessage());
         getText().setBackground(ColorRegistry.COLOR_ERROR);
         e.doit = false;
      }
   }
}

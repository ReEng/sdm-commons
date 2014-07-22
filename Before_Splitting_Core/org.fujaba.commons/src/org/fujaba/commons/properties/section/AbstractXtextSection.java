package org.fujaba.commons.properties.section;


import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.fujaba.commons.editor.xtext.EmbeddedXtextEditor;

import com.google.inject.Injector;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public abstract class AbstractXtextSection extends AbstractSection
{
   private CLabel label;

   private EmbeddedXtextEditor editor;


   protected abstract Injector getInjector();


   protected int getStyle()
   {
      return SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL;
   }


   @Override
   protected void createWidgets(Composite composite)
   {
      Injector injector = getInjector();
      editor = new EmbeddedXtextEditor(composite, injector, getStyle());

      editor.getDocument().addModelListener(new IXtextModelListener()
      {
         @Override
         public void modelChanged(XtextResource resource)
         {
            // TODO: reconcileChangedModel();
         }
      });

      // TODO: we must deactivate the Cut/Copy/Paste global actions contributed by the EditingDomain
      // action bar
      editor.getViewer().getTextWidget().addFocusListener(new FocusListener()
      {
         public void focusLost(FocusEvent e)
         {
            // ((ActionBarContributor)getEditor().getActionBarContributor()).activateCCPActions();
         }


         public void focusGained(FocusEvent e)
         {
            // ((ActionBarContributor)getEditor().getActionBarContributor()).deactivateCCPActions();
         }
      });

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


   protected String getTooltip()
   {
      return null;
   }


   protected void handleTextModified()
   {
      if (isTextValid())
      {
         createCommand(getOldFeatureValue(), editor.getDocument().get());
      }
      else
      {
         refresh();
      }
   }


   @Override
   protected void hookListeners()
   {
      editor.getViewer().addTextListener(new ITextListener()
      {
         @Override
         public void textChanged(TextEvent event)
         {
            handleTextModified();
         }
      });
   }


   protected boolean isTextValid()
   {
      return true;
   }


   @Override
   public void refresh()
   {
      if (editor != null)
      {
         editor.getViewer().setEditable(!isReadOnly());
         editor.getDocument().set(getFeatureAsString());
      }
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
      editor.getViewer().getControl().setLayoutData(data);

      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(editor.getViewer().getControl(),
            -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(editor.getViewer().getControl(), 0, SWT.TOP);
      label.setLayoutData(data);
   }


   protected String getText()
   {
      return editor.getDocument().get();
   }


   protected ISharedTextColors getSharedColors()
   {
      return EditorsUI.getSharedTextColors();
   }
}

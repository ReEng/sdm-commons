package org.fujaba.commons.properties.section;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.PageBookView;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.fujaba.commons.properties.PropertiesAdapterImpl;
import org.fujaba.commons.properties.util.AdapterUtil;
import org.fujaba.commons.properties.util.MessageManager;


public abstract class AbstractSection extends AbstractPropertySection
{
   public static boolean isBoolean(EAttribute attribute)
   {
      // check
      if (attribute != null)
      {
         return EcorePackage.eINSTANCE.getEBoolean().equals(
               attribute.getEAttributeType());
      }

      return false;
   }


   public static boolean isDouble(EAttribute attribute)
   {
      // check
      if (attribute != null)
      {
         return EcorePackage.eINSTANCE.getEDouble().equals(
               attribute.getEAttributeType());
      }

      return false;
   }


   public static boolean isEnum(EAttribute attribute)
   {
      // check
      if (attribute != null)
      {
         return attribute.getEAttributeType() instanceof EEnum;
      }

      return false;
   }


   public static boolean isInteger(EAttribute attribute)
   {
      // check
      if (attribute != null)
      {
         return EcorePackage.eINSTANCE.getEInt().equals(
               attribute.getEAttributeType());
      }

      return false;
   }

   private EObject element;


   private List<EObject> elements;


   private IStatusLineManager statusLineManager;


   private MessageManager messageManager;


   private Composite section;


   private Adapter modelListener = new PropertiesAdapterImpl()
   {
      @Override
      protected void safeNotifyChanged(Notification msg)
      {
         handleModelChanged(msg);
      }
   };


   @Override
   public void aboutToBeHidden()
   {
      removeListener();
   }


   @Override
   public void aboutToBeShown()
   {
      addListener();
   }


   /**
    * Adds a model listener to this object.
    */
   protected void addListener()
   {
      // check for existence
      if (getElement() != null)
      {
         // check for containing
         if (!getElement().eAdapters().contains(modelListener))
         {
            getElement().eAdapters().add(modelListener);
         }
      }
   }


   /**
    * Clears the existing decorators.
    */
   protected void clearDecorators()
   {
      messageManager.removeAllMessages();
   }


   /**
    * Manages a self-contained set of interrelated EMF models and the {@link Command}s that modify
    * them. The models are maintained in the form of a {@link ResourceSet}. Commands that modify the
    * model are typically created through the domain and are executed using the {@link CommandStack}
    * .
    * 
    * @param oldValue The previous property value
    * @param newValue The new value to set
    */
   protected void createCommand(Object oldValue, Object newValue)
   {
      boolean equals = oldValue == null ? false : oldValue.equals(newValue);
      if (!equals)
      {
         EditingDomain editingDomain = getEditingDomain();
         Object value = newValue;
         if (getElements().size() == 1)
         {
            // apply the property change to single selected object
            editingDomain.getCommandStack().execute(
                  SetCommand.create(editingDomain, getElement(), getFeature(),
                        value));
         }
         else
         {
            CompoundCommand compoundCommand = new CompoundCommand();
            // apply the property change to all selected elements
            for (EObject nextObject : getElements())
            {
               compoundCommand.append(SetCommand.create(editingDomain,
                     nextObject, getFeature(), value));
            }
            editingDomain.getCommandStack().execute(compoundCommand);
         }
      }
   }


   @Override
   public void createControls(Composite parent, TabbedPropertySheetPage page)
   {
      super.createControls(parent, page);

      // create section composite
      section = getWidgetFactory().createFlatFormComposite(parent);

      // create the widgets
      createWidgets(section);

      // set layout data
      setSectionData(section);

      // hook listeners
      hookListeners();

      // create a new message manager
      messageManager = new MessageManager();

      // set status line manager
      statusLineManager = page.getSite().getActionBars().getStatusLineManager();
   }


   /**
    * Section widgets should be created inside this method. To set the layout data the method
    * {@link #setSectionData(Composite)} will be called right afterwards. If widgets have listeners
    * implement they can be hooked in the {@link #hookListeners()} method.
    * 
    * @param parent The parent composite.
    */
   protected abstract void createWidgets(Composite parent);


   protected EditingDomain getEditingDomain()
   {
      IWorkbenchPart part = getPart();

      if (part.getAdapter(EditingDomain.class) != null)
      {
         return (EditingDomain) getPart().getAdapter(EditingDomain.class);
      }

      if (part instanceof IEditingDomainProvider)
      {
         return ((IEditingDomainProvider) part).getEditingDomain();
      }

      if (part.getAdapter(IEditingDomainProvider.class) != null)
      {
         return ((IEditingDomainProvider) part
               .getAdapter(IEditingDomainProvider.class)).getEditingDomain();
      }

      if (part instanceof PageBookView)
      {
         IPage page = ((PageBookView) part).getCurrentPage();
         if (page instanceof IEditingDomainProvider)
         {
            return ((IEditingDomainProvider) page).getEditingDomain();
         }
      }

      throw new IllegalArgumentException();
   }


   protected EObject getElement()
   {
      return element;
   }


   protected List<EObject> getElements()
   {
      return elements;
   }


   /**
    * Get the feature for the section.
    * 
    * @return Should return the feature for the section.
    */
   protected abstract EStructuralFeature getFeature();


   /**
    * Get the label text for the section's feature.
    * 
    * @return Should return the label text for the section's feature.
    */
   protected abstract String getLabelText();


   /**
    * Get the standard label width when labels for sections line up on the left hand side of the
    * composite. They are lined up to a fixed position, but if a string is wider than the fixed
    * position, then that widest string will be used.
    * 
    * @param parent The parent composite used to create a GC.
    * @param label The label.
    * @return Returns the standard label width.
    */
   protected int getStandardLabelWidth(Composite parent, String label)
   {
      return getStandardLabelWidth(parent, new String[] { label });
   }


   /**
    * Get the standard label width when labels for sections line up on the left hand side of the
    * composite. They are lined up to a fixed position, but if a string is wider than the fixed
    * position, then that widest string will be used.
    * 
    * @param parent The parent composite used to create a GC.
    * @param labels The list of labels.
    * @return Returns the standard label width.
    */
   protected int getStandardLabelWidth(Composite parent, String[] labels)
   {
      int standardLabelWidth = STANDARD_LABEL_WIDTH + 15;
      GC gc = new GC(parent);
      int indent = gc.textExtent("XXX").x; //$NON-NLS-1$
      for (int i = 0; i < labels.length; i++)
      {
         int width = gc.textExtent(labels[i]).x;
         if (width + indent > standardLabelWidth)
         {
            standardLabelWidth = width + indent;
         }
      }
      gc.dispose();

      return standardLabelWidth;
   }


   /**
    * This method is called when an event occurred on the model objects.
    * 
    * @param msg The event notification.
    */
   protected void handleModelChanged(Notification msg)
   {
      Object notifier = msg.getNotifier();
      if (notifier.equals(getElement()) && getFeature() != null)
      {
         if (msg.getFeatureID(getElement().getClass()) == getFeature()
               .getFeatureID())
         {
            refresh();
         }
      }
   }


   /**
    * Widgets created at {@link #createWidgets(Composite)} may listen platform events. Set them here
    * in order to improve visibility
    */
   protected void hookListeners()
   {
      // nothing by default
   }


   /**
    * This returns whether the resource is read only in the editing domain.
    * 
    * @return Returns <code>false</code> when the file can be written.
    */
   protected boolean isReadOnly()
   {
      // get resource
      Resource resource = getElement().eResource();

      // get editing domain
      EditingDomain domain = getEditingDomain();

      // return the result
      return domain != null && resource != null && domain.isReadOnly(resource);
   }


   /**
    * Removes the model listener from this object.
    */
   protected void removeListener()
   {
      // check for existence
      if (getElement() != null)
      {
         // check for containing
         if (getElement().eAdapters().contains(modelListener))
         {
            getElement().eAdapters().remove(modelListener);
         }
      }
   }


   private void setDecorator(Control control, String message, int type)
   {
      messageManager.addMessage("", message, null, type, control); //$NON-NLS-1$
   }


   /**
    * Add a decorator to the given control. A tool tip will display the given error message.
    * 
    * @param control The affected control.
    * @param message The message to show.
    */
   protected void setErrorDecorator(Control control, String message)
   {
      setDecorator(control, message, IMessageProvider.ERROR);
   }


   /**
    * Sets the error message to be displayed in the status line.
    * 
    * @param message The message to be displayed, or <code>null</code>.
    */
   protected void setErrorMessage(String message)
   {
      // show the error message
      if (statusLineManager != null)
      {
         statusLineManager.setErrorMessage(message);
      }
   }


   /**
    * Add a decorator to the given control. A tool tip will display the given message.
    * 
    * @param control The affected control.
    * @param message The message to show.
    */
   protected void setInfoDecorator(Control control, String message)
   {
      setDecorator(control, message, IMessageProvider.INFORMATION);
   }


   @Override
   public void setInput(IWorkbenchPart part, ISelection selection)
   {
      super.setInput(part, selection);

      // check for selection type
      if (!(selection instanceof IStructuredSelection))
      {
         return;
      }

      // get selected
      Object selected = ((IStructuredSelection) selection).getFirstElement();

      // remove listener
      removeListener();

      // set the selected element
      element = AdapterUtil.adaptObject(selected);

      // set the selected elements
      elements = new ArrayList<EObject>();

      // go through the selection
      for (Object element : ((IStructuredSelection) selection).toArray())
      {
         EObject realElement = AdapterUtil.adaptObject(element);
         if (realElement != null)
         {
            elements.add(realElement);
         }
      }

      // add listener
      addListener();
   }


   /**
    * Sets the message to be displayed in the status line. This message is displayed when there is
    * no error message.
    * 
    * @param message The message to be displayed, or <code>null</code>.
    */
   protected void setMessage(String message)
   {
      // show the message
      if (statusLineManager != null)
      {
         statusLineManager.setMessage(message);
      }
   }


   /**
    * This method should be implemented to set layout data to the widgets created at
    * {@link #createWidgets(Composite)}. This improves visibility.
    * 
    * @param parent The parent composite.
    */
   protected void setSectionData(Composite parent)
   {
      // nothing by default
   }


   /**
    * Add a decorator to the given control. A tool tip will display the given warning message.
    * 
    * @param control The affected control.
    * @param message The message to show.
    */
   protected void setWarningDecorator(Control control, String message)
   {
      setDecorator(control, message, IMessageProvider.WARNING);
   }
}

package org.fujaba.commons.properties.util;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.IMessagePrefixProvider;
import org.eclipse.ui.forms.widgets.Hyperlink;


public class MessageManager implements IMessageManager
{

   private static final DefaultPrefixProvider DEFAULT_PREFIX_PROVIDER = new DefaultPrefixProvider();

   private List<Message> messages = new ArrayList<Message>();

   private Hashtable<Control, ControlDecorator> decorators = new Hashtable<Control, ControlDecorator>();

   private boolean autoUpdate = true;

   private IMessagePrefixProvider prefixProvider = DEFAULT_PREFIX_PROVIDER;

   private int decorationPosition = SWT.LEFT | SWT.BOTTOM;

   private static FieldDecoration standardError = FieldDecorationRegistry
         .getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);

   private static FieldDecoration standardWarning = FieldDecorationRegistry
         .getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_WARNING);

   static class Message implements IMessage
   {

      Control control;

      Object data;

      Object key;

      String message;

      int type;

      String prefix;


      Message(Object key, String message, int type, Object data)
      {
         this.key = key;
         this.message = message;
         this.type = type;
         this.data = data;
      }


      @Override
      public Object getKey()
      {
         return key;
      }


      @Override
      public String getMessage()
      {
         return message;
      }


      @Override
      public int getMessageType()
      {
         return type;
      }


      @Override
      public Control getControl()
      {
         return control;
      }


      @Override
      public Object getData()
      {
         return data;
      }


      @Override
      public String getPrefix()
      {
         return prefix;
      }
   }

   static class DefaultPrefixProvider implements IMessagePrefixProvider
   {

      @Override
      public String getPrefix(Control c)
      {
         Composite parent = c.getParent();
         Control[] siblings = parent.getChildren();
         for (int i = 0; i < siblings.length; i++)
         {
            if (siblings[i] == c)
            {
               // this is us - go backward until you hit
               // a label-like widget
               for (int j = i - 1; j >= 0; j--)
               {
                  Control label = siblings[j];
                  String ltext = null;
                  if (label instanceof Label)
                  {
                     ltext = ((Label) label).getText();
                  }
                  else if (label instanceof Hyperlink)
                  {
                     ltext = ((Hyperlink) label).getText();
                  }
                  else if (label instanceof CLabel)
                  {
                     ltext = ((CLabel) label).getText();
                  }
                  if (ltext != null)
                  {
                     if (!ltext.endsWith(":")) //$NON-NLS-1$
                        return ltext + ": "; //$NON-NLS-1$
                     return ltext + " "; //$NON-NLS-1$
                  }
               }
               break;
            }
         }
         return null;
      }
   }

   class ControlDecorator
   {

      private ControlDecoration decoration;

      private List<Message> controlMessages = new ArrayList<Message>();

      private String prefix;


      ControlDecorator(Control control)
      {
         this.decoration = new ControlDecoration(control, decorationPosition);
      }


      /**
       * Return true whether the control is disposed
       * 
       * @return true if the control is disposed
       */
      public boolean isDisposed()
      {
         return decoration.getControl() == null;
      }


      void updatePrefix()
      {
         prefix = null;
      }


      void updatePosition()
      {
         Control control = decoration.getControl();
         decoration.dispose();
         this.decoration = new ControlDecoration(control, decorationPosition);
         update();
      }


      String getPrefix()
      {
         if (prefix == null)
            createPrefix();
         return prefix;
      }


      private void createPrefix()
      {
         if (prefixProvider == null)
         {
            prefix = ""; //$NON-NLS-1$
            return;
         }
         prefix = prefixProvider.getPrefix(decoration.getControl());
         if (prefix == null)
            // make a prefix anyway
            prefix = ""; //$NON-NLS-1$
      }


      void addAll(List<Message> target)
      {
         target.addAll(controlMessages);
      }


      void addMessage(Object key, String text, Object data, int type)
      {
         Message message = MessageManager.this.addMessage(getPrefix(), key,
               text, data, type, controlMessages);
         message.control = decoration.getControl();
         if (isAutoUpdate())
            update();
      }


      boolean removeMessage(Object key)
      {
         Message message = findMessage(key, controlMessages);
         if (message != null)
         {
            controlMessages.remove(message);
            if (isAutoUpdate())
               update();
         }
         return message != null;
      }


      boolean removeMessages()
      {
         if (controlMessages.isEmpty())
            return false;
         controlMessages.clear();
         if (isAutoUpdate())
            update();
         return true;
      }


      /**
       * Update
       */
      public void update()
      {
         if (controlMessages.isEmpty())
         {
            decoration.setDescriptionText(null);
            decoration.hide();
         }
         else
         {
            List<Message> peers = createPeers(controlMessages);
            int type = ((IMessage) peers.get(0)).getMessageType();
            String description = createDetails(createPeers(peers), true);
            if (type == IMessageProvider.ERROR)
               decoration.setImage(standardError.getImage());
            else if (type == IMessageProvider.WARNING)
               decoration.setImage(standardWarning.getImage());
            decoration.setDescriptionText(description);
            decoration.show();
         }
      }
   }


   @Override
   public void addMessage(Object key, String messageText, Object data, int type)
   {
      addMessage(null, key, messageText, data, type, messages);
   }


   @Override
   public void addMessage(Object key, String messageText, Object data,
         int type, Control control)
   {
      ControlDecorator dec = decorators.get(control);

      if (dec == null)
      {
         dec = new ControlDecorator(control);
         decorators.put(control, dec);
      }
      dec.addMessage(key, messageText, data, type);
   }


   @Override
   public void removeMessage(Object key)
   {
      Message message = findMessage(key, messages);
      if (message != null)
      {
         messages.remove(message);
      }
   }


   @Override
   public void removeMessages()
   {
      if (!messages.isEmpty())
      {
         messages.clear();
      }
   }


   @Override
   public void removeMessage(Object key, Control control)
   {
      ControlDecorator dec = decorators.get(control);
      if (dec == null)
         return;
      dec.removeMessage(key);
   }


   @Override
   public void removeMessages(Control control)
   {
      ControlDecorator dec = decorators.get(control);
      if (dec != null)
      {
         dec.removeMessages();
      }
   }


   @Override
   public void removeAllMessages()
   {
      for (Enumeration<ControlDecorator> enm = decorators.elements(); enm
            .hasMoreElements();)
      {
         ControlDecorator control = enm.nextElement();
         control.removeMessages();
      }
      if (!messages.isEmpty())
      {
         messages.clear();
      }
   }


   /**
    * Adds the message if it does not already exist in the provided list.
    * 
    * @param prefix
    * @param key
    * @param messageText
    * @param data
    * @param type
    * @param list
    * @return Message
    */
   private Message addMessage(String prefix, Object key, String messageText,
         Object data, int type, List<Message> list)
   {
      Message message = findMessage(key, list);
      if (message == null)
      {
         message = new Message(key, messageText, type, data);
         message.prefix = prefix;
         list.add(message);
      }
      else
      {
         message.message = messageText;
         message.type = type;
         message.data = data;
      }
      return message;
   }


   /**
    * Finds the message with the provided key in the provided list.
    * 
    * @param key
    * @param list
    * @return Message
    */
   private Message findMessage(Object key, List<Message> list)
   {
      for (int i = 0; i < list.size(); i++)
      {
         Message message = list.get(i);
         if (message.getKey().equals(key))
            return message;
      }
      return null;
   }


   @Override
   public void update()
   {
      // Update decorations
      for (ControlDecorator dec : decorators.values())
      {
         dec.update();
      }
   }


   private static String getFullMessage(IMessage message)
   {
      if (message.getPrefix() == null)
         return message.getMessage();
      return message.getPrefix() + message.getMessage();
   }


   private List<Message> createPeers(List<Message> msges)
   {
      List<Message> peers = new ArrayList<Message>();
      int maxType = 0;
      for (int i = 0; i < msges.size(); i++)
      {
         Message message = msges.get(i);
         if (message.type > maxType)
         {
            peers.clear();
            maxType = message.type;
         }
         if (message.type == maxType)
            peers.add(message);
      }
      return peers;
   }


   /**
    * @param msges
    * @param excludePrefix
    * @return String
    */
   private String createDetails(List<Message> msges, boolean excludePrefix)
   {
      StringWriter sw = new StringWriter();
      PrintWriter out = new PrintWriter(sw);

      for (int i = 0; i < msges.size(); i++)
      {
         if (i > 0)
            out.println();
         IMessage m = msges.get(i);
         out.print(excludePrefix ? m.getMessage() : getFullMessage(m));
      }
      out.flush();
      return sw.toString();
   }


   /**
    * @param messages
    * @return String
    */
   public static String createDetails(IMessage[] messages)
   {
      if (messages == null || messages.length == 0)
         return null;
      StringWriter sw = new StringWriter();
      PrintWriter out = new PrintWriter(sw);

      for (int i = 0; i < messages.length; i++)
      {
         if (i > 0)
            out.println();
         out.print(getFullMessage(messages[i]));
      }
      out.flush();
      return sw.toString();
   }


   @Override
   public String createSummary(IMessage[] msges)
   {
      return createDetails(msges);
   }


   @Override
   public IMessagePrefixProvider getMessagePrefixProvider()
   {
      return prefixProvider;
   }


   @Override
   public void setMessagePrefixProvider(IMessagePrefixProvider provider)
   {
      this.prefixProvider = provider;
      for (ControlDecorator dec : decorators.values())
      {
         dec.updatePrefix();
      }
   }


   @Override
   public int getDecorationPosition()
   {
      return decorationPosition;
   }


   @Override
   public void setDecorationPosition(int position)
   {
      this.decorationPosition = position;
      for (ControlDecorator dec : decorators.values())
      {
         dec.updatePosition();
      }
   }


   @Override
   public boolean isAutoUpdate()
   {
      return autoUpdate;
   }


   @Override
   public void setAutoUpdate(boolean autoUpdate)
   {
      boolean needsUpdate = !this.autoUpdate && autoUpdate;
      this.autoUpdate = autoUpdate;
      if (needsUpdate)
         update();
   }
}

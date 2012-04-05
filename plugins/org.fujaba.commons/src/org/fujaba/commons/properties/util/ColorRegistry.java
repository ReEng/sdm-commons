package org.fujaba.commons.properties.util;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;


/**
 * The color registry class helps client to color its sections. This registry manages all the
 * allocated colors and dispose its when the current display is disposed.
 */
public final class ColorRegistry
{

   /**
    * Constant for error color.
    */
   public static Color COLOR_ERROR = getInstance().get("255,128,128"); //$NON-NLS-1$

   /**
    * Constant for warning color.
    */
   public static Color COLOR_WARNING = getInstance().get("249,240,163"); //$NON-NLS-1$

   /**
    * Constant for info color.
    */
   public static Color COLOR_INFO = getInstance().get("128,128,255"); //$NON-NLS-1$

   /**
    * Constant for black color.
    */
   public static Color COLOR_BLACK = getInstance().get("0,0,0"); //$NON-NLS-1$

   /**
    * Constant for white color.
    */
   public static Color COLOR_WHITE = getInstance().get("255,255,255"); //$NON-NLS-1$

   /**
    * Constant for red color.
    */
   public static Color COLOR_RED = getInstance().get("255,0,0"); //$NON-NLS-1$

   /**
    * Constant for green color.
    */
   public static Color COLOR_GREEN = getInstance().get("0,255,0"); //$NON-NLS-1$

   /**
    * Constant for blue color.
    */
   public static Color COLOR_BLUE = getInstance().get("0,0,255"); //$NON-NLS-1$

   /**
    * Constant for a soft grey color.
    */
   public static Color COLOR_SOFT_GREY = getInstance().get("219,211,203"); //$NON-NLS-1$

   private static ColorRegistry instance;


   /**
    * Returns the singleton registry instance
    * 
    * @return the registry
    */
   public static ColorRegistry getInstance()
   {
      if (instance == null)
      {
         instance = new ColorRegistry();
      }

      return instance;
   }

   /**
    * This registries <code>Display</code>. All colors will be allocated using it.
    */
   protected Display display;

   /**
    * Table of known colors, keyed by symbolic color name (key type: <code>String</code>, value
    * type: <code>org.eclipse.swt.graphics.Color</code>.
    */
   private Map<String, Color> colors = new HashMap<String, Color>(7);

   /**
    * Runnable that cleans up the manager on disposal of the display.
    */
   protected Runnable cleanUpRunnable = new Runnable()
   {
      @Override
      public void run()
      {
         clear();
      }
   };


   /**
    * Create a new instance of the receiver that is hooked to the current display.
    */
   private ColorRegistry()
   {
      this(PlatformUI.getWorkbench().getDisplay());
   }


   /**
    * Create a new instance of the receiver.
    * 
    * @param display the <code>Display</code> to hook into.
    */
   private ColorRegistry(Display display)
   {
      Assert.isNotNull(display);
      this.display = display;
      hookDisplayDispose();
   }


   /**
    * Hook a dispose listener on the SWT display.
    */
   private void hookDisplayDispose()
   {
      display.disposeExec(cleanUpRunnable);
   }


   /**
    * Releases all the allocated colors
    */
   private void clear()
   {
      for (Color color : colors.values())
      {
         color.dispose();
      }

      colors.clear();
   }


   /**
    * Returns the <code>color</code> associated with the given symbolic color name, or
    * <code>null</code> if no such definition exists.
    * 
    * @param symbolicName symbolic color name
    * @return the <code>Color</code> or <code>null</code>
    */
   public Color get(String symbolicName)
   {
      Assert.isNotNull(symbolicName);
      if (symbolicName.isEmpty())
      {
         return new Color(display, new RGB(0, 0, 0));
      }

      return get(StringConverter.asRGB(symbolicName));
   }


   /**
    * Returns the <code>color</code> associated with the given RGB object, or <code>null</code> if
    * no such definition exists.
    * 
    * @param rgb the rgb color
    * @return the <code>Color</code> or <code>null</code>
    */
   public Color get(RGB rgb)
   {
      if (rgb == null)
      {
         return null;
      }

      String symbolicName = StringConverter.asString(rgb);
      Object result = colors.get(symbolicName);
      if (result != null)
      {
         return (Color) result;
      }

      Color color = new Color(display, rgb);

      colors.put(symbolicName, color);

      return color;
   }
}

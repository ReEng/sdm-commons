/**
 * 
 */
package de.fujaba.commons.extensionpoints;

import org.eclipse.gef.palette.PaletteRoot;

import de.fujaba.commons.extensionpoints.util.IHierachicalExtension;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public interface IPaletteExtension extends IHierachicalExtension<IPaletteContainerExtension>
{
   /**
    * Unique id of this extensionpoint.
    */
   public final static String PALETTE_EXTENSION_POINT_ID = "de.fujaba.commons.palettes";


   /**
    * Creates a new palette.
    * @return a new palette
    */
   public PaletteRoot createPalette();
}

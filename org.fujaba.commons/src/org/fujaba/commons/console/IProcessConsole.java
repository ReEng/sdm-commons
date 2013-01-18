package org.fujaba.commons.console;


import org.fujaba.commons.console.internal.ProcessConsole;


/**
 * This interface can be used to append messages to a {@link ProcessConsole}. Extend the
 * {@link ConsoleJob} class or use the {@link ProcessConsoleFactory} to receive one.
 * 
 * @noextend This interface should not be extended.
 * @noimplement This interface should not be implemented.
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public interface IProcessConsole
{
   /**
    * Adds a new listener to the console.
    * 
    * @param listener The listener to add.
    * @return Returns <code>true</code> on success, otherwise <code>false</code>.
    */
   boolean addListener(IProcessConsoleListener listener);


   /**
    * Removes an attached listener from the console.
    * 
    * @param listener The listener to remove.
    * @return Returns <code>true</code> on success, otherwise <code>false</code>.
    */
   boolean removeListener(IProcessConsoleListener listener);
}

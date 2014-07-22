package org.fujaba.commons.console;


import org.eclipse.core.runtime.IStatus;


public interface IReportListener
{
   IStatus error(String message, Object... args);


   void warn(String message, Object... args);


   void append(String message, Object... args);


   void task(String message, Object... args);


   void info(String message, Object... args);


   void debug(String message, Object... args);
}

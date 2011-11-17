package org.fujaba.commons.console;


import org.eclipse.core.runtime.IStatus;


public interface IReportListener
{
   String PREFIX_ERROR = "ERROR";

   String PREFIX_WARNING = "WARNING";


   void append(String message, String type);


   void info(String message, Object... args);


   void info(String message);


   void warn(String message);


   IStatus error(String message);
}

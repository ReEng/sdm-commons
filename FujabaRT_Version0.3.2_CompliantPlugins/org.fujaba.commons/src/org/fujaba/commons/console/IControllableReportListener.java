package org.fujaba.commons.console;


import org.fujaba.commons.console.IProcessConsole;
import org.fujaba.commons.console.IReportListener;


public interface IControllableReportListener extends IReportListener
{
   boolean isAborted();


   boolean isPaused();


   IProcessConsole getConsole();
}

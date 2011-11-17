package org.fujaba.commons.console;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.fujaba.commons.FujabaCommonsImages;
import org.fujaba.commons.console.internal.ProcessConsole;


public abstract class AbstractProcessConsoleJob extends Job implements IReportListener
{
   private final ProcessConsole console;


   /**
    * Creates a new console process with the given attributes and connects a new console to it.
    * 
    * @param category The category of the process.
    * @param name The name of the process.
    * @param description The description of the process.
    */
   public AbstractProcessConsoleJob(String category, String name, String description)
   {
      this(category, name, description, FujabaCommonsImages.getDescriptor(FujabaCommonsImages.IMG_CONSOLE_DEFAULT));
   }


   /**
    * Creates a new console process with the given attributes and connects a new console to it.
    * 
    * @param category The category of the process.
    * @param name The name of the process.
    * @param description The description of the process.
    * @param image An image descriptor for the process.
    */
   public AbstractProcessConsoleJob(String category, String name, String description, ImageDescriptor image)
   {
      super(name);
      setUser(true);

      console = (ProcessConsole) ProcessConsoleFactory.createConsole(category, name, description, image);
   }


   @Override
   public final IStatus run(IProgressMonitor monitor)
   {
      // let the console start
      console.fireNewState(ProcessConsoleState.RUNNING);

      // start the process
      IStatus result = start(monitor);

      // check for null
      if (result == null)
      {
         result = Status.CANCEL_STATUS;
      }

      // let the console finish
      if (result.getSeverity() == Status.OK)
      {
         console.fireNewState(ProcessConsoleState.FINISHED);
         monitor.done();
         return result;
      }

      // process has been terminated
      console.fireNewState(ProcessConsoleState.ABORTED);
      monitor.done();
      return result;
   }


   /**
    * Within this method the job is being processed. When possible, you should check the state of the process regularly.
    * For this, check {@link #isPaused()} and {@link #isAborted()} at adequate time.
    * 
    * @param monitor The monitor to be used for reporting progress and responding to cancellation. The monitor is never
    *           <code>null</code>.
    * @return Returns the resulting status of the run.
    */
   public abstract IStatus start(IProgressMonitor monitor);


   @Override
   public final void append(String message, String type)
   {
      console.append(message, type);
   }


   @Override
   public final IStatus error(String message)
   {
      console.append(message, PREFIX_ERROR);
      return Status.CANCEL_STATUS;
   }


   @Override
   public final void info(String message)
   {
      console.append(message);
   }


   @Override
   public final void info(String message, Object... args)
   {
      console.append(String.format(message, args));
   }


   /**
    * Checks whether this process has already been aborted.
    * 
    * @return Returns <code>true</code> when aborted, otherwise <code>false</code>.
    */
   public final boolean isAborted()
   {
      return console.getProcessState().equals(ProcessConsoleState.ABORTED);
   }


   /**
    * Checks whether this process is paused at the moment.
    * 
    * @return Returns <code>true</code> when paused, otherwise <code>false</code>.
    */
   public final boolean isPaused()
   {
      return console.getProcessState().equals(ProcessConsoleState.PAUSED);
   }


   @Override
   public final void warn(String message)
   {
      console.append(message, PREFIX_WARNING);
   }


   @Override
   protected final void canceling()
   {
      console.fireNewState(ProcessConsoleState.ABORTED);
   }


   public final IProcessConsole getConsole()
   {
      return console;
   }
}

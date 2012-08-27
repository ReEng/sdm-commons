package org.fujaba.commons.console;


/**
 * Represents the types of messages that will be reported during a {@link AbstractProcessConsoleJob console job}.
 * 
 * @author Aljoscha Hark
 */
public enum ReportLevel
{
   /**
    * Minimal report level. Will just output the start and end of the process, warnings and errors.
    */
   MINIMAL,

   /**
    * Will report all message types of {@link #MINIMAL} and in addition the start and end of a task.
    */
   TASK,

   /**
    * Will report all message types of {@link #TASK} and in addition all runtime information of the current task.
    */
   INFO,

   /**
    * Will report all message types of {@link #INFO} and in addition all debug messages.
    */
   DEBUG;

   public static String[] getItems()
   {
      String[] items = new String[ReportLevel.values().length];
      for (int i = 0; i < items.length; i++)
      {
         items[i] = ReportLevel.values()[i].name();
      }

      return items;
   }


   public static ReportLevel getItem(int index)
   {
      for (int i = 0; i < ReportLevel.values().length; i++)
      {
         if (index == i)
         {
            return ReportLevel.values()[i];
         }
      }

      return null;
   }


   public static int getIndex(ReportLevel reportLevel)
   {
      for (int i = 0; i < ReportLevel.values().length; i++)
      {
         if (ReportLevel.values()[i].equals(reportLevel))
         {
            return i;
         }
      }

      return -1;
   }


   public static ReportLevel getItem(String string)
   {
      try
      {
         return getItem(Integer.valueOf(string));
      }
      catch (Exception e)
      {
         return ReportLevel.INFO;
      }
   }


   public static String getDescription(ReportLevel reportLevel)
   {
      switch (reportLevel)
      {
         case MINIMAL:
            return "Minimal report level. Will just output the start and end of the process, warnings and errors.";

         case TASK:
            return "Will report all message types of level 'MINIMAL' and in addition the start and end of a task.";

         case INFO:
            return "Will report all message types of level 'TASK' and in addition all runtime information of the current task.";

         case DEBUG:
            return "Will report all message types of level 'INFO' and in addition all debug messages.";

         default:
            return "No further description.";
      }
   }
}

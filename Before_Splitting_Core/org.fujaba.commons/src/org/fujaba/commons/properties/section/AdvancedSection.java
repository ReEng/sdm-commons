package org.fujaba.commons.properties.section;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.SubActionBars;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.fujaba.commons.properties.CustomTabbedPropertySheetPage;
import org.fujaba.commons.properties.TabbedPropertiesContentProvider;


public class AdvancedSection extends AdvancedPropertySection
{
   private SubActionBars subActionBars;

   private CustomTabbedPropertySheetPage propertySheetPage;


   @Override
   public void createControls(Composite parent, TabbedPropertySheetPage page)
   {
      super.createControls(parent, page);
      if (page instanceof CustomTabbedPropertySheetPage)
      {
         propertySheetPage = (CustomTabbedPropertySheetPage)page;
         this.page.setPropertySourceProvider(new TabbedPropertiesContentProvider(
                     propertySheetPage.getAdapterFactory()));
      }

      // create sub action bars
      subActionBars = new SubActionBars(page.getSite().getActionBars());

      // contribute those bars
      page.makeContributions(subActionBars.getMenuManager(),
            subActionBars.getToolBarManager(),
            subActionBars.getStatusLineManager());
   }


   @Override
   public void aboutToBeHidden()
   {
      super.aboutToBeHidden();

      if (subActionBars != null)
      {
         subActionBars.deactivate();
         subActionBars.updateActionBars();
      }
   }


   @Override
   public void aboutToBeShown()
   {
      super.aboutToBeShown();

      if (subActionBars != null)
      {
         subActionBars.activate();
         subActionBars.updateActionBars();
      }
   }


   /**
    * Getter of the PropertySheetPage.
    * 
    * @return Returns the CustomTabbedPropertySheetPage.
    */
   public CustomTabbedPropertySheetPage getPropertySheetPage()
   {
      return propertySheetPage;
   }
}

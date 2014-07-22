package org.fujaba.commons.properties;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


/**
 * The property sheet page to implement to provide the tabbed UI.
 * 
 * @author harka
 */
public class CustomTabbedPropertySheetPage extends TabbedPropertySheetPage
{

   /**
    * This is the adapter factory used for providing views of the model.
    */
   private AdapterFactory adapterFactory;


   public CustomTabbedPropertySheetPage(
         ITabbedPropertySheetPageContributor contributor)
   {
      super(contributor);
   }


   /**
    * This method creates a list of factories used by the editor. Resource, Specification and Ecore
    * adapter factories are added here.
    * Add further factories via inheritance.
    * 
    * @return The list of factories.
    */
   public List<? extends AdapterFactory> getPrincipalAdapterFactories()
   {
      List<AdapterFactory> factories = new ArrayList<AdapterFactory>();

      factories.add(new ResourceItemProviderAdapterFactory());
      factories.add(new EcoreItemProviderAdapterFactory());

      return factories;
   }


   /**
    * This method creates the ComposedAdapterFactory that groups all the factories used by the
    * editor.
    * 
    * @return The composed adapter factory.
    */
   protected ComposedAdapterFactory createAdapterFactory()
   {
      return new ComposedAdapterFactory(getAdapterFactories());
   }


   /**
    * Getter of the adapter factory.
    * 
    * @return Returns the adapter factory.
    */
   public AdapterFactory getAdapterFactory()
   {
      if (adapterFactory == null)
      {
         adapterFactory = createAdapterFactory();
      }

      return adapterFactory;
   }


   @Override
   public void selectionChanged(IWorkbenchPart part, ISelection selection)
   {
      ISelection newSel = selection;
      if (selection instanceof IStructuredSelection)
      {
         // collect unwrapped elements
         List<Object> selected = new ArrayList<Object>();
         for (Object element : ((IStructuredSelection) selection).toList())
         {
            Object unwrapped = AdapterFactoryEditingDomain.unwrap(element);
            selected.add(unwrapped);
         }

         // create new selection
         newSel = new StructuredSelection(selected);
      }

      super.selectionChanged(part, newSel);
   }


   /**
    * This method could be overridden to add specific factories before those.
    * 
    * @return Returns a list which contains types of AdapterFactory.
    */
   protected Collection<? extends AdapterFactory> getAdapterFactories()
   {
      return getPrincipalAdapterFactories();
   }
}

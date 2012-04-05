package org.storydriven.modeling.editor.gef.properties;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.fujaba.commons.properties.CustomTabbedPropertySheetPage;
import org.storydriven.modeling.activities.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.modeling.activities.provider.ActivitiesItemProviderAdapterFactory;


/**
 * The property sheet page to implement to provide the tabbed UI.
 * 
 * @author harka
 */
public class SDMTabbedPropertySheetPage extends CustomTabbedPropertySheetPage
{
   public SDMTabbedPropertySheetPage(
         ITabbedPropertySheetPageContributor contributor)
   {
      super(contributor);
   }


   /**
    * @see org.fujaba.commons.properties.CustomTabbedPropertySheetPage#getPrincipalAdapterFactories()
    */
   @Override
   public List<? extends AdapterFactory> getPrincipalAdapterFactories()
   {
      List<AdapterFactory> factories = new ArrayList<AdapterFactory>();

      factories.add(new ResourceItemProviderAdapterFactory());
      factories.add(new ActivitiesItemProviderAdapterFactory());
      factories.add(new ExpressionsItemProviderAdapterFactory());
      factories.add(new org.storydriven.modeling.patterns.expressions.provider.ExpressionsItemProviderAdapterFactory());
      factories.add(new org.storydriven.modeling.calls.expressions.provider.ExpressionsItemProviderAdapterFactory());
      factories.add(new org.storydriven.modeling.expressions.provider.ExpressionsItemProviderAdapterFactory());
      factories.add(new EcoreItemProviderAdapterFactory());

      return factories;
   }

}

package org.storydriven.modeling.editor.gef.properties;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.fujaba.commons.properties.CustomTabbedPropertySheetPage;
import org.storydriven.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory;
import org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.core.provider.CoreItemProviderAdapterFactory;
import org.storydriven.storydiagrams.activities.expressions.provider.ActivitiesExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.activities.provider.ActivitiesItemProviderAdapterFactory;
import org.storydriven.storydiagrams.calls.expressions.provider.CallsExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.calls.provider.CallsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.patterns.expressions.provider.PatternsExpressionsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.patterns.provider.PatternsItemProviderAdapterFactory;
import org.storydriven.storydiagrams.provider.StorydiagramsItemProviderAdapterFactory;


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
      factories.add(new EcoreItemProviderAdapterFactory());
      
      factories.add(new CoreItemProviderAdapterFactory());
      factories.add(new ExpressionsItemProviderAdapterFactory());
      factories.add(new CommonExpressionsItemProviderAdapterFactory());
      
      factories.add(new StorydiagramsItemProviderAdapterFactory());
      factories.add(new ActivitiesItemProviderAdapterFactory());
      factories.add(new ActivitiesExpressionsItemProviderAdapterFactory());
      factories.add(new PatternsItemProviderAdapterFactory());
      factories.add(new PatternsExpressionsItemProviderAdapterFactory());
      factories.add(new CallsItemProviderAdapterFactory());
      factories.add(new CallsExpressionsItemProviderAdapterFactory());

      return factories;
   }

}

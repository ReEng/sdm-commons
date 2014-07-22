package org.fujaba.commons.properties;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;
import org.fujaba.commons.properties.util.AdapterUtil;


public class TabbedPropertiesContentProvider extends
      AdapterFactoryContentProvider
{

   public TabbedPropertiesContentProvider(AdapterFactory factory)
   {
      super(factory);
   }


   @Override
   public IPropertySource getPropertySource(Object element)
   {
      // try to adapt the object
      EObject adapted = AdapterUtil.adaptObject(element);
      if (adapted != null)
      {
         // return the property source for the adapted
         return super.getPropertySource(adapted);
      }

      // let the super resolve the rest
      return super.getPropertySource(element);
   }
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!-- end-user-doc -->
 * @see org.storydriven.core.util.CoreResourceImpl
 * @generated
 */
public class CoreResourceFactoryImpl extends ResourceFactoryImpl implements CoreResource.Factory
{
   private Boolean useUUIDs;

   /**
    * Creates an instance of the resource factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public CoreResourceFactoryImpl ()
   {
      super();
   }

   public CoreResourceFactoryImpl (boolean useUUIDs)
   {
      this();
      this.useUUIDs = useUUIDs;
   }

   public boolean useUUIDs ()
   {
      if (this.useUUIDs == null)
      {
         this.useUUIDs = USE_UUIDS_DEFAULT;
      }
      return false;
   }

   /**
    * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   @Override
   public Resource createResource (URI uri)
   {
      CoreResource result = useUUIDs() ? new CoreResourceImpl.UUIDs(uri) : new CoreResourceImpl(uri);
      result.setEncoding(CoreResource.DEFAULT_ENCODING);
      return result;
   }

} // SDMResourceFactoryImpl

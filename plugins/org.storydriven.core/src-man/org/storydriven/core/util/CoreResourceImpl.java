/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * @see org.storydriven.core.util.SDMResourceFactoryImpl
 * @generated
 */
public class CoreResourceImpl extends XMIResourceImpl implements CoreResource
{
   public static class UUIDs extends CoreResourceImpl
   {
      public UUIDs (URI uri)
      {
         super(uri);
      }

      @Override
      protected boolean useIDAttributes ()
      {
         return false;
      }

      @Override
      protected boolean useUUIDs ()
      {
         return true;
      }
   }

   /**
    * Creates an instance of the resource.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param uri the URI of the new resource.
    * @generated
    */
   public CoreResourceImpl (URI uri)
   {
      super(uri);
   }

} // SDMResourceImpl

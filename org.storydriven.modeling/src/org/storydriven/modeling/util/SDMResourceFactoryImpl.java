/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.util.SDMResourceImpl
 * @generated
 */
public class SDMResourceFactoryImpl extends ResourceFactoryImpl implements SDMResource.Factory
{
   /**
    * Creates an instance of the resource factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public SDMResourceFactoryImpl ()
   {
      super();
   }

   /**
    * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Resource createResource (URI uri)
   {
      SDMResource result = new SDMResourceImpl(uri);
      result.setEncoding(SDMResource.DEFAULT_ENCODING);
      return result;
   }

} // SDMResourceFactoryImpl

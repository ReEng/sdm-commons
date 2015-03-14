/**
 * 
 */
package org.storydriven.modeling.editor.gef.editor;

import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.fujaba.commons.editor.AbstractPersistableModelViewMultiPageEditor;
import org.fujaba.commons.editor.CommandStackDelegate;
import org.fujaba.commons.notation.HierarchicalNode;
import org.fujaba.commons.providers.ModelViewAdapterFactoryContentProvider;
import org.fujaba.commons.utils.IDUsingResourceFactory;
import org.storydriven.modeling.editor.gef.SdmUiPlugin;
import org.storydriven.modeling.editor.gef.properties.SDMTabbedPropertySheetPage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.OperationExtension;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class SDMEditor extends AbstractPersistableModelViewMultiPageEditor implements ITabbedPropertySheetPageContributor
{
	public static final String FILE_EXTENSION_DIAGRAMS = "diagrams";
	public static final String FILE_EXTENSION_ECORE = "ecore";
	
	private SDMOverviewPage overviewPage;
   private ComposedAdapterFactory adapterFactory;
   private EPackage pack;
   protected PropertySheetPage propertySheetPage;
   public static final String TABBED_PROPERTY_CONTRIBUTOR_ID = "org.fujaba.sdm.ui.property.contributor"; //$NON-NLS-1$  
   
   
   public SDMEditor()
   {
      super();
      this.initializeEditingDomain();
   }
   
   @Override
   public AdapterFactoryEditingDomain getEditingDomain()
   {
      return (AdapterFactoryEditingDomain) super.getEditingDomain();
   }

   /**
    * @see org.fujaba.commons.editor.AbstractMultiPageEditor#initializeEditingDomain()
    */
   @Override
   protected void initializeEditingDomain()
   {
   // Create an adapter factory that yields item providers.
      //
      adapterFactory = new ComposedAdapterFactory(
            ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
      adapterFactory
            .addAdapterFactory(new ResourceItemProviderAdapterFactory());
      adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
      adapterFactory
            .addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

      // Create the command stack that will notify this editor as commands are executed.
      //
      org.eclipse.emf.common.command.CommandStack commandStack = new CommandStackDelegate(
            this.getCommandStack());

      // Add a listener to set the most recent command's affected objects to be the selection of the
      // viewer with focus.
      //
      commandStack.addCommandStackListener(new CommandStackListener()
      {
         public void commandStackChanged(final EventObject event)
         {
            getSite().getShell().getDisplay().asyncExec(new Runnable()
            {
               public void run()
               {
                  firePropertyChange(PROP_DIRTY);

                  if (propertySheetPage != null
                        && !propertySheetPage.getControl().isDisposed())
                  {
                     propertySheetPage.refresh();
                  }
               }
            });
         }
      });

      // Create the editing domain with a special command stack.
      editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
            commandStack, new HashMap<Resource, Boolean>());
      
      editingDomain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new IDUsingResourceFactory());
   }

   @Override
   protected void addPages()
   {
         overviewPage = new SDMOverviewPage(this);
         try
         {
            this.addPage(overviewPage);
         }
         catch (PartInitException e)
         {
            SdmUiPlugin.getDefault().logError("Exception while adding overview page", e);
         }
   }
   
   public EPackage getPackage()
   {
      return this.pack;
   }

   public void addPageFor(Activity activity)
   {      
      IEditorInput input = provideEditorInput(activity);
      try
      {
         int pageIndex = findEditor(input);
         if(pageIndex < 0)
         {
            SDMActivityPage page = new SDMActivityPage(this);
            pageIndex = addPage(page, input);
            setTabsToCloseable(pageIndex, page);
            String name = ((OperationExtension)activity.eContainer()).getOperation().getName();
            setPageText(pageIndex, name);
         }
         this.setActivePage(pageIndex);
      }
      catch (PartInitException e)
      {
         SdmUiPlugin.getDefault().logError("Could not create a new editor page", e);
      }
   }
   
   
   /**
    * Customized, such that we can use the generated EMF.edit item providers and do not need to care
    * for manual property specification.
    * 
    * @see org.fujaba.commons.editor.AbstractSimpleEditorPart#getPropertySheetPage()
    */
   protected PropertySheetPage getPropertySheetPage()
   {
      if (propertySheetPage == null)
      {
         propertySheetPage = new PropertySheetPage();
         propertySheetPage
               .setPropertySourceProvider(new ModelViewAdapterFactoryContentProvider(
                     adapterFactory));
      }
      return propertySheetPage;
   }
   
   /**
    * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
    */
   @Override
   public Object getAdapter(Class adapter)
   {
      if (adapter == IPropertySheetPage.class)
      {
         return new SDMTabbedPropertySheetPage(this);
      }
      else
      {
         return super.getAdapter(adapter);
      }
   }
   
   private Resource loadResource(URI resourceURI)
   {
		Resource resource = null;
		try
		{
			// Load the resource through the editing domain.
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e)
		{
			SdmUiPlugin.getDefault().logError("load on demand failed", e);
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}
		return resource;
   }
   
   @Override
   protected void setInput(IEditorInput input)
   {
      setInputWithNotify(input);
      
      URI resourceURI = EditUIUtil.getURI(getEditorInput());
      Resource resource = null;
      if (FILE_EXTENSION_ECORE.equals(resourceURI.fileExtension()))
      {
    	  // try to find a diagram file for the ecore file
    	  resource = loadResource(resourceURI.appendFileExtension(FILE_EXTENSION_DIAGRAMS));
    	  if (resource == null)
    	  {
    		  resource = loadResource(resourceURI);
    	  }
      }

      EObject rootElement = null;
      try
      {
         rootElement = resource.getContents().get(1);
      }
      catch (Exception e)
      {
         rootElement = resource.getContents().get(0);
      }
      
      if (rootElement instanceof HierarchicalNode) // found the diagram file
      {
         Activity activity = (Activity)((HierarchicalNode) rootElement).getModel();
         OperationExtension ext = (OperationExtension) activity.eContainer();
         
         this.pack = ext.getOperation().getEContainingClass().getEPackage();
         this.modelResource = this.pack.eResource();
         this.diagramResource = resource;
      }
      else if (rootElement instanceof EPackage)
      {
         this.pack = (EPackage) rootElement;
         this.modelResource = this.pack.eResource();
         URI uri = this.modelResource.getURI().appendFileExtension(FILE_EXTENSION_DIAGRAMS);
         this.diagramResource = this.editingDomain.getResourceSet().createResource(uri); 
      }
      else
      {
         MessageDialog.openError(
               getSite().getShell(),
               "Error",
               "Problems occured during loading of resource "
                     + resourceURI.path());
      }
   }

   @Override
   public String getContributorId()
   {
      return TABBED_PROPERTY_CONTRIBUTOR_ID;
   }
}

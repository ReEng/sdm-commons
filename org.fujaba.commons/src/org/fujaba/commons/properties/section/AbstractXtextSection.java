/**
 * 
 */
package org.fujaba.commons.properties.section;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.MarkerAnnotationPreferences;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.fujaba.commons.editor.xtext.EmbeddedXtextEditor;
import org.fujaba.commons.properties.util.TextChangeListener;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public abstract class AbstractXtextSection extends AbstractSection
{
   private static final int VERTICAL_RULER_WIDTH= 12;
   private static final String XTEXT_UI_FORMAT_ACTION = "org.eclipse.xtext.ui.FormatAction";
   private static final String XTEXT_UI_TOGGLE_SL_COMMENT_ACTION = "org.eclipse.xtext.ui.ToggleCommentAction";
   
   private CLabel label;
   private IOverviewRuler fOverviewRuler;
   private IAnnotationAccess fAnnotationAccess;
   private MarkerAnnotationPreferences fAnnotationPreferences;
   private Composite viewerComp;
   private Map<String, IAction> fActions = Maps.newHashMap();
   private List<IAction> fSelectionDependentActions = Lists.newArrayList();
   private List<ActionHandler> fActionHandlers = Lists.newArrayList();
   private XtextSourceViewerConfiguration fViewerConfiguration;
   private EmbeddedXtextEditor editor;
   
   /**
    * A helper to listen for events that indicate that a text field has been changed.
    */
   private TextChangeListener listener;

   protected abstract Injector getInjector();

   protected int getStyle()
   {
      return SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL;
   }

   
   
   @Override
   protected void createWidgets(Composite composite)
   {
      
//      viewerComp = getWidgetFactory().createComposite(composite, getStyle());
//      getInjector().injectMembers(this);
      
//      viewerComp = getWidgetFactory().createComposite(composite);
//      GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
//      viewerComp.setLayoutData(data);
      Injector injector = getInjector();
      editor = new EmbeddedXtextEditor(composite, injector, getStyle());
      
//      viewerComp.setLayout(new GridLayout());
//      GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
//      data.horizontalSpan = 2;
//      viewerComp.setLayoutData(data);
      
      editor.getViewer().getTextWidget().addModifyListener(new ModifyListener() {
         public void modifyText(ModifyEvent e) {
//            if (!editor.getViewer().getTextWidget().getText().equals(getEditedEObject().getAsString())) {
//               getEditor().setDirty(true);
//               getEditor().firePropertyChange(IEditorPart.PROP_DIRTY);
//            } else {
//               getEditor().setDirty(false);
//               getEditor().firePropertyChange(IEditorPart.PROP_DIRTY);
//            }
         }
      });
      editor.getDocument().addModelListener(new IXtextModelListener() {
         public void modelChanged(XtextResource resource) {
//            reconcileChangedModel();
         }
      });

      // we must deactivate the Cut/Copy/Paste global actions contributed by the EditingDomain action bar
      editor.getViewer().getTextWidget().addFocusListener(new FocusListener() {
         public void focusLost(FocusEvent e) {
//            ((ActionBarContributor)getEditor().getActionBarContributor()).activateCCPActions();
         }
         
         public void focusGained(FocusEvent e) {
//            ((ActionBarContributor)getEditor().getActionBarContributor()).deactivateCCPActions();
         }
      });
     
//      fAnnotationPreferences= EditorsPlugin.getDefault().getMarkerAnnotationPreferences();
      
//      viewer = new XtextSourceViewer(composite, new CompositeRuler(), getOverviewRuler(), true, getStyle());
//      XtextDocument document = new XtextDocument();
//      document.set(getFeatureAsString());
//      AnnotationModel annotationModel = new AnnotationModel();
//      if (document instanceof ISynchronizable) {
//         Object lock= ((ISynchronizable)document).getLockObject();
//         if (lock == null) {
//            lock= new Object();
//            ((ISynchronizable)document).setLockObject(lock);
//         }
//         ((ISynchronizable) annotationModel).setLockObject(lock);
//      }
//      viewer.setDocument(document, annotationModel);
//      fViewerConfiguration = fSourceViewerConfigurationProvider.get();
//      viewer.configure(fViewerConfiguration);
//      fHighlightingHelper.install(fViewerConfiguration, viewer);
//      
//      MenuManager manager = new MenuManager(null, null);
//      manager.setRemoveAllWhenShown(true);
//      manager.addMenuListener(new IMenuListener() {
//         public void menuAboutToShow(IMenuManager mgr) {
//            AbstractXtextSection.this.menuAboutToShow(mgr);
//         }
//      });
//      StyledText text = viewer.getTextWidget();
//      Menu menu = manager.createContextMenu(text);
//      text.setMenu(menu);
      
   // create label
      label = getWidgetFactory().createCLabel(composite, getLabelText(),
            SWT.TRAIL);

      // set tool tip
      String tooltip = getTooltip();
      if (tooltip != null && !tooltip.isEmpty())
      {
         label.setToolTipText(tooltip);
      }
      else
      {
         label.setToolTipText(null);
      }
   }
   
   
   
   /**
    * Returns the overview ruler.
    *
    * @return the overview ruler
    */
   private IOverviewRuler getOverviewRuler()
   {
      if (fOverviewRuler == null && (getStyle() & SWT.V_SCROLL) != 0)
         fOverviewRuler = createOverviewRuler(getSharedColors());
      return fOverviewRuler;
   }
   

   private IOverviewRuler createOverviewRuler(ISharedTextColors sharedColors)
   {
      IOverviewRuler ruler = new OverviewRuler(getAnnotationAccess(), VERTICAL_RULER_WIDTH, sharedColors);

      Iterator<?> e = fAnnotationPreferences.getAnnotationPreferences().iterator();
      while (e.hasNext())
      {
         AnnotationPreference preference = (AnnotationPreference) e.next();
         if (preference.contributesToHeader())
            ruler.addHeaderAnnotationType(preference.getAnnotationType());
      }
      return ruler;
   }
   
   /**
    * Returns the annotation access.
    *
    * @return the annotation access
    */
   private IAnnotationAccess getAnnotationAccess()
   {
      if (fAnnotationAccess == null)
         fAnnotationAccess = new DefaultMarkerAnnotationAccess()
         {
            @Override
            public int getLayer(Annotation annotation)
            {
               if (annotation.isMarkedDeleted())
               {
                  return IAnnotationAccessExtension.DEFAULT_LAYER;
               }
               return super.getLayer(annotation);
            }
         };
      return fAnnotationAccess;
   }

   
   /**
    * Handle action when the focus is gained. Default action is to do nothing. Clients may override
    * this method if they desire a particular action to be executed when the text control gain the
    * focus.
    */
   protected void focusIn()
   {
      // do nothing
   }


   /**
    * Handle action when the focus is lost. Default action is to do nothing. Clients may override
    * this method if they desire a particular action to be executed when the text control lost the
    * focus.
    */
   protected void focusOut()
   {
      // do nothing
   }


   protected abstract String getErrorMessage();


   /**
    * Get the value of the feature as text for the text field for the section.
    * 
    * @return Should return the value of the feature as text.
    */
   protected abstract String getFeatureAsString();


   /**
    * Get the new value of the feature from the text field of the section.
    * 
    * @param newText the new value of the feature as a string.
    * @return the new value of the feature.
    */
   protected abstract Object getNewFeatureValue(String newText);


   /**
    * Returns the feature value from the model as an object type.
    * 
    * @return the feature object
    */
   protected abstract Object getOldFeatureValue();
   
   
   protected abstract String getTooltip();


   protected void handleTextModified()
   {
      if (isTextValid())
      {
         createCommand(getOldFeatureValue(), getNewFeatureValue(editor.getDocument().get()));
      }
      else
      {
         refresh();
      }
   }



   @Override
   protected void hookListeners()
   {      
      editor.getViewer().addTextListener(new ITextListener()
      {
         @Override
         public void textChanged(TextEvent event)
         {
            handleTextModified();
         }
      });

      editor.getControl().addListener(SWT.Modify, new Listener()
      {
         @Override
         public void handleEvent(Event e)
         {
            verifyField(e);
         }
      });
   }




   protected boolean isTextValid()
   {
      return true;
   }



   @Override
   public void refresh()
   {
      if(editor != null)
      {
         editor.getViewer().setEditable(!isReadOnly());
         editor.getDocument().set(getFeatureAsString());
      }
   }



   @Override
   protected void setSectionData(Composite composite)
   {      
      FormData data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(composite,
            new String[] { getLabelText() }));
      data.right = new FormAttachment(100, 0);
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      data.bottom = new FormAttachment(100, 0);
      editor.getViewer().getControl().setLayoutData(data);
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(editor.getViewer().getControl(), -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(editor.getViewer().getControl(), 0, SWT.TOP);
      label.setLayoutData(data);
   }




   protected void verifyField(Event e)
   {
//      String value = ""; //TODO: Parse and validate
//      if (value == null || value.isEmpty() || isTextValid())
//      {
//         setErrorMessage(null);
////         getText().setBackground(null);
//         e.doit = true;
//      }
//      else
//      {
//         setErrorMessage(getErrorMessage());
////         getText().setBackground(ColorRegistry.COLOR_ERROR);
//         e.doit = false;
//      }
   }



   protected String getText()
   {
      return editor.getDocument().get();
   }

   

   private ISharedTextColors getSharedColors() {
      return EditorsUI.getSharedTextColors();
   }
}

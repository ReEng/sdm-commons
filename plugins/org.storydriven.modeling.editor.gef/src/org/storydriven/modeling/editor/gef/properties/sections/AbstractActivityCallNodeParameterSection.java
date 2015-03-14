/**
 * 
 */
package org.storydriven.modeling.editor.gef.properties.sections;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.fujaba.commons.properties.section.AbstractSection;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.modeling.editor.gef.properties.util.ConfigureParameterBindingDialog;
import org.storydriven.modeling.editor.gef.utils.Expr2String;
import org.storydriven.modeling.editor.gef.utils.ModelHelper;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.ParameterBinding;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
abstract public class AbstractActivityCallNodeParameterSection extends AbstractSection
{

   private CLabel label;


   private Composite area;

   private TableViewer viewer;

   private Composite controlArea;

   private Button cfgButton;

   private Button delButton;


   private EParameter selectedParameter;

   
   protected Viewer getViewer()
   {
      return this.viewer;
   }

   @Override
   protected void createWidgets(Composite parent)
   {
      // property label
      label = getWidgetFactory()
            .createCLabel(parent, getLabelText(), SWT.TRAIL);

      // property area
      area = getWidgetFactory().createFlatFormComposite(parent);

      // parameter binding viewer
      int style = SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION;
      viewer = new TableViewer(area, style);
      viewer.setContentProvider(new ArrayContentProvider());
      viewer.setLabelProvider(new ParameterBindingsLabelProvider());
      viewer.getTable().setHeaderVisible(true);
      viewer.getTable().setLinesVisible(true);

      TableColumn typeColumn = new TableColumn(viewer.getTable(), SWT.LEAD);
      typeColumn.setText("Parameter");
      typeColumn.setWidth(300);

      TableColumn nameColumn = new TableColumn(viewer.getTable(), SWT.LEAD);
      nameColumn.setText("Binding");
      nameColumn.setWidth(200);

      // control area
      style = SWT.PUSH | SWT.CENTER;
      String text = ""; //$NON-NLS-1$
      controlArea = getWidgetFactory().createFlatFormComposite(area);

      cfgButton = getWidgetFactory().createButton(controlArea, text, style);
      cfgButton.setText("Config"); // TODO: image

      delButton = getWidgetFactory().createButton(controlArea, text, style);
      delButton.setText("Remove"); // TODO: image
   }


   @Override
   protected void hookListeners()
   {
      viewer.addSelectionChangedListener(new ISelectionChangedListener()
      {
         @Override
         public void selectionChanged(SelectionChangedEvent event)
         {
            if (!event.getSelection().isEmpty())
            {
               Object selected = ((IStructuredSelection) event.getSelection())
                     .getFirstElement();
               if (selected instanceof EParameter)
               {
                  // cache
                  selectedParameter = (EParameter) selected;

                  if (hasBinding())
                  {
                     cfgButton.setText("Edit");

                     cfgButton.setEnabled(true);
                     delButton.setEnabled(true);
                  }
                  else
                  {
                     cfgButton.setText("Add");

                     cfgButton.setEnabled(true);
                     delButton.setEnabled(false);
                  }

                  return;
               }
            }

            selectedParameter = null;
            cfgButton.setEnabled(false);
            delButton.setEnabled(false);
         }
      });

      cfgButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            // find parameter binding
            boolean addBinding = false;
            boolean addExpression = false;
            ParameterBinding binding = null;
            TextualExpression bindingExpression = null;

            for (ParameterBinding possible : getElement()
                  .getOwnedParameterBindings())
            {
               if (selectedParameter.equals(possible.getParameter()))
               {
                  binding = possible;
                  break;
               }
            }

            // create a new binding
            if (binding == null)
            {
               addBinding = true;
               binding = CallsFactory.eINSTANCE.createParameterBinding();
               binding.setParameter(selectedParameter);
            }


            // create textual expression
            if (binding.getValueExpression() == null)
            {
               addExpression = true;
               bindingExpression = ExpressionsFactory.eINSTANCE
                     .createTextualExpression();

               if (addBinding)
               {
                  addExpression = false;
                  binding.setValueExpression(bindingExpression);
               }
            }
            else
            {
               // find textual expression
               if (binding.getValueExpression() instanceof TextualExpression)
               {
                  bindingExpression = (TextualExpression) binding
                        .getValueExpression();
               }
               else
               {
                  System.out
                        .println("there is already a non-textual expression bound to the parameter");
                  return;
               }
            }

            // create dialog
            ConfigureParameterBindingDialog dialog = new ConfigureParameterBindingDialog(
                  binding);

            // open it
            if (dialog.open() == Window.OK)
            {
               // prepare command
               CompoundCommand command = new CompoundCommand(
                     "Configure Parameter Binding");

               EditingDomain domain = getEditingDomain();
               Object owner;
               Object feature;
               Object value;

               // set language value
               owner = bindingExpression;
               feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE;
               value = dialog.getLanguage();
               command.append(SetCommand.create(domain, owner, feature, value));

               // set language version
               feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION;
               value = dialog.getLanguageVersion();
               command.append(SetCommand.create(domain, owner, feature, value));

               // set expression text
               feature = ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT;
               value = dialog.getExpressionText();
               command.append(SetCommand.create(domain, owner, feature, value));
               
               // add expression to binding
               if (addExpression)
               {
                  owner = binding;
                  feature = CallsPackage.Literals.PARAMETER_BINDING__VALUE_EXPRESSION;
                  value = bindingExpression;
                  command.append(AddCommand.create(domain, owner, feature,
                        value));
               }
               
               // add binding to activity call node
               if (addBinding)
               {
                  owner = getElement();
                  feature = CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS;
                  value = binding;
                  command.append(AddCommand.create(domain, owner, feature,
                        value));
               }

               // execute the command
               getEditingDomain().getCommandStack().execute(command.unwrap());
               refresh();
            }
         }
      });

      delButton.addSelectionListener(new SelectionAdapter()
      {
         @Override
         public void widgetSelected(SelectionEvent e)
         {
            // get selected binding
            ParameterBinding binding = getBinding(selectedParameter);

            if (binding != null)
            {
               getEditingDomain().getCommandStack().execute(
                     DeleteCommand.create(getEditingDomain(), binding));
            }
         }
      });
   }


   @Override
   protected void setSectionData(Composite parent)
   {
      // area layout
      GridLayoutFactory.fillDefaults().numColumns(2).applyTo(area);

      // table
      GridDataFactory.fillDefaults().grab(true, true)
            .applyTo(viewer.getControl());

      // control area
      GridLayoutFactory.fillDefaults().applyTo(controlArea);
      GridDataFactory.fillDefaults().grab(false, true).applyTo(controlArea);

      // buttons
      GridDataFactory.fillDefaults().grab(true, false).applyTo(cfgButton);
      GridDataFactory.fillDefaults().grab(true, false).applyTo(delButton);

      // property area
      FormData data = new FormData();
      data.left = new FormAttachment(0, getStandardLabelWidth(parent,
            new String[] { getLabelText() }));
      data.right = new FormAttachment(100, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
      data.bottom = new FormAttachment(100, 0);
      area.setLayoutData(data);

      // label
      data = new FormData();
      data.left = new FormAttachment(0, 0);
      data.right = new FormAttachment(area, -ITabbedPropertyConstants.HSPACE);
      data.top = new FormAttachment(area, 0, SWT.TOP);
      label.setLayoutData(data);
   }


   @Override
   public void refresh()
   {
      // viewer state
      viewer.getTable().setEnabled(hasCallee());

      // buttons state
      cfgButton.setEnabled(hasCallee() && selectedParameter != null);
      delButton.setEnabled(hasCallee() && hasBinding());
   }


   protected boolean hasCallee()
   {
      return getElement().getCallee() != null;
   }


   protected boolean hasBinding()
   {
      return getBinding(selectedParameter) != null;
   }


   private ParameterBinding getBinding(EParameter parameter)
   {
      if (parameter != null)
      {
         for (ParameterBinding possible : getElement()
               .getOwnedParameterBindings())
         {
            if (parameter.equals(possible.getParameter()))
            {
               return possible;
            }
         }
      }

      return null;
   }


   @Override
   protected void addListener()
   {
      // add listener to element
      super.addListener();

      // add listener to callee
      if (getElement() != null && getElement().getCallee() != null)
      {
         getElement().getCallee().eAdapters().add(getModelListener());
      }
   }


   @Override
   protected void removeListener()
   {
      // remove listener from element
      super.removeListener();

      // remove listener from callee
      if (getElement() != null && getElement().getCallee() != null)
      {
         getElement().getCallee().eAdapters().remove(getModelListener());
      }
   }


   @Override
   protected void handleModelChanged(Notification msg)
   {
      // handle element notifications
      super.handleModelChanged(msg);

      // handle parameter bindings
      if (CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS.equals(msg
            .getFeature()))
      {
         refresh();
      }

      // handle callee notifications
      if (CallsPackage.Literals.INVOCATION__CALLEE.equals(msg.getFeature()))
      {
         // TODO: make the table fit vertically
         refresh();
      }
   }


   @Override
   protected ActivityCallNode getElement()
   {
      return (ActivityCallNode) super.getElement();
   }


   @Override
   protected EStructuralFeature getFeature()
   {
      return CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS;
   }


   private class ParameterBindingsLabelProvider extends LabelProvider implements
         ITableLabelProvider
   {

      @Override
      public Image getColumnImage(Object element, int columnIndex)
      {
         // TODO Auto-generated method stub
         return null;
      }


      @Override
      public String getColumnText(Object element, int index)
      {
         // get the value
         EParameter param = (EParameter) element;

         // create the text
         StringBuilder text = new StringBuilder();

         switch (index)
         {
            case 0:
               // type + name
               text.append(param.getName());
               text.append(": "); //$NON-NLS-1$
               text.append(ModelHelper.getText(param.getEType()));
               break;

            case 1:
               // binding
               ParameterBinding binding = getBinding(param);
               if (binding != null)
               {
                  text.append(Expr2String.toString(binding.getValueExpression()));
               }
               else
               {
                  text.append("\u00ABno binding\u00BB");
               }
               break;

            default:
               break;
         }

         return text.toString();
      }
   }
}

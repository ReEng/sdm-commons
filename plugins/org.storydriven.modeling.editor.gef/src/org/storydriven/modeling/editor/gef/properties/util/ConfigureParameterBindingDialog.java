package org.storydriven.modeling.editor.gef.properties.util;


import java.security.InvalidParameterException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.modeling.editor.gef.utils.ModelHelper;
import org.storydriven.storydiagrams.calls.ParameterBinding;


public class ConfigureParameterBindingDialog extends TitleAreaDialog
{
   private ParameterBinding binding;

   private Text languageField;

   private Text languageVersionField;

   private Text expressionTextField;

   private String language;

   private String languageVersion;

   private String expressionText;


   public ConfigureParameterBindingDialog(ParameterBinding binding)
   {
      super(PlatformUI.getWorkbench().getDisplay().getActiveShell());

      // ensure existence
      if (binding == null || binding.getValueExpression() == null
            || !(binding.getValueExpression() instanceof TextualExpression))
      {
         throw new InvalidParameterException();
      }

      this.binding = binding;

      TextualExpression expression = (TextualExpression) binding
            .getValueExpression();

      language = expression.getLanguage();
      if (language == null)
      {
         language = "OCL"; //$NON-NLS-1$
      }

      languageVersion = expression.getLanguageVersion();
      if (languageVersion == null)
      {
         languageVersion = ""; //$NON-NLS-1$
      }

      expressionText = expression.getExpressionText();
      if (expressionText == null)
      {
         expressionText = ""; //$NON-NLS-1$
      }
   }


   @Override
   protected void configureShell(Shell newShell)
   {
      super.configureShell(newShell);

      EClassifier parameterType = binding.getParameter().getEType();

      String text = "Parameter Binding for %1$s";
      newShell.setText(String.format(text, ModelHelper.getText(parameterType)));
   }


   @Override
   protected void createButtonsForButtonBar(Composite parent)
   {
      createButton(parent, IDialogConstants.OK_ID, "Save", true);
      createButton(parent, IDialogConstants.CANCEL_ID,
            IDialogConstants.CANCEL_LABEL, false);
   }


   @Override
   protected Control createContents(Composite parent)
   {
      Control contents = super.createContents(parent);

      EParameter parameter = binding.getParameter();

      StringBuilder parameterText = new StringBuilder();
      parameterText.append(parameter.getName());
      parameterText.append(": "); //$NON-NLS-1$
      parameterText.append(ModelHelper.getText(parameter.getEType()));

      String message = "Configure the binding expression for the parameter '%1$s'.";

      message += "\nCurrently only a simple textual expression can be defined!";

      setTitle("Configure Parameter Binding");
      setMessage(String.format(message, parameterText));

      return contents;
   }


   @Override
   protected Control createDialogArea(Composite content)
   {
      Composite parent = (Composite) super.createDialogArea(content);

      Composite main = new Composite(parent, SWT.NONE);
      GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2)
            .applyTo(main);
      GridDataFactory.fillDefaults().grab(true, true).applyTo(main);

      // language
      Label languageLabel = new Label(main, SWT.TRAIL);
      languageLabel.setText("Language:");
      GridDataFactory.fillDefaults().applyTo(languageLabel);

      languageField = new Text(main, SWT.BORDER | SWT.LEAD | SWT.SINGLE);
      GridDataFactory.fillDefaults().grab(true, false).applyTo(languageField);
      languageField.addModifyListener(new ModifyListener()
      {
         @Override
         public void modifyText(ModifyEvent e)
         {
            language = languageField.getText();
         }
      });

      // language version
      Label languageVersionLabel = new Label(main, SWT.TRAIL);
      languageVersionLabel.setText("Version:");
      GridDataFactory.fillDefaults().applyTo(languageVersionLabel);

      languageVersionField = new Text(main, SWT.BORDER | SWT.LEAD | SWT.SINGLE);
      GridDataFactory.fillDefaults().applyTo(languageVersionField);
      languageVersionField.addModifyListener(new ModifyListener()
      {
         @Override
         public void modifyText(ModifyEvent e)
         {
            languageVersion = languageVersionField.getText();
         }
      });

      // value
      Label valueLabel = new Label(main, SWT.TRAIL);
      valueLabel.setText("Value:");
      GridDataFactory.fillDefaults().applyTo(valueLabel);

      expressionTextField = new Text(main, SWT.BORDER | SWT.LEAD | SWT.MULTI
            | SWT.WRAP);
      expressionTextField.setText("\n\n\n\n\n");
      GridDataFactory.fillDefaults().grab(true, true)
            .applyTo(expressionTextField);
      expressionTextField.addModifyListener(new ModifyListener()
      {
         @Override
         public void modifyText(ModifyEvent e)
         {
            expressionText = expressionTextField.getText();
         }
      });

      // init values
      languageField.setText(language);
      languageVersionField.setText(languageVersion);
      expressionTextField.setText(expressionText);

      return parent;
   }


   public String getLanguage()
   {
      return language;
   }


   public String getLanguageVersion()
   {
      return languageVersion;
   }


   public String getExpressionText()
   {
      return expressionText;
   }
}

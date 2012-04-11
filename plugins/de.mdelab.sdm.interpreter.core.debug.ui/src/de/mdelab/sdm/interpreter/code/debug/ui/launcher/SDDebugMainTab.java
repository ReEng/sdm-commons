package de.mdelab.sdm.interpreter.code.debug.ui.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.mdelab.sdm.interpreter.code.debug.ui.SDDebugUiConstants;

public abstract class SDDebugMainTab extends AbstractLaunchConfigurationTab
{
	private Text	textServerAddress	= null;
	private Text	textServerPort		= null;

	@Override
	public void createControl(Composite parent)
	{
		Composite compositeMain = this.createComposite(parent, 1, 1, GridData.FILL_HORIZONTAL);
		this.setControl(compositeMain);

		Label descriptionLabel = new Label(compositeMain, SWT.NONE);
		descriptionLabel.setText("Enter the connection details to connect to the Debug Server.");

		// Server address Group
		this.createServerAddressGroup(compositeMain);

		// Server port Group
		this.createServerPortGroup(compositeMain);
	}

	private void createServerAddressGroup(Composite compositeMain)
	{
		Group groupServer = this.createGroup(compositeMain, "Server Adress", 1);

		this.textServerAddress = this.createSingleText(groupServer, "Enter the adress of the server.");

		this.textServerAddress.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				SDDebugMainTab.this.setDirty(true);
				SDDebugMainTab.this.updateLaunchConfigurationDialog();
			}
		});
	}

	private void createServerPortGroup(Composite compositeMain)
	{
		Group groupServer = this.createGroup(compositeMain, "Server Port", 1);

		this.textServerPort = this.createSingleText(groupServer, "Enter the server port.");

		this.textServerPort.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				SDDebugMainTab.this.setDirty(true);
				SDDebugMainTab.this.updateLaunchConfigurationDialog();
			}
		});

	}

	@Override
	public String getName()
	{
		return "Connection Details";
	}

	@Override
	public boolean isValid(ILaunchConfiguration configuration)
	{

		this.setErrorMessage(null);

		String serverAddressString = "", serverPortString = "";

		try
		{
			serverAddressString = configuration.getAttribute(SDDebugUiConstants.ATTR_SERVER_ADDRESS, "");
			serverPortString = configuration.getAttribute(SDDebugUiConstants.ATTR_SERVER_PORT, "");
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}

		if (serverAddressString.equals(""))
		{
			this.setErrorMessage("Server Address cannot be empty!");
			return false;
		}

		if (!serverPortString.matches("[0-9]*"))
		{
			this.setErrorMessage("Server Port has to be a number!");
			return false;
		}

		return true;
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration)
	{

		this.initializeTextFieldFromAttribute(this.textServerAddress, SDDebugUiConstants.ATTR_SERVER_ADDRESS, configuration, "");

		this.initializeTextFieldFromAttribute(this.textServerPort, SDDebugUiConstants.ATTR_SERVER_PORT, configuration, "");

	}

	private void initializeTextFieldFromAttribute(Text textfield, String attrName, ILaunchConfiguration configuration, String defaultString)
	{
		try
		{
			String s = configuration.getAttribute(attrName, "");

			if (!"".equals(s))
			{
				textfield.setText(s);
			}
			else
			{
				textfield.setText(defaultString);
			}
		}
		catch (CoreException e)
		{
			textfield.setText(defaultString);
		}
		catch (IllegalArgumentException e)
		{
			textfield.setText(defaultString);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration)
	{
		configuration.setAttribute(SDDebugUiConstants.ATTR_SERVER_ADDRESS, this.textServerAddress.getText());
		configuration.setAttribute(SDDebugUiConstants.ATTR_SERVER_PORT, this.textServerPort.getText());

		this.setDirty(false);
	}

	protected Composite createComposite(Composite parent, int columns, int hspan, int fill)
	{
		Composite g = new Composite(parent, SWT.NONE);
		g.setLayout(new GridLayout(columns, false));
		g.setFont(parent.getFont());
		GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
		g.setLayoutData(gd);
		return g;
	}

	protected Group createGroup(Composite parent, String text, int columns)
	{
		Group g = new Group(parent, SWT.NONE);
		g.setLayout(new GridLayout(columns, false));
		g.setText(text);
		g.setFont(parent.getFont());
		GridData gd = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd.widthHint = 640;
		g.setLayoutData(gd);

		return g;
	}

	protected Text createSingleText(Composite parent, String toolTipText)
	{
		Text t = new Text(parent, SWT.SINGLE | SWT.BORDER);
		t.setFont(parent.getFont());
		t.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		t.setToolTipText(toolTipText);
		return t;
	}

	protected static Combo createCombo(Composite parent, int style, int hspan, String[] items)
	{
		Combo c = new Combo(parent, style);
		c.setFont(parent.getFont());
		GridData gd = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd.horizontalSpan = hspan;
		c.setLayoutData(gd);
		if (items != null)
		{
			c.setItems(items);
		}
		c.select(0);
		return c;
	}

	@Override
	public abstract void setDefaults(ILaunchConfigurationWorkingCopy configuration);
}

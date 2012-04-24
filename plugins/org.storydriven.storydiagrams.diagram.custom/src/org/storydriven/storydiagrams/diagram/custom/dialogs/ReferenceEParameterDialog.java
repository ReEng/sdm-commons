package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;

import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.storydriven.storydiagrams.diagram.custom.Activator;
import org.storydriven.storydiagrams.diagram.custom.providers.EParametersLabelProvider;

public class ReferenceEParameterDialog extends TitleAreaDialog {
	private TableViewer typeViewer;
	private Collection<EParameter> eParameters;
	private EParameter eParameter;

	public ReferenceEParameterDialog(Shell shell) {
		super(shell);
		setHelpAvailable(false);
	}

	public void setEParameters(Collection<EParameter> eParameters) {
		this.eParameters = eParameters;
	}

	public EParameter getEParameter() {
		return eParameter;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// meta data
		setTitle("Reference In Parameter");
		setMessage("Select the input parameter that should be referenced as output parameter.");

		Composite areaComposite = (Composite) super.createDialogArea(parent);

		Composite mainComposite = new Composite(areaComposite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(mainComposite);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(mainComposite);

		// type group
		Group typeGroup = new Group(mainComposite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(typeGroup);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(typeGroup);
		typeGroup.setText("In Parameter");

		typeViewer = new TableViewer(typeGroup, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(typeViewer.getControl());
		typeViewer.setContentProvider(new ArrayContentProvider());
		typeViewer.setLabelProvider(new EParametersLabelProvider());
		typeViewer.setUseHashlookup(true);
		typeViewer.setInput(eParameters);

		// hook listeners
		hookListeners();

		return mainComposite;
	}

	private void hookListeners() {
		typeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) typeViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof EParameter) {
						eParameter = (EParameter) element;
					}
				} else {
					eParameter = null;
				}
				checkButtons();
			}
		});

		typeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) typeViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof EParameter) {
						eParameter = (EParameter) element;
						okPressed();
					}
				} else {
					eParameter = null;
				}
				if (getReturnCode() != Window.OK) {
					checkButtons();
				}
			}
		});
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Reference Parameter");
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		String sectionName = getClass().getCanonicalName();

		IDialogSettings plugin = Activator.getInstance().getDialogSettings();
		IDialogSettings dialog = plugin.getSection(sectionName);
		if (dialog == null) {
			dialog = plugin.addNewSection(sectionName);
		}
		return dialog;
	}

	private void checkButtons() {
		getButton(IDialogConstants.OK_ID).setEnabled(eParameter != null);
	}
}

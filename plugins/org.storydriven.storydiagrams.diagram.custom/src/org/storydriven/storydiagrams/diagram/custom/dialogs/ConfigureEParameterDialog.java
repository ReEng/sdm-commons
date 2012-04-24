package org.storydriven.storydiagrams.diagram.custom.dialogs;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.Activator;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesContentProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.ResourcesLabelProvider;

public class ConfigureEParameterDialog extends TitleAreaDialog {
	private EClassifier eClassifier;
	private String name;

	private boolean isOutgoing;
	private boolean isCreating;
	private Text nameText;
	private TreeViewer typeViewer;
	private Activity activity;
	private Text filterText;

	public ConfigureEParameterDialog(Shell shell) {
		super(shell);
		setHelpAvailable(false);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EClassifier getEClassifier() {
		return eClassifier;
	}

	public void setEClassifier(EClassifier eClassifier) {
		this.eClassifier = eClassifier;
	}

	public void setCreating(boolean isCreating) {
		this.isCreating = isCreating;
	}

	public void setOutgoing(boolean isOutgoing) {
		this.isOutgoing = isOutgoing;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// meta data
		getShell().setText(getShellText());
		setTitle(getTitle());
		setMessage(getDescription());

		Composite areaComposite = (Composite) super.createDialogArea(parent);

		Composite mainComposite = new Composite(areaComposite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(mainComposite);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(mainComposite);

		// type group
		Group typeGroup = new Group(mainComposite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(typeGroup);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(typeGroup);
		typeGroup.setText("Type");

		// filter
		Composite filterComposite = new Composite(typeGroup, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterComposite);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(filterComposite);

		Label filterLabel = new Label(filterComposite, SWT.TRAIL);
		filterLabel.setText("Filter:");

		filterText = new Text(filterComposite, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		filterText.setEnabled(false);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filterText);

		typeViewer = new TreeViewer(typeGroup, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(typeViewer.getControl());
		typeViewer.setContentProvider(new ResourcesContentProvider());
		typeViewer.setLabelProvider(new ResourcesLabelProvider());
		typeViewer.setUseHashlookup(true);
		typeViewer.setInput(activity);

		// name stuff
		Composite nameComposite = new Composite(mainComposite, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(nameComposite);
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2).applyTo(nameComposite);

		Label nameLabel = new Label(nameComposite, SWT.TRAIL);
		nameLabel.setText("Name:");

		nameText = new Text(nameComposite, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(nameText);

		// hook listeners
		hookListeners();

		if (name != null) {
			nameText.setText(name);
			nameText.selectAll();
		}
		if (eClassifier != null) {
			EPackage ePackage = eClassifier.getEPackage();
			while (ePackage != null) {
				typeViewer.setExpandedState(ePackage.eResource(), true);
				typeViewer.setExpandedState(ePackage, true);
				ePackage = ePackage.getESuperPackage();
			}
			typeViewer.setSelection(new StructuredSelection(eClassifier), true);
		}

		return mainComposite;
	}

	private String getShellText() {
		if (isOutgoing) {
			return "Output Parameter";
		} else {
			return "Input Parameter";
		}
	}

	private String getTitle() {
		if (isCreating) {
			if (isOutgoing) {
				return "Create Output Parameter";
			} else {
				return "Create Input Parameter";
			}
		} else {
			if (isOutgoing) {
				return "Configure Output Parameter";
			} else {
				return "Configure Input Parameter";
			}
		}
	}

	private String getDescription() {
		if (isCreating) {
			if (isOutgoing) {
				return "Create Out Parameter";
			} else {
				return "Create In Parameter";
			}
		} else {
			if (isOutgoing) {
				return "Configure Out Parameter";
			} else {
				return "Configure In Parameter";
			}
		}
	}

	private void hookListeners() {
		nameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				name = nameText.getText();
			}
		});

		typeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) typeViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof EClassifier) {
						eClassifier = (EClassifier) element;
					}
				}
			}
		});

		typeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) typeViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof EClassifier) {
						eClassifier = (EClassifier) element;
						okPressed();
					} else {
						boolean expanded = typeViewer.getExpandedState(element);
						typeViewer.setExpandedState(element, !expanded);
					}
				}
			}
		});
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
}

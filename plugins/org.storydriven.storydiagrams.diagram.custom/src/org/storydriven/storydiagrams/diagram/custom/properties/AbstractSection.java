package org.storydriven.storydiagrams.diagram.custom.properties;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public abstract class AbstractSection implements ISection {
	private class AbstractPropertiesAdapter extends AdapterImpl {
		@Override
		public final void notifyChanged(Notification msg) {
			if (Display.getCurrent() != PlatformUI.getWorkbench().getDisplay()) {
				syncNotifyChanged(msg);
			} else {
				AbstractSection.this.notifyChanged(msg);
			}
		}

		private void syncNotifyChanged(final Notification msg) {
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					AbstractSection.this.notifyChanged(msg);
				}
			});
		}
	}

	protected static final String EMPTY = ""; //$NON-NLS-1$
	protected static final int LABEL_WIDTH = 120;
	private static final String COMMAND_LABEL = null;

	private TransactionalEditingDomain editingDomain;
	private TabbedPropertySheetPage page;
	private EObject element;
	private Adapter propertiesListener;

	public AbstractSection() {
		propertiesListener = new AbstractPropertiesAdapter();
	}

	@Override
	public final void createControls(Composite parent, TabbedPropertySheetPage page) {
		this.page = page;

		TabbedPropertySheetWidgetFactory factory = page.getWidgetFactory();

		Composite section = factory.createFlatFormComposite(parent);

		createWidgets(section, factory);
		layoutWidgets(section);
		hookWidgetListeners();
	}

	protected abstract void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory);

	protected void layoutWidgets(Composite parent) {
		// nothing by default
	}

	protected void hookWidgetListeners() {
		// nothing by default
	}

	@Override
	public final void aboutToBeShown() {
		addModelListeners();
	}

	protected void addModelListeners() {
		if (getElement() != null) {
			getElement().eAdapters().add(propertiesListener);
		}
	}

	@Override
	public final void aboutToBeHidden() {
		removeModelListeners();
	}

	protected void removeModelListeners() {
		if (getElement() != null) {
			getElement().eAdapters().remove(propertiesListener);
		}
	}

	protected void execute(final EStructuralFeature feature, final Object newValue) {
		if (getElement() != null) {
			Object oldValue = getElement().eGet(feature);

			if (newValue != oldValue) {
				Command command = new RecordingCommand(getEditingDomain(), COMMAND_LABEL) {
					@Override
					protected void doExecute() {
						getElement().eSet(feature, newValue);
					}
				};
				execute(command);
			}
		}
	}

	protected EObject getElement() {
		return element;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			Object adaptable = ((IStructuredSelection) selection).getFirstElement();

			if (adaptable instanceof EObject) {
				this.element = (EObject) adaptable;
				editingDomain = TransactionUtil.getEditingDomain(adaptable);
				return;
			}

			if (adaptable instanceof IAdaptable) {
				Object element = ((IAdaptable) adaptable).getAdapter(EObject.class);
				if (element instanceof EObject) {
					this.element = (EObject) element;
					editingDomain = TransactionUtil.getEditingDomain(element);
				}
			}
		}
	}

	@Override
	public void dispose() {
		// nothing to dispose
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}

	@Override
	public void refresh() {
		// nothing to refresh
	}

	protected void execute(Command command) {
		if (getEditingDomain() != null) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}

	protected TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}

	protected void notifyChanged(Notification msg) {
		// nothing by default
	}

	protected final void refreshTitleBar() {
		page.refresh();
	}
}

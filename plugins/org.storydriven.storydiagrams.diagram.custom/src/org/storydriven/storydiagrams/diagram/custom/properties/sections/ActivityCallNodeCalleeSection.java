package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.window.Window;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.custom.dialogs.SelectActivityDialog;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractEListComboSection;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;

public class ActivityCallNodeCalleeSection extends AbstractEListComboSection<Callable> {
	private SelectActivityDialog dialog;

	public ActivityCallNodeCalleeSection() {
		dialog = new SelectActivityDialog();
	}

	@Override
	protected void handleSearchButtonClicked() {
		// prepare dialog
		dialog.setActivityCallNode(getElement());

		if (dialog.open() == Window.OK) {
			final Activity call = dialog.getElement();
			if (call != null) {
				RecordingCommand command = new RecordingCommand(getEditingDomain()) {
					@Override
					protected void doExecute() {
						getElement().setCallee(call);
					}
				};
				execute(command);
				refresh();
			}
		}
	}

	@Override
	protected List<Callable> getItems() {
		Activity activity = ActivityUtil.getActivity(getElement());

		List<Callable> items = new ArrayList<Callable>();
		items.addAll(ResourceManager.get(activity).getActivities());

		return items;
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	protected String getText(Callable element) {
		return TextUtil.getText(element);
	}

	@Override
	protected boolean isShowSearchButton() {
		return true;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CallsPackage.Literals.INVOCATION__CALLEE;
	}

	@Override
	protected String getLabelText() {
		return "Callee";
	}
}

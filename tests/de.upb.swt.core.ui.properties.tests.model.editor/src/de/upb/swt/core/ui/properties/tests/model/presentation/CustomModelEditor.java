package de.upb.swt.core.ui.properties.tests.model.presentation;

import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class CustomModelEditor extends ModelEditor implements
		ITabbedPropertySheetPageContributor {
	@Override
	public String getContributorId() {
		return "de.upb.swt.core.ui.properties.tests.diagram"; //$NON-NLS-1$
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class required) {
		if (IPropertySheetPage.class.equals(required)) {
			return new TabbedPropertySheetPage(this);
		}

		return super.getAdapter(required);
	}
}

package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;

import de.upb.swt.core.ui.providers.ComposedAdapterFactoryLabelProvider;
import de.upb.swt.core.ui.providers.ContainmentContentProvider;

public class SelectEPackageFromRegistryDialog extends AbstractTreeSelectionDialog<EPackage> {
	private static final String TITLE = "Add Registered Packages";
	private static final String DESCRIPTION = "Select the packages that should be added to the type model.";

	public SelectEPackageFromRegistryDialog() {
		super(TITLE, DESCRIPTION);
		setTitleImage(DiagramImages.getImage(DiagramImages.BANNER_ADD_EPACKAGE_URI));
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ComposedAdapterFactoryLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((EPackage) element).getNsURI();
			}
		};
	}

	@Override
	protected ITreeContentProvider getContentProvider() {
		return new ContainmentContentProvider() {
			private Object[] cached;

			@Override
			public Object[] getElements(Object element) {
				if (cached == null) {
					Registry reg = EPackage.Registry.INSTANCE;
					Collection<EPackage> all = new HashSet<EPackage>();
					for (Object child : super.getElements(element)) {
						if (reg.containsKey(child)) {
							try {
								all.add(reg.getEPackage((String) child));
							} catch (Exception e) {
								e.printStackTrace();
								System.out.println("Exception ignored during resolving of EPackage with namespace URI "
										+ child);
							}
						}
					}
					cached = all.toArray(new Object[all.size()]);
				}

				return cached;
			}

			@Override
			public Object[] getChildren(Object element) {
				return new Object[0];
			}
		};
	}

	@Override
	protected Object getInput() {
		return EPackage.Registry.INSTANCE.keySet();
	}
}

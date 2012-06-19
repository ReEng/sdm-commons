package org.storydriven.storydiagrams.diagram.custom.dialogs;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.providers.ComposedAdapterFactoryLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.ContainmentContentProvider;

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
			@Override
			public Object[] getElements(Object element) {
				Registry reg = EPackage.Registry.INSTANCE;
				Collection<EPackage> ePackages = new HashSet<EPackage>();
				for (Object child : super.getElements(element)) {
					if (reg.containsKey(child)) {
						try {
							ePackages.add(reg.getEPackage((String) child));
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("Exception ignored during resolving of EPackage with namespace URI "
									+ child);
						}
					}
				}

				return ePackages.toArray(new Object[ePackages.size()]);
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

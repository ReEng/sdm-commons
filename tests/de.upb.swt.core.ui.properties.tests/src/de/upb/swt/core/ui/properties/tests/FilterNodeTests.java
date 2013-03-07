package de.upb.swt.core.ui.properties.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.StructuredSelection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class FilterNodeTests {
	private EObject element;
	private IFilter filter;

	private EditPart editPart;

	@Before
	public void initialize() {
		// create element
		element = EcoreFactory.eINSTANCE.createEClass();

		// create filter
		filter = new AbstractFilter() {
			@Override
			protected boolean select(EObject element) {
				return FilterNodeTests.this.element.equals(element);
			}
		};

		// create view
		View view = NotationFactory.eINSTANCE.createNode();
		view.setElement(element);

		// create edit part
		editPart = new GraphicalEditPart(view) {
		};
	}

	@Test
	public void testElement() {
		assertTrue(filter.select(new StructuredSelection(element)));
	}

	@Test
	public void testEditPart() {
		assertTrue(filter.select(new StructuredSelection(editPart)));
	}

	@After
	public void dispose() {
		filter = null;

		editPart = null;
		element = null;
	}
}

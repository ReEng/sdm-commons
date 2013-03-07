package de.upb.swt.core.ui.properties.sections;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;

/**
 * This is the abstract base class for all {@link org.eclipse.emf.ecore.EStructuralFeature feature} based sections.
 * 
 * @author Aljoscha Hark <aljoschability@gmail.com>
 */
public abstract class AbstractFeaturePropertySection extends AbstractPropertySection {
	/**
	 * Executes an {@link AddCommand} on the command stack for the {@link #getFeature() feature} with the given value.
	 * 
	 * @param values The values to add to the {@link #getFeature() feature}.
	 */
	protected final void add(Collection<Object> values) {
		add(getFeature(), values);
	}

	/**
	 * Executes an {@link AddCommand} on the command stack for the {@link #getFeature() feature} with the given value.
	 * 
	 * @param value The value to add to the {@link #getFeature() feature}.
	 */
	protected final void add(Object value) {
		add(getFeature(), value);
	}

	/**
	 * Executes a {@link RemoveCommand} on the command stack for the {@link #getFeature() feature} with the given value.
	 * 
	 * @param values The values to remove from the {@link #getFeature() feature}.
	 */
	protected final void remove(Collection<Object> values) {
		remove(getFeature(), values);
	}

	/**
	 * Executes a {@link RemoveCommand} on the command stack for the {@link #getFeature() feature} with the given value.
	 * 
	 * @param value The value to remove from the {@link #getFeature() feature}.
	 */
	protected final void remove(Object value) {
		remove(getFeature(), value);
	}

	/**
	 * Executes a {@link SetCommand} on the command stack for the {@link #getFeature() feature} with the given value.
	 * 
	 * @param value The value to set for the {@link #getFeature() feature}.
	 */
	protected final void set(Object value) {
		set(getFeature(), value);
	}

	protected Object getValue() {
		return getValue(getFeature());
	}

	@Override
	protected boolean shouldRefresh(Notification msg) {
		return super.shouldRefresh(msg) && getElement().equals(msg.getNotifier()) && getFeature() != null
				&& getFeature().equals(msg.getFeature());
	}

	/**
	 * Delivers the {@link EStructuralFeature feature} for this section. This feature typically comes from the
	 * <code>Literals</code> interface from inside the generated <code>EPackage</code>.
	 * 
	 * @return Returns the {@link EStructuralFeature feature} for this section.
	 */
	protected abstract EStructuralFeature getFeature();
}

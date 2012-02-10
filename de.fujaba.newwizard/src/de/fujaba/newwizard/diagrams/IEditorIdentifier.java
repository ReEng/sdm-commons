package de.fujaba.newwizard.diagrams;

/**
 * An interface for all objects that can identify an editor by telling its GMF
 * editor-id.
 * 
 * @author bingo
 * 
 */
public interface IEditorIdentifier {
	/**
	 * Should return the ID of the generated Editor class.
	 * 
	 * @return the Editor-ID.
	 */
	String getEditorId();
}

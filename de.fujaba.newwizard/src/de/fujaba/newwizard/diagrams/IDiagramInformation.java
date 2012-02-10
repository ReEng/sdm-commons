package de.fujaba.newwizard.diagrams;

import de.fujaba.newwizard.IFujabaEditor;

/**
 * Interface for objects that can be asked about information provided by an
 * extension of "de.fujaba.newwizard.diagraminformation" for a given editorId.
 * 
 * @author bingo
 * 
 */
public interface IDiagramInformation {

	String getEditorName();

	String getFileExtension();

	String getModelId();

	String getModelElementCategoryKey();

	IFujabaEditor getFujabaEditor();

	boolean shouldUseModelElementCategory();

}

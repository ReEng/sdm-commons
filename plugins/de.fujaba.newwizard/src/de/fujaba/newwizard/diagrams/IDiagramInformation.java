package de.fujaba.newwizard.diagrams;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * Interface for objects that can be asked about information provided by an
 * extension of "de.fujaba.newwizard.diagraminformation".
 * 
 * @author bingo
 * 
 */
public interface IDiagramInformation {
	
	String getPreferencesHint();
	
	String getEditorId();

	String getEditorName();

	String getFileExtension();

	String getModelId();

	String getModelElementCategoryKey();

	EClass getDiagramElementClass();

	/**
	 * Gets a map from domainElement to semanticHint.
	 * @return a map from domainElement to semanticHint.
	 */
	Map<String, String> getTopLevelNodes();

}

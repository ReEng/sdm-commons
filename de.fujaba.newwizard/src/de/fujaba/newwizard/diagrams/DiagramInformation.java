package de.fujaba.newwizard.diagrams;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import de.fujaba.newwizard.IFujabaEditor;

/**
 * Datastructure that represents the information provided by an
 * extension of "de.fujaba.newwizard.diagraminformation" for a given editorId.
 * 
 * @author bingo
 * 
 */
public class DiagramInformation implements IDiagramInformation {
	
	private String editorName;
	
	private String fileExtension;
	
	private String modelId;
	
	private String modelElementCategoryKey;
	
	private IFujabaEditor fujabaEditor;

	private boolean useModelElementCategory;


	public DiagramInformation(String editorName, String fileExtension, String modelId, String modelElementCategoryKey, IFujabaEditor fujabaEditor, boolean useModelElementCategory) {
		this.editorName = editorName;
		this.fileExtension = fileExtension;
		this.modelId = modelId;
		this.modelElementCategoryKey = modelElementCategoryKey;
		this.fujabaEditor = fujabaEditor;
		this.useModelElementCategory = useModelElementCategory;
	}

	public DiagramInformation(IConfigurationElement information) {
		modelId = information.getAttribute("modelId");
		editorName = information.getAttribute("editorName");
		modelElementCategoryKey = information
				.getAttribute("modelElementCategoryKey");
		useModelElementCategory = Boolean.valueOf(information
				.getAttribute("useModelElementCategory"));
		Object o;
		try {
			o = information.createExecutableExtension("fujabaEditor");
			if (o instanceof IFujabaEditor) {
				fujabaEditor = (IFujabaEditor) o;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		fileExtension = information.getAttribute("fileExtension");
	}
	

	@Override
	public String getEditorName() {
		return editorName;
	}

	@Override
	public String getFileExtension() {
		return fileExtension;
	}

	@Override
	public String getModelId() {
		return modelId;
	}

	@Override
	public String getModelElementCategoryKey() {
		return modelElementCategoryKey;
	}

	@Override
	public IFujabaEditor getFujabaEditor() {
		return fujabaEditor;
	}

	@Override
	public boolean shouldUseModelElementCategory() {
		return useModelElementCategory;
	}

}

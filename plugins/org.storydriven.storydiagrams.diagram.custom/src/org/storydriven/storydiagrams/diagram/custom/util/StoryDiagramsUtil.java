/**
 * 
 */
package org.storydriven.storydiagrams.diagram.custom.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.diagram.custom.ResourceManager;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEditPart;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsDiagramEditorPlugin;


/**
 * This class offers operations that help to connect an Ecore class model with a behavior model
 * specified as a set of story diagrams. Each story diagram is connected to an EOperation and
 * defines the EOperation's behavior.
 * 
 * Each EOperation gets an EAnnotation pointing to the corresponding Activity (story diagram root element).
 * All story diagram models are stored in a .sd file named like the .ecore file of the corresponding EOperation.
 * The diagram models are stored in a .sd_diagrams file with the same name.
 * The .ecore file gets an EAnnotation that points to the .sd file with all corresponding story diagrams.
 * 
 * @author Dietrich Travkin
 *
 */
public class StoryDiagramsUtil
{	
	/**
	 * An {@link org.eclipse.emf.ecore.EAnnotation} with this source key references another
	 * {@link org.eclipse.emf.ecore.EAnnotation} with the source key {@link #CONTAINER} that contains the activities for
	 * an ecore resource.
	 */
	private static final String ACTIVITIES = "http://www.storydriven.org/storydiagrams/activities"; //previous key: "http://www.uni-paderborn.de/pose/activities" 

	/**
	 * An {@link org.eclipse.emf.ecore.EAnnotation} with this source key references an activity for an
	 * {@link org.eclipse.emf.ecore.EOperation}.
	 */
	private static final String ACTIVITY = "http://www.storydriven.org/storydiagrams/activity"; //previous key: "http://www.uni-paderborn.de/pose/activity"
	
	/**
	 * An {@link org.eclipse.emf.ecore.EAnnotation} with this source key contains different other elements and probably
	 * references back to another {@link org.eclipse.emf.ecore.EAnnotation}.
	 */
	private static final String CONTAINER = "http://www.storydriven.org/storydiagrams/container"; //previous key: "http://www.uni-paderborn.de/pose/container"
	
	/**
	 * An {@link org.eclipse.emf.ecore.EAnnotation} with this source key references another
	 * {@link org.eclipse.emf.ecore.EAnnotation} with the source key {@link #CONTAINER} that contains the diagrams for a
	 * model resource.
	 */
	private static final String DIAGRAMS = "http://www.storydriven.org/storydiagrams/diagrams"; //previous key: "http://www.uni-paderborn.de/pose/diagrams"
	
	public static final String SD_FILE_EXTENSION = "sd";
	
	public static final String SD_DIAGRAM_FILE_EXTENSION = "sd_diagrams";
	
	
	public static EAnnotation findPointerToActivity(EOperation eOperation)
	{
		return eOperation.getEAnnotation(ACTIVITY);
	}
	
	private static EAnnotation findOrCreatePointerToActivity(EOperation eOperation)
	{
		EAnnotation pointerToActivity = findPointerToActivity(eOperation);
		if (pointerToActivity == null)
		{
			pointerToActivity = EcoreFactory.eINSTANCE.createEAnnotation();
			pointerToActivity.setSource(ACTIVITY);
			pointerToActivity.setEModelElement(eOperation);
		}
		return pointerToActivity;
	}
	
	public static Activity findActivity(EOperation eOperation)
	{
		EAnnotation pointerToActivity = findPointerToActivity(eOperation);
		if (pointerToActivity != null)
		{
			for (EObject reference : pointerToActivity.getReferences())
			{
				if (reference instanceof Activity)
				{
					return (Activity) reference;
				}
			}
		}
		return null;
	}
	
	public static EAnnotation findPointerToAllActivitiesContainer(EOperation eOperation)
	{
		for (EObject rootElement : eOperation.eResource().getContents())
		{
			if (rootElement instanceof EModelElement)
			{
				return ((EModelElement) rootElement).getEAnnotation(ACTIVITIES);
			}
		}
		return null;
	}
	
	private static EAnnotation findOrCreatePointerToAllActivitiesContainer(EOperation eOperation)
	{
		EAnnotation pointerToAllActivitiesContainer = findPointerToAllActivitiesContainer(eOperation);
		if (pointerToAllActivitiesContainer == null)
		{
			pointerToAllActivitiesContainer = EcoreFactory.eINSTANCE.createEAnnotation();
			pointerToAllActivitiesContainer.setSource(ACTIVITIES);
			for (EObject rootElement : eOperation.eResource().getContents())
			{
				if (rootElement instanceof EModelElement)
				{
					pointerToAllActivitiesContainer.setEModelElement((EModelElement) rootElement);
					break;
				}
			}
		}
		return pointerToAllActivitiesContainer;
	}
	
	public static EAnnotation findAllActivitiesContainer(EOperation eOperation)
	{
		EAnnotation pointerToActivitiesContainer = findPointerToAllActivitiesContainer(eOperation);
		if (pointerToActivitiesContainer != null)
		{
			for (EObject reference : pointerToActivitiesContainer.getReferences())
			{
				if (reference instanceof EAnnotation
						&& ((EAnnotation) reference).getSource().equals(CONTAINER))
				{
					return (EAnnotation) reference;
				}
			}
		}
		return null;
	}
	
	private static EAnnotation findOrCreateAllActivitiesContainer(EOperation eOperation)
	{
		EAnnotation allActivitiesContainer = findAllActivitiesContainer(eOperation);
		if (allActivitiesContainer == null)
		{
			EAnnotation pointerToAllActivitiesContainer = findOrCreatePointerToAllActivitiesContainer(eOperation);
			
			allActivitiesContainer = EcoreFactory.eINSTANCE.createEAnnotation();
			allActivitiesContainer.setSource(CONTAINER);
			pointerToAllActivitiesContainer.getReferences().add(allActivitiesContainer);

			// determine the resource for the new activities container and add the container to the new resource
			URI baseUri = eOperation.eResource().getURI().trimFileExtension();
			URI activitiesUri = baseUri.appendFileExtension(SD_FILE_EXTENSION);
			Resource activitiesResource = eOperation.eResource().getResourceSet().createResource(activitiesUri);
			activitiesResource.getContents().add(allActivitiesContainer);
		}
		return allActivitiesContainer;
	}
	
	public static EAnnotation findPointerToAllActivityDiagramsContainer(EOperation eOperation)
	{
		EAnnotation activitiesContainer = findAllActivitiesContainer(eOperation);
		if (activitiesContainer != null)
		{
			return activitiesContainer.getEAnnotation(DIAGRAMS);
		}
		return null;
	}
	
	private static EAnnotation findOrCreatePointerToAllActivityDiagramsContainer(EOperation eOperation)
	{
		EAnnotation pointerToAllActivityDiagramsContainer = findPointerToAllActivityDiagramsContainer(eOperation);
		if (pointerToAllActivityDiagramsContainer == null)
		{
			EAnnotation activitiesContainer = findOrCreateAllActivitiesContainer(eOperation);
			
			pointerToAllActivityDiagramsContainer = EcoreFactory.eINSTANCE.createEAnnotation();
			pointerToAllActivityDiagramsContainer.setSource(DIAGRAMS);
			activitiesContainer.getEAnnotations().add(pointerToAllActivityDiagramsContainer);
		}
		return pointerToAllActivityDiagramsContainer;
	}
	
	public static EAnnotation findAllActivityDiagramsContainer(EOperation eOperation)
	{
		EAnnotation pointerToAllActivityDiagramsContainer = findPointerToAllActivityDiagramsContainer(eOperation);
		if (pointerToAllActivityDiagramsContainer != null)
		{
			for (EObject reference : pointerToAllActivityDiagramsContainer.getReferences())
			{
				if (reference instanceof EAnnotation
						&& ((EAnnotation) reference).getSource().equals(CONTAINER))
				{
					return (EAnnotation) reference;
				}
			}
		}
		return null;
	}
	
	private static EAnnotation findOrCreateAllActivityDiagramsContainer(EOperation eOperation)
	{
		EAnnotation activityDiagramsContainer = findAllActivityDiagramsContainer(eOperation);
		if (activityDiagramsContainer == null)
		{
			EAnnotation pointerToAllActivityDiagramsContainer = findOrCreatePointerToAllActivityDiagramsContainer(eOperation);
			
			activityDiagramsContainer = EcoreFactory.eINSTANCE.createEAnnotation();
			activityDiagramsContainer.setSource(CONTAINER);
			pointerToAllActivityDiagramsContainer.getReferences().add(activityDiagramsContainer);
			
			// determine the resource for the new activity diagrams container and add the container to the new resource
			URI baseUri = eOperation.eResource().getURI().trimFileExtension();
			URI activityDiagramsUri = baseUri.appendFileExtension(SD_DIAGRAM_FILE_EXTENSION);
			Resource activityDiagramsResource = eOperation.eResource().getResourceSet().createResource(activityDiagramsUri);
			activityDiagramsResource.getContents().add(activityDiagramsContainer);
		}
		return activityDiagramsContainer;
	}
	
	public static Diagram findActivityDiagram(EOperation eOperation)
	{
		EAnnotation activityDiagramsContainer = findAllActivityDiagramsContainer(eOperation);
		Activity activity = findActivity(eOperation);
		if (activity != null && activityDiagramsContainer != null)
		{
			for (EObject content : activityDiagramsContainer.getContents())
			{
				if (content instanceof Diagram
						&& ((Diagram) content).getElement().equals(activity))
				{
					return (Diagram) content;
				}
			}
		}
		return null;
	}
	
	public static Activity createNewActivityFor(EOperation eOperation)
	{
		if (findActivity(eOperation) != null)
		{
			throw new IllegalStateException("The EOperation has already an activity!, EOperation: " + eOperation.toString());
		}
		
		Activity newActivity = ActivitiesFactory.eINSTANCE.createActivity();
		
		// create pointer to activity
		EAnnotation pointerToActivity = findOrCreatePointerToActivity(eOperation);
		pointerToActivity.getReferences().add(newActivity);

		// add the activity to the activities container
		EAnnotation allActivitiesContainer = findOrCreateAllActivitiesContainer(eOperation);
		allActivitiesContainer.getContents().add(newActivity);
		
		// TODO also add a pointer from Activity to the EOperation?
		
		// set the activity's properties
		newActivity.setName(eOperation.getName());
		
		// add types to the activity's type model
		EAnnotation typesAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		typesAnnotation.setSource(ResourceManager.SOURCE_TYPES);
		typesAnnotation.getReferences().add(eOperation.getEContainingClass().getEPackage());
		newActivity.getAnnotations().add(typesAnnotation);
		
		// add out parameter
		if (eOperation.getEType() != null)
		{
			EParameter outParameter = EcoreFactory.eINSTANCE.createEParameter();
			outParameter.setEType(eOperation.getEType());
			newActivity.getContainedParameters().add(outParameter);
			newActivity.getOutParameters().add(outParameter);
			
			typesAnnotation.getReferences().add(eOperation.getEType().getEPackage());
		}

		// add in parameters
		for (EParameter parameter : eOperation.getEParameters())
		{
			newActivity.getInParameters().add(parameter);
			
			typesAnnotation.getReferences().add(parameter.getEType().getEPackage());
		}		
		
		return newActivity;
	}
	
	public static Diagram createNewActivityDiagramFor(EOperation eOperation)
	{
		Activity activity = findActivity(eOperation);
		if (activity == null)
		{
			activity = createNewActivityFor(eOperation);
		}
		
		Diagram diagram = findActivityDiagram(eOperation);
		if (diagram != null)
		{
			throw new IllegalStateException("The EOperation has already an activity diagram!, EOperation: " + eOperation.toString());
		}
		
		EAnnotation activityDiagramsContainer = findOrCreateAllActivityDiagramsContainer(eOperation);
		
		String mid = ActivityEditPart.MODEL_ID;
		PreferencesHint phint = StorydiagramsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;

		diagram = ViewService.createDiagram(activity, mid, phint);
		diagram.setElement(activity);

		activityDiagramsContainer.getContents().add(diagram);
		
		return diagram;
	}
}

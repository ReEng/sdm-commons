package org.storydriven.storydiagrams.interpreter.patternmatcher;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.expressions.pathExpressions.ExplicitPathDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.ImplicitPathDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.ImplicitPathKind;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathExpression;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathSegment;
import org.storydriven.storydiagrams.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.storydiagrams.expressions.pathExpressions.RepeatOperator;
import org.storydriven.storydiagrams.expressions.pathExpressions.RestrictionList;
import org.storydriven.storydiagrams.expressions.pathExpressions.TypeRestriction;
import org.storydriven.storydiagrams.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.storydiagrams.patterns.AbstractLinkVariable;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.Path;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.ECheckResult;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.EMatchType;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.MatchState;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPart;
import de.mdelab.sdm.interpreter.core.patternmatcher.patternPartBased.PatternPartBasedMatcher;
import de.mdelab.sdm.interpreter.core.variables.Variable;

public class StoryDrivenPathPatternPart extends
		StoryDrivenPatternPart<AbstractVariable, Path> {

    private final static int ALLOWED = 1, NOT_MENTIONED = 0, RESTRICTED = -1;

	public StoryDrivenPathPatternPart(
			final PatternPartBasedMatcher<?, ?, ?, ?, AbstractVariable, AbstractLinkVariable, EClassifier, ?, Expression> patternMatcher,
			final Path link) {
		super(patternMatcher, link, new AbstractVariable[] { link.getSource(),
				link.getTarget() });
	}

	@Override
	protected EMatchType doGetMatchType() {
		switch (this.link.getBindingOperator()) {
		case CHECK_ONLY:
			switch (this.link.getBindingSemantics()) {
			case MANDATORY:
				return EMatchType.MANDATORY;
			case OPTIONAL:
				return EMatchType.OPTIONAL;
			case NEGATIVE:
				// return EMatchType.NEGATIVE;
				throw new UnsupportedOperationException();
			}
		case CREATE:
			throw new UnsupportedOperationException();
		case DESTROY:
			switch (this.link.getBindingSemantics()) {
			case MANDATORY:
				return EMatchType.MANDATORY;
			case OPTIONAL:
				return EMatchType.OPTIONAL;
			case NEGATIVE:
				throw new UnsupportedOperationException();
			}
		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	protected void doCreateLink() {
		// Do nothing
	}

	@Override
	protected void doDestroyLink(
			final Map<AbstractVariable, Object> deletedObjects) {
		// Do nothing
	}

	@Override
	public ECheckResult check() throws SDMException {
		if (this.patternMatcher.isBound(this.link.getSource())
				&& this.patternMatcher.isBound(this.link.getTarget())) {
			final AbstractVariable sourceSpo = this.link.getSource();
			final AbstractVariable targetSpo = this.link.getTarget();

			final Variable<EClassifier> sourceVariable = this.patternMatcher
					.getVariablesScope().getVariable(sourceSpo.getName());
			final Variable<EClassifier> targetVariable = this.patternMatcher
					.getVariablesScope().getVariable(targetSpo.getName());

			if ((sourceVariable != null) && (targetVariable != null)) {
				assert sourceVariable.getValue() != null;
				assert targetVariable.getValue() != null;

				assert sourceVariable.getValue() instanceof EObject;

				final EObject sourceInstanceObject = (EObject) sourceVariable
						.getValue();
				final Object targetInstanceObject = targetVariable.getValue();

				/*
				 * Evaluate the expression
				 */
				final Variable<EClassifier> result = applyPathMatching(sourceInstanceObject);

				if (result.getValue() instanceof Collection<?>) {
					if (((Collection<Object>) result.getValue())
							.contains(targetInstanceObject)) {
						this.patternMatcher
								.getNotificationEmitter()
								.linkCheckSuccessful(
										sourceSpo,
										sourceInstanceObject,
										this.link,
										targetSpo,
										targetInstanceObject,
										this.patternMatcher.getVariablesScope(),
										this.patternMatcher);

						return ECheckResult.OK;
					} else {
						this.patternMatcher
								.getNotificationEmitter()
								.linkCheckFailed(
										sourceSpo,
										sourceInstanceObject,
										this.link,
										targetSpo,
										targetInstanceObject,
										this.patternMatcher.getVariablesScope(),
										this.patternMatcher);

						return ECheckResult.FAIL;
					}
				} else {
					if (result.getValue() == targetInstanceObject) {
						this.patternMatcher
								.getNotificationEmitter()
								.linkCheckSuccessful(
										sourceSpo,
										sourceInstanceObject,
										this.link,
										targetSpo,
										targetInstanceObject,
										this.patternMatcher.getVariablesScope(),
										this.patternMatcher);

						return ECheckResult.OK;
					} else {
						this.patternMatcher
								.getNotificationEmitter()
								.linkCheckFailed(
										sourceSpo,
										sourceInstanceObject,
										this.link,
										targetSpo,
										targetInstanceObject,
										this.patternMatcher.getVariablesScope(),
										this.patternMatcher);

						return ECheckResult.FAIL;
					}
				}
			} else {
				return ECheckResult.UNKNOWN;
			}
		} else {
			return ECheckResult.UNKNOWN;
		}
	}

	@Override
	public boolean match(final MatchState matchState) throws SDMException {
		final AbstractVariable sourceVar = this.link.getSource();
		final AbstractVariable targetVar = this.link.getTarget();

		assert this.patternMatcher.isBound(sourceVar)
				|| this.patternMatcher.isBound(targetVar);
		assert !(this.patternMatcher.isBound(sourceVar) && this.patternMatcher
				.isBound(targetVar));

		assert this.patternMatcher.isBound(sourceVar);

		final Variable<EClassifier> sourceVariable = this.patternMatcher
				.getVariablesScope().getVariable(sourceVar.getName());

		assert sourceVariable != null;
		assert sourceVariable.getValue() instanceof EObject;

		final EObject sourceInstanceObject = (EObject) sourceVariable
				.getValue();

		/*
		 * Evaluate link expression
		 */
		final Variable<EClassifier> result = applyPathMatching(sourceInstanceObject);

		assert result != null;

		this.patternMatcher.getNotificationEmitter().traversingLink(this.link,
				sourceVar, sourceInstanceObject, targetVar,
				this.patternMatcher.getVariablesScope(), this.patternMatcher);

		if (result.getValue() instanceof Collection<?>) {
			for (final Object targetObject : (Collection<Object>) result
					.getValue()) {
				if (this.patternMatcher.matchStoryPatternObject(targetVar,
						targetObject)) {
					return true;
				}
			}
		} else {
			if ((result.getValue() != null)
					&& this.patternMatcher.matchStoryPatternObject(targetVar,
							result.getValue())) {
				return true;
			}
		}

		this.patternMatcher.getNotificationEmitter()
				.storyPatternObjectNotBound(targetVar,
						this.patternMatcher.getVariablesScope(),
						this.patternMatcher);

		return false;
	}

	@Override
	public int calculateMatchingCost() {
		assert !(this.patternMatcher.isBound(this.link.getSource()) && this.patternMatcher
				.isBound(this.link.getTarget()));

		if (this.patternMatcher.isBound(this.link.getSource())) {
			/*
			 * It is probably very difficult to provide a useful matching cost
			 * estimation for a path.
			 */
			return Integer.MAX_VALUE - 1;
		} else {
			return PatternPart.MATCHING_NOT_POSSIBLE;
		}
	}

	@Override
	public MatchState createMatchState() {
		return null;
	}

	// -------------------
	// Actual path evaluation
	// -------------------

	// -----------------------------------------------------------------------------------------------------------------------
	/**
	 * Performing the search for all paths, which can be reached via the given
	 * path expression.
	 * 
	 * @param startNodeAdapter
	 * @param targetPropertyAdapter
	 * @return A list of reached nodes.
	 */
	private  Variable<EClassifier> applyPathMatching(EObject sourceObject) {
		final List<EObject> results = new LinkedList<EObject>();
		final Path path = this.link;
		final PathExpressionBridge bridge = (PathExpressionBridge) path.getPathExpression();
		final PathExpression expr = bridge.getPathExpression();
		for (final org.storydriven.storydiagrams.expressions.pathExpressions.Path pa : expr.getPathAlternatives()) {
			List<EObject> tmp = applySearchForPathAlternative(sourceObject, pa);
			results.addAll(tmp);
		}

		return new Variable<EClassifier>(this.link.getName(), null ,results);
	}

	private List<EObject> applySearchForPathAlternative(
			EObject sourceObject,
			org.storydriven.storydiagrams.expressions.pathExpressions.Path pa) {
		
	      final List<EObject> results = new LinkedList<EObject>();
	      final List<EObject> visited = new LinkedList<EObject>();
	      final LinkedList<EObject> queue = new LinkedList<EObject>();
	      
	      queue.offer(sourceObject);
	      List<EObject> reached = new LinkedList<EObject>();
	      for(final org.storydriven.storydiagrams.expressions.pathExpressions.PathSegment segment : pa.getSegments())
	      {
	         //do this for every link segment and fill the queue with reached node from last iteration
	         reached = checkNextSegment(visited, queue, segment);
	         
	         //add all reached nodes to queue
	         for(EObject node : reached)
	         {
	            queue.offer(node);
	         }
	      }
	      
	      results.addAll(reached);
	      return results;
	}

	private List<EObject> checkNextSegment(
			List<EObject> visited,
			LinkedList<EObject> queue,
			org.storydriven.storydiagrams.expressions.pathExpressions.PathSegment segment) {
	      
		final List<EObject> intermediateResult = new LinkedList<EObject>();
	      final RepeatOperator operator = segment.getRepeatOperator(); 

	      // *-operator means the nodes themselves are part are reached nodes themselves
	      if(operator == RepeatOperator.ARBITRARY)
	      { 
	         intermediateResult.addAll(queue);
	      }
	      
	      // +-operator
	      while(!queue.isEmpty())
	      {
	         EObject node = queue.pop();
	         
	         //check neighbors via specified link type
	         List<EObject> neighbors = getNodeNeighbors(node, segment);
	         for(EObject neighbor : neighbors)
	         {
	            if(!visited.contains(neighbor))
	            {
	               //NO_REPEAT: don't search for nodes reachable from the reached nodes
	               if(operator != RepeatOperator.NO_REPEAT)
	               {
	                  queue.offer(neighbor);
	               }
	               visited.add(neighbor);
	               intermediateResult.add(neighbor);
	            }
	         }
	      }
	      return intermediateResult;
	}

	private List<EObject> getNodeNeighbors(EObject node, PathSegment segment) {
		final EClass classifier = node.eClass();
		final List<EObject> neighbors = new LinkedList<EObject>();
		List<EObject> tmp = null;
		
		for (PathSegmentDescription desc : segment.getAlternatives()) {
			if (desc instanceof ExplicitPathDescription) {
				ExplicitPathDescription exDesc = (ExplicitPathDescription) desc;
				String name = exDesc.getAssociationName();
				for (EReference ref : classifier.getEAllReferences()) {
					if (name.equals(ref.getName())) {
						tmp = getFilteredNeighbors(node, ref, exDesc);
						neighbors.addAll(tmp);
					}
				}
			} else if (desc instanceof ImplicitPathDescription) {
				ImplicitPathDescription imDesc = (ImplicitPathDescription) desc;
				ImplicitPathKind kind = imDesc.getKind();

				for (EReference ref : classifier.getEAllReferences()) {
					if ((kind == ImplicitPathKind.CONTAINMENT_SOURCE && ref
							.isContainment()) // <>-->
							|| (kind == ImplicitPathKind.CONTAINMENT_TARGET && ref
									.isContainer()) // <--<>
							|| kind == ImplicitPathKind.ANY) // -->
					{
						tmp = getFilteredNeighbors(node, ref, imDesc);
						neighbors.addAll(tmp);
					}
				}
			}
		}

		return neighbors;
	}

	private List<EObject> getFilteredNeighbors(EObject node, EReference ref,
			PathSegmentDescription desc) {
		final List<EObject> neighbors = new LinkedList<EObject>();

		final List<EObject> targets = new LinkedList<EObject>();
		if (ref.isMany()) {
			targets.addAll((List<EObject>) node.eGet(ref));
		} else {
			targets.add((EObject) node.eGet(ref));
		}
		for (final EObject target : targets) {
			int chkResult = checkTypeRestrictions(desc, target);
			if (chkResult != RESTRICTED) {
				neighbors.add(target);
			}
		}

		return neighbors;
	}

	private int checkTypeRestrictions(final PathSegmentDescription desc,
			final EObject target) {

		if (desc.getRestrictionList() == null) {
			return ALLOWED;
		}

		EClass cl = target.eClass();
		RestrictionList rest = desc.getRestrictionList();
		for (TypeRestriction typeRest : rest.getRestrictions()) {
			if (cl.getName().equals(typeRest.getTypeName())) {
				if (typeRest.isForbidden()) {
					return RESTRICTED;
				} else {
					return ALLOWED;
				}
			}
		}

		return NOT_MENTIONED;
	}
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.patterns.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.storydiagrams.patterns.MatchingPattern;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.patterns.util.MatchingPatternOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MatchingPatternImpl extends StoryPatternImpl implements MatchingPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.MATCHING_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean NoModifierInMatchingPattern(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MatchingPatternOperations.NoModifierInMatchingPattern(this, diagnostics, context);
	}

} //MatchingPatternImpl

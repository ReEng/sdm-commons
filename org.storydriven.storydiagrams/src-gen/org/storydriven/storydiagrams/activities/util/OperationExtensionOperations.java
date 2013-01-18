/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.storydriven.core.util.ExtensionOperations;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.OperationExtension;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operation Extension</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.OperationExtension#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationExtensionOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationExtensionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #NumberOfOutParams(OperationExtension, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NumberOfOutParams(OperationExtension, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.oclAsType(Callable).out->size() <= 1";

	/**
	 * The cached OCL invariant for the '{@link #NumberOfOutParams(OperationExtension, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NumberOfOutParams(OperationExtension, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param operationExtension The receiving '<em><b>Operation Extension</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean NumberOfOutParams(OperationExtension operationExtension, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ActivitiesPackage.Literals.OPERATION_EXTENSION);
			try {
				NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(NUMBER_OF_OUT_PARAMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(operationExtension)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, ActivitiesValidator.DIAGNOSTIC_SOURCE,
						ActivitiesValidator.OPERATION_EXTENSION__NUMBER_OF_OUT_PARAMS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
								"_UI_GenericInvariant_diagnostic",
								new Object[] {
										"NumberOfOutParams",
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(operationExtension,
												context) }), new Object[] { operationExtension }));
			}
			return false;
		}
		return true;
	}

	/**
	 * @generated NOT
	 */
	public static boolean isSetOperation(OperationExtension operationExtension) {
		return operationExtension.getOperation() != null;
	}

	/**
	 * @generated NOT
	 */
	public static EOperation getOperation(OperationExtension operationExtension) {
		EModelElement modelBase = ExtensionOperations.getModelBase(operationExtension);
		return modelBase instanceof EOperation ? (EOperation) modelBase : null;
	}

	/**
	 * @generated NOT
	 */
	public static void setOperation(OperationExtension operationExtension, EOperation operation) {
		ExtensionOperations.setModelBase(operationExtension, operation);
	}

	/**
	 * @generated NOT
	 */
	public static void unsetOperation(OperationExtension operationExtension) {
		if (operationExtension.isSetOperation()) {
			ExtensionOperations.unsetModelBase(operationExtension);
		}
	}
} // OperationExtensionOperations
package de.mdelab.sdm.interpreter.ocl;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.types.OCLStandardLibrary;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.expressions.ExpressionInterpreter;
import de.mdelab.sdm.interpreter.core.facade.IExpressionFacade;
import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;
import de.mdelab.sdm.interpreter.ocl.environment.CustomOCLEnvironmentFactory;
import de.mdelab.sdm.interpreter.ocl.environment.MultiResourceLazyExtentMap;

/**
 * An interpreter for OCL expressions.
 * 
 * @author Stephan Hildebrandt
 * @param <Expression>
 * @param <Classifier>
 */
public class OCLExpressionInterpreter<Expression> extends ExpressionInterpreter<Expression, EClassifier>
{
	private final Map<VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression>, OCL>	usedOCLs;

	public OCLExpressionInterpreter()
	{
		this.usedOCLs = new ConcurrentHashMap<VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression>, OCL>();
	}

	/**
	 * Return the OCL object for the specified variablesScope. Create a new one
	 * if necessary.
	 * 
	 * @param variablesScope
	 * @return
	 * @throws SDMException
	 */
	private OCL getOCL(final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws SDMException
	{
		OCL ocl = this.usedOCLs.get(variablesScope);

		if (ocl == null)
		{
			ocl = OCL.newInstance(new CustomOCLEnvironmentFactory(variablesScope));
			this.usedOCLs.put(variablesScope, ocl);

			for (final String importURI : variablesScope.getExpressionImports(OCLExpressionInterpreterConstants.OCL_LANGUAGE_NAME,
					OCLExpressionInterpreterConstants.OCL_LANGUAGE_VERSION))
			{
				try
				{
					ocl.parse(new OCLInput(URIConverter.INSTANCE.createInputStream(URI.createURI(importURI))));
				}
				catch (final ParserException e)
				{
					throw new SDMException("Could not parse imported URI '" + importURI + "'.", e);
				}
				catch (final IOException e)
				{
					throw new SDMException("Could not parse imported URI '" + importURI + "'.", e);
				}
			}
		}

		return ocl;
	}

	@Override
	public Variable<EClassifier> evaluateExpression(final Expression expression, final EClassifier contextClassifier,
			final Object contextInstance, final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope)
			throws SDMException
	{
		final IExpressionFacade<Expression> expressionFacade = this.getExpressionInterpreterManager().getFacadeFactory()
				.getExpressionFacade();

		OCLExpression oclExpression = null;

		final Object expressionAST = expressionFacade.getExpressionAST(expression);

		if (expressionAST == null)
		{
			/*
			 * Create the abstract syntax by parsing the string
			 */
			try
			{
				oclExpression = this.parseExpression(expressionFacade.getExpressionString(expression), contextClassifier, variablesScope);
			}
			catch (final ParserException e)
			{
				throw new SDMException("Could not parse OCL expression '" + expressionFacade.getExpressionString(expression) + "': "
						+ e.getMessage(), e);
			}

			expressionFacade.setExpressionAST(expression, oclExpression);
		}
		else
		{
			/*
			 * Reuse the abstract syntax tree of the adapter
			 */
			assert expressionAST instanceof OCLExpression;

			oclExpression = (OCLExpression) expressionAST;
		}

		final OCL ocl = this.getOCL(variablesScope);

		Object result = null;

		try
		{
			result = ocl.evaluate(contextInstance, oclExpression);
		}
		catch (final IllegalArgumentException ex)
		{
			throw new SDMException("The OCL expression '" + expressionFacade.getExpressionString(expression) + "' could not be evaluated.",
					ex);
		}

		/*
		 * Here it would be nicer to just compare with the EClass instance of
		 * OclInvalid_Class
		 */
		if (ocl.isInvalid(result))
		{
			throw new SDMException("The OCL expression '" + expressionFacade.getExpressionString(expression)
					+ "' was evaluated to an invalid result.");
		}

		if (oclExpression.getType() != null)
		{
			return new Variable<EClassifier>(VariablesScope.INTERNAL_VARIABLE_NAME,
					this.getEcoreStandardType(oclExpression.getType(), ocl), result);
		}
		else
		{
			assert result == null;

			return new Variable<EClassifier>(VariablesScope.INTERNAL_VARIABLE_NAME, EcorePackage.Literals.EJAVA_OBJECT, null);
		}
	}

	/**
	 * Return the Ecore type that corresponds to the OCL type.
	 * 
	 * @param oclType
	 * @param ocl
	 * @return
	 */
	protected EClassifier getEcoreStandardType(final EClassifier oclType, final OCL ocl)
	{
		/*
		 * TODO: Extend this list.
		 */
		final OCLStandardLibrary<EClassifier> oclStandardLibrary = ocl.getEnvironment().getOCLStandardLibrary();

		if (oclType == oclStandardLibrary.getBoolean())
		{
			return EcorePackage.Literals.EBOOLEAN;
		}
		else if (oclType == oclStandardLibrary.getInteger())
		{
			return EcorePackage.Literals.EINT;
		}
		else if (oclType == oclStandardLibrary.getReal())
		{
			return EcorePackage.Literals.EDOUBLE;
		}
		else if (oclType == oclStandardLibrary.getString())
		{
			return EcorePackage.Literals.ESTRING;
		}
		else if (oclType == oclStandardLibrary.getUnlimitedNatural())
		{
			return EcorePackage.Literals.ELONG;
		}
		else
		{
			return oclType;
		}

	}

	/**
	 * Parse an OCL expression string.
	 * 
	 * @param expressionString
	 *            The OCL expression string.
	 * @param contextClassifier
	 *            The context classifier or null if there is no context.
	 * @return The expression's AST.
	 * @throws ParserException
	 * @throws SDMException
	 */
	private OCLExpression parseExpression(final String expressionString, EClassifier contextClassifier,
			final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, Expression> variablesScope) throws ParserException, SDMException
	{
		if (contextClassifier == null)
		{
			/*
			 * TODO: This is more of a hack. Actually, the context should be
			 * null if the constraint is to be evaluated without a context. But
			 * createQuery throws a NullPointerException in this case.
			 * Therefore, the context is set to EObject.
			 */
			contextClassifier = EcorePackage.Literals.EOBJECT;
		}

		final OCL ocl = this.getOCL(variablesScope);

		if (ocl.getExtentMap() == null)
		{
			final List<EObject> contextObjects = new LinkedList<EObject>();

			for (final Variable<EClassifier> v : variablesScope.getVariables())
			{
				if (v.getValue() instanceof EObject)
				{
					contextObjects.add((EObject) v.getValue());
				}

			}

			ocl.setExtentMap(new MultiResourceLazyExtentMap(contextObjects));
		}

		final Helper helper = ocl.createOCLHelper();

		helper.setContext(contextClassifier);

		return helper.createQuery(expressionString);
	}

}

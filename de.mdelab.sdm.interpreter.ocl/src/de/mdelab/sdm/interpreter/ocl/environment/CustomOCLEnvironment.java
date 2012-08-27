package de.mdelab.sdm.interpreter.ocl.environment;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;

import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * A customized OCL environment that does not store variables locally but
 * retrieves them from a variables scope.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class CustomOCLEnvironment extends EcoreEnvironment
{
	private final VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?>	variablesScope;

	/**
	 * 
	 * @param variablesScope
	 *            The variables scope from where variables are retrieved.
	 */
	protected CustomOCLEnvironment(VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		super(EPackage.Registry.INSTANCE);

		this.variablesScope = variablesScope;
	}

	@Override
	public boolean addElement(String name, Variable<EClassifier, EParameter> elem, boolean isExplicit)
	{
		return super.addElement(name, elem, isExplicit);
	}

	@Override
	public void deleteElement(String name)
	{
		super.deleteElement(name);
	}

	@Override
	public Collection<Variable<EClassifier, EParameter>> getVariables()
	{
		throw new UnsupportedOperationException("getVariables not implemented yet");
	}

	@Override
	public Variable<EClassifier, EParameter> lookupLocal(String name)
	{
		assert this.variablesScope != null;
		assert name != null;
		assert !"".equals(name);

		/*
		 * Delegate the lookup to the variables manager.
		 */

		de.mdelab.sdm.interpreter.core.variables.Variable<EClassifier> variable = this.variablesScope.getVariable(name);

		if (variable == null && AbstractOCLAnalyzer.isEscaped(name))
		{
			variable = this.variablesScope.getVariable(AbstractOCLAnalyzer.unescape(name));
		}

		if (variable == null)
		{
			return super.lookupLocal(name);
		}
		else
		{
			Variable<EClassifier, EParameter> var = this.getOCLFactory().createVariable();
			var.setName(variable.getName());
			var.setType(this.getOclType(variable.getClassifier()));

			return var;
		}
	}

	/**
	 * Map an EClassifier to the appropriate OCL type.
	 * 
	 * @param classifier
	 *            The EClassifier to map.
	 * @return The OCL type or the classifier itself if it does not need to be
	 *         mapped.
	 */
	private EClassifier getOclType(EClassifier classifier)
	{
		assert classifier != null;

		if (classifier.eClass() == EcorePackage.Literals.EDATA_TYPE)
		{
			// EInt, EIntegerObject, EBigInteger, EByte, EByteObject, EShort,
			// EShortObject
			if (EcorePackage.Literals.EINT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EINTEGER_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBIG_INTEGER.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBYTE.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBYTE_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESHORT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESHORT_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ELONG.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ELONG_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return this.getOCLStandardLibrary().getInteger();
			}
			// EDouble, EDoubleObject, EFloat, EFloatObject, EBigDecimal
			else if (EcorePackage.Literals.EDOUBLE.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EDOUBLE_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EFLOAT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EFLOAT_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return this.getOCLStandardLibrary().getReal();
			}
			// EBoolean, EBooleanObject
			else if (EcorePackage.Literals.EBOOLEAN.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.EBOOLEAN_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return this.getOCLStandardLibrary().getBoolean();
			}
			// EChar, ECharacterObject, EString
			else if (EcorePackage.Literals.ECHAR.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ECHARACTER_OBJECT.getInstanceTypeName().equals(classifier.getInstanceTypeName())
					|| EcorePackage.Literals.ESTRING.getInstanceTypeName().equals(classifier.getInstanceTypeName()))
			{
				return this.getOCLStandardLibrary().getString();
			}
			else
			{
				return classifier;
			}
		}
		else
		{
			return classifier;
		}
	}

	@Override
	public EClassifier lookupClassifier(List<String> names)
	{
		EClassifier classifier = super.lookupClassifier(names);

		if (classifier != null)
		{
			return classifier;
		}
		else if (names.size() <= 1)
		{
			return null;
		}
		else
		{
			EPackage rootPackage = null;

			for (de.mdelab.sdm.interpreter.core.variables.Variable<EClassifier> var : this.variablesScope.getVariables())
			{
				rootPackage = this.findRootPackage(var.getClassifier(), names.get(0));

				if (rootPackage != null)
				{
					break;
				}

			}

			if (rootPackage != null)
			{
				EPackage pkg = rootPackage;

				for (int i = 1; i < names.size() - 1; i++)
				{
					pkg = getESubpackage(pkg, names.get(i));

					if (pkg == null)
					{
						return null;
					}
				}

				return getEClassifier(pkg, names.get(names.size() - 1));
			}

			return null;
		}
	}

	private EPackage findRootPackage(EClassifier classifier, String packageName)
	{
		EPackage pkg = classifier.getEPackage();

		while (pkg.getESuperPackage() != null)
		{
			pkg = pkg.getESuperPackage();
		}

		if (pkg.getName().equals(packageName))
		{
			return pkg;
		}

		if (classifier instanceof EClass)
		{
			for (EClass eClass : ((EClass) classifier).getESuperTypes())
			{
				pkg = this.findRootPackage(eClass, packageName);

				if (pkg != null)
				{
					return pkg;
				}
			}
		}

		return null;
	}

	/**
	 * Foreign method for {@link EPackage#getESubpackages()} that searches by
	 * name and accounts for possibility of underscore-escaped names.
	 * 
	 * (copied from EcoreForeignMethods class)
	 * 
	 * @param pkg
	 *            a package
	 * @param name
	 *            a possibly underscore-escaped name of a nested package
	 * 
	 * @return the matching sub-package, or <code>null</code> if none
	 */
	public static EPackage getESubpackage(EPackage pkg, String name)
	{
		for (EPackage sub : pkg.getESubpackages())
		{
			if (name.equals(sub.getName()))
			{
				return sub;
			}
		}

		if (AbstractOCLAnalyzer.isEscaped(name))
		{
			// try the unescaped name
			name = AbstractOCLAnalyzer.unescape(name);

			for (EPackage sub : pkg.getESubpackages())
			{
				if (name.equals(sub.getName()))
				{
					return sub;
				}
			}
		}

		return null;
	}

	/**
	 * Foreign method for {@link EPackage#getEClassifier(String)} that accounts
	 * for possibility of underscore-escaped names.
	 * 
	 * (copied from EcoreForeignMethods class)
	 * 
	 * @param pkg
	 *            a package
	 * @param name
	 *            a possibly underscore-escaped name of a nested classifier
	 * 
	 * @return the matching classifier, or <code>null</code> if none
	 */
	public static EClassifier getEClassifier(EPackage pkg, String name)
	{
		EClassifier result = pkg.getEClassifier(name);

		if (result == null && AbstractOCLAnalyzer.isEscaped(name))
		{
			// try the unescaped name
			result = pkg.getEClassifier(AbstractOCLAnalyzer.unescape(name));
		}

		return result;
	}

	@Override
	protected void setFactory(
			EnvironmentFactory<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> factory)
	{
		super.setFactory(factory);
	}
}

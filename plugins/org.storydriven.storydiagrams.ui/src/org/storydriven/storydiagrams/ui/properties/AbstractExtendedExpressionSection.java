package org.storydriven.storydiagrams.ui.properties;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.BinaryExpression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.util.ExpressionUtils;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.diagram.custom.util.ActivityUtil;
import org.storydriven.storydiagrams.diagram.custom.util.BoundUtil;
import org.storydriven.storydiagrams.diagram.custom.util.TextUtil;
import org.storydriven.storydiagrams.patterns.ObjectVariable;
import org.storydriven.storydiagrams.patterns.PrimitiveVariable;
import org.storydriven.storydiagrams.patterns.expressions.AttributeValueExpression;
import org.storydriven.storydiagrams.patterns.expressions.ObjectVariableExpression;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsPackage;
import org.storydriven.storydiagrams.patterns.expressions.PrimitiveVariableExpression;
import org.storydriven.storydiagrams.ui.SourceViewerProvider;

import de.upb.swt.core.ui.CoreImages;
import de.upb.swt.core.ui.properties.sections.AbstractPropertySection;
import de.upb.swt.core.ui.providers.ComposedAdapterFactoryLabelProvider;
import de.upb.swt.core.ui.providers.ContainmentContentProvider;

public abstract class AbstractExtendedExpressionSection extends AbstractPropertySection {
	private static final String EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID = "org.storydriven.storydiagrams.diagram.custom.expressionSourceViewerExtension";
	private static final String EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
	private static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
	private static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";

	private static HashMap<String, SourceViewerProvider> sourceViewerProviders;

	private Group group;

	private Composite viewerComposite;

	private Composite createComposite;

	private SashForm treeForm;

	private Composite treeViewerWrapperComposite;
	private TreeViewer treeViewer;
	private Composite treePropertiesWrapperComposite;
	private Composite treePropertiesComposite;

	private ISourceViewer sourceViewer;

	private Button removeButton;

	private SourceViewerProvider provider;

	private Composite emptyPC;
	private Composite literalPC;
	private Composite comparisonPC;
	private Composite arithmeticPC;
	private Composite logicPC;
	private Composite attributePC;
	private Combo logicOperatorCombo;
	private Combo arithmeticOperatorCombo;
	private Combo comparisonOperatorCombo;
	private Text literalValueText;

	private Map<String, ObjectVariable> objectVariables;
	private Map<String, PrimitiveVariable> primitiveVariables;
	private Map<String, EAttribute> attributes;

	private ComposedAdapterFactoryLabelProvider labelProvider;
	private Combo oveVariableCombo;
	private Composite ovePC;
	private Composite pvePC;
	private Combo pveVariableCombo;
	private Combo attributesObjectCombo;
	private Combo attributesCombo;

	public AbstractExtendedExpressionSection() {
		objectVariables = new LinkedHashMap<String, ObjectVariable>();
		primitiveVariables = new LinkedHashMap<String, PrimitiveVariable>();
		attributes = new LinkedHashMap<String, EAttribute>();

		initializeSourceViewerProviders();
	}

	private static void initializeSourceViewerProviders() {
		if (sourceViewerProviders == null && Platform.getExtensionRegistry() != null) {
			sourceViewerProviders = new HashMap<String, SourceViewerProvider>();

			IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(EXPRESSION_SOURCE_VIEWER_EXTENSION_POINT_ID);

			for (IConfigurationElement configurationElement : configurationElements) {
				String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_LANGUAGE_ATTRIBUTE_NAME);
				String v = configurationElement.getAttribute(EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME);

				if ((s != null && !("".equals(s))) && (v != null && !("".equals(v)))) {
					try {
						sourceViewerProviders.put(s.concat(v), (SourceViewerProvider) configurationElement
								.createExecutableExtension(EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME));
					} catch (CoreException e) {
						// Skip it but show error message
						e.printStackTrace();
					}
				}
			}
		}

		for (String aLanguage : ExpressionUtils.getAvailableExpressionLanguages()) {
			for (String aVersion : ExpressionUtils.getAvailableExpressionLanguageVersions(aLanguage)) {
				if (!sourceViewerProviders.containsKey(aLanguage.concat(aVersion))) {
					sourceViewerProviders.put(aLanguage.concat(aVersion), new SourceViewerProvider());
				}
			}
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void dispose() {
		if (provider != null) {
			provider.dispose();
		}

		if (labelProvider != null) {
			labelProvider.dispose();
			labelProvider = null;
		}
		super.dispose();
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		labelProvider = new ComposedAdapterFactoryLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof EObject) {
					StringBuilder builder = new StringBuilder();

					builder.append(getEClassName((EObject) element));

					builder.append(' ');

					if (element instanceof ArithmeticExpression) {
						builder.append(TextUtil.getText(((ArithmeticExpression) element).getOperator()));
					} else if (element instanceof ComparisonExpression) {
						builder.append(TextUtil.getText(((ComparisonExpression) element).getOperator()));
					} else if (element instanceof LogicalExpression) {
						builder.append(TextUtil.getText(((LogicalExpression) element).getOperator()));
					} else if (element instanceof UnaryExpression) {
						// nothing
					} else if (element instanceof Expression) {
						builder.append(TextUtil.getText((Expression) element));
					} else {
						builder.append(element);
					}

					return builder.toString();
				}

				return super.getText(element);
			}
		};

		group = factory.createGroup(parent, getLabelText());

		viewerComposite = factory.createFlatFormComposite(group);

		// composite to show create buttons
		createComposite = factory.createFlatFormComposite(viewerComposite);
		fillCreateComposite(factory);

		// tree viewer to show containment hierarchy
		treeForm = new SashForm(viewerComposite, SWT.NONE);
		factory.adapt(treeForm);

		treeViewerWrapperComposite = factory.createFlatFormComposite(treeForm);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(treeViewerWrapperComposite);

		Tree tree = factory.createTree(treeViewerWrapperComposite, SWT.BORDER | SWT.SINGLE);
		treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new ContainmentContentProvider());
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

		treePropertiesWrapperComposite = factory.createFlatFormComposite(treeForm);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(treePropertiesWrapperComposite);

		treePropertiesComposite = factory.createFlatFormComposite(treePropertiesWrapperComposite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(treePropertiesComposite);

		// property things
		createPropertyWidgets(factory);

		// source viewer to show textual expression
		// TODO

		// remove button
		removeButton = factory.createButton(group, "Remove Expression", SWT.PUSH);

		// createMenu();
	}

	protected String getLabelText() {
		return "Expression";
	}

	private void fillCreateComposite(TabbedPropertySheetWidgetFactory factory) {
		Button comparisonButton = factory.createButton(createComposite, "Comparison Expression", SWT.PUSH);
		comparisonButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(CommonExpressionsFactory.eINSTANCE.createComparisonExpression());
			}
		});

		Button objectButton = factory.createButton(createComposite, "Object Variable Expression", SWT.PUSH);
		objectButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression());
			}
		});

		Button primitiveButton = factory.createButton(createComposite, "Primitive Variable Expression", SWT.PUSH);
		primitiveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression());
			}
		});

		Button logicButton = factory.createButton(createComposite, "Logic Expression", SWT.PUSH);
		logicButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(CommonExpressionsFactory.eINSTANCE.createLogicalExpression());
			}
		});

		Button arithmeticButton = factory.createButton(createComposite, "Arithmetic Expression", SWT.PUSH);
		arithmeticButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(CommonExpressionsFactory.eINSTANCE.createArithmeticExpression());
			}
		});

		Button stringLiteralButton = factory.createButton(createComposite, "Literal Expression", SWT.PUSH);
		stringLiteralButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				internalSetExpression(CommonExpressionsFactory.eINSTANCE.createLiteralExpression());
			}
		});

		Button textualItem = factory.createButton(createComposite, "Textual Expression", SWT.PUSH);
		textualItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
				expression.setLanguage("OCL");
				expression.setLanguageVersion("1.0");
				internalSetExpression(expression);
			}
		});
	}

	private void createPropertyWidgets(TabbedPropertySheetWidgetFactory factory) {
		// empty
		emptyPC = factory.createFlatFormComposite(treePropertiesComposite);

		// literal expression
		{
			literalPC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(literalPC);

			factory.createLabel(literalPC, "Value:", SWT.TRAIL);
			literalValueText = factory.createText(literalPC, EMPTY, SWT.BORDER | SWT.SINGLE);
			literalValueText.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					changeProperty(CommonExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE,
							literalValueText.getText());
				}
			});
			GridDataFactory.fillDefaults().grab(true, false).applyTo(literalValueText);
		}

		// comparison expression
		{
			comparisonPC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(comparisonPC);

			factory.createLabel(comparisonPC, "Operator:", SWT.TRAIL);
			comparisonOperatorCombo = new Combo(comparisonPC, SWT.READ_ONLY);
			factory.adapt(comparisonOperatorCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(comparisonOperatorCombo);
			String[] items = new String[ComparingOperator.values().length];
			for (int i = 0; i < items.length; i++) {
				items[i] = ComparingOperator.get(i).getName();
			}
			comparisonOperatorCombo.setItems(items);
			comparisonOperatorCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Object value = ComparingOperator.get(comparisonOperatorCombo.getSelectionIndex());
					changeProperty(CommonExpressionsPackage.Literals.COMPARISON_EXPRESSION__OPERATOR, value);
				}
			});
		}

		// arithmetic expression
		{
			arithmeticPC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(arithmeticPC);

			factory.createLabel(arithmeticPC, "Operator:", SWT.TRAIL);
			arithmeticOperatorCombo = new Combo(arithmeticPC, SWT.READ_ONLY);
			factory.adapt(arithmeticOperatorCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(arithmeticOperatorCombo);
			String[] items = new String[ArithmeticOperator.values().length];
			for (int i = 0; i < items.length; i++) {
				items[i] = ArithmeticOperator.get(i).getName();
			}
			arithmeticOperatorCombo.setItems(items);
			arithmeticOperatorCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Object value = ArithmeticOperator.get(arithmeticOperatorCombo.getSelectionIndex());
					changeProperty(CommonExpressionsPackage.Literals.ARITHMETIC_EXPRESSION__OPERATOR, value);
				}
			});
		}

		// logic expression
		{
			logicPC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(logicPC);

			factory.createLabel(logicPC, "Operator:", SWT.TRAIL);
			logicOperatorCombo = new Combo(logicPC, SWT.READ_ONLY);
			factory.adapt(logicOperatorCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(logicOperatorCombo);
			String[] items = new String[LogicOperator.values().length];
			for (int i = 0; i < items.length; i++) {
				items[i] = LogicOperator.get(i).getName();
			}
			logicOperatorCombo.setItems(items);
			logicOperatorCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Object value = LogicOperator.get(logicOperatorCombo.getSelectionIndex());
					changeProperty(CommonExpressionsPackage.Literals.LOGICAL_EXPRESSION__OPERATOR, value);
				}
			});
		}

		// object variable expression
		{
			ovePC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(ovePC);

			factory.createLabel(ovePC, "Variable:", SWT.TRAIL);
			oveVariableCombo = new Combo(ovePC, SWT.READ_ONLY);
			factory.adapt(oveVariableCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(oveVariableCombo);
			oveVariableCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					changeProperty(PatternsExpressionsPackage.Literals.OBJECT_VARIABLE_EXPRESSION__OBJECT,
							objectVariables.get(oveVariableCombo.getText()));
				}
			});
		}

		// primitive variable expression
		{
			pvePC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(pvePC);

			factory.createLabel(pvePC, "Variable:", SWT.TRAIL);
			pveVariableCombo = new Combo(pvePC, SWT.READ_ONLY);
			factory.adapt(pveVariableCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(pveVariableCombo);
			pveVariableCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					changeProperty(
							PatternsExpressionsPackage.Literals.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE,
							primitiveVariables.get(pveVariableCombo.getText()));
				}
			});
		}

		// attribute value expression
		{
			attributePC = factory.createFlatFormComposite(treePropertiesComposite);
			GridLayoutFactory.fillDefaults().numColumns(2).applyTo(attributePC);

			// object variable
			factory.createLabel(attributePC, "Variable:", SWT.TRAIL);
			attributesObjectCombo = new Combo(attributePC, SWT.READ_ONLY);
			factory.adapt(attributesObjectCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(attributesObjectCombo);
			attributesObjectCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					changeProperty(PatternsExpressionsPackage.Literals.ATTRIBUTE_VALUE_EXPRESSION__OBJECT,
							objectVariables.get(attributesObjectCombo.getText()));
				}
			});

			// attribute
			factory.createLabel(attributePC, "Attribute:", SWT.TRAIL);
			attributesCombo = new Combo(attributePC, SWT.READ_ONLY);
			factory.adapt(attributesCombo);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(attributesCombo);
			attributesCombo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					changeProperty(PatternsExpressionsPackage.Literals.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE,
							attributes.get(attributesCombo.getText()));
				}
			});
		}
	}

	protected abstract void setExpression(Expression expression);

	@Override
	protected void hookWidgetListeners() {
		// addButton.addSelectionListener(new SelectionAdapter() {
		// @Override
		// public void widgetSelected(SelectionEvent e) {
		// addMenu.setVisible(true);
		// }
		// });
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				showProperties();
				fillMenu();
			}
		});

		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeExpression();
			}
		});
	}

	@Override
	protected void layoutWidgets() {
		// group
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(group);

		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		group.setLayoutData(data);

		// viewer pane
		viewerComposite.setLayout(new StackLayout());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(viewerComposite);

		// create section
		GridLayoutFactory.fillDefaults().applyTo(createComposite);

		// tree section
		treePropertiesComposite.setLayout(new StackLayout());
	}

	private void removeExpression() {
		if (getExpression() != null) {
			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
				@Override
				protected void doExecute() {
					EcoreUtil.delete(getExpression(), true);
				}
			};

			execute(command);
			refresh();
		}
	}

	private void internalSetExpression(final Expression expression) {
		RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
			@Override
			protected void doExecute() {
				setExpression(expression);
			}
		};
		execute(command);

		refresh();
	}

	private void remove() {
		RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
			@Override
			protected void doExecute() {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				for (Object selected : selection.toArray()) {
					if (selected instanceof EObject) {
						EcoreUtil.delete((EObject) selected, true);
					}
				}
			}
		};

		execute(command);
		refresh();
	}

	@Override
	public void refresh() {
		Expression expression = getExpression();

		if (expression == null) {
			// TODO: make some buttons

			// show it
			StackLayout layout = (StackLayout) viewerComposite.getLayout();
			layout.topControl = createComposite;
		} else if (expression instanceof TextualExpression) {
			System.out.println("show the source viewer");

			EClassifier classifier = getContextClassifier();
			String value = ((TextualExpression) expression).getExpressionText();

			if (provider == null) {
				provider = sourceViewerProviders.get("OCL1.0");
			}
			if (sourceViewer != null) {
				sourceViewer.getTextWidget().dispose();
				sourceViewer = null;
			}

			sourceViewer = provider.createSourceViewer(viewerComposite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL,
					classifier, getContextInformation(), value);
			sourceViewer.addTextListener(new ITextListener() {
				@Override
				public void textChanged(TextEvent event) {
					final Expression expression = getExpression();
					if (expression instanceof TextualExpression) {
						RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
							@Override
							protected void doExecute() {
								((TextualExpression) expression).setExpressionText(sourceViewer.getDocument().get());
								Expression expression = getExpression();
								setExpression(null);
								setExpression(expression);
							}
						};

						execute(command);
					}
				}
			});

			provider.setText(value);

			// show it
			StackLayout layout = (StackLayout) viewerComposite.getLayout();
			layout.topControl = sourceViewer.getTextWidget();
		} else {
			// set tree input
			treeViewer.setInput(getElement());

			// show adequate properties
			showProperties();

			// show it
			StackLayout layout = (StackLayout) viewerComposite.getLayout();
			layout.topControl = treeForm;
		}

		viewerComposite.layout();
	}

	protected abstract Expression getExpression();

	protected EClassifier getContextClassifier() {
		return null;
	}

	protected Map<String, EClassifier> getContextInformation() {
		return BoundUtil.getBoundObjects(getElement());
	}

	private void showProperties() {
		StackLayout properties = (StackLayout) treePropertiesComposite.getLayout();
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		Composite control = emptyPC;
		if (selection.size() == 1) {
			Object selected = selection.getFirstElement();

			if (selected instanceof LiteralExpression) {
				LiteralExpression le = (LiteralExpression) selected;
				String value = le.getValue();
				literalValueText.setText(value == null ? EMPTY : value);

				control = literalPC;
			} else if (selected instanceof ComparisonExpression) {
				ComparisonExpression ce = (ComparisonExpression) selected;
				comparisonOperatorCombo.select(ce.getOperator().ordinal());

				control = comparisonPC;
			} else if (selected instanceof ArithmeticExpression) {
				ArithmeticExpression ae = (ArithmeticExpression) selected;
				arithmeticOperatorCombo.select(ae.getOperator().ordinal());

				control = arithmeticPC;
			} else if (selected instanceof LogicalExpression) {
				LogicalExpression le = (LogicalExpression) selected;
				logicOperatorCombo.select(le.getOperator().ordinal());

				control = logicPC;
			} else if (selected instanceof ObjectVariableExpression) {
				ObjectVariableExpression ove = (ObjectVariableExpression) selected;

				String[] items = getObjectVariableItems();
				int index = getObjectVariableIndex(ove.getObject());

				oveVariableCombo.setItems(items);
				oveVariableCombo.select(index);

				control = ovePC;
			} else if (selected instanceof PrimitiveVariableExpression) {
				PrimitiveVariableExpression ove = (PrimitiveVariableExpression) selected;

				String[] items = getPrimitiveVariableItems();
				int index = getPrimitiveVariableIndex(ove.getPrimitiveVariable());

				pveVariableCombo.setItems(items);
				pveVariableCombo.select(index);

				control = pvePC;
			} else if (selected instanceof AttributeValueExpression) {
				AttributeValueExpression ave = (AttributeValueExpression) selected;

				// TODO: set object variables
				String[] items = getObjectVariableItems();
				int index = getObjectVariableIndex(ave.getObject());

				attributesObjectCombo.setItems(items);
				attributesObjectCombo.select(index);

				items = getAttributeItems(ave.getObject());
				index = getAttributeIndex(ave.getAttribute());

				attributesCombo.setItems(items);
				attributesCombo.select(index);

				control = attributePC;
			}
		}
		properties.topControl = control;
		treePropertiesComposite.layout();
	}

	private String[] getObjectVariableItems() {
		// clear
		objectVariables.clear();

		// get available types
		List<ObjectVariable> variables = BoundUtil.getAllObjectVariables(ActivityUtil.getActivity(getElement()));

		// collect them
		for (ObjectVariable variable : variables) {
			String key = variable.getName();
			if (key == null) {
				key = "";
			}
			objectVariables.put(key, variable);
		}

		return objectVariables.keySet().toArray(new String[objectVariables.keySet().size()]);
	}

	private int getObjectVariableIndex(ObjectVariable variable) {
		int index = 0;
		for (ObjectVariable check : objectVariables.values()) {
			if (check.equals(variable)) {
				return index;
			}
			index++;
		}

		return -1;
	}

	private String[] getPrimitiveVariableItems() {
		// clear
		primitiveVariables.clear();

		// get available types
		List<PrimitiveVariable> variables = BoundUtil.getAllPrimitiveVariables(ActivityUtil.getActivity(getElement()));

		// collect them
		for (PrimitiveVariable variable : variables) {
			String key = variable.getName();
			if (key == null) {
				key = "";
			}
			primitiveVariables.put(key, variable);
		}

		return primitiveVariables.keySet().toArray(new String[primitiveVariables.keySet().size()]);
	}

	private int getPrimitiveVariableIndex(PrimitiveVariable variable) {
		int index = 0;
		for (PrimitiveVariable check : primitiveVariables.values()) {
			if (check.equals(variable)) {
				return index;
			}
			index++;
		}

		return -1;
	}

	private String[] getAttributeItems(ObjectVariable variable) {
		// clear
		attributes.clear();

		if (variable != null && variable.getClassifier() != null) {
			// collect them
			for (EAttribute attribute : variable.getClassifier().getEAllAttributes()) {
				String key = attribute.getName();
				attributes.put(key, attribute);
			}

			return attributes.keySet().toArray(new String[attributes.keySet().size()]);
		}
		return new String[0];
	}

	private int getAttributeIndex(EAttribute attribute) {
		int index = 0;
		for (EAttribute check : attributes.values()) {
			if (check.equals(attribute)) {
				return index;
			}
			index++;
		}

		return -1;
	}

	private void changeProperty(final EStructuralFeature feature, final Object value) {
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		if (selection.size() == 1) {
			final Object selected = selection.getFirstElement();
			if (selected instanceof EObject) {
				RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
					@Override
					protected void doExecute() {
						((EObject) selected).eSet(feature, value);
					}
				};
				execute(command);
				refreshExpression();
				fillMenu();
				treeViewer.refresh();
				treeViewer.expandAll();
			}
		}
	}

	private void refreshExpression() {
		RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
			protected void doExecute() {
				Expression expression = getExpression();
				setExpression(null);
				setExpression(expression);
			}
		};
		execute(command);
	}

	private void fillMenu() {
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		if (selection.size() == 1) {
			Object element = selection.getFirstElement();

			Menu menu = new Menu(treeViewer.getControl());

			// binary expression
			if (element instanceof BinaryExpression) {
				// allow only literal, arithmetic.... expressions
				BinaryExpression be = (BinaryExpression) element;
				if (be.getLeftExpression() == null) {
					String prefix = "Left";
					EStructuralFeature feature = CommonExpressionsPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION;

					createMenuItems(menu, feature, prefix);
				}

				if (be.getRightExpression() == null) {
					String prefix = "Right";
					EStructuralFeature feature = CommonExpressionsPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION;

					createMenuItems(menu, feature, prefix);
				}
			} else if (element instanceof UnaryExpression) {
				EStructuralFeature feature = CommonExpressionsPackage.Literals.UNARY_EXPRESSION__ENCLOSED_EXPRESSION;

				createMenuItems(menu, feature, null);
			}

			// add separator at top
			if (menu.getItemCount() > 0) {
				new MenuItem(menu, SWT.SEPARATOR, 0);
			}

			// add 'remove' at top
			MenuItem removeItem = new MenuItem(menu, SWT.PUSH, 0);
			removeItem.setText("Remove");
			removeItem.setImage(CoreImages.get(CoreImages.REMOVE));
			removeItem.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					remove();
				}
			});

			// set menu
			treeViewer.getControl().setMenu(menu);
		} else {
			treeViewer.getControl().setMenu(null);
		}
	}

	private void createMenuItems(Menu menu, final EStructuralFeature feature, String prefix) {
		// core
		createMenuItem(menu, feature, CommonExpressionsFactory.eINSTANCE.createArithmeticExpression(), prefix);
		createMenuItem(menu, feature, CommonExpressionsFactory.eINSTANCE.createLogicalExpression(), prefix);
		createMenuItem(menu, feature, CommonExpressionsFactory.eINSTANCE.createComparisonExpression(), prefix);
		createMenuItem(menu, feature, CommonExpressionsFactory.eINSTANCE.createUnaryExpression(), prefix);
		createMenuItem(menu, feature, CommonExpressionsFactory.eINSTANCE.createLiteralExpression(), prefix);

		// calls
		new MenuItem(menu, SWT.SEPARATOR);
		createMenuItem(menu, feature, CallsExpressionsFactory.eINSTANCE.createMethodCallExpression(), prefix);
		createMenuItem(menu, feature, CallsExpressionsFactory.eINSTANCE.createParameterExpression(), prefix);

		// patterns
		new MenuItem(menu, SWT.SEPARATOR);
		createMenuItem(menu, feature, PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression(), prefix);
		createMenuItem(menu, feature, PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression(), prefix);
		createMenuItem(menu, feature, PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression(), prefix);
		createMenuItem(menu, feature, PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression(), prefix);

		// activities
		new MenuItem(menu, SWT.SEPARATOR);
		createMenuItem(menu, feature, ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression(),
				prefix);
	}

	private void createMenuItem(Menu menu, final EStructuralFeature feature, final EObject element, String prefix) {
		String text = getEClassName(element);

		if (prefix != null) {
			text = prefix + ':' + ' ' + text;
		}
		MenuItem item = new MenuItem(menu, SWT.NONE);
		item.setImage(labelProvider.getImage(element));
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				changeProperty(feature, element);
			};
		});

		item.setText(text);
	}

	private String getEClassName(EObject element) {
		StringBuilder builder = new StringBuilder();

		String value = element.eClass().getName();

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (i > 0 && Character.isUpperCase(c)) {
				builder.append(' ');
			}
			builder.append(c);
		}

		return builder.toString();
	}
}

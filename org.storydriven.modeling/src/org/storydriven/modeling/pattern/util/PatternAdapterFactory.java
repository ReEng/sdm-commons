/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.pattern.AttributeExpression;
import org.storydriven.modeling.pattern.Link;
import org.storydriven.modeling.pattern.MultiLink;
import org.storydriven.modeling.pattern.ObjectPattern;
import org.storydriven.modeling.pattern.Path;
import org.storydriven.modeling.pattern.PatternPackage;
import org.storydriven.modeling.pattern.StoryNode;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage
 * @generated
 */
public class PatternAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static PatternPackage modelPackage;

   /**
    * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public PatternAdapterFactory ()
   {
      if (modelPackage == null)
      {
         modelPackage = PatternPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This implementation returns <code>true</code> if the object is either the
    * model's package or is an instance object of the model. <!-- end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType (Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected PatternSwitch<Adapter> modelSwitch = new PatternSwitch<Adapter>()
   {
      @Override
      public Adapter caseAttributeExpression (AttributeExpression object)
      {
         return createAttributeExpressionAdapter();
      }

      @Override
      public Adapter caseLink (Link object)
      {
         return createLinkAdapter();
      }

      @Override
      public Adapter caseMultiLink (MultiLink object)
      {
         return createMultiLinkAdapter();
      }

      @Override
      public Adapter caseObjectPattern (ObjectPattern object)
      {
         return createObjectPatternAdapter();
      }

      @Override
      public Adapter caseStoryNode (StoryNode object)
      {
         return createStoryNodeAdapter();
      }

      @Override
      public Adapter casePath (Path object)
      {
         return createPathAdapter();
      }

      @Override
      public Adapter caseObject (org.storydriven.modeling.pattern.Object object)
      {
         return createObjectAdapter();
      }

      @Override
      public Adapter caseExtendableElement (ExtendableElement object)
      {
         return createExtendableElementAdapter();
      }

      @Override
      public Adapter caseNamedElement (NamedElement object)
      {
         return createNamedElementAdapter();
      }

      @Override
      public Adapter caseCommentableElement (CommentableElement object)
      {
         return createCommentableElementAdapter();
      }

      @Override
      public Adapter caseActivityNode (ActivityNode object)
      {
         return createActivityNodeAdapter();
      }

      @Override
      public Adapter caseTypedElement (TypedElement object)
      {
         return createTypedElementAdapter();
      }

      @Override
      public Adapter defaultCase (EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter (Notifier target)
   {
      return this.modelSwitch.doSwitch((EObject) target);
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.AttributeExpression <em>Attribute Expression</em>}'. <!-- begin-user-doc --> This
    * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.AttributeExpression
    * @generated
    */
   public Adapter createAttributeExpressionAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.Link <em>Link</em>}'. <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.Link
    * @generated
    */
   public Adapter createLinkAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.MultiLink <em>Multi Link</em>}'. <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.MultiLink
    * @generated
    */
   public Adapter createMultiLinkAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.ObjectPattern <em>Object Pattern</em>}'. <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.ObjectPattern
    * @generated
    */
   public Adapter createObjectPatternAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.StoryNode <em>Story Node</em>}'. <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.StoryNode
    * @generated
    */
   public Adapter createStoryNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.Path <em>Path</em>}'. <!-- begin-user-doc --> This default implementation returns null
    * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.Path
    * @generated
    */
   public Adapter createPathAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.pattern.Object <em>Object</em>}'. <!-- begin-user-doc --> This default implementation returns
    * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.pattern.Object
    * @generated
    */
   public Adapter createObjectAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'. <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.ExtendableElement
    * @generated
    */
   public Adapter createExtendableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.NamedElement <em>Named Element</em>}'. <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.CommentableElement <em>Commentable Element</em>}'. <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.CommentableElement
    * @generated
    */
   public Adapter createCommentableElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.activities.ActivityNode <em>Activity Node</em>}'. <!-- begin-user-doc --> This default
    * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.activities.ActivityNode
    * @generated
    */
   public Adapter createActivityNodeAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.modeling.TypedElement <em>Typed Element</em>}'. <!-- begin-user-doc --> This default implementation
    * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.storydriven.modeling.TypedElement
    * @generated
    */
   public Adapter createTypedElementAdapter ()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null. <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter ()
   {
      return null;
   }

} // PatternAdapterFactory

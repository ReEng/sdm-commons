/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bound Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.pattern.PatternPackage#getBoundType()
 * @model
 * @generated
 */
public enum BoundType implements Enumerator
{
   /**
    * The '<em><b>BOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOUND_VALUE
    * @generated
    * @ordered
    */
   BOUND (0, "BOUND", "BOUND"),

   /**
    * The '<em><b>UNBOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #UNBOUND_VALUE
    * @generated
    * @ordered
    */
   UNBOUND (1, "UNBOUND", "UNBOUND"),

   /**
    * The '<em><b>MAYBE BOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MAYBE_BOUND_VALUE
    * @generated
    * @ordered
    */
   MAYBE_BOUND (2, "MAYBE_BOUND", "MAYBE_BOUND");

   /**
    * The '<em><b>BOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int BOUND_VALUE = 0;

   /**
    * The '<em><b>UNBOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>UNBOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #UNBOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int UNBOUND_VALUE = 1;

   /**
    * The '<em><b>MAYBE BOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MAYBE BOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #MAYBE_BOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int MAYBE_BOUND_VALUE = 2;

   /**
    * An array of all the '<em><b>Bound Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final BoundType[] VALUES_ARRAY = new BoundType[] {BOUND, UNBOUND, MAYBE_BOUND,};

   /**
    * A public read-only list of all the '<em><b>Bound Type</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<BoundType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Bound Type</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BoundType get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BoundType result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Bound Type</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BoundType getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BoundType result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Bound Type</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static BoundType get (int value)
   {
      switch (value)
      {
         case BOUND_VALUE:
            return BOUND;
         case UNBOUND_VALUE:
            return UNBOUND;
         case MAYBE_BOUND_VALUE:
            return MAYBE_BOUND;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private BoundType (int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue ()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName ()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral ()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      return literal;
   }

} //BoundType

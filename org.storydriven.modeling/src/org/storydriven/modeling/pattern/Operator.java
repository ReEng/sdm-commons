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
 * A representation of the literals of the enumeration '<em><b>Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.pattern.PatternPackage#getOperator()
 * @model
 * @generated
 */
public enum Operator implements Enumerator
{
   /**
    * The '<em><b>ASSIGN</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ASSIGN_VALUE
    * @generated
    * @ordered
    */
   ASSIGN (0, "ASSIGN", "ASSIGN"),

   /**
    * The '<em><b>EQUAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EQUAL_VALUE
    * @generated
    * @ordered
    */
   EQUAL (1, "EQUAL", "EQUAL"),

   /**
    * The '<em><b>NOT EQUAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NOT_EQUAL_VALUE
    * @generated
    * @ordered
    */
   NOT_EQUAL (2, "NOT_EQUAL", "NOT_EQUAL"),

   /**
    * The '<em><b>LESS</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LESS_VALUE
    * @generated
    * @ordered
    */
   LESS (3, "LESS", "LESS"),

   /**
    * The '<em><b>GREATER</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREATER_VALUE
    * @generated
    * @ordered
    */
   GREATER (4, "GREATER", "GREATER"),

   /**
    * The '<em><b>LESS EQUAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LESS_EQUAL_VALUE
    * @generated
    * @ordered
    */
   LESS_EQUAL (5, "LESS_EQUAL", "LESS_EQUAL"),

   /**
    * The '<em><b>GREATER EQUAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #GREATER_EQUAL_VALUE
    * @generated
    * @ordered
    */
   GREATER_EQUAL (6, "GREATER_EQUAL", "GREATER_EQUAL");

   /**
    * The '<em><b>ASSIGN</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ASSIGN</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ASSIGN
    * @model
    * @generated
    * @ordered
    */
   public static final int ASSIGN_VALUE = 0;

   /**
    * The '<em><b>EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int EQUAL_VALUE = 1;

   /**
    * The '<em><b>NOT EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NOT EQUAL</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NOT_EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int NOT_EQUAL_VALUE = 2;

   /**
    * The '<em><b>LESS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LESS
    * @model
    * @generated
    * @ordered
    */
   public static final int LESS_VALUE = 3;

   /**
    * The '<em><b>GREATER</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATER
    * @model
    * @generated
    * @ordered
    */
   public static final int GREATER_VALUE = 4;

   /**
    * The '<em><b>LESS EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LESS EQUAL</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LESS_EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int LESS_EQUAL_VALUE = 5;

   /**
    * The '<em><b>GREATER EQUAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>GREATER EQUAL</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #GREATER_EQUAL
    * @model
    * @generated
    * @ordered
    */
   public static final int GREATER_EQUAL_VALUE = 6;

   /**
    * An array of all the '<em><b>Operator</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final Operator[] VALUES_ARRAY = new Operator[] {ASSIGN, EQUAL, NOT_EQUAL, LESS, GREATER, LESS_EQUAL,
         GREATER_EQUAL,};

   /**
    * A public read-only list of all the '<em><b>Operator</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<Operator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Operator</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Operator get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Operator result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Operator</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Operator getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Operator result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Operator</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Operator get (int value)
   {
      switch (value)
      {
         case ASSIGN_VALUE:
            return ASSIGN;
         case EQUAL_VALUE:
            return EQUAL;
         case NOT_EQUAL_VALUE:
            return NOT_EQUAL;
         case LESS_VALUE:
            return LESS;
         case GREATER_VALUE:
            return GREATER;
         case LESS_EQUAL_VALUE:
            return LESS_EQUAL;
         case GREATER_EQUAL_VALUE:
            return GREATER_EQUAL;
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
   private Operator (int value, String name, String literal)
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

} //Operator

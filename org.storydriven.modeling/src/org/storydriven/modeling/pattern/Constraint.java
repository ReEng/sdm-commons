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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Constraint</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.storydriven.modeling.pattern.PatternPackage#getConstraint()
 * @model
 * @generated
 */
public enum Constraint implements Enumerator
{
   /**
    * The '<em><b>NONE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #NONE_VALUE
    * @generated
    * @ordered
    */
   NONE (0, "NONE", "NONE"),

   /**
    * The '<em><b>NEGATIVE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #NEGATIVE_VALUE
    * @generated
    * @ordered
    */
   NEGATIVE (1, "NEGATIVE", "NEGATIVE"),

   /**
    * The '<em><b>OPTIONAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #OPTIONAL_VALUE
    * @generated
    * @ordered
    */
   OPTIONAL (2, "OPTIONAL", "OPTIONAL"),

   /**
    * The '<em><b>SET</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #SET_VALUE
    * @generated
    * @ordered
    */
   SET (3, "SET", "SET");

   /**
    * The '<em><b>NONE</b></em>' literal value. <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #NONE
    * @model
    * @generated
    * @ordered
    */
   public static final int NONE_VALUE = 0;

   /**
    * The '<em><b>NEGATIVE</b></em>' literal value. <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NEGATIVE</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #NEGATIVE
    * @model
    * @generated
    * @ordered
    */
   public static final int NEGATIVE_VALUE = 1;

   /**
    * The '<em><b>OPTIONAL</b></em>' literal value. <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #OPTIONAL
    * @model
    * @generated
    * @ordered
    */
   public static final int OPTIONAL_VALUE = 2;

   /**
    * The '<em><b>SET</b></em>' literal value. <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SET</b></em>' literal object isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SET
    * @model
    * @generated
    * @ordered
    */
   public static final int SET_VALUE = 3;

   /**
    * An array of all the '<em><b>Constraint</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final Constraint[] VALUES_ARRAY = new Constraint[] {NONE, NEGATIVE, OPTIONAL, SET,};

   /**
    * A public read-only list of all the '<em><b>Constraint</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<Constraint> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Constraint</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Constraint get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Constraint result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Constraint</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Constraint getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Constraint result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Constraint</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Constraint get (int value)
   {
      switch (value)
      {
         case NONE_VALUE:
            return NONE;
         case NEGATIVE_VALUE:
            return NEGATIVE;
         case OPTIONAL_VALUE:
            return OPTIONAL;
         case SET_VALUE:
            return SET;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   private Constraint (int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public int getValue ()
   {
      return this.value;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName ()
   {
      return this.name;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getLiteral ()
   {
      return this.literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString ()
   {
      return this.literal;
   }

} // Constraint

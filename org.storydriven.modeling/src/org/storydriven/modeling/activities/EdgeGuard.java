/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edge Guard</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getEdgeGuard()
 * @model
 * @generated
 */
public enum EdgeGuard implements Enumerator
{
   /**
    * The '<em><b>NONE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NONE_VALUE
    * @generated
    * @ordered
    */
   NONE (0, "NONE", "NONE"),

   /**
    * The '<em><b>SUCCESS</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #SUCCESS_VALUE
    * @generated
    * @ordered
    */
   SUCCESS (1, "SUCCESS", "SUCCESS"),

   /**
    * The '<em><b>FAILURE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FAILURE_VALUE
    * @generated
    * @ordered
    */
   FAILURE (2, "FAILURE", "FAILURE"),

   /**
    * The '<em><b>EACH TIME</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EACH_TIME_VALUE
    * @generated
    * @ordered
    */
   EACH_TIME (3, "EACH_TIME", "EACH_TIME"),

   /**
    * The '<em><b>END</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #END_VALUE
    * @generated
    * @ordered
    */
   END (4, "END", "END"),

   /**
    * The '<em><b>ELSE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ELSE_VALUE
    * @generated
    * @ordered
    */
   ELSE (5, "ELSE", "ELSE"),

   /**
    * The '<em><b>BOOL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOOL_VALUE
    * @generated
    * @ordered
    */
   BOOL (6, "BOOL", "BOOL"),

   /**
    * The '<em><b>EXCEPTION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EXCEPTION_VALUE
    * @generated
    * @ordered
    */
   EXCEPTION (7, "EXCEPTION", "EXCEPTION"),

   /**
    * The '<em><b>FINALLY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FINALLY_VALUE
    * @generated
    * @ordered
    */
   FINALLY (8, "FINALLY", "FINALLY");

   /**
    * The '<em><b>NONE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NONE
    * @model
    * @generated
    * @ordered
    */
   public static final int NONE_VALUE = 0;

   /**
    * The '<em><b>SUCCESS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SUCCESS</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #SUCCESS
    * @model
    * @generated
    * @ordered
    */
   public static final int SUCCESS_VALUE = 1;

   /**
    * The '<em><b>FAILURE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FAILURE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FAILURE
    * @model
    * @generated
    * @ordered
    */
   public static final int FAILURE_VALUE = 2;

   /**
    * The '<em><b>EACH TIME</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EACH TIME</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EACH_TIME
    * @model
    * @generated
    * @ordered
    */
   public static final int EACH_TIME_VALUE = 3;

   /**
    * The '<em><b>END</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>END</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #END
    * @model
    * @generated
    * @ordered
    */
   public static final int END_VALUE = 4;

   /**
    * The '<em><b>ELSE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ELSE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ELSE
    * @model
    * @generated
    * @ordered
    */
   public static final int ELSE_VALUE = 5;

   /**
    * The '<em><b>BOOL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOOL</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOOL
    * @model
    * @generated
    * @ordered
    */
   public static final int BOOL_VALUE = 6;

   /**
    * The '<em><b>EXCEPTION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXCEPTION</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EXCEPTION
    * @model
    * @generated
    * @ordered
    */
   public static final int EXCEPTION_VALUE = 7;

   /**
    * The '<em><b>FINALLY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FINALLY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FINALLY
    * @model
    * @generated
    * @ordered
    */
   public static final int FINALLY_VALUE = 8;

   /**
    * An array of all the '<em><b>Edge Guard</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final EdgeGuard[] VALUES_ARRAY = new EdgeGuard[] {NONE, SUCCESS, FAILURE, EACH_TIME, END, ELSE, BOOL,
         EXCEPTION, FINALLY,};

   /**
    * A public read-only list of all the '<em><b>Edge Guard</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<EdgeGuard> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Edge Guard</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static EdgeGuard get (String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EdgeGuard result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Edge Guard</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static EdgeGuard getByName (String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EdgeGuard result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Edge Guard</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static EdgeGuard get (int value)
   {
      switch (value)
      {
         case NONE_VALUE:
            return NONE;
         case SUCCESS_VALUE:
            return SUCCESS;
         case FAILURE_VALUE:
            return FAILURE;
         case EACH_TIME_VALUE:
            return EACH_TIME;
         case END_VALUE:
            return END;
         case ELSE_VALUE:
            return ELSE;
         case BOOL_VALUE:
            return BOOL;
         case EXCEPTION_VALUE:
            return EXCEPTION;
         case FINALLY_VALUE:
            return FINALLY;
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
   private EdgeGuard (int value, String name, String literal)
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

} //EdgeGuard

package org.fujaba.commons.properties.util;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.fujaba.commons.identifier.Identifier;


public enum SectionFilters
{
   INSTANCE;

   public static class IdentifierFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof Identifier;
      }
   }

//   public static class PSLinkQualifierFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSLink
//               && ((PSLink) element).getSource() instanceof PSAnnotation;
//      }
//   }
//
//   public static class PSLinkTypeFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSLink
//               && ((PSLink) element).getSource() instanceof PSObject
//               && ((PSLink) element).getTarget() instanceof PSObject;
//      }
//   }
//
//   public static class PSLinkModifierFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSLink
//               && !ModelHelper.isCreate((PSLink) element)
//               && ((PSLink) element).getTarget() instanceof PSObject;
//      }
//   }
//
//   public static class PSObjectFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         // check type
//         return element instanceof PSObject;
//      }
//   }
//
//   public static class PSAnnotationFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         // check type
//         return element instanceof PSAnnotation;
//      }
//   }
//
//   public static class PSAnnotationCreatingFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         // check type and create state
//         return (element instanceof PSAnnotation)
//               && ModelHelper.isCreate((PSAnnotation) element);
//      }
//   }
//
//   public static class PSAnnotationReferencingFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         // check type and create state
//         return (element instanceof PSAnnotation)
//               && !ModelHelper.isCreate((PSAnnotation) element);
//      }
//   }
//
//   public static class PSPathFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         // check type
//         return element instanceof PSPath;
//      }
//   }
//
//   public static class PSPatternSpecificationFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSPatternSpecification;
//      }
//   }
//
//   public static class PSBooleanConstraintFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSBooleanConstraint;
//      }
//   }
//
//   public static class PSAttributeConstraintFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSAttributeConstraint;
//      }
//   }
//
//   public static class PSMetricConstraintFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSMetricConstraint;
//      }
//   }
//
//   public static class PSFuzzyMetricConstraintFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSFuzzyMetricConstraint;
//      }
//   }
//
//   public static class PSCatalogFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSCatalog;
//      }
//   }
//
//   public static class PSSpecificationConstraintFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSSpecificationConstraint;
//      }
//   }
//
//   public static class PSSetFragmentFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         if (element instanceof PSCombinedFragment)
//         {
//            // get element
//            PSCombinedFragment fragment = (PSCombinedFragment) element;
//
//            // check for type and constraint existence
//            return fragment.getKind().equals(ModifierType.SET)
//                  && fragment.getConstraint() != null;
//         }
//
//         return false;
//      }
//   }
//
//   public static class PSCombinedFragmentFilter implements IFilter
//   {
//      @Override
//      public boolean select(Object object)
//      {
//         // get adapted element
//         EObject element = AdapterUtil.adaptObject(object);
//
//         return element instanceof PSCombinedFragment;
//      }
//   }
}

/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package de.fujaba.commons.utils;


import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * @author Dietrich Travkin
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1206 $ $Date: 2006-12-08 19:42:13 +0100 (Fr, 08 Dez 2006) $
 */
public class ConstraintAnchor extends AbstractConnectionAnchor
{

   private ConstraintAnchor partner = null;

   private int y_constraint = 0;


   public ConstraintAnchor(IFigure owner)
   {
      super(owner);
   }


   public void setPartnerAnchor(ConstraintAnchor partner)
   {
      this.partner = partner;
   }


   public void setY_Constraint(int y_constraint)
   {
      this.y_constraint = y_constraint;
   }


   /**
    * @see org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
    */
   public Point getLocation(Point reference)
   {
      Rectangle ownBounds = new Rectangle(getOwner().getBounds());
      getOwner().translateToAbsolute(ownBounds);

      int y = Math.min(ownBounds.y + this.y_constraint, ownBounds.y
            + ownBounds.height);

      if (this.partner == null)
      {
         return new Point(getReferencePoint().x, y);
      }

      Rectangle partnerBounds = new Rectangle(this.partner.getOwner()
            .getBounds());
      this.partner.getOwner().translateToAbsolute(partnerBounds);

      int x;
      if (ownBounds.x + ownBounds.width <= partnerBounds.x)
      {
         // anchor on the right of the owner figure
         x = ownBounds.x + ownBounds.width;
      }
      else if (partnerBounds.x + partnerBounds.width <= ownBounds.x)
      {
         // anchor on the left of the owner figure
         x = ownBounds.x;
      }
      else if (ownBounds.equals(partnerBounds))
      {
         // source and target are the same, choose right side of the figure
         x = ownBounds.x + ownBounds.width;
      }
      else
      {
         return getReferencePoint();
      }

      return new Point(x, y);
   }

}

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
package org.storydriven.modeling.editor.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;


/**
 * @author    Dietrich Travkin (travkin)
 * @author    Last editor: $Author: travkin $
 * @version   $Revision: 1022 $ $Date: 2006-05-22 19:11:54 +0200 (Mo, 22 Mai 2006) $
 */
public class UMLStopActivityFigure extends CircleFigure
{
   /**
    */
   public UMLStopActivityFigure()
   {
      this (ColorConstants.white);
   }


   /**
    * @param fillColor
    */
   public UMLStopActivityFigure (Color fillColor)
   {
      super (fillColor);
      this.setForegroundColor (ColorConstants.black);
   }


   /**
    * @param graphics  No description provided
    * @see             org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
    */
   @Override
   protected void paintFigure (Graphics graphics)
   {
      if (isOpaque())
      {
         int size = Math.min (getBounds().height, getBounds().width);
         int x = getBounds().x + getBounds().width / 2 - size / 2;
         int y = getBounds().y + getBounds().height / 2 - size / 2;

         graphics.fillOval (x, y, size, size);
         graphics.setBackgroundColor (this.getForegroundColor());
         graphics.fillOval (x + size / 4, y + size / 4, size / 2, size / 2);
         graphics.setBackgroundColor (this.getColor());

         graphics.drawOval (x, y, size - 1, size - 1);
      }
   }
}

/*
 * $Log$
 * Revision 1.4  2006/05/22 17:11:34  travkin
 * Removed most compile warnings.
 *
 * Revision 1.3  2006/04/11 17:07:05  travkin
 * Changed some javadoc comments.
 *
 */

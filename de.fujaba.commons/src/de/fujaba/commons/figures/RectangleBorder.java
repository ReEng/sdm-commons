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
package de.fujaba.commons.figures;

import org.eclipse.swt.graphics.Color;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;

/**
 * @author Florian Klein (fklein@upb.de)
 * @author Last editor: $Author: fklein $
 * @version $Revision: 1207 $ $Date: 2006-12-08 19:43:39 +0100 (Fr, 08 Dez 2006) $
 *
 * A symmetrical rectangular border
 * 
 * Equivalent to org.eclipse.draw2d.LineBorder {@link LineBorder},
 * but supports line style and is part of a proper AbstractLineBorder
 * hierarchy
 */
public class RectangleBorder extends AbstractLineBorder
{
   /**
    * Constructs a border with width 1, default color, default line style
    */
   public RectangleBorder() 
   { 
      
   }
   
   /**
    * Constructs a border with the provided width, default color, default line style
    *
    * @param width the width of the border
    */
   public RectangleBorder(int width) 
   {
      this(null, width);
   }
  
   /**
    * Constructs a border with the provided color, width 1, default line style
    *
    * @param color the border color
    */
   public RectangleBorder(Color color) 
   {
      this(color, 1);
   }
   
   /**
    * Constructs a border with the provided color and width, default line style
    *
    * @param color the border color
    * @param width the width of the border
    */
   public RectangleBorder(Color color, int width) 
   {
      setColor(color);
      setWidth(width);
   }
   
   /**
    * Constructs a border with the provided color, width, and line style
    *
    * @param color the border color
    * @param width the width of the border
    */
   public RectangleBorder(Color color, int width, int lineStyle) 
   {
      setColor(color);
      setWidth(width);
      setLineStyle(lineStyle);
   }
  
   /**
    * The space used up by the border
    * 
    * @param figure this border's figure
    * @return the border's insets
    */
   public Insets getInsets(IFigure figure) 
   {
      return new Insets(getWidth());
   }
         
   /**
    * Actually draw the border (rectangle)
    */
   @Override
   public void paintBorder(IFigure figure, Graphics graphics, Insets insets) 
   {
      tempRect.setBounds(getPaintRectangle(figure, insets));
      if (getWidth() % 2 == 1) 
      {
         tempRect.width--;
         tempRect.height--;
      }
      tempRect.shrink(getWidth() / 2, getWidth() / 2);      
      graphics.drawRectangle(tempRect);
   }   
}

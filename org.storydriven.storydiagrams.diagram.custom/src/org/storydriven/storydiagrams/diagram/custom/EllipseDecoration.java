package org.storydriven.storydiagrams.diagram.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IClippingStrategy;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transform;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.swt.graphics.Color;

public class EllipseDecoration extends Ellipse implements RotatableDecoration {
	private Polyline verticalLine;
	private Polyline horizontalLine;

	private Transform transform = new Transform();

	private Point location = new Point();
	private int diameter;

	public EllipseDecoration(IMapMode mapMode) {
		diameter = mapMode.DPtoLP(16);
		int radius = mapMode.DPtoLP(8);
		Dimension dimension = new Dimension(diameter, diameter);

		setPreferredSize(dimension);
		setMaximumSize(dimension);
		setMinimumSize(dimension);
		setClippingStrategy(new IClippingStrategy() {
			@Override
			public Rectangle[] getClip(IFigure childFigure) {
				return new Rectangle[] { childFigure.getBounds() };
			}
		});

		PointList pl = new PointList(2);
		pl.addPoint(-radius, mapMode.DPtoLP(-2));
		pl.addPoint(-radius, mapMode.DPtoLP(-diameter + 2));

		verticalLine = new Polyline();
		verticalLine.setPoints(pl);
		verticalLine.setFill(true);
		add(verticalLine);

		pl = new PointList(2);
		pl.addPoint(mapMode.DPtoLP(-2), -radius);
		pl.addPoint(mapMode.DPtoLP(-diameter + 2), -radius);

		horizontalLine = new Polyline();
		horizontalLine.setPoints(pl);
		horizontalLine.setFill(true);
		add(horizontalLine);

		setFill(false);
		setLineWidth(1);

		setBackgroundColor(ColorConstants.white);
	}

	@Override
	public void setBackgroundColor(Color fg) {
		super.setBackgroundColor(fg);
		verticalLine.setBackgroundColor(fg);
		horizontalLine.setBackgroundColor(fg);
	}

	public void setReferencePoint(Point ref) {
		Point pt = Point.SINGLETON;
		pt.setLocation(ref);
		pt.negate().translate(location);
		setRotation(Math.atan2(pt.y, pt.x));
	}

	public void setRotation(double angle) {
		bounds = null;
		transform.setRotation(angle);
	}

	public Rectangle getBounds() {
		if (bounds == null) {
			int expand = (int) (getLineWidthFloat() / 2.0f);
			bounds = new Rectangle(location.x, location.y, diameter, diameter).getExpanded(expand, expand);
		}
		return bounds;
	}

	@Override
	public void setForegroundColor(Color fg) {
		super.setForegroundColor(fg);
		verticalLine.setForegroundColor(fg);
		horizontalLine.setForegroundColor(fg);
	}

	public void setLocation(Point p) {
		bounds = null;
		location.setLocation(p);
		transform.setTranslation(p.x, p.y);
	}
}

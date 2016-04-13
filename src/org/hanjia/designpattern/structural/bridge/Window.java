package org.hanjia.designpattern.structural.bridge;

import org.hanjia.designpattern.structural.Point;
import org.hanjia.designpattern.structural.View;

/**
 * 
 * Abstraction
 * @author hanjia
 *
 */
public abstract class Window {

	private WindowImp imp;
	private View contents;
	
	public abstract void open();
	public abstract void close();
	public abstract void iconify();
	public abstract void deiconify();
	
	public abstract void setOrigin(Point at);
	public abstract void setExtent(Point extent);
	public abstract void raise();
	public abstract void lower();
	
	public abstract void drawLine(final Point start, final Point end);
	public abstract void drawRect(final Point leftTop, final Point rightBottom);
	public abstract void drawPolygon(final Point[] points, int n);
	public abstract void drawText(final char text, final Point point);
	
	public WindowImp getImp() {
		return imp;
	}
	public View getContents() {
		return contents;
	}
		
}

package org.hanjia.designpattern.structural.flyweight;

import org.hanjia.designpattern.structural.Font;
import org.hanjia.designpattern.structural.bridge.Window;

/**
 * 
 * Flyweight
 * @author hanjia
 *
 */
public abstract class Glyph {

	public Glyph() {
		
	}
	public abstract void draw(Window window, GlyphContext context);
	public abstract void setFont(Font font, GlyphContext context);
	public abstract Font getFont(GlyphContext context);
	
	public abstract void first(GlyphContext context);
	public abstract void next(GlyphContext context);
	public abstract boolean isDone(GlyphContext context);
	public abstract Glyph current(GlyphContext context);
	
	public abstract void insert(Glyph glyph, GlyphContext context);
	public abstract void remove(GlyphContext context);

}

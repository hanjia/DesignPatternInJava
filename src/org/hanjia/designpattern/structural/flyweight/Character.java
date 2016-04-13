package org.hanjia.designpattern.structural.flyweight;

import org.hanjia.designpattern.structural.Font;
import org.hanjia.designpattern.structural.bridge.Window;

/**
 * 
 * Sharable Concrete Flyweight
 * @author hanjia
 *
 */
public class Character extends Glyph{

	private char charCode;
	
	public Character(char c) {
		this.charCode = c;
	}

	public char getCharCode() {
		return charCode;
	}

	@Override
	public void draw(Window window, GlyphContext context) {
		
	}

	@Override
	public void setFont(Font font, GlyphContext context) {
		
	}

	@Override
	public Font getFont(GlyphContext context) {
		return null;
	}

	@Override
	public void first(GlyphContext context) {
		
	}

	@Override
	public void next(GlyphContext context) {
		
	}

	@Override
	public boolean isDone(GlyphContext context) {
		return false;
	}

	@Override
	public Glyph current(GlyphContext context) {
		return null;
	}

	@Override
	public void insert(Glyph glyph, GlyphContext context) {
		
	}

	@Override
	public void remove(GlyphContext context) {
		
	}
}

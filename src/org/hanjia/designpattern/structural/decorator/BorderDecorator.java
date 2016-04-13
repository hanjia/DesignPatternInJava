package org.hanjia.designpattern.structural.decorator;

/**
 * 
 * Concrete Decorator
 * @author hanjia
 *
 */
public class BorderDecorator extends Decorator{

	private int width;
	
	public BorderDecorator(VisualComponent component, int borderWidth) {
		super(component);
		this.width = borderWidth;
	}
	
	private void drawBorder(int width) {
		
	}
	
	@Override
	public void draw() {
		super.draw();
		drawBorder(width);
	}

}

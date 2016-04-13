package org.hanjia.designpattern.structural.decorator;

/**
 * 
 * Decorator
 * @author hanjia
 *
 */
public class Decorator extends VisualComponent{
	
	private VisualComponent component;
	
	public Decorator(VisualComponent component) {
		this.component = component;
	}

	@Override
	public void draw() {
		component.draw();
	}

	@Override
	public void resize() {
		component.resize();
	}
	
	
}

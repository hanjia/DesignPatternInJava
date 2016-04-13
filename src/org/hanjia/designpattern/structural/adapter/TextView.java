package org.hanjia.designpattern.structural.adapter;

import org.hanjia.designpattern.structural.Coordinate;

/**
 * 
 * Adaptee
 * @author hajia
 *
 */
public interface TextView {	
	
	public void getOrigin(Coordinate x, Coordinate y);
	
	public void getExtent(Coordinate width, Coordinate height);
	
	public boolean isEmpty();
}

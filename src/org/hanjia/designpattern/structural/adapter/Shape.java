package org.hanjia.designpattern.structural.adapter;

import org.hanjia.designpattern.structural.Manipulator;
import org.hanjia.designpattern.structural.Point;

/**
 * 
 * Target
 * @author hanjia
 *
 */
public abstract class Shape {	 
	public abstract BoundingBox boundingBox(Point bottomLeft, Point topRight);
	public abstract Manipulator createManipulator();	
}
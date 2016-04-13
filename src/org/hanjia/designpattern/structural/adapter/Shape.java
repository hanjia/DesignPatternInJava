package org.hanjia.designpattern.structural.adapter;

import org.hanjia.designpattern.structural.adapter.util.BoundingBox;
import org.hanjia.designpattern.structural.adapter.util.Manipulator;
import org.hanjia.designpattern.structural.adapter.util.Point;

public interface Shape {	 
	public BoundingBox boundingBox(Point bottomLeft, Point topRight);
	public Manipulator createManipulator();	
}
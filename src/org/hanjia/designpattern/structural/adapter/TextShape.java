package org.hanjia.designpattern.structural.adapter;

import org.hanjia.designpattern.structural.adapter.util.BoundingBox;
import org.hanjia.designpattern.structural.adapter.util.Coordinate;
import org.hanjia.designpattern.structural.adapter.util.Manipulator;
import org.hanjia.designpattern.structural.adapter.util.Point;

/**
 *
 * Class Adapter
 * 
 * @author hanjia
 *
 */
public class TextShape extends TextView implements Shape {
	Coordinate bottom, left, width, height;

	@Override
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
	
	@Override
	public BoundingBox boundingBox(Point bottomLeft, Point topRight) {		
		getOrigin(bottom, left);
		getExtent(width, height);
		
		bottomLeft = new Point(bottom.value, left.value);
		topRight = new Point(bottom.value + height.value, left.value + width.value);
		return new BoundingBox(bottomLeft, topRight);
	}

}


/**
 * 
 * Object Adapter
 * 
 */
//public class TextShape implements Shape {
//	private Coordinate bottom, left, width, height;
//	private TextView textView;
//	
//	public TextShape(TextView textView) {
//		this.textView = textView;
//	}
//	
//	@Override
//	public Manipulator createManipulator() {
//		return new TextManipulator();
//	}
//	
//	@Override
//	public BoundingBox boundingBox(Point bottomLeft, Point topRight) {		
//		textView.getOrigin(bottom, left);
//		textView.getExtent(width, height);
//		
//		bottomLeft = new Point(bottom.value, left.value);
//		topRight = new Point(bottom.value + height.value, left.value + width.value);
//		return new BoundingBox(bottomLeft, topRight);
//	}	
//	
//	public boolean isEmpty() {
//		return textView.isEmpty();
//	} 	
//}


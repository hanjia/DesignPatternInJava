package org.hanjia.designpattern.structural.adapter;

import org.hanjia.designpattern.structural.Coordinate;
import org.hanjia.designpattern.structural.Manipulator;
import org.hanjia.designpattern.structural.Point;

/**
 *
 * Class Adapter: by implementing Adaptee and by extending Target
 * @author hanjia
 *
 */
public class TextShape extends Shape implements TextView {
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

	@Override
	public void getOrigin(Coordinate x, Coordinate y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getExtent(Coordinate width, Coordinate height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}


/**
 * 
 * Object Adapter: by composing an instance of adaptee
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


package org.hanjia.designpattern.creational.singleton;

public class SimpleMazeFactory {
	
	private static SimpleMazeFactory instance;
	
	protected SimpleMazeFactory() {
		
	}
	
	public static SimpleMazeFactory getInstance() {
		if (instance == null) {
			instance = new SimpleMazeFactory();
		}
		return instance;
	}
}

package org.hanjia.designpattern.creational.builder;

import org.hanjia.designpattern.creational.Maze;


/**
 * 
 * Abstract Builder
 * @author hanjia
 *
 */
public abstract class MazeBuilder {
	
	public abstract void buildMaze();
	public abstract void buildRoom(int room);
	public abstract void buildDoor(int roomFrom, int roomTo);	
	public abstract Maze getMaze();
}

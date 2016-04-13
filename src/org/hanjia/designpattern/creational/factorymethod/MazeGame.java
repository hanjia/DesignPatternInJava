package org.hanjia.designpattern.creational.factorymethod;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

/**
 * 
 * Creator
 * @author hanjia
 *
 */
public abstract class MazeGame {
	
	/**
	 * Factory Methods
	 */
	public abstract Maze makeMaze();
	public abstract Wall makeWall();
	public abstract Room makeRoom(int n);
	public abstract Door makeDoor(Room r1, Room r2);
	
	public Maze createMaze() {
		Maze maze = makeMaze();
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);
		
		r1.setSide("North", makeWall());
		r1.setSide("East", door);
		r1.setSide("South", makeWall());
		r1.setSide("West", makeWall());

		r1.setSide("North", makeWall());
		r1.setSide("East", makeWall());
		r1.setSide("South", makeWall());
		r1.setSide("West", door);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		return maze;
	}
}

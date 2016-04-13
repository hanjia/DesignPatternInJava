package org.hanjia.designpattern.creational.abstractfactory;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

/**
 * 
 * Abstract Factory
 * @author hanjia
 *
 */
public interface MazeFactory {

	public Maze makeMaze();
	public Wall makeWall();
	public Room makeRoom(int n);
	public Door makeDoor(Room r1, Room r2);
}

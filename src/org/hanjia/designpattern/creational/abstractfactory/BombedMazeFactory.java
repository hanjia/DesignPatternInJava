package org.hanjia.designpattern.creational.abstractfactory;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

/**
 * 
 * Concrete Factory 1
 * @author hanjia
 *
 */
public class BombedMazeFactory implements MazeFactory{
	
	public BombedMazeFactory() {
		
	}

	@Override
	public Maze makeMaze() {
		return null;
	}

	@Override
	public Wall makeWall() {
		return new BombedWall();
	}

	@Override
	public Room makeRoom(int n) {
		return new RoomWithABomb(n);
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return null;
	}

}

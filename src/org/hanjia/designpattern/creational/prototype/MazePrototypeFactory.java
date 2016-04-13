package org.hanjia.designpattern.creational.prototype;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

/**
 * 
 * Client
 * @author hanjia
 *
 */
public class MazePrototypeFactory implements MazeFactory {

	Maze prototypeMaze;
	Wall prototypeWall;
	Room prototypeRoom;
	Door prototypeDoor;
	
	/**
	 * 
	 * Prototypes as arguments
	 * 
	 */
	public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
		prototypeMaze = maze;
		prototypeWall = wall;
		prototypeRoom = room;
		prototypeDoor = door;
	}
	
	@Override
	public Maze makeMaze() {
		return prototypeMaze.clone();
	}

	@Override
	public Wall makeWall() {
		return prototypeWall.clone();
	}

	@Override
	public Room makeRoom(int n) {
		return prototypeRoom.clone();
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		Door door = prototypeDoor.clone();
		door.initialize(r1, r2);
		return door;
	}

}

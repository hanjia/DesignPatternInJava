package org.hanjia.designpattern.creational.builder;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

/**
 * 
 * Concrete Builder 1
 * @author hanjia
 *
 */
public class StandardMazeBuilder extends MazeBuilder{

	private Maze currentMaze;
	
	public StandardMazeBuilder() {
		
	}
	
	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int n) {
		if (currentMaze.roomList.get(n) == null) {
			Room room = new Room(n);
			room.setSide("North", new Wall());
			room.setSide("East", new Wall());
			room.setSide("South", new Wall());
			room.setSide("West", new Wall());
			currentMaze.addRoom(room);
		}
	}

	@Override
	public void buildDoor(int n1, int n2) {
		Room r1 = currentMaze.roomList.get(n1);
		Room r2 = currentMaze.roomList.get(n2);
		Door d = new Door(r1, r2);
		
		r1.setSide("Wall:r1->r2", d);
		r2.setSide("Wall:r2->r1", d);
	}

	@Override
	public Maze getMaze() {
		return currentMaze;
	}

}

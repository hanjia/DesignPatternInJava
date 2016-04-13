package org.hanjia.designpattern.creational.builder;

import org.hanjia.designpattern.creational.Maze;

/**
 * 
 * Concrete Builder 2
 * @author hanjia
 *
 */
public class CountingMazeBuilder extends MazeBuilder{
	
	private int doors;
	private int rooms;
	
	public CountingMazeBuilder() {
		doors = 0;
		rooms = 0;
	}

	@Override
	public void buildMaze() {		
	}

	@Override
	public void buildRoom(int room) {
		rooms++;
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		doors++;
	}

	@Override
	public Maze getMaze() {
		return null;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public int getRooms() {
		return rooms;
	}
}

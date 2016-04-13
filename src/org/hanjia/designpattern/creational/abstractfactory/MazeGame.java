package org.hanjia.designpattern.creational.abstractfactory;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;

/**
 * 
 * Client
 * @author hanjia
 *
 */
public class MazeGame {

	public Maze createMaze(MazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);
		
		r1.setSide("North", factory.makeWall());
		r1.setSide("East", door);
		r1.setSide("South", factory.makeWall());
		r1.setSide("West", factory.makeWall());

		r1.setSide("North", factory.makeWall());
		r1.setSide("East", factory.makeWall());
		r1.setSide("South", factory.makeWall());
		r1.setSide("West", door);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		return maze;
	}
	
	public static void main(String[] args){
		MazeGame game = new MazeGame();
		BombedMazeFactory factory1 = new BombedMazeFactory();
		Maze maze1 = game.createMaze(factory1);
		maze1.getRoomList();
		
		EnchantedMazeFactory factory2 = new EnchantedMazeFactory();
		Maze maze2 = game.createMaze(factory2);
		maze2.getRoomList();
	}
}

package org.hanjia.designpattern.creational.prototype;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Wall;

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
		Maze maze = new Maze();
		Wall wall = new Wall();
		Room room = new Room();
		Door door = new Door();
		
		MazeFactory simpleMazeFactory = new MazePrototypeFactory(maze, wall, room, door);
		maze = game.createMaze(simpleMazeFactory);
		
		Room roomWithABomb = new RoomWithABomb();
		Wall bombedWall = new BombedWall();
		MazeFactory bombedMazeFactory = new MazePrototypeFactory(maze, bombedWall, roomWithABomb, door);
		maze = game.createMaze(bombedMazeFactory);
	}
}

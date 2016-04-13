package org.hanjia.designpattern.creational.builder;

import org.hanjia.designpattern.creational.Maze;

/**
 * 
 * Client
 * @author hanjia
 *
 */
public class MazeGame {

	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		return builder.getMaze();	
	}
	
	public static void main(String[] args) {
		StandardMazeBuilder builder1 = new StandardMazeBuilder();
		MazeGame game1 = new MazeGame();
		
		game1.createMaze(builder1);
		builder1.getMaze();
		
		CountingMazeBuilder builder2 = new CountingMazeBuilder();
		MazeGame game2 = new MazeGame();
		
		game2.createMaze(builder2);
		builder2.getMaze();
	}
}

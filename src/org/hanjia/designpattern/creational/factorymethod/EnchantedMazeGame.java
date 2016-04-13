package org.hanjia.designpattern.creational.factorymethod;

import org.hanjia.designpattern.creational.Door;
import org.hanjia.designpattern.creational.Maze;
import org.hanjia.designpattern.creational.Room;
import org.hanjia.designpattern.creational.Spell;
import org.hanjia.designpattern.creational.Wall;

public class EnchantedMazeGame extends MazeGame{
	
	public EnchantedMazeGame() {
		
	}

	@Override
	public Maze makeMaze() {
		return null;
	}

	@Override
	public Wall makeWall() {
		return null;
	}

	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n, castSpell());
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}
	
	protected Spell castSpell() {
		return new Spell();
	}
}

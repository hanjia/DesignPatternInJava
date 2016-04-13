package org.hanjia.designpattern.creational.prototype;

import org.hanjia.designpattern.creational.Wall;


/**
 * 
 * Concrete Prototype
 * @author hanjia
 *
 */
public class BombedWall extends Wall{
	
	private boolean hasBomb;
	
	public BombedWall() {
		
	}
	
	public BombedWall(BombedWall wall) {
		this.hasBomb = wall.hasBomb;
	}
	
	@Override
	public BombedWall clone() {
		return new BombedWall(this);
	}
	
	public boolean hasBomb() {
		return hasBomb;
	}
}

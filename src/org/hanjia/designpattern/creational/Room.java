package org.hanjia.designpattern.creational;

public class Room {
	
	private int roomNumber;
	
	public Room() {
		
	}
	
	public Room(int n) {
		this.roomNumber = n;
	}
	
	public void setSide(String orientation, Object object) {
		
	}	
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public Room clone() {
		return null;
	}
	
}

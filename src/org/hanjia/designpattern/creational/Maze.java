package org.hanjia.designpattern.creational;

import java.util.ArrayList;
import java.util.List;

public class Maze {
	
	public List<Room> roomList;

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public Maze() {
		roomList = new ArrayList<Room>();
	}
	
	public void addRoom(Room r) {
		roomList.add(r);
	}

	public Maze clone() {
		return null;
	}
}

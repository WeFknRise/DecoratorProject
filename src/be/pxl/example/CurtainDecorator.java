package be.pxl.example;

public class CurtainDecorator extends RoomDecorator {

	Room room;
	
	public CurtainDecorator(Room room) {
		this.room = room;
	}
	
	public String getDescription() {
		return room.getDescription() + ", met gordijnen";
	}

	public double cost() {
		return room.cost() + 99.99;
	}

}

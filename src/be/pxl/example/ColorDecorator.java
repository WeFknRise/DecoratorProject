package be.pxl.example;

public class ColorDecorator extends RoomDecorator {

	Room room;
	
	public ColorDecorator(Room room) {
		this.room = room;
	}
	
	public String getDescription() {
		return room.getDescription() + ", met kleur";
	}
	
	public double cost() {
		return room.cost() + 75.50;
	}

}

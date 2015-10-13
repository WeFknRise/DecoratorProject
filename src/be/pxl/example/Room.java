package be.pxl.example;

public abstract class Room {
	String description = "Empty room";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

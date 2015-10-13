package be.pxl.example;

public class Main {

	public static void main(String[] args) {
		Room room1 = new SimpleRoom();
		Room room2 = new SimpleRoom();
		Room room3 = new SimpleRoom();
		
		room1 = new CurtainDecorator(room1);
		room1 = new ColorDecorator(room1);
		
		room2 = new CurtainDecorator(room2);
		
		room3 = new ColorDecorator(room3);
		
		System.out.println(room1.getDescription() + " €" + room1.cost());
		System.out.println(room2.getDescription() + " €" + room2.cost());
		System.out.println(room3.getDescription() + " €" + room3.cost());
	}
}

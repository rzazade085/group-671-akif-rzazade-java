package classwork_13;

public class Lexus {

	String model;
	int year;
	int motor;
	
	public Lexus(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void unlockDoors() {
	    System.out.println("Doors unlocked");
	}

	public void checkFuel() {
	    System.out.println("Checking fuel level");
	}

	public void playMusic() {
	    System.out.println("Music playing");
	}
}

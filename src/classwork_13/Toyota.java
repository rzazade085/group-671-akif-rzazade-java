package classwork_13;

public class Toyota {

	String model;
	int year;
	int motor;
	
	public Toyota(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void openTrunk() {
	    System.out.println("Trunk opened");
	}

	public void closeTrunk() {
	    System.out.println("Trunk closed");
	}

	public void lockDoors() {
	    System.out.println("Doors locked");
	}
}

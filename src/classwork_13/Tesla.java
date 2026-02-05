package classwork_13;

public class Tesla {

	String model;
	int year;
	int motor;
	
	public Tesla(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void openDoors() {
	    System.out.println("Doors opened");
	}

	public void closeDoors() {
	    System.out.println("Doors closed");
	}

	public void honk() {
	    System.out.println("Beep beep");
	}
}

package classwork_13;

public class Jeep {

	String model;
	int year;
	int motor;
	
	public Jeep(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void headlightsOff() {
	    System.out.println("Headlights off");
	}

	public void turnOnWipers() {
	    System.out.println("Wipers on");
	}

	public void turnOffWipers() {
	    System.out.println("Wipers off");
	}
}

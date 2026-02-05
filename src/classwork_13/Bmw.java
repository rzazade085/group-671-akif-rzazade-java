package classwork_13;

public class Bmw {

	String model;
	int year;
	int motor;
	
	public Bmw(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void startEngine() {
	    System.out.println("Engine started");
	}

	public void stopEngine() {
	    System.out.println("Engine stopped");
	}

	public void accelerate() {
	    System.out.println("Accelerating");
	}
}

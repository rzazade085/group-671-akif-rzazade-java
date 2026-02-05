package classwork_13;

public class Changan {

	String model;
	int year;
	int motor;
	
	public Changan(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void drive() {
		System.out.println("Drive");
	}
	
	public void parking() {
		System.out.println("Parking");
	}
	
	public void avtopilot() {
		System.out.println("Avtopilot");
	}
}

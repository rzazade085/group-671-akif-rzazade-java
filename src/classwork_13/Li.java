package classwork_13;

public class Li {

	String model;
	int year;
	int motor;
	
	public Li(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void openWindows() {
	    System.out.println("Windows opened");
	}

	public void closeWindows() {
	    System.out.println("Windows closed");
	}

	public void enableCruiseControl() {
	    System.out.println("Cruise control enabled");
	}
	
	
}

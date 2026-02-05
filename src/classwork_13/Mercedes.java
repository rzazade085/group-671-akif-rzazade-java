package classwork_13;

public class Mercedes {

	String model;
	int year;
	int motor;
	
	public Mercedes(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
   public void brake() {
	    System.out.println("Braking");
	}

	public void turnLeft() {
	    System.out.println("Turning left");
	}

	public void turnRight() {
	    System.out.println("Turning right");
	}
}

package classwork_13;

public class Hyundai {

	String model;
	int year;
	int motor;
	
	public Hyundai(String model, int year, int motor) {
		this.model = model;
		this.year = year;
		this.motor = motor;
	}
	
	public void stopMusic() {
	    System.out.println("Music stopped");
	}

	public void increaseVolume() {
	    System.out.println("Volume increased");
	}

	public void decreaseVolume() {
	    System.out.println("Volume decreased");
	}
}

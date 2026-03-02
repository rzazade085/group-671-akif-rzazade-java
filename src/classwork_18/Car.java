package classwork_18;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void stop() {
		System.out.println("Car stoped");
	}
}

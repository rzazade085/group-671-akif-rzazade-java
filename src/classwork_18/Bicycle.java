package classwork_18;

public class Bicycle implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bicycle started");
	}

	@Override
	public void stop() {
		System.out.println("Bicycle stopped");
	}
}

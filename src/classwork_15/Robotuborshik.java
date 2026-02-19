package classwork_15;

public class Robotuborshik {

	// 1

	String name;
	int battery;
	boolean isWorking;

	Robotuborshik(String name) {
		        this.name = name;
		        battery = 1;
		        isWorking = false;
		    }

	void start() {
		if (battery > 10) {
			isWorking = true;
			System.out.println("Ya nacel ubirat");
		} else {
			System.out.println("Malo zaredki");
		}
	}

	void stop() {
		isWorking = false;
		System.out.println("Ya zakoncil ubirat");
	}

	void charge() {
		battery = 100;
		System.out.println("Polniy zaredka");
	}
}

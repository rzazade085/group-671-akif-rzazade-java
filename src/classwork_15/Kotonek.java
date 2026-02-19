package classwork_15;

public class Kotonek {
	// 2

	String name;
	int ageMonths;
	int happiness;
	String color;

	Kotonek(String name, String color) {
		this.name = name;
		this.color = color;
		ageMonths = 2;
		happiness = 30;
	}

	void play() {
		happiness += 20;
		if (happiness > 100) {
			happiness = 100;
		}
	}

	void eat() {
		happiness += 15;
		if (happiness > 100) {
			happiness = 100;
		}
	}

	void sleep() {
		happiness += 10;
		if (happiness > 100) {
			happiness = 100;
		}
	}

	void status() {
		System.out.println("Imya: " + name);
		System.out.println("Vozrast: " + ageMonths + " mesyacev");
		System.out.println("Scaste: " + happiness);
		System.out.println("cvet: " + color);

		if (happiness < 10) {
			System.out.println("Kotonok myaukaet ocen qrustno");
		}
	}
}
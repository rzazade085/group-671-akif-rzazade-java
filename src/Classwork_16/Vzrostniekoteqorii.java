package Classwork_16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Vvedite vozrast: ");
		int age = sc.nextInt();

		if (age < 0) {
			System.out.println("Vozrast ne mojet bit otricatelnim");
		} else if (age <= 2) {
			System.out.println("Mladenec");
		} else if (age <= 6) {
			System.out.println("Doskolnik");
		} else if (age <= 10) {
			System.out.println("Mladsiy skolnik");
		} else if (age <= 14) {
			System.out.println("Podrostok mladsiy");
		} else if (age <= 17) {
			System.out.println("Podrostok starsiy");
		} else if (age <= 64) {
			System.out.println("Vzrosli");
		} else {
			System.out.println("Pojiloy celovek");
		}

	}
}

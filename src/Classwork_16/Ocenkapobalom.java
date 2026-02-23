package Classwork_16;

import java.util.Scanner;

public class Ocenkapobalom {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite ball");
		int x = sc.nextInt();

		if (x < 0 || x > 100) {
			System.out.println("Nekorrektniy ball");
		}

		if (x >= 90 && x <= 100) {
			System.out.println("Otlicno");
		}

		if (x >= 75 && x <= 89) {
			System.out.println("Xoroso");
		}

		if (x >= 60 && x <= 74) {
			System.out.println("Udovletvoritelno");
			{
			}

			if (x >= 0 && x < 60) {
				System.out.println("Nedovletvoritelno");
			}
		}
	}
}
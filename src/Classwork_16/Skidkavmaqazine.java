package Classwork_16;

import java.util.Scanner;

public class Skidkavmaqazine {

	public class Main {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Vvedite summu pokupki: ");
			int sum = sc.nextInt();

			double finalSum = sum;

			if (sum >= 5000) {
				finalSum = sum * 0.85;
			} else if (sum >= 2000) {
				finalSum = sum * 0.90;
			} else if (sum >= 1000) {
				finalSum = sum * 0.95;
			}

			System.out.println("Itoqovaya summa oplati: " + finalSum);
		}
	}
}

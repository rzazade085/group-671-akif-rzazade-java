package classwork_19;

import java.util.Scanner;

public class Zadaniye1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Vvedite pervoe chislo");
		int a = sc.nextInt();

		System.out.print("Vvedite vtoroe chislo");
		int b = sc.nextInt();

		System.out.println("Summa: " + (a + b));
		System.out.println("Raznost:" + (a - b));
		System.out.println("Proizvedeniye: " + (a * b));

		if (b == 0) {
			System.out.println("Na nol delit nelzya");
		} else {
			double result = (double) a / b;
			System.out.println("Chastnoe: " + result);
		}
	}
}

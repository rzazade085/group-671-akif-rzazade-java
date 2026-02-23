package Classwork_16;

import java.util.Scanner;

public class Chectnoe_Nechotnoi {
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Vvedite celoe cislo: ");
			int number = sc.nextInt();

			if (number % 2 == 0) {
				System.out.println("Chotnoe");
			} else {
				System.out.println("Nechotnoi");
			}
		}
	}
}

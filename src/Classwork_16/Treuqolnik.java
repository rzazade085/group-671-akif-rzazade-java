package Classwork_16;

import java.util.Scanner;

public class Treuqolnik {

	public class Main {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Vvedite a:");
			int a = sc.nextInt();

			System.out.print("Vvedite b:");
			int b = sc.nextInt();

			System.out.print("Vvedite c:");
			int c = sc.nextInt();

			if (a + b <= c) {
				System.out.println("Treuqolnik ne scustvuet");
			} else if (a + c <= b) {
				System.out.println("Treuqolnik ne scustvuet");
			} else if (b + c <= a) {
				System.out.println("Treuqolnik ne scustvuet");
			} else {
				System.out.println("Treuqolnik scustvuet");
			}
		}
	}
}

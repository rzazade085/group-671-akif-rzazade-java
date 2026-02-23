package Classwork_16;

import java.util.Scanner;

public class Pramyauqolnikizzvoyzdov {

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Vvedite visotu (h): ");
			int h = sc.nextInt();

			System.out.print("Vvedite sirinu (w): ");
			int w = sc.nextInt();

			int i = 0;
			while (i < h) {
				int j = 0;
				while (j < w) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
		}
	}
}

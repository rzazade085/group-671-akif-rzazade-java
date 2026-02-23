package Classwork_16;

import java.util.Scanner;

public class Faktorial {

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Vvedite chislo m (1-20):");
			int n = sc.nextInt();

			if (n > 20) {
				System.out.println("Sliskom bolsoe chislo");
			} else {
				long factorial = 1;
				int i = 1;
				while (i <= n) {
					factorial *= i;
					i++;
				}
				System.out.println("Factorial chisla " + n + " = " + factorial);
			}
		}
	}
}

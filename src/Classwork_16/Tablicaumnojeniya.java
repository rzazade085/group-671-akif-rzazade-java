package Classwork_16;

import java.util.Scanner;

public class Tablicaumnojeniya {

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Vvedite chislo ot 1 do 9:");
			int n = sc.nextInt();

			int i = 1;
			while (i <= 10) {
				System.out.println(n + " x " + i + " = " + (n * i));
				i++;
			}
		}
	}
}

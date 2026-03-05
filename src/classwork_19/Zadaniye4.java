package classwork_19;

import java.util.Scanner;

public class Zadaniye4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите строку: ");
		String text = sc.nextLine();

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

		System.out.println();

		int count = 0;
		String t = text.toLowerCase();

		for (int i = 0; i < t.length(); i++) {

			char c = t.charAt(i);

			if (c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'ю'
					|| c == 'я') {
				count++;
			}
		}

		System.out.println("Qlasnix: " + count);

		String newText = text.replace(" ", "_");
		System.out.println("Posle zameni: " + newText);
	}
}

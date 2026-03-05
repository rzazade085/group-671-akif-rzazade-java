package classwork_19;

public class Zadaniye3 {

	public static void main(String[] args) {

		int[] arr = { -4, 12, 0, -9, 5, 3, -1, 10 };

		int sum = 0;
		int plus = 0;
		int minus = 0;
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			if (arr[i] > 0) {
				plus = plus + 1;
			}

			if (arr[i] < 0) {
				minus = minus + 1;
			}

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		double avg = (double) sum / arr.length;

		System.out.println("Summa: " + sum);
		System.out.println("Polojitelnix: " + plus);
		System.out.println("Otricatelnix: " + minus);
		System.out.println("Maksimum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Srednee: " + avg);
	}
}

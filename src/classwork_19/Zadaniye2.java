package classwork_19;

public class Zadaniye2 {

	public static boolean isLuckyTicket(int n) {

		int a = n / 100000;
		int b = (n / 100000) % 10;
		int c = (n / 1000) % 10;
		int d = (n / 100) % 10;
		int e = (n / 10) % 10;
		int f = n % 10;

		int sum1 = a + b + c;
		int sum2 = d + e + f;

		if (sum1 == sum2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isLuckyTicket(123006));
		System.out.println(isLuckyTicket(123456));
		System.out.println(isLuckyTicket(111111));
		System.out.println(isLuckyTicket(100200));
		System.out.println(isLuckyTicket(222222));
		System.out.println(isLuckyTicket(555000));
	}
}

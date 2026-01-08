package lesson6;

public class classwork_6 {

	public class Main {
	    public static void main(String[] args) {

	        // Задание 1
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	        }

	        System.out.println(); // 


	        // Задание 2
	        for (int i = 10; i > 0; i--) {
	            System.out.println(i);
	        }
	        System.out.println("Поехали!");

	        System.out.println();


	        //  Задание 3
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.print(i + " ");
	        }

	        System.out.println();
	        System.out.println();


	        // Задание 4
	        int sum = 0;

	        for (int i = 1; i <= 50; i++) {
	            sum = sum + i;
	        }

	        System.out.println(sum);

	        System.out.println();


	        // Задание 5
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("7 * " + i + " = " + (7 * i));
	        }

	        System.out.println();

	        
	        for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= 5; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}

}

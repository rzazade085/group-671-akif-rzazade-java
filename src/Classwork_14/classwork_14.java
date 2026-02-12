package Classwork_14;

public class classwork_14 {
	 public static void main(String[] args) {

	        // 2 
	        int number = -5;

	        if (number > 0) {
	            System.out.println("Polojitelnie");
	        }

	        if (number < 0) {
	            System.out.println("Otricatelnie");
	        }

	        if (number == 0) {
	            System.out.println("Nol");
	        }


	        // 3 
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("5 x " + i + " = " + (5 * i));
	        }


	        // 4 С
	        int sum = 0;
	        for (int i = 1; i <= 100; i++) {
	            sum = sum + i;
	        }
	        System.out.println("Summa = " + sum);


	        // 5 
	        int secret = 7;
	        int guess = 7;

	        while (guess != secret) {
	            if (guess > secret) {
	                System.out.println("Mense");
	            }
	            if (guess < secret) {
	                System.out.println("Bolse");
	            }
	        }
	        System.out.println("Uqadal");


	        // 6 
	        int[] numbers = {2, 5, 8, 1, 4, 7, 6, 9, 10, 3};
	        int evenCount = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] % 2 == 0) {
	                evenCount++;
	            }
	        }
	        System.out.println("Chetmie  " + evenCount);


	        // 7 
	        int n = 5;
	        int factorial = 1;

	        for (int i = 1; i <= n; i++) {
	            factorial = factorial * i;
	        }
	        System.out.println("Faktorial = " + factorial);


	        // 8
	        int[] nums = {3, 9, 1, 15, 7};
	        int max = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > max) {
	                max = nums[i];
	            }
	        }
	        System.out.println("Maksimum = " + max);


	        // 9 
	        int height = 3;
	        int width = 5;

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }


	        // 10
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }


	        // 11
	        for (int i = 10; i >= 1; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        //12
	        int sumOdd = 0;
	        for (int i = 1; i <= 50; i++) {
	            if (i % 2 != 0) {
	                sumOdd = sumOdd + i;
	            }
	        }
	        System.out.println("Summa necetnix = " + sumOdd);
	        
	        //13
	        for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= 10; j++) {
	                System.out.print(i + "x" + j + "=" + (i * j) + "  ");
	            }
	            System.out.println();
	        }
	        
	        //14  
	        int count = 0;
	        int temp = number;

	        while (temp != 0) {
	            temp = temp / 10;
	            count++;
	        }
	        System.out.println("Kolicestvo cifr = " + count);
	        
	        //15
	        int age = 15;

	        if (age <= 12) {
	            System.out.println("Malis");
	        } else if (age <= 17) {
	            System.out.println("rebenok");
	        } else {
	            System.out.println("Bolsoy");
	        }
	        
	     //17
	        int[] numbers = {8, 3, 15, 2, 9, 6, 4};
	        int min = numbers[0];

	        for (int j = 1; j < numbers.length; j++) {
	            if (numbers[j] < min) {
	                min = numbers[j];
	            }
	        }
	        System.out.println("Minimum = " + min);
	        
	    }
	}

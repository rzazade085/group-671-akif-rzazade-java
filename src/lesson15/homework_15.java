package lesson15;

public class homework_15 {

    // Задание 1. 
    for (int i = 1; i <= 10; i++) {
        System.out.println("Привет, я учу Java!");
    }

    System.out.println(); 


    // Задание 2. 
    for (int i = 1; i <= 20; i++) {
        System.out.println(i);
    }

    System.out.println();


    // Задание 3. 
    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }
    System.out.println("Пуск!");

    System.out.println();


    // Задание 4. 
    for (int i = 1; i <= 10; i++) {
        System.out.println("5 x " + i + " = " + (5 * i));
    }

    System.out.println();


    // Задание 6. 
    String[] animals = {"кот", "собака", "хомяк", "попугай", "кролик"};

    for (int i = 0; i < animals.length; i++) {
        System.out.println("Животное " + (i + 1) + ": " + animals[i]);
    }

    System.out.println();


    // Задание 7. 
    String[] fruits = {"яблоко", "банан", "груша", "апельсин", "киви"};
    System.out.println(fruits[fruits.length - 1]);

    System.out.println();


    // Задание 8. 
    int[] pies = {1, 0, 1, 1, 0, 1, 0, 1};

    for (int i = 0; i < pies.length; i++) {
        if (pies[i] == 0) {
            continue;
        }
        System.out.println("Пирожок готов!");
    }
}
}
}

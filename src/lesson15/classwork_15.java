package lesson15;

public class classwork_15 {
	
	
//1
	 System.out.print("Введите количество часов сна: ");
     int sleep = sc.nextInt();

     if (sleep < 6) {
         System.out.println("Мало спал, пора отдохнуть!");
     } else if (sleep <= 8) {
         System.out.println("Нормально, бодрый день");
     } else if (sleep <= 10) {
         System.out.println("Хорошо выспался");
     } else {
         System.out.println("Переспал, пора вставать!");
     }

     // 2. 
     System.out.print("Введите код фрукта (1-5): ");
     int fruit = sc1.nextInt();

     switch (fruit) {
         case 1:
             System.out.println("Витамин C и клетчатка");
             break;
         case 2:
             System.out.println("Калий для сердца");
             break;
         case 3:
             System.out.println("Иммунитет на высоте");
             break;
         case 4:
             System.out.println("Сочный и освежающий");
             break;
         case 5:
             System.out.println("Экзотика с витаминами");
             break;
         default:
             System.out.println("Фрукт не найден в списке");
     }
 }
}
}

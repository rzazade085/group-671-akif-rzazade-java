package homework13;

public class Homework_13 {

	//1
	  public static int броситьКубик() {
	        return (int)(Math.random() * 6) + 1;
	    }

	    public static void main(String[] args) {

	        int всегоОчков = 0;
	        int количествоБросков = 15;

	        System.out.println("Игра начинается!");

	        for (int i = 1; i <= количествоБросков; i++) {
	            int очки = броситьКубик();
	            System.out.println("Бросок " + i + ": " + очки);

	            всегоОчков = всегоОчков + очки;

	            if (очки == 1) {
	                System.out.println("Очень плохо...");
	            }

	            if (очки == 6) {
	                System.out.println("Классно! Шестёрка!");
	            }
	        }

	        System.out.println("Всего набрано очков: " + всегоОчков);
	    }
	    
	    //3
	    public static void main(String[] args) {

	        int[] баллы = {120, 85, 200, 95, 150, 60, 175, 110};

	        int лучшийСчёт = баллы[0];
	        int худшийСчёт = баллы[0];

	        for (int i = 1; i < баллы.length; i++) {
	            лучшийСчёт = Math.max(лучшийСчёт, баллы[i]);
	            худшийСчёт = Math.min(худшийСчёт, баллы[i]);
	        }

	        System.out.println("Лучший результат: " + лучшийСчёт);
	        System.out.println("Худший результат: " + худшийСчёт);

	        int разница = лучшийСчёт - худшийСчёт;
	        System.out.println("Разница между лучшим и худшим: " + разница + " баллов");

	        if (разница > 100) {
	            System.out.println("Очень большая разница!");
	        }
	    }
	    
	    //4
	    public static double площадьКвадрата(double сторона) {
	        return сторона * сторона;
	    }

	    public static double площадьПрямоугольника(double длина, double ширина) {
	        return длина * ширина;
	    }

	    public static void main(String[] args) {

	        double[] квадраты = {5, 8, 3, 10, 6};

	        System.out.println("Площади квадратов:");

	        double maxПлощадь = 0;

	        for (double сторона : квадраты) {
	            double площадь = площадьКвадрата(сторона);
	            System.out.println("Сторона " + сторона + " → площадь " + площадь);

	            if (площадь > maxПлощадь) {
	                maxПлощадь = площадь;
	            }
	        }

	        int[][] прямоугольники = {
	            {4, 6},
	            {7, 3},
	            {9, 2},
	            {5, 5}
	        };

	        System.out.println("Площади прямоугольников:");

	        for (int i = 0; i < прямоугольники.length; i++) {
	            double площадь = площадьПрямоугольника(
	                прямоугольники[i][0],
	                прямоугольники[i][1]
	            );

	            System.out.println(
	                "Прямоугольник " + прямоугольники[i][0] + "x" +
	                прямоугольники[i][1] + " → " + площадь
	            );

	            if (площадь > maxПлощадь) {
	                maxПлощадь = площадь;
	            }
	        }

	        System.out.println("Самая большая площадь: " + maxПлощадь);
	    }
	    
	    //5
	    public static double посчитайРасстояние(double x1, double y1, double x2, double y2) {
	        double dx = x2 - x1;
	        double dy = y2 - y1;
	        return Math.sqrt(dx * dx + dy * dy);
	    }

	    public static void main(String[] args) {

	        double домX = 0;
	        double домY = 0;

	        String[] места = {"Школа", "Магазин", "Парк", "Друг", "Кино", "Бабушка"};
	        double[][] координаты = {
	            {4, 3},
	            {0, 8},
	            {5, 12},
	            {9, 0},
	            {2, 10},
	            {7, 5}
	        };

	        System.out.println("Расстояние от дома до:");

	        double min = 9999;
	        double max = 0;

	        for (int i = 0; i < места.length; i++) {
	            double расстояние = посчитайРасстояние(
	                домX, домY,
	                координаты[i][0],
	                координаты[i][1]
	            );

	            System.out.println(места[i] + ": " + расстояние);

	            if (расстояние < min) min = расстояние;
	            if (расстояние > max) max = расстояние;
	        }

	        System.out.println("Ближайшее место: " + min + " метров");
	        System.out.println("Самое дальнее: " + max + " метров");
	    }
}

package homework13;

public class extratask {

	public class MathPractice {

	    public static void main(String[] args) {
          //1  
	        int summa = 0;
	        int pyaterki = 0;
	        for (int i = 1; i <= 20; i++) {
	            int ocenka = (int)(Math.random() * 4) + 2;
	            System.out.println("Урок " + i + " → " + ocenka);
	            summa += ocenka;
	            if (ocenka == 5) pyaterki++;
	        }
	        System.out.println("Средняя: " + Math.round(summa / 20.0));
	        System.out.println("Пятёрок: " + pyaterki);

            //2
	        double[] temp = {18.4,19.7,17.2,20.9,16.8,21.3,18.1};
	        double maxT = -100, minT = 100;
	        for (double t : temp) {
	            System.out.println(t + " → " + Math.round(t));
	            maxT = Math.max(maxT, t);
	            minT = Math.min(minT, t);
	        }
	        System.out.println("Тёплая: " + maxT);
	        System.out.println("Холодная: " + minT);
	        System.out.println("Разница: " + (maxT - minT));

            //3
	        int[] coins = {1,2,5,10};
	        int coinCount = 0;
	        int coinSum = 0;
	        for (int i = 0; i < 30; i++) {
	            int c = coins[(int)(Math.random()*4)];
	            System.out.println("Монета: " + c);
	            coinCount++;
	            coinSum += c;
	            if (c == 10) System.out.println("Большая монета!");
	        }
	        System.out.println("Монет: " + coinCount);
	        System.out.println("Сумма: " + coinSum);
	        System.out.println("Средний номинал: " + Math.round((double)coinSum / coinCount));

            //4
	        double[][] rooms = {
	            {4.5,3.2},{5,4},{3.8,3.5},{6.1,2.9},{4.2,4.2}
	        };
	        double totalArea = 0;
	        double maxArea = 0;
	        for (double[] r : rooms) {
	            double s = r[0] * r[1];
	            System.out.println(r[0] + " x " + r[1] + " = " + s);
	            totalArea += s;
	            maxArea = Math.max(maxArea, s);
	        }
	        System.out.println("Общая площадь: " + Math.round(totalArea));
	        System.out.println("Самая большая: " + maxArea);

            //5
	        double[][] shops = {{2,3},{5,1},{-4,6},{7,8},{1,-5},{9,2}};
	        double minDist = 999, maxDist = 0;
	        for (double[] s : shops) {
	            double d = Math.sqrt(s[0]*s[0] + s[1]*s[1]);
	            System.out.println("Расстояние: " + d);
	            minDist = Math.min(minDist, d);
	            maxDist = Math.max(maxDist, d);
	        }
	        System.out.println("Ближайший: " + Math.round(minDist));
	        System.out.println("Дальний: " + Math.round(maxDist));

            //6
	        int sumSquares = 0;
	        for (int i = 0; i < 12; i++) {
	            int n = (int)(Math.random()*20) + 1;
	            int sq = n * n;
	            System.out.println(n + " → " + sq);
	            if (sq > 100) System.out.println("Большое число!");
	            sumSquares += sq;
	        }
	        System.out.println("Сумма квадратов: " + sumSquares);

            //7
	        int[] nums = {-5,3,-2,8,-9,4,1,-6,7,-1};
	        int minAbs = Math.abs(nums[0]);
	        int maxAbs = minAbs;
	        int sumAbs = 0;
	        for (int x : nums) {
	            int a = Math.abs(x);
	            System.out.println(x + " → " + a);
	            minAbs = Math.min(minAbs, a);
	            maxAbs = Math.max(maxAbs, a);
	            sumAbs += a;
	        }
	        System.out.println("Мин модуль: " + minAbs);
	        System.out.println("Макс модуль: " + maxAbs);
	        System.out.println("Сумма модулей: " + sumAbs);

           //8
	        int[] r = {1,2,3,4,5,6,7};
	        double minS = Math.PI * r[0] * r[0];
	        double maxS = minS;
	        double sumS = 0;
	        for (int x : r) {
	            double s = Math.PI * x * x;
	            System.out.println("Площадь: " + s);
	            minS = Math.min(minS, s);
	            maxS = Math.max(maxS, s);
	            sumS += s;
	        }
	        System.out.println("Мин площадь: " + Math.round(minS));
	        System.out.println("Макс площадь: " + Math.round(maxS));
	        System.out.println("Сумма площадей: " + sumS);

            //9
	        int countMore7 = 0;
	        for (int i = 0; i < 15; i++) {
	            double n = Math.random() * 10;
	            System.out.println(n);
	            System.out.println("ceil: " + Math.ceil(n));
	            System.out.println("floor: " + Math.floor(n));
	            if (n > 7) countMore7++;
	        }
	        System.out.println("Чисел больше 7: " + countMore7);

            //10
	        int secret = (int)(Math.random()*100) + 1;
	        boolean guessed = false;
	        for (int i = 1; i <= 10; i++) {
	            int p = (int)(Math.random()*100) + 1;
	            System.out.println("Попытка: " + p);

	            if (p == secret) {
	                System.out.println("Угадал!");
	                guessed = true;
	                break;
	            } else if (p > secret) {
	                System.out.println("Слишком большое");
	            } else {
	                System.out.println("Слишком маленькое");
	            }
	        }
	        if (!guessed) System.out.println("Не повезло");
	        System.out.println("Секретное число: " + secret);
	    }
	}

}
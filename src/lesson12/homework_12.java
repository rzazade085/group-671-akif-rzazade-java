package lesson12;

public class homework_12 {

	//1
	public class Person {
	    String name;

	    public Person(String name) {
	        this.name = name;
	    }

	    public void printNameLength() {
	        if (name != null) {
	            System.out.println(name.length());
	        } else {
	            System.out.println("Имя не задано");
	        }
	    }

	    public static void main(String[] args) {
	        Person p1 = new Person("Akif");
	        p1.printNameLength(); // 4

	        Person p2 = new Person(null);
	        p2.printNameLength(); 
	    }
	}

	//3
	public class MathTest {

	    public static double sumNumbers(Integer a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        System.out.println(sumNumbers(5, 2.5));
	        System.out.println(sumNumbers(10, 1.2));
	    }
	}
	
	//4
	public class Box {
	    int value;

	    public static void changeValue(Box b) {
	        b.value = 100;
	    }

	    public static void main(String[] args) {
	        Box box = new Box();
	        box.value = 10;

	        changeValue(box);

	        System.out.println(box.value); // 100
	    }
	}

	//5
	public class ScopeTest {

	    public static void testScopes() {
	        int x = 10;
	        int y = 0;

	        if (x > 5) {
	            y = x * 2;
	            System.out.println("y = " + y);
	        }

	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	    }

	    public static void main(String[] args) {
	        testScopes();
	    }
	}

}

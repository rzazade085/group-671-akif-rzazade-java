package lesson11;

public class homework_11_extra_task {

	//1
	class Book {
	    String title;
	    String author;

	    void printInfo() {
	        System.out.println(title + " - " + author);
	    }
	}

	//2
	class Student {
	    String name;
	    int age;

	    Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	// 3
	class Counter {
	    static int count;

	    Counter() {
	        count++;
	    }
	}

	// 4
	class User {
	    String role;

	    {
	        role = "guest";
	    }
	}

	// 5
	class AppConfig {
	    static String version;

	    static {
	        version = "1.0";
	    }
	}

	// 6
	class Car {
	    String model;
	    int year;

	    Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return model + " (" + year + ")";
	    }
	}


	// 9
	abstract class GameCharacter {
	    abstract void attack();
	}

	class Warrior extends GameCharacter {
	    @Override
	    void attack() {
	        System.out.println("Воин атакует мечом");
	    }
	}

	//10
	interface Movable {
	    void move();
	}

	class Robot implements Movable {
	    @Override
	    public void move() {
	        System.out.println("Робот движется вперёд");
	    }
	}
}

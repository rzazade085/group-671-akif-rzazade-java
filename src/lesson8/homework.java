package lesson8;

public class homework {
	public class Main {
	    public static void main(String[] args) {


	// ===== Задание 1 =====
	class Account {
	    private String owner;
	    private double balance;

	    public Account(String owner, double balance) {
	        this.owner = owner;
	        this.balance = Math.max(balance, 0);
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Сумма должна быть больше нуля");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Сумма должна быть больше нуля");
	        } else if (amount > balance) {
	            System.out.println("Недостаточно средств");
	        } else {
	            balance -= amount;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	// Задание 2 
	class Rectangle {
	    double width;
	    double height;

	    Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    double area() {
	        return width * height;
	    }

	    Rectangle scale(double factor) {
	        return new Rectangle(width * factor, height * factor);
	    }
	}

	//  Задание 3
	class Temperature {
	    double celsius;

	    Temperature(double celsius) {
	        this.celsius = celsius;
	    }

	    double toFahrenheit() {
	        return celsius * 9 / 5 + 32;
	    }

	    static Temperature fromFahrenheit(double f) {
	        return new Temperature((f - 32) * 5 / 9);
	    }
	}



	// Задание 5 
	class Character {
	    String name;
	    int health;
	    int strength;

	    Character(String name) {
	        this.name = name;
	        this.health = 100;
	        this.strength = 10;
	    }

	    Character heal(int value) {
	        health += value;
	        return this;
	    }

	    Character train() {
	        strength += 5;
	        return this;
	    }

	    void printStats() {
	        System.out.println("Имя: " + name);
	        System.out.println("Здоровье: " + health);
	        System.out.println("Сила: " + strength);
	    }
	}

}

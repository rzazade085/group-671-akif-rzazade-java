package lesson9;

public class homework_9 {

	//1

	public class Student {

	    public String name;
	    double averageGrade; // default-доступ

	    public Student(String name, double averageGrade) {
	        this.name = name;
	        this.averageGrade = averageGrade;
	    }

	    public double getAverageGrade() {
	        return averageGrade;
	    }
	}
	
	//2

	public class Date {
	    public String eventDate;
	}

	//4

	public interface Resizable {

	    void resize(double factor);

	    default void resizeTwice() {
	        resize(2.0);
	        logResize("увеличен в 2 раза");
	    }

	    private void logResize(String message) {
	        System.out.println("Лог: " + message);
	    }
	}

	//5

	public class Product {
	    public int id;
	    public String name;
	    public double price;
	}
}

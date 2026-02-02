package lesson11;

public class homework_11_task {

	public class Student {
	    public String name;
	    private double averageGrade;

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
	

	public class Date2 {
	    public long timestamp;
	}
	
	public class Main {
	    public static void main(String[] args) {

	        com.myapp.utils.Date d1 = new com.myapp.utils.Date();
	        com.myapp.model.Date d2 = new com.myapp.model.Date();
	    }
	}
	
	//4
	

public interface Resizable {

    void resize(double factor);

    default void resizeTwice() {
        resize(2.0);
        log();
    }

    private void log() {
        System.out.println("resize");
    }
}


public class Image implements Resizable {

    public void resize(double factor) {
        System.out.println("resize " + factor);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Image img = new Image();
        img.resizeTwice();
    }
 }



}

package classwork_19;

public class Zadaniye5 {

	class Student {
		String name;
		int course;
		double grade;
	}

	public class Task5 {

	    public static void main(String[] args) {

	        Student s1 = new Student();
	        s1.name = "Ivan";
	        s1.course = 2;
	        s1.grade = 4.5;

	        Student s2 = new Student();
	        s2.name = "Petr";
	        s2.course = 1;
	        s2.grade = 3.8;

	        Student s3 = new Student();
	        s3.name = "Anna";
	        s3.course = 2;
	        s3.grade = 4.9;

	        Student s4 = new Student();
	        s4.name = "Maria";
	        s4.course = 3;
	        s4.grade = 4.2;

	        Student s5 = new Student();
	        s5.name = "Oleg";
	        s5.course = 2;
	        s5.grade = 3.5;

	        Student[] arr = {s1, s2, s3, s4, s5};


	        System.out.println("2 kurs:");
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].course == 2) {
	                System.out.println(arr[i].name);
	            }
	        }

	        double sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum = sum + arr[i].grade;
	        }
	        System.out.println("Sredniy bal: " + sum / arr.length);

	        Student best = arr[0];
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].grade > best.grade) {
	                best = arr[i];
	            }
	        }
	        System.out.println("Lucsiy: " + best.name);

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length - 1; j++) {
	                if (arr[j].grade < arr[j + 1].grade) {
	                    Student temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Otstrativano:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i].name + " " + arr[i].grade);
	        }
	    }
}

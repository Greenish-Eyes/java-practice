package lab10;

/**
 * <p>Title: The Application Class</p>
 * <p>Description: The program reads student data from the courseData.txt 
 * and uses it to create student objects.
 * It adds each student to a course object and then displays the course info.
 * It also includes a method to find which student got the lowest score on a specific exam.  </p>
 * @author Olena Fedochynska, Tanisha T.
 */
import java.io.*;
import java.util.*;
public class Lab11App {

	public static void main(String[] args) throws IOException {
		
		String studentId;
		String firstName;
		String lastName;
		double[] grades = new double[4];
		Student student1;
		Course theCourse = new Course();
		Scanner fileScan = new Scanner(new File("courseData.txt"));
		while (fileScan.hasNext())
		{
			studentId = fileScan.next();
			lastName = fileScan.next();
			firstName = fileScan.next();
			
			for(int i = 0; i< grades.length; i++)
			{
				double grade = fileScan.nextDouble();
				grades[i] = grade;
			}
			Student student = new Student(studentId, firstName, lastName, grades);
			theCourse.inserStudent(student);
		}
		fileScan.close();
		System.out.println(theCourse);
		
		for (int i = 1; i <= 4; i++)
		{
			int theLowest = theCourse.findIndexForStudentWithLowestExam(i);
			System.out.println("The student with the lowest grade for the exam " + i + " has index : " + theLowest + "\n");
		}
		
		student1 = new Student ();
		student1.setId("123-45-6789");
		System.out.println("Position of the student with id '"+ student1.getId() + "' in the array: " + theCourse.findStudent(student1));
		student1.setId("765-43-2100");
		System.out.println("Position of the student with id '"+ student1.getId() + "' in the array: " + theCourse.findStudent(student1));
		student1.setId("999-99-9999");
		System.out.println("Position of the student with id '"+ student1.getId() + "' in the array: " + theCourse.findStudent(student1));
		student1.setId("666-66-6666");
		System.out.println("Position of the student with id '"+ student1.getId() + "' in the array: " + theCourse.findStudent(student1));
		
		
		
		

	}

}

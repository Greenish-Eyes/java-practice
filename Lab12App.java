package lab10;
/**
 * <p>Title: The Application Class</p>
 * <p>Description: 
 * </p> This program works with arrays of student objects within a course.
 * It reads student data from a file, finds the student with the highest average,
 * deletes the students using two different methods
 * and displays the updated couse roster after each operation.
 * @author Olena Fedochynska, Tanisha T.
 */
import java.io.*;
import java.util.*;

public class Lab12App {

	public static void main(String[] args) throws IOException {
		String studentId;
		String firstName;
		String lastName;
		double[] grades = new double[4];
		Student student1 = new Student();
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
		Student topStudent = theCourse.determineHighestAverage();
		System.out.println("The student with the hightest average is:\n" + topStudent);

		System.out.println(topStudent.getFirstName() + " " + topStudent.getLastName() + " the highest exam average of " + topStudent.calcAverage());
		//765-43-2100
		student1 = new Student ();
		student1.setId("765-43-2100");

		if (theCourse.deleteStudent(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		//999-99-9999
		student1.setId("999-99-9999");

		if (theCourse.deleteStudent(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		//123-45-6789		
		student1.setId("123-45-6789");

		if (theCourse.deleteStudent(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}

		//666-66-6666		
		student1.setId("666-66-6666");

		if (theCourse.deleteStudent(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}

		System.out.println("\n" + theCourse.toString());
		
		

		//333-44-5555		
		student1.setId("333-44-5555");

		if (theCourse.deleteStudentByShifting(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}

		//222-34-5555		
		student1.setId("222-34-5555");

		if (theCourse.deleteStudentByShifting(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}

		//888-44-2222		
		student1.setId("888-44-2222");

		if (theCourse.deleteStudentByShifting(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		//666-66-6666		
		student1.setId("666-66-6666");

		if (theCourse.deleteStudentByShifting(student1) == true)
		{
			System.out.println("\nDeletion successful! " 
					+ "The student with id:" + student1.getId() 
					+ " was deleted from course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		else
		{
			System.out.println("\nUnable to delete. Student not found in the course.");
			System.out.println("The number of students in this course is " + theCourse.getNumStudents());
		}
		
		System.out.println("\n" + theCourse.toString());

	}
}

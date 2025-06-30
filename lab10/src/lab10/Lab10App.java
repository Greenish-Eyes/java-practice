package lab10;
import java.util.Scanner;
/**
 * <p>Title: The Application Class</p>
 * <p>Description: The program creates a course and adds students to it.  
 * It shows how many students are in the course,
 *  lets the user enter exam grades for a new student. 
 *  Also finds out which student has the lowest grade and displays all the information. </p>
 * @author Olena Fedochynska, Tanisha T.
 */


public class Lab10App {
	public static void main(String[] args) {
		
		Course course1 = new Course();
		System.out.println("Check of accessor method on default constructor. \nNumber of students: " 
				+ course1.getNumStudents() + "\n");
		
		
		double[] grades = {78.0, 93.5, 91.0, 88.5};
		Student student1 = new Student ("N001234", "Lucas", "Sinclair", grades);
		// insert new student into course1
		course1.inserStudent(student1);
		
		double[] grades2 = {82.0, 67.5, 90.0, 85.0};
		Student student2 = new Student ("N002345", "Mike", "Wheeler", grades2);
		course1.inserStudent(student2);
		
		System.out.println("Check of accessor method after inserting two new students. \nNumber of students: " 
				+ course1.getNumStudents() + "\n");
		//The output is as we call toString method
		//Because Java automatically calls 
		//the toString method when printing an object
		// The output is lab10.Course@2eafffde because 
		//it returns the address of memory where the variable course1 store 
		System.out.println(course1);
		
		for (int i = 1; i <= 4; i++)
		{
			double average = course1.calcExamAverage(i);
			System.out.println("The average for the exam " + i + " is : " + average + "\n");
		}
		
		Scanner scnr = new Scanner(System.in);
		double[] grades3 = new double [4];
	
		for (int i = 0; i < 4; i++) 
		{
			
			System.out.println("Enter the exam " + (i+1) + " grade: ");
			grades3[i] = scnr.nextDouble();
			if ((grades3[i] < 0) ||(grades3[i] > 100))
			{
				System.out.println("Wrong value of the grade. \nEnter the exam " + (i+1) + " grade: ");		
				grades3[i] = scnr.nextDouble();
			}
		}
		
		
		
		Student student3 = new Student("N0056", "Ania", "Perez", grades3);
		course1.inserStudent(student3);
		System.out.println(course1);
		
		for (int i = 1; i <= 4; i++)
		{
			double average = course1.calcExamAverage(i);
			System.out.println("The average for the exam " + i + " is : " + average + "\n");
		}
		
		for (int i = 1; i <= 4; i++)
		{
			int theLowest = course1.findIndexForStudentWithLowestExam(i);
			System.out.println("The student with the lowest grade for the exam " + i + " has index : " + theLowest + "\n");
		}
		
	}
	
	

}

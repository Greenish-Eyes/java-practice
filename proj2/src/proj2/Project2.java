package proj2;
import java.util.Scanner;

/**
 * <p>Title: Programming Project #2 </p>
 * <p>Description: A small, non-profit school needs help taking data about its courses and breaking it into different pieces
 * of information that the school needs. The course data they receive has the following parts: course id,
 * department, course number, section, number of credits and course name</p>
 * @author Olena Fedochynska
 *
 */
public class Project2 {
	public static void main(String[] args)
	{
		// should store the position of where the first space is located
		int posOfSpace; 

		// should store the position of where the first hyphen is located
		int posOfHyphen; 

		// should store the full course information as entered by the user
		String courseInfo; 

		/* stores the various parts of the course information, 
		do not change the data type of any of these variables */
		String dept;
		String section;
		String courseName;
		int courseId;
		int courseNum;
		double credits;

		Scanner scnr = new Scanner(System.in);

		/* use 
		18169 CSC-120-G1 4.0-Computer Science I
		as your initial input */
		System.out.println("Please enter a String with the course information");
		courseInfo = scnr.nextLine();
		
		//find space location
		posOfSpace = courseInfo.indexOf(" ");
		
		//find the first hyphen location
		posOfHyphen = courseInfo.indexOf("-");
		
		//find course ID
		courseId = Integer.parseInt(courseInfo.substring(0, posOfSpace));
		
		//find department
		dept = courseInfo.substring(posOfSpace + 1, posOfHyphen);
		
		//find 2nd hyphen location
		int secondHyphen = courseInfo.indexOf("-", posOfHyphen + 1);
		
		//find course number
		courseNum = Integer.parseInt(courseInfo.substring(posOfHyphen + 1, secondHyphen));
		
		//find 2nd space
		int secondSpace = courseInfo.indexOf(" ", posOfSpace + 1);
				
		//find section
		section = courseInfo.substring(secondHyphen + 1, secondSpace);
		
		//find 3rd hyphen location
		int thirdHyphen = courseInfo.indexOf("-", secondHyphen + 1);
		
		//find credits
		credits = Double.parseDouble(courseInfo.substring(secondSpace +1, thirdHyphen));
		
		//find course name
		courseName = courseInfo.substring(thirdHyphen + 1);


		//System.out.println("The course information is: " + courseInfo);
		System.out.println("Course Id: " + courseId);
		System.out.println("Department: " + dept);
		System.out.println("Course number: " + courseNum);
		System.out.println("Section: " + section);
		System.out.println("Credits: " + credits);
		System.out.println("Course Name: " + courseName);
		scnr.close();

		/* use 
		7531 MATH-1001-T11 4.25-Mathematical Reasoning
		for additional testing */
		
	}
}
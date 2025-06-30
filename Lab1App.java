package lab1;
/**
* <p>Title: Day 2 Sample Java Program</p>
* <p>Description: Oak Street Elementary School has students in 1st & 2nd
* grade. After the first day of school, two students join the first grade.
* This program determines the number of students in the school and the
* percentage of students in the first grade.</p>
* @author Prof. Postner
*/
// class definition
public class Lab1App {	// class header
	public static void main(String[] args)	// main method header
	{
		// variable declarations
		int firstGraders;
		int secondGraders;
		int totalStudents;
		
		// assignment statements
		firstGraders = 18;
		secondGraders = 30;
		firstGraders = firstGraders +2;
		totalStudents = firstGraders + secondGraders;
		
		// output statements
		System.out.println("Oak Street Elementary School has:");
		System.out.println(firstGraders + " students in first grade");
		System.out.println(secondGraders + " students in second grade");
		System.out.println(totalStudents + " total students");
		
		/*
		ANSWER QUESTION 1 & 2 HERE
		1) 0 
		2) Bc we do mathematics operations with integer numbers, 
		so when computer do calculations 20/50=0 as the result all output will be 0.
		To avoide it we can use (double) (as it is below) or multiply 0.1
		
		*/
		
		System.out.println((double)firstGraders / (firstGraders + secondGraders) * 100 + 
				"% of the students are in first grade");
		}

}

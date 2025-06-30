package lab10;
/**
 * <p>Title: The Course Class</p>
 * 
 * <p>Description: This class models a Course and is capable of storing references 
 * to Student objects. Students can be inserted in the course and the number of students
 * in the course can be determined. The average for a given exam can be calculated, the 
 * position of the Student with the lowest score for a given exam can be determined and 
 * the students at a given position can be returned.</p>
 *
 * @author Olena Fedochynska, Tanisha T.
 *
 */
public class Course 
{
	//instance variables
	private Student[] theStudents;
	private int numStudents;



	/**
	 * Default constructor --
	 * Creates storage for at most 30 students and sets the number of
	 * students in the course to 0.
	 */

	public Course()
	{
		theStudents = new Student[30];
		numStudents = 0;
	}


	/**
	 * getNumStudents --
	 * Returns the number of students currently in the course.
	 * @return numStudents
	 */

	public int getNumStudents()
	{
		return numStudents;
	}


	/**
	 * insertStudent --
	 * Adds a student to the course if there's room.  If the course is full, 
	 * it doesn't do anything.
	 * @param aStudent a reference to the student to be added 
	 */
	public void inserStudent(Student aStudent)
	{
		if (numStudents < theStudents.length) {
			theStudents[numStudents] = aStudent;
			numStudents++;
		}
	}


	/**
	 * calcExamAverage --
	 * Calculates the average for a particular exam.
	 * @param examNum the exam number to calculate the average for
	 * @return the average for the specified exam
	 */
	public double calcExamAverage (int examNum)
	{
		double total = 0;
		int count = 0;
		for (int i = 0; i<numStudents; i++)
		{
			double[] exams = theStudents[i].getExams();
			total = total + exams[examNum -1];
			count++;

		}

		double average = total/count;
		return average;
	}


	/**
	 * findIndexForStudentWithLowestExam --
	 * Determines the index of the student with the lowest score for a 
	 * particular exam. 
	 * 
	 * @param examNum an integer representing the exam number to find the lowest 
	 * exam score for 
	 * @return the index of the student with the lowest exam score for the 
	 * specified exam
	 */

	public int findIndexForStudentWithLowestExam(int examNum)
	{

		double theLowest = 100;
		int indexTheLowest = 0;
		for (int i = 0; i < numStudents; i++)
		{
			double[] scores = theStudents[i].getExams();
			double score = scores[examNum -1];
			if (score < theLowest)
			{
				theLowest = score;
				indexTheLowest = i;
			}
		}
		return indexTheLowest;
	}
	/**
	 * findStudent method
	 * locate the student in the array whose id matches 
	 * the id of the student whose
	 * reference was passed to the method.
	 * @param Student st
	 * @return the position where the Student reference is 
	 * stored in the array
	 */
	public int findStudent(Student st)
	{
		for (int i = 0; i < numStudents; i++)
		{
			if (theStudents[i].equals(st))
				return i;
		}
		return -1;
	}


	/**
	 * toString method -- 
	 * Returns a String representing the state of the Course.
	 * @return a reference to a string containing all the students in
	 * the course
	 */
	public String toString()
	{
		String str = new String();
		for (int i = 0; i < numStudents; i++)
			str = str + "Student " + (i+1) + ": \n" + theStudents[i].toString() + "\n\n";
		return str;	}

}
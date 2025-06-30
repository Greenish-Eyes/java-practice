package lab8;
/**
 * <p>Title: Lab8 Student class </p>
 * <p>Description: </p>
 * @Olena Fedochynska, Tanisha T.
 */

public class Student {
	// instance variables
	private String studentId;
	private String firstName;
	private String lastName;
	private double[] examGrades;

	/** 
	 * default constructor
	 * the id, first and last names are initialized to "none"
	 * the array is created with 4 elements - each element is
	 * initialized to 0
	 */
	public Student()
	{
		studentId = new String("N000000");
		firstName = new String("None");
		lastName = new String("None");
		// creates the array that can store 4 elements of type double
		examGrades = new double[4];
		// initializes each element in the array to 0.0
		for (int i=0; i<examGrades.length; i++)
			examGrades[i] = 0.0;
	}

	/** 
	 * parameterized constructor
	 * stores the parameters into the appropriate instance variables
	 * @param sId the value to be stored in the instance variable id
	 * @param sFirstName the value to be stored in the instance variable first name
	 * @param sLastName the value to be stored in the instance variable last name
	 * @param sExams the value to be stored in the instance variable exam grades
	 */
	public Student(String sId, String sFirstName, String sLastName, double[] sExams)
	{
		studentId = sId;
		firstName = sFirstName;
		lastName = sLastName;
		examGrades = sExams;
	}


	/**
	 * mutator method for student id
	 * stores the parameter into the instance variable
	 * @param sId the value to be stored in the instance variable id
	 */
	public void setStudentId(String sId)
	{
		studentId = sId;
	}

	

	/**
	 * mutator method for exam grades
	 * stores the parameter into the instance variable
	 * @param sExams the address of the array to be stored in the instance variable exams
	 */
	public void setExamGrades(double[] sExams)
	{
		examGrades = sExams;
	}


	/**
	 * accessor method for student id
	 * @return a reference to the instance variable student id
	 */
	public String getStudentId()
	{
		return studentId;
	}
	
	
	/**
	 * accessor method for exam grades
	 * @return a reference to the instance variable exam grades
	 */
	public double[] getExamGrades()
	{
		return examGrades;
	}


	/**
	 * calcExamAverage method
	 * calculates the average of the exams
	 * @return the exam average
	 */
	public double calcExamAverage ()
	{
		double sum = 0;
		for (int i = 0; i<examGrades.length; i++)
		{
			sum = sum + examGrades[i];
		}
		double average = sum / examGrades.length;
		return average;
	}



	/**
	 * findLowestExam method
	 * find and return the lowest exam score in the array
	 * @return the lowest exam score in the array
	 */
	public double findLowestExam ()
	{
		double lowest = examGrades[0];
		for (int i = 1; i<examGrades.length; i++)
		{
			if ( examGrades[i] < lowest)
				lowest = examGrades[i];
		}
		return lowest;
	}



	/**
	 * findHighestExamIndex method
	 * find and return the index of the highest exam score in the array
	 * @return the index of the highest exam score in the array
	 */
	
	public int  findHighestExamIndex  ()
	{
		int highestIndex = 0;
		double highest = examGrades[0];
		for (int i = 1; i<examGrades.length; i++)
		{
			if ( examGrades[i] > highest)
				highestIndex = i;
		}
		return highestIndex;
	}



	/**
	 * toString method
	 * @return a reference to a String containing the student id, first and last names
	 * and the exam grades
	 */
	public String toString()
	{
		String str = new String("Id: " + studentId +"\nName: " + lastName + ", " + firstName + "\nGrades: ");
		for (int i=0; i < examGrades.length;i++)
		{
			str = str +examGrades[i] + " ";
		}
		return str;
	}



}
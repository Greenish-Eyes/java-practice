package lab8;
/**
 * <p>Title: Lab8 Application program </p>
 * <p>Description: </p>
 * @Olena Fedochynska, Tanisha T.
 */
public class Lab8App {

	public static void main(String[] args) {
		//test default
		Student testDefStudent = new Student();
		System.out.println(testDefStudent.toString());
		
		//test parameterized constructor
		double[] sGrades = {85.5, 80.0, 88.5, 84.0};
		Student testParamStudent = new Student("N00514375","Sarah", "John", sGrades);
		System.out.println(testParamStudent.toString());
		
		
		//test no7
		testDefStudent.setStudentId("N296112");
		double[] s2Grades = {85.0, 90.0, 68.0, 80.0};
		testDefStudent.setExamGrades(s2Grades);
		
		System.out.println(testDefStudent.toString()); 
		
		//test n08
		
		
		System.out.println(testParamStudent.getStudentId());
		double[] scores = testParamStudent.getExamGrades();
		for(int i = 0; i < scores.length;i++)
		{
			String str = new String(scores[i] + " ");
			System.out.println(str);
		}
		
		//test no9
		System.out.println("Average Grade for the default student: " + testDefStudent.calcExamAverage());
		System.out.println("Average Grade for the second student: " + testParamStudent.calcExamAverage());
		
		//test no10
		System.out.println("The lowest Grade for the default student: " + testDefStudent.findLowestExam());
		System.out.println("The lowest Grade for the second student: " + testParamStudent.findLowestExam());
		
		//test no11
		System.out.println("The position of the highest exam for the default student: " + testDefStudent.findHighestExamIndex());
		System.out.println("The position of the highest exam for the second student: " + testParamStudent.findHighestExamIndex());
		

		
	}

}

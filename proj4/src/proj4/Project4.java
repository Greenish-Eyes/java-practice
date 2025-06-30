package proj4;
/**
 * <p>Title: Project 4. A Question Class </p>
 * <p>Description: The Project4 class runs a division practice game for students.
 * It asks division questions, tracks scores, and adjusts difficulty based on responses.</p>
 *  @author Olena Fedochynska
 */
import java.util.Scanner;
public class Project4 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int level;
		int correctAnswers = 0;
		int totalQuestions = 10;

		System.out.println("What type of question do you want to start with: easy (1), moderate (2) or difficult (3)?"); 
		level = scanner.nextInt();

		for (int i = 1; i <= totalQuestions; i++) {
			Question question = new Question(level);
			System.out.println("Q: " + i + " level: " + level 
					+ "\nWhat's the quotient for: " + question.toString());
			int userQuotient = scanner.nextInt();
			
			if (userQuotient == question.determineQuotient())
			{
				System.out.println("Congrats!");
				System.out.println("What's the remainder for: " + question.toString());
				int userRemainder = scanner.nextInt();
				if (userRemainder == question.determineRemainder())
				{
					System.out.println("Woo hoo! You got it right!");
					if (level < 3)
					{
						System.out.println("Let's try a harder question");
						level++;
					}
					correctAnswers++;
				}
				else
				{
					System.out.println("Sorry, that's not correct. The remainder for " + question.toString() + " is " + question.determineRemainder());
				}
			}
			else
			{
				System.out.println("Not quite. The quotient for " +  question.toString() + " is " + question.determineQuotient());
				if (level > 1)
					level--;
			}
			
		}
		System.out.println("You got " + correctAnswers + " completely correct");

	}
}

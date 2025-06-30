package proj4;
/**
 * <p>Title: Project 4. A Question Class </p>
 * <p>Description: The Question class generates division problems based on the difficulty level.
 * It determines the quotient and remainder for the generated problem. </p>
 * @author Olena Fedochynska
 */
import java.util.Random;

public class Question {
	private int dividend;
	private int divisor;
	
	/**
     * parameterized constructor
     * Constructs a division problem based on the specified difficulty level.
     * @param level Difficulty level (1 = easy, 2 = moderate, 3 = difficult)
     */
	public Question (int level)
	{
		Random randGen = new Random();
		//easy level
		if (level == 1)
		{
			// divisor from 1 to 4
			divisor = randGen.nextInt(4) + 1;
			//dividend from 1 to 20
			/*
			 * randGen.nextInt(20 - divisor) generates a random number from 0 to (19 - divisor),so + 1.
			 *Adding divisor ensures the final value is always at least divisor.
			 *This keeps dividend within the range [divisor, 20], which is the intended behavior.
			 */
			dividend = randGen.nextInt(20 - divisor + 1) + divisor; 
		
		}
		else
		{
			// moderate level
			if (level == 2)
			{
				//divisor from 5 to 7
				divisor = randGen.nextInt(3) + 5;
				//dividend from 21 to 50
				dividend = randGen.nextInt(30) + 21;
			}

			// difficult level
			else
			{
				// divisor from 8 to 12
				divisor = randGen.nextInt(5) + 8;
				int midRange = divisor * 7;
				// dividend from midRage to 144
				/*
				 * Ensures the dividend is at least 7 times the divisor
				 * randGen.nextInt(144 - minRange + 1) generates a random number from 0 to (143 - midRange),so + 1.
				 * Adding divisor ensures the final value is always at least midRage.
				 * This keeps dividend within the range [minRange, 144], which is the intended behavior.
				 */
				dividend = randGen.nextInt(144 - midRange + 1) + midRange;
				
			}
		}

	}
	 
	/**
	 * determineQuotient method
     * Returns the quotient of the division problem.
     * @return The quotient of dividend divided by divisor.
     */
	public int determineQuotient()
	{
		int quotient = dividend / divisor;
		return quotient;
	}
	
	/**
	 * determineRemainder method
     * Returns the remainder of the division problem.
     * @return The remainder of dividend divided by divisor.
     */
	public int determineRemainder()
	{
		int reminder = dividend % divisor;
		return reminder;
	}
	
	/**
	 * toString method
     * Returns a string representation of the division problem.
     * @return A formatted string representing the division problem.
     */
	public String toString()
	{
		String str = new String(dividend + " / " + divisor + " = ");
		return str;
	}

}


package lab6;
import java.util.Random;

/**
 * <p>Title:   </p> Lab 6 Dice class
 * <p>Description:  </p> Writing and Testing the Dice Class
 * @author Olena Fedochynska, Tanisha T.
 *
 */
public class Dice {
	private int die1;
	private int die2;
	private int die3;


	/**
	 * default constructor
	 * sets each instance variable to an initial value of 0
	 */
	public Dice()
	{
		die1 = 0;
		die2 = 0;
		die3 = 0;
	}


	/**
	 * setDie1 method
	 * the mutator method changes the value stored in the die1 instance variable 
	 * based upon the value of the parameter
	 * @param num the value to store in the instance variable die1
	 */
	//#7Q1. setDie1
	//Q2 int num
	//Q3 None

	public void setDie1(int num1)
	{

		die1 = num1;
	}


	/**
	 * setDie2 method
	 * the mutator method changes the value stored in the die2 instance variable 
	 * based upon the value of the parameter
	 * @param num the value to store in the instance variable die2
	 */

	public void setDie2(int num2)
	{

		die2 = num2;
	}


	/**
	 * setDie3 method
	 * the mutator method changes the value stored in the die3 instance variable 
	 * based upon the value of the parameter
	 * @param num the value to store in the instance variable die3
	 */

	public void setDie3(int num3)
	{

		die3 = num3;
	}



	/**
	 * getDie1 method
	 * the accessor method returns the value stored in the die1 instance variable
	 * @return the face value of die1
	 */
	//14Q4. getDie1
	//Q5. no parameters
	//Q6. int die1

	public int getDie1() 
	{
		return die1;
	}


	/**
	 * getDie2 method
	 * the accessor method returns the value stored in the die2 instance variable
	 * @return the face value of die2
	 */

	public int getDie2() 
	{
		return die2;
	}
	/**
	 * getDie3 method
	 * the accessor method returns the value stored in the die3 instance variable
	 * @return the face value of die3
	 */

	public int getDie3() 
	{
		return die3;
	}

	/**
	 * roll method
	 * stores a random number in the range 1 to 6 in each of the 3 die
	 */
	//21Q7. no parameters
	//Q8. no return

	public void roll()
	{
		Random randGen = new Random();
		die1 = randGen.nextInt(5) + 1;
		die2 = randGen.nextInt(5) + 1;
		die3 = randGen.nextInt(5) + 1;

	}

	/**
	 * calcTotalRoll method - this method calculates the total of the three die
	 * @return the sum of the dice
	 */
	//25Q9. 0
	//Q10. int

	public int calcTotalRoll()
	{
		int sum = die1 + die2 + die3;
		return sum;
	}

	/**
	 * threeOfAKind method - this method determines if all three dice have the same value
	 * @return true if they have the same value, false otherwise
	 */
	//28Q11. 0
	//Q12. returns a boolean value

	public boolean threeOfAKind()
	{
		if ((die1 == die2) || (die1 == die3) || (die2 == die3))
			return true;
		else
			return false;

	}

	/**
	 * findHighestDieValue method - this method determines the highest value of the dice
	 * @return the value of the highest die
	 */
	//32Q13. 0
	//Q14. int

	public int findHighestDieValue()
	{
		if ((die1 >= die2) && (die1 >= die3) )
			return die1;
		else
			if (die2 >= die3)
				return die2;
			else 
				return die3;
	}
	/**
	 *  rollOneDice  method allows the user to roll a single die as opposed to all three
	 * @param whichDie
	 */
	public void rollOneDice(int whichDie)
	{
		Random randGen2 = new Random();
		if (whichDie == 1)
			die1 = randGen2.nextInt(5) + 1;
		else
			if (whichDie == 2)
				die2 = randGen2.nextInt(5) + 1;
			else
				die3 = randGen2.nextInt(5) + 1;


	}
	
	/**
	 *  rollDice  method allows the user to roll any combination of the three dice
	 * @param bDie1
	 * @param bDie2
	 * @param bDie3
	 */
	
	public void rollDice(boolean bDie1, boolean bDie2, boolean bDie3)
	{
	
		Random randGen3 = new Random();
		if (bDie1 == true)
			die1 = randGen3.nextInt(5) + 1;
		if (bDie2 == true)
			die2 = randGen3.nextInt(5) + 1;
		if (bDie3 == true)
			die3 = randGen3.nextInt(5) + 1;
	}

	/**
	 * toString method
	 * creates & returns a String with the face values of the 3 die
	 * @return the state of the object
	 */

	public String toString()
	{
		String str = new String(die1 + " " + die2 + " " + die3);
		return str;
	}

}

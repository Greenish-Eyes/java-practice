package proj5;
/**
 * <p>Title: * DiceArray Class </p>
 * <p>Description: This class simulates a set of 3 six-sided dice using an array.
 *  It includes functionality to roll the dice, calculate the total of the roll,
 * count how many dice rolled a 1, and return the dice values as a string. 
 * </p>
 * @author Olena Fedochynska
 */

import java.util.Random;

public class DiceArray {

	private int[] dice; // Array to hold 3 dice values
	
	/** 
	 * Default constructor.
	 * Initializes a 3-element array and sets all values to 0.
	 */
	public DiceArray() 
	{
		dice = new int[3];
		for (int i = 0; i < dice.length; i++)
		{
			dice[i] = 0;
		}
		
	}

	/**
	 * A roll method
	 * Rolls all three dice by assigning each a random value from 1 to 6.
	 */
	public void roll() 
	{
		Random randGen = new Random();
		for (int i = 0; i < dice.length; i++) 
		{
			
			dice[i] = randGen.nextInt(6) + 1;
		}
	}

	/**
	 * A calcTotalRoll method 
	 * Calculates the total value of the dice rolled.
	 * @return the sum of the three dice
	 */
	public int calcTotalRoll() 
	{
		int total = 0;
		for (int i = 0; i < dice.length; i++) 
		{
			total += dice[i];
		}
		return total;
	}

	/**
	 * A countNumOnes method
	 * Counts the number of dice that show a 1.
	 * @return the count of dice showing a face value of 1
	 */
	public int countNumOnes() 
	{
		int count = 0;
		for (int i = 0; i < dice.length; i++) 
		{
			if (dice[i] == 1) 
				count++;
		}
		return count;
	}

	/**
	 * A toString method 
	 * Returns a string representation of the dice values.
	 * @return a string showing all three dice values
	 */
	public String toString() 
	{
		String str = new String(" ");
		for (int i = 0; i < dice.length; i++) 
		{
			str += dice[i] + " ";
			
		}
		return str;
	}
}




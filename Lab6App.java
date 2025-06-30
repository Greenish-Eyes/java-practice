package lab6;
import java.util.Scanner;

/**
 * <p>Title:   </p> Lab 6 Dice class
 * <p>Description:  </p> Writing and Testing the Dice Class
 * @author Olena Fedochynska, Tanisha T.
 *
 */

public class Lab6App {

	public static void main(String[] args) 
	{
		Dice theDice = new Dice();

		theDice.setDie1(2);
		theDice.setDie2(4);
		theDice.setDie3(6);
		System.out.println(theDice.toString());
		
		System.out.println(theDice.getDie1());
		System.out.println(theDice.getDie2());
		System.out.println(theDice.getDie3());
		
		theDice.roll();
		System.out.println("After rolling the dice: " + theDice.toString());
		System.out.println("The roll total is " + theDice.calcTotalRoll());
		if (theDice.threeOfAKind() == true)
			System.out.println("Three of a kind");
		else
			System.out.println( "Not three of a kind");
		
		System.out.println(theDice.findHighestDieValue());
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter number of the dice to roll: ");
		int whichDie = scnr.nextInt();
		theDice.rollDice(whichDie);
		System.out.println("Rolling one die - die " + whichDie +": " + theDice.toString());
		
		System.out.println("Enter number of the dice to roll: ");
		int whichDie2 = scnr.nextInt();
		theDice.rollDice(whichDie2);
		System.out.println("Rolling one die - die " + whichDie + " die " + whichDie2 + ": " + theDice.toString());
		
		System.out.println("Enter number of the dice to roll: ");
		int whichDie3 = scnr.nextInt();
		theDice.rollDice(whichDie3);
		System.out.println("Rolling one die - die " + whichDie + " die " + whichDie2 +" die " + whichDie3 + ": " + theDice.toString());
		
		
		
	}

}

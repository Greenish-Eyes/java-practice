
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
		theDice.rollOneDice(whichDie);
	
		System.out.println("Rolling die " + whichDie +": " + theDice.toString());
		

		System.out.println("Do you want to roll die 1? ");
		String bSrtingDie1 = scnr.next();
		boolean bDie1;
		if ((bSrtingDie1.equals("Yes")) || (bSrtingDie1.equals("yes")) || (bSrtingDie1.equals("Y")) || (bSrtingDie1.equals("y")))
			bDie1 = true;
		else
			bDie1 = false;
		
		System.out.println("Do you want to roll die 2? ");
		String bSrtingDie2 = scnr.next();
		boolean bDie2;
		if ((bSrtingDie2.equals("Yes")) || (bSrtingDie2.equals("yes")) || (bSrtingDie2.equals("Y")) || (bSrtingDie2.equals("y")))
			bDie2 = true;
		else
			bDie2 = false;
		
		System.out.println("Do you want to roll die 3? ");
		String bSrtingDie3 = scnr.next();
		boolean bDie3;
		if ((bSrtingDie3.equals("Yes")) || (bSrtingDie3.equals("yes")) || (bSrtingDie3.equals("Y")) || (bSrtingDie3.equals("y")))
			bDie3 = true;
		else
			bDie3 = false;
		
		theDice.rollDice(bDie1, bDie2, bDie3);
		System.out.println(theDice.toString());

	}

}

package proj5;

import java.util.Scanner;

/**
 * <p>Title: * Project5 Application Class </p>
 * <p>Description:  This class is used to test the DiceArray class by rolling the dice,
 * printing the results, and checking the total and number of ones rolled.
 * </p>
 * @author Olena Fedochynska
 */
public class Project5 {

	public static void main(String[] args) {
		int computerTotalScore = 0;
		int userTotalScore = 0;
		DiceArray dice = new DiceArray();
		
		System.out.println("Game Rules:\n"
				+ "The user gets the first turn. They will roll the dice until one of four things happens:\n"
				+ "- They have rolled three times\n"
				+ "- They roll double 1s and turn total equal 0\n"
				+ "- They roll triple 1s and game total equal 0\n"
				+ "- They decide not to roll again\r\n"
				+ "The computer gets its turn. The computer will roll the dice until one of three things happens:\r\n"
				+ "- It rolls double 1s and turn total equal 0\n"
				+ "- It rolls triple 1s and game total equal 0\n"
				+ "- Its total for the turn is 20 or more\n\n");


		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("ROUND " + i);

			// USER TURN
			System.out.println("\nUser");
			int userTurnScore = 0;
			int userRolls = 0;
			boolean userDone = false;
			Scanner scnr = new Scanner(System.in);

			while (!userDone && userRolls < 3) 
			{

				dice.roll();
				userRolls++;

				int ones = dice.countNumOnes();
				int rollTotal = dice.calcTotalRoll();
				if (ones == 3) 
				{

					userTotalScore = 0;
					userTurnScore = 0;
					System.out.println("Roll "+ userRolls + ": " + dice.toString()+ " - turn total = " 
							+ userTurnScore);
					userDone = true;

				} 
				else 
					if (ones == 2) 
					{
						userTurnScore = 0;
						System.out.println("Roll "+ userRolls +": "  + dice.toString()+ " - turn total = " 
								+ userTurnScore);
						userDone = true;

					} 
					else 
					{
						userTurnScore += rollTotal; 

						if ((userRolls < 3) && (ones <= 1))
						{

							System.out.println("Roll "+ userRolls +": " + dice.toString()+ " - turn total = " 
									+ userTurnScore + ", roll again?" );
							char rollAgain = scnr.next().charAt(0);
							if (rollAgain != 'y')
							{
								userDone = true;
							}
						}
						else 
						{
							System.out.println("Roll "+ userRolls +": "  + dice.toString()+ " - turn total = " 
									+ userTurnScore);
						}
					}

				userTotalScore += userTurnScore;
			}

			System.out.println("Turn total: " + userTurnScore + "   Game total: "+ userTotalScore);



			// COMPUTER TURN
			System.out.println("\nComputer");
			int compTurnScore = 0;
			int compRolls = 0;
			boolean compDone = false;


			while (!compDone) 
			{
				dice.roll();
				compRolls++;
				int ones = dice.countNumOnes();
				int rollTotal = dice.calcTotalRoll();

				if (ones == 3) 
				{
					computerTotalScore = 0;
					compTurnScore = 0;
					System.out.println("Roll "+ compRolls + ": " + dice.toString()+ " - turn total = " 
							+ compTurnScore);
				} 
				else 
					if (ones == 2) 
					{
						compTurnScore = 0;
						System.out.println("Roll "+ compRolls + ": " + dice.toString()+ " - turn total = " 
								+ compTurnScore);
					} 
					else 
					{
						compTurnScore += rollTotal;
						System.out.println("Roll "+ compRolls + ": " + dice.toString()+ " - turn total = " 
								+ compTurnScore);
					}
				if (compTurnScore >= 20)
				{
					compDone = true;

				}
				computerTotalScore += compTurnScore;

			}
			System.out.println("Turn total: " + compTurnScore + "   Game total: "+ computerTotalScore);
			System.out.println("\n------------------------ \n");

		}




		// Final result
		System.out.println("THE GAME OVER!");
		System.out.println("Your final score: " + userTotalScore);
		System.out.println("Computer's final score: " + computerTotalScore);

		if (userTotalScore > computerTotalScore) 
		{
			System.out.println("User wins!");
		} 
		else 
			if (userTotalScore < computerTotalScore) 
			{
				System.out.println("Computer wins!");
			} 
			else 
			{
				System.out.println("It's a tie!");

			}
	}

}





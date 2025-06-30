package lab9;

import java.util.*;
import java.io.*;

/**
 * <p>Title: Application Class </p>
 * <p>Description: </p>
 * @author Olena Fedochynska, Tanisha T.
 */

public class Lab9App {
	/* include throws IOException to acknowledge that an error may
	 * occur when using a File for input */
	public static void main(String[] args) throws IOException
	{
		// declare and instantiate a CountyShelters object named nassauCounty 
		CountyShelters nassauCounty = new CountyShelters();
		
		// create a Scanner object that reads from a file
		Scanner fileScan = new Scanner(new File("shelter-info.txt"));
		
		// read the first line which is the number of shelters in the file
		int numShelters = fileScan.nextInt();
		
		/* variable to be used to create a shelter object to be put into
		 * the CountyShelters object */
		Shelter tempShelter;
		
		// loop for the number of elements in the file
		for (int i=0; i<numShelters; i++)
		{
			// read the end of line character
			fileScan.nextLine();
			
			// read and store the Shelter name
			String sName = fileScan.nextLine();
			
			// read and store the number of beds
			int sBeds = fileScan.nextInt();
			
			// create the shelter
			tempShelter = new Shelter(sName, sBeds);
			
			// add it to the county shelters object
			nassauCounty.insertShelter(tempShelter); 
		}
		
		// call the toString method on the CountyShelters object and display the value returned
	
		System.out.println(nassauCounty.toString());
		
		// display the total number of beds available in the county

		System.out.println("The total number of beds available in the county: "+ nassauCounty.calcTotalBedsAvailable());
		
		// check if the county has any beds available - display an appropriate message
		
		if (nassauCounty.allFull() == true)
			System.out.println("The county does not have any beds available.");
		else
			System.out.println("The county has " + nassauCounty.calcTotalBedsAvailable() + " beds available.");

		
		/* display both the index of and the shelter information for the shelter with 
		 * the most availability */
		
		System.out.println("The index of  the shelter with the most availability is: " + nassauCounty.determineShelterMostAvailIndex() + "\n"
				+ "The shelter information: " + nassauCounty.determineShelter(nassauCounty.determineShelterMostAvailIndex()));


		/* call the registerGuests methods with a value between 401 and 725 and displays
		 * if the registration was successful or not AND the current state of the county
		 * shelters object */
		
		if (nassauCounty.registerGuests(500) == true);
			System.out.println("The registration was successful \nThe current state of the county\n"
					+ nassauCounty.toString());

		
		// display how many beds are available county wide
		
		
		/* call the registerGuests methods with a value between 326 and 449 and displays
		 * if the registration was successful or not AND the current state of the county
		 * shelters object */
		

		// display how many beds are available county wide
		
		
		/* call the registerGuests methods with a value higher than the number of beds available and displays
		 * if the registration was successful or not AND the current state of the county
		 * shelters object */

		
		// display how many beds are available county wide

	}
}
package proj1;

import java.util.Scanner;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * @author Olena Fedochynska
 *
 */
public class Project1 {
	public static void main(String[] args)
	{
		String locationInfo;
		int posOfSpace;
		String zipCode;
		String cityName;
		int zipLength;
		int cityLength;
		char cityInitial;
		int miles;
		int speedLimit;
		double timeToSchool;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your zip code, followed by a space, followed by your city name (ie. 11553 Uniondale or 11040-9998 New Hyde Park)");
		locationInfo = scnr.nextLine();
		
		//position of space
		posOfSpace = locationInfo.indexOf(" ");
		
		/*find zip code
		//This way the first digit of zip code is skipped and the last is excised.
		Extract the ZIP code correctly from index 0 up to posOffSpace, but not beyond that. 
		*/
		zipCode = locationInfo.substring(0, posOfSpace);
		
		/*find city name
		 * Since it anticipates a specific ZIP code length, `5` is incorrect.
		 * Retrieve the city name dynamically from (posOfSpace + 1) to the end of the string.
		 */
		cityName = locationInfo.substring(posOfSpace + 1);
		
		//find length of 'zip code' and 'city'
		zipLength = zipCode.length();
		cityLength = cityName.length();
		
		/*
		 * Instead of using the first character in the city name, this chooses the second one.
		 * The initial character of the city name may be obtained by using index `0`.
		 */
		cityInitial = cityName.charAt(0);
		
		//Ask distance and speed
		System.out.println("How many miles is it from this location to Garden City, NY");
		miles = scnr.nextInt();
		System.out.println("What is the average speed limit on your route?");
		speedLimit = scnr.nextInt();
		
		
		/*time to school
		 * Speed is not accurately converted to minutes when `100.0` is used.
		 * To convert speed from miles per hour to minutes per mile, use `60.0`.
		 */
		timeToSchool = miles / (speedLimit / 60.0);
		
		//Seperate output of city and zip code to two different lines.
		System.out.println("\nCity: " + cityName);
		System.out.println( "Zip: " + zipCode + "\n");
		//Zip code can have different length, so change '5' to + zipLength +
		System.out.println("There are  " + zipLength + " digits in the zip code");
		//Change orders of output
		System.out.println("There are " + cityLength + " letters in the city name");
		//Take away \n to not have one empty line.
		System.out.println("City name initial: " + cityInitial + "\n");
		System.out.println("Approximate time to travel " + miles + " miles to school is " + timeToSchool + " minutes");
		
		scnr.close();
	}

}

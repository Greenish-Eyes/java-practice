package lab5;

/**
 * <p>Title: Lab5 Application program </p>
 * <p>Description:This program is designed to manage a shelter where guests can 
 * register. It keeps track of the shelter’s name, the number of beds available,
 *  and how many guests are currently staying. </p>
 * @Olena Fedochynska, Tanish T.
 */
public class Lab5App {

	public static void main(String[] args)
	{
		// declares and instantiates a Shelter object
		Shelter pineElementary = new Shelter();

		// calls the getShelterName method and displays the value returned with a label
		System.out.println("Shelter Name: " + pineElementary.getShelterName());

		// calls the getNumBeds method and displays the value returned with a label
		System.out.println("The number of beds is: " + pineElementary.getNumBeds());

		// calls the getNumGuests method and displays the value returned with a label
		System.out.println("The current number of guests is: " + pineElementary.getNumGuests());

		// calls the toString method and displays the state of the object
		System.out.println(pineElementary.toString()+"\n");

		pineElementary.setShelterName("Pine Elementary School Shelter");
		System.out.println(pineElementary.toString()+"\n");
		pineElementary.setNumBeds(150);
		System.out.println(pineElementary.toString()+"\n");
		
		// declares and instantiates a Shelter object
		Shelter walnutMS = new Shelter("Walnut Middle School Shelter", 500);

		System.out.println(walnutMS.toString()+"\n");
		
		pineElementary.registerGuests(20);
		System.out.println( "The number of guests at " + pineElementary.getShelterName() + " is " + pineElementary.getNumGuests() + ".");
		
		walnutMS.registerGuests(5);
		System.out.println( "The number of guests at " + walnutMS.getShelterName() + " is " + walnutMS.getNumGuests() + ".\n");
		pineElementary.determineBedsAvailable();
		System.out.println(pineElementary.getShelterName() + " has " + pineElementary.determineBedsAvailable() + " beds available.");
		
		walnutMS.determineBedsAvailable();
		System.out.println(walnutMS.getShelterName() + " has " + walnutMS.determineBedsAvailable() + " beds available.\n");
				
		walnutMS.isFull();
		if (walnutMS.isFull() == true)
		{
			System.out.println("The " + walnutMS.getShelterName() + " is full.");
		}
		else
		{ 
			System.out.println("The " + walnutMS.getShelterName() + " is not full. It has " +  walnutMS.determineBedsAvailable() + " beds available.\n");
		}

		
		pineElementary.registerGuests(130);
		System.out.println(pineElementary.toString()+"\n");
		
		pineElementary.isFull();
		if (pineElementary.isFull() == true)
		{
			System.out.println("The " + pineElementary.getShelterName() + " is full.");
		}
		else
		{ 
			System.out.println("The " + pineElementary.getShelterName() + " is not full. It has " +  pineElementary.determineBedsAvailable() + " beds available.");
		}


	}
}
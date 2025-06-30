package lab7;

/**
 * <p>Title:   </p> Lab 7 Application class
 * <p>Description:  </p> define instance variables for a single 
 * contact in a cell phone contact list including
 * the person's first and last names, mobile phone number and date of birth. 
 * @author Olena Fedochynska, Tanisha T.
 *
 */
public class Lab7App {

	public static void main(String[] args) {
		Contact theContact = new Contact();
		System.out.println("Default settings:\n" + theContact);

		Contact newContact = new Contact("Mary", "Johnson", "631-123-4567", "03/15/1990");
		System.out.println("New Contact:\n" + newContact.toString());

		//call accessor methods
		System.out.println("First Name: " + newContact.getFirstName());
		System.out.println("Last Name: " + newContact.getLastName());
		System.out.println("Phone Number: " + newContact.getMobilePhoneNumber());
		System.out.println("Date of the birth: " + newContact.getBirthDate());


		//call mutator methods
		theContact.setFirstName("Reggie");
		theContact.setLastName("Green");
		theContact.setMobilePhoneNumber("516-987-6543");
		theContact.setBirthDate("11/08/2001");
		System.out.println("Contact info after mutator methods: \n" + theContact.toString());

		Contact thirdContact = new Contact("Mary", "Johnson", "631-554-6685", "05/05/2002");

		//call the equal method

		if (newContact.equals(thirdContact) == true)
			System.out.println("Both contacts are the same.");
		else
			System.out.println("Both contacts are diferent.");

		Contact fourthContact = new Contact ("Reggie", "Johnson", "631-554-6685", "05/05/2002" );

		//call the equal method

		if (newContact.equals(fourthContact) == true)
			System.out.println("Both contacts are the same.");
		else
			System.out.println("Both contacts are diferent.");

		// check livesInNassau method

		if (theContact.livesInNassau() == true)
			System.out.println(theContact.getFirstName() + ", " + theContact.getMobilePhoneNumber() + 
					", lives in Nassau.");
		else
			System.out.println(theContact.getFirstName() + ", " + theContact.getMobilePhoneNumber() + 
					", does not live in Nassau.");

		if (newContact.livesInNassau() == true)
			System.out.println(newContact.getFirstName() + ", " + newContact.getMobilePhoneNumber() + 
					", lives in Nassau.");
		else
			System.out.println(newContact.getFirstName() + ", " + newContact.getMobilePhoneNumber() + 
					", does not live in Nassau.");
		
		//check calculateAge method
		String todayDate = "03/26/2025";
		
		int ageNewContact = newContact.calculateAge(todayDate);
		int ageThirdContact = thirdContact.calculateAge(todayDate);
		
		System.out.println(newContact.getFirstName() + " " + newContact.getLastName() + " " + newContact.getBirthDate() + " is " + ageNewContact + " years old");
		System.out.println(thirdContact.getFirstName() + " " + thirdContact.getLastName() + " " + thirdContact.getBirthDate() + " is " + ageThirdContact + " years old");



	}

}

package lab7;

/**
 * <p>Title:   </p> Lab 7 Contact class
 * <p>Description:  </p>  define instance variables for a single 
 * contact in a cell phone contact list including
 * the person's first and last names, mobile phone number and date of birth. 
 * @author Olena Fedochynska, Tanisha T.
 *
 */
public class Contact {
	private String firstName;
	private String lastName;
	private String mobilePhoneNumber;
	private String birthDate;

	/**
	 * default constructor
	 * sets each instance variable to an initial value of 0
	 */
	public Contact()
	{
		firstName = "None";
		lastName = "None";
		mobilePhoneNumber = "516-555-5555";
		birthDate = "01/01/2000";
	}

	/**
	 * parameterized constructor
	 * sets the instance variables
	 * @param personFirstName
	 * @param personLastName
	 * @param personMobilePhoneNumber
	 * @param personBirthDate
	 */
	public Contact (String personFirstName, String personLastName, String  personMobilePhoneNumber, String personBirthDate)
	{
		firstName = personFirstName;
		lastName = personLastName;
		mobilePhoneNumber = personMobilePhoneNumber;
		birthDate = personBirthDate;
	}

	/**
	 * accessor method
	 * this method returns the value stored in the instance variable
	 * @return String
	 */

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getMobilePhoneNumber()
	{
		return mobilePhoneNumber;
	}

	public String getBirthDate()
	{
		return birthDate;
	}

	/**
	 * mutator method 
	 * this method sets the instance variable 
	 * @param String
	 */
	public void setFirstName(String personFirstName)
	{
		firstName = personFirstName;
	}

	public void setLastName(String personLastName)
	{
		lastName = personLastName;
	}

	public void setMobilePhoneNumber(String personMobilePhoneNumber)
	{
		mobilePhoneNumber = personMobilePhoneNumber;
	}

	public void setBirthDate(String personBirthDate)
	{
		birthDate = personBirthDate;
	}
	/**
	 * equals method
	 * @return Boolean
	 */


	public boolean equals(Contact otherContact)
	{
		if (this.firstName.equals(otherContact.firstName) && (this.lastName.equals(otherContact.lastName)))
			return true;
		else
			return false;
	}

	/**
	 * livesInNassau method
	 * @return Boolean
	 */

	public boolean livesInNassau()
	{
		int dashLocation = mobilePhoneNumber.indexOf("-");
		String areaCode = mobilePhoneNumber.substring(0, dashLocation);
		if (areaCode.equals("516"))
			return true;
		else
			return false;

	}

	/**
	 * calculateAge
	 * @return Int age
	 */

	public int calculateAge (String todayDate)
	{
		//create variables to separate month, day, and year
		int numCharact = todayDate.length();
		int tSlashLocation = todayDate.indexOf("/");
		int t2SlashLocation = todayDate.lastIndexOf("/");
		
		int slashLocation = birthDate.indexOf("/");
		int sSlashLocation = birthDate.lastIndexOf("/");
		
		//check correct format
		if((numCharact != 10) && (tSlashLocation != 2) && (t2SlashLocation != 5))
			return -1;
		
		//separate month, day, and year
		int todayDay = Integer.parseInt(todayDate.substring(tSlashLocation +1, t2SlashLocation));
		int todayMonth = Integer.parseInt(todayDate.substring(0, tSlashLocation));
		int todayYear = Integer.parseInt(todayDate.substring(t2SlashLocation + 1));
		
		int birthDay = Integer.parseInt(birthDate.substring(slashLocation + 1, sSlashLocation));
		int birthMonth = Integer.parseInt(birthDate.substring(0, slashLocation));
		int birthYear = Integer.parseInt(birthDate.substring(sSlashLocation + 1));
		//create variable age for further calculation
		int age;
		
		//compare months to check if person already had birthday this year or not
		if (todayMonth > birthMonth)
			age = todayYear - birthYear;
		else if (todayMonth < birthMonth)
			age = todayYear - birthYear - 1;
		else
			//if months the same compare days  to check if person already had birthday this year or not
			if (todayDay >= birthDay)
				age = todayYear - birthYear;
			else
				age = todayYear - birthYear - 1;
		
		
		return age;
	}


	/**
	 * toString method
	 * creates & returns a String with the values of the contact
	 * @return the state of the object
	 */

	public String toString()
	{
		String str = new String(lastName + ", " + firstName + 
				"\n" + mobilePhoneNumber + 
				"\n" + birthDate );
		return str;
	}

}

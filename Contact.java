package lab7;

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
		if (areaCode == "516")
			return true;
		else
			return false;
					
	}
	
	/**
	 * calculateAge
	 * @return String
	 */
	
	public String calculateAge (String todayDate)
	{
		int secondSlashLocation = birthDate.lastIndexOf("/");
		String yearOfBirth = birthDate.substring(slashLocation + 1);
		
		int todaySecondSlashLocation = todayDate.lastIndexOf("/");
		String year = todayDate.substring(slashLocation + 1);
		
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

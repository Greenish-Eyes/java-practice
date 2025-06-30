package lab4;

/**
 * <p>Title: Table Class</p>
 * <p>Description: This class defines a table object by specifying the
 * number of guests at the table, the server's name and table's bill and
 * tip left.  It can calculate the bill, tip and total owed.</p>
 * @author CSC 120 Instructor
 */
public class Table {
	// instance variables
	private String server;
	private int numGuests;
	private double billAmt;
	private double tipAmt;
	
	/**
	 * default constructor
	 * sets default values for each of the instance variables
	 */
	public Table()
	{
		server = new String("None assigned");
		numGuests = 0;
		billAmt = 0.0;
		tipAmt = 0.0;
	}
	
	/**
	 * parameterized constructor
	 * sets default values for all the instance variables
	 * except the number of guests
	 * @param nGuests the number of guests at this table
	 */
	public Table(int nGuests)
	{
		server = new String("None assigned");
		numGuests = nGuests;
		billAmt = 0.0;
		tipAmt = 0.0;
	}
	
	/**
	 * setServer method
	 * mutator method that sets the instance variable server to 
	 * the parameter
	 * @param sName - the name of the server
	 */
	public void setServer(String sName)
	{
		server = sName;
	}
	
	/**
	 * getServer method
	 * accessor method that gets the value stored in the 
	 * instance variable server
	 * @return the name of the server
	 */
	public String getServer()
	{
		return server;
	}
	
	/**
	 * setNumGuests method
	 * mutator method that sets the instance variable numGuests to 
	 * the parameter
	 * @param guests - the number of guests at the table
	 */
	public void setNumGuests(int guests)
	{
		numGuests = guests;
	}
	
	/**
	 * getNumGuests method
	 * accessor method that gets the value stored in the 
	 * instance variable numGuests
	 * @return the number of guests at the table
	 */
	public int getNumGuests()
	{
		return numGuests;
	}
	
	/**
	 * calcBill method
	 * multiplies the cost per person by the number of guests
	 * to determine the bill amount
	 * @param costPerPerson the cost of the meal per person
	 */
	public void calcBill(double costPerPerson)
	{
		billAmt =  numGuests * costPerPerson;
	}
	
	/**
	 * calcTip method
	 * multiplies the amount of the bill by the tip percent to
	 * determine the tip amount
	 * @param tipPercent the percent the table wants to leave
	 * as a tip
	 */
	public void calcTip(double tipPercent)
	{
		tipAmt = billAmt * tipPercent/100;
	}
	
	/**
	 * determineTotalOwed method
	 * adds the tip amount to the bill amount to determine the
	 * total amount owed
	 * @return the total amount the table owes
	 */
	public double determineTotalOwed()
	{
		return billAmt + tipAmt;
	}
	
	/**
	 * toString method
	 * creates and returns a String with the values stored in the
	 * instance variables
	 * @return the state of the object
	 */
	public String toString()
	{
		String str = new String(server + " has a table with " + numGuests + " guests.\nThe bill amount is $" + billAmt + " and " + server + " has earned a $" + tipAmt + " tip.");
		return str;
	}
}

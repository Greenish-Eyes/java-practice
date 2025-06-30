package lab4;

import java.util.Random;
/**
 * <p>Title: Restaurant Class</p>
 * <p>Description: This class defines a restaurant object by specifying the
 * restaurant's name, tables and servers.  It can make a reservation, assign
 * a server to a table, determine the the number of guests and calculate
 * the total amount the restaurant has taken in in bills and tips.</p>
 * @author CSC 120 Instructor
 */
public class Restaurant {
	// instance variables
	private String rName;
	private Table[] tables;
	private int numTables;
	private String[] servers;

	/**
	 * Restaurant default constructor
	 * sets the instance variables to their default values
	 */
	public Restaurant()
	{
		rName = new String("No name");
		tables = new Table[10];
		servers = new String[3];
		numTables = 0;
	}

	/**
	 * setRestaurantName method
	 * mutator method that sets the instance variable rName to 
	 * the parameter
	 * @param name - the name of the restaurant
	 */
	public void setRestaurantName(String name)
	{
		rName = name;
	}

	/**
	 * getRestaurantName method
	 * accessor method that gets the value stored in the 
	 * instance variable rName
	 * @return the name of the restaurant
	 */
	public String getRestaurantName()
	{
		return rName;
	}

	/**
	 * determineServers method
	 * specifies the restaurant's servers for the shift
	 */
	public void determineServers()
	{
		servers[0] = new String("Alex");
		servers[1] = new String("Jordan");
		servers[2] = new String("Chris");
	}

	/**
	 * assignServer method
	 * randomly assigns a server from the list of servers
	 * to the current table
	 * @param t the table that needs a server
	 */
	public void assignServer(Table t)
	{
		Random generator = new Random();
		t.setServer(servers[generator.nextInt(3)]);
	}


	/**
	 * makeReservation method
	 * creates a new table based upon the number of people and
	 * updates the number of full tables
	 * @param numPeople the number of people at the table
	 * @return a reference to the Table object
	 */
	public Table makeReservation(int numPeople)
	{
		Table tbl = new Table(numPeople);
		if (numTables < tables.length)
		{
			tables[numTables] = tbl;
			numTables++;
		}
		return tbl;
	}

	/**
	 * calcTotalGuests method
	 * totals the number of guests at each table
	 * @return the total number of guests
	 */
	public int calcTotalGuests()
	{
		int guests = 0;
		for (int i=0; i<numTables; i++)
			guests = guests + tables[i].getNumGuests();
		return guests;
	}

	/**
	 * calcTotalCollected method
	 * totals the amount of money collected at each table
	 * @return the total amount the restaurant has collected
	 */
	public double calcTotalCollected()
	{
		double total = 0;
		for (int i=0; i<numTables; i++)
			total = total + tables[i].determineTotalOwed();
		return total;
	}

	/**
	 * toString method
	 * creates and returns a String with the values stored in the
	 * instance variables
	 * @return the state of the object
	 */
	public String toString()
	{
		String str = new String(rName);
		for (int i=0; i<numTables; i++)
			str = str + "\n----------------\n" + tables[i].toString();
		return str;
	}
}

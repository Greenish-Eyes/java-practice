package lab9;

/**
 * <p>Title:CountyShelters Class </p>
 * <p>Description: </p>
 * @author Olena Fedochynska, Tanisha T.
 */
public class CountyShelters {
	private Shelter[] places;
	private int numShelters;

	/**
	 * default constructor
	 * creates an array of size 10 and initializes the
	 * number of shelters in the county to 0
	 */
	public CountyShelters()
	{
		places = new Shelter[10];
		numShelters = 0;
	}

	/**
	 * insertShelter method
	 * stores the shelter passed to the method in the
	 * next available location in the array and increments
	 * the number of shelters by 1
	 * @param sh the shelter to be placed in the array
	 */
	public void insertShelter(Shelter sh)
	{
		if (numShelters < places.length) {
			places[numShelters] = sh;
			numShelters++;
		}
	}

	/**
	 * calcTotalBedsAvailable method
	 * calculates and returns the number of beds available across
	 * all shelters in the county
	 * @return the number of beds available
	 */

	public int calcTotalBedsAvailable()
	{
		int beds = 0;
		for (int i = 0; i < numShelters; i++)
			beds = beds + places [i].determineBedsAvailable();
		return beds;
	}


	/**
	 * allFull method
	 * calls the calcTotalBedsAvailable method and if the number
	 * of beds available is 0 it returns true (all shelters are
	 * full) otherwise returns false
	 * @return true if all beds are full, false otherwise
	 */

	public boolean allFull()
	{
		if (this.calcTotalBedsAvailable() == 0)
			return true;
		else
			return false;
	}


	/**
	 * determineShelterMostAvailIndex method
	 * cycles through the Shelters to determine which has the most
	 * beds currently available
	 * @return the index of the Shelter with the most beds
	 */
	public int determineShelterMostAvailIndex()
	{
		int mostAvailable = places [0].determineBedsAvailable();
		int indexMostAvl = 0;
		for (int i = 1; i < numShelters; i++)
			if (places [i].determineBedsAvailable() > mostAvailable)
			{
				mostAvailable = places [i].determineBedsAvailable();
				indexMostAvl = i;
			}
		return indexMostAvl;

	}



	/**
	 * determineShelter method
	 * checks to make sure that the index is valid (ie. is between 0 and
	 * numShelters-1) if so, returns a reference to the shelter object at the given index
	 * otherwise returns null (meaning it is an invalid index and no Shelter exists there)
	 * @param index the location of the Shelter to return
	 * @return a reference to the Shelter at that index or null if it is an invalid index
	 */

	public String determineShelter(int indexMostAvl)
	{
		if ((indexMostAvl > 0) && (indexMostAvl < ( numShelters-1) ))
		{
			return (places[indexMostAvl].toString());
		}
		else
			return "Null";
	}


	/**
	 * registerGuests method
	 * this method makes sure the county has enough beds available to register
	 * all of the guests - if not, return false
	 * if there are enough beds available in the county, check which shelter has the most
	 * beds available and register as many guests as possible there - if it did
	 * not have enough beds available to accommodate all the guests, repeat the process
	 * of finding the shelter with the most available beds and registering as
	 * many guests as possible there until all guests have been registered and then
	 * return true
	 * @param numGuests the total number of guests to be registered
	 * @return true if all the guests could be registered, false if they could not
	 */

	public boolean registerGuests (int numGuests )
	{

		if (numGuests < this.calcTotalBedsAvailable())
		{
			this.determineShelter(this.determineShelterMostAvailIndex());
			int availBeds = places [this.determineShelterMostAvailIndex()].determineBedsAvailable();
			if (numGuests > availBeds)
			{
				for (int i = 0; i < numGuests; i++)
				{
					places [this.determineShelterMostAvailIndex()].registerGuests(availBeds);
					numGuests = numGuests - availBeds;

					this.determineShelter(this.determineShelterMostAvailIndex());
					availBeds = places [this.determineShelterMostAvailIndex()].determineBedsAvailable();
				}

			}
			else
				availBeds = availBeds - numGuests;
			places [this.determineShelterMostAvailIndex()].registerGuests(numGuests);
			return true;
		}
		else
			return false;
	}


	/**
	 * toString method
	 * concatenates the information about each shelter into a String
	 * each shelter should be preceded by the word "Shelter" and a number
	 * (ie. Shelter 1:, Shelter 2:, etc.)
	 * @return a reference to a String that contains the state of the object 
	 */

	public String toString()
	{
		String str = new String();
		for (int i = 0; i < numShelters; i++)
			str = str + "Shelter " + (i+1) + ": " + places[i].toString() + "\n";
		return str;
	}

}
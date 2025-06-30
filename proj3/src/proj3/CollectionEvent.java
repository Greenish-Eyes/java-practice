package proj3;
/**
 * <p>Title: Project 3. A scheduling Collection Event Class </p>
 * <p>Description: The app will let the volunteer know whether 
 * they have been scheduled to work on an upcoming collection day
 </p>
 * @author Olena Fedochynska
 */
public class CollectionEvent {
	private char dayWeek;
	private int startTime;
	private int endTime;
	private int numVolunteers;
	
	
	/**
	 * parameterized constructor
	 * sets the instance variables for shelter name and number of beds
	 * to the parameters, the other instance variable is given a default value
	 * @param dayWeek the a single letter representing the day 
	 * of the week (MTWRFSU)
	 * @param startTime the time the food collection event begins; 
	 * this will be in military time.
	 * @param endTime the time the food collection event ends; this will 
	 * also be in military time.
	 */
	public CollectionEvent (char day, int start, int end)
	{
		dayWeek = day;
		startTime = start;
		endTime = end;
		numVolunteers = 0;
	}
	/**
	 * accessor method for the start time 
	 * this method returns the value stored in the instance variable
	 * getStartTime
	 * @return the start time
	 */
	public int getStartTime()
	{
		return startTime;
	}
	/**
	 * accessor method for the end time 
	 * this method returns the value stored in the instance variable
	 * getEndTime
	 * @return the end time
	 */
	public int getEndTime()
	{
		return endTime;
	}
	/**
	 * sameDay method
	 * accepts a character representing the 
	 * day of the week a volunteer is available
	 * @param char volAvailable character of the day of the week
	 * @return true if the day the volunteer is available 
	 * is the same as the day of the event; 
	 * otherwise, it should return false 
	 */
	public boolean sameDay (char volAvailable)
	{
		return (dayWeek == volAvailable);
	}
	/**
	 * scheduleVolunteer method
	 * that accepts the start time and the end time 
	 * the volunteer is available
	 * @param int volStart the start time the volunteer is available;
	 * @param int volEnd the end time the volunteer is available;
	 * @return true indicating the volunteer has been scheduled; 
	 * otherwise, it should return false. 
	 */
	public boolean scheduleVolunteer (int volStart, int volEnd)
	{
		if ((startTime >= volStart) && (endTime <= volEnd))
		{
			numVolunteers++;
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	/**
	 * toString method
	 * this method creates and returns a reference to 
	 * a String object with the state of the object
	 * @return the values stored in the instance variables
	 */
	public String toString()
	{
		String str = new String("Collection day:\n"
				+ "Collection occurs on: " + dayWeek + "\n"
				+ "Start time: " + startTime + "\n"
				+ "End time: " + endTime +"\n"
				+ "Number of volunteers: " + numVolunteers);
		return str;
	}

}

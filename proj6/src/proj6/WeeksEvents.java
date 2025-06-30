package proj6;
/**
 * WeeksEvents
 * Manages a week's worth of food collection events and volunteer scheduling.
 * @author Olena Fedochynska
 */
public class WeeksEvents {
	private CollectionEvent[] events;
	private int numEvents;

	/**
	 * Default constructor
	 * Initializes the events array and sets number of scheduled events to 0.
	 */
	public WeeksEvents() 
	{
		events = new CollectionEvent[15];
		numEvents = 0;
	}

	/**
	 * insertEvent method
	 * Inserts a new event if there is space available.
	 * @param e the CollectionEvent to be added
	 */
	public void insertEvent(CollectionEvent event) 
	{
		if (numEvents < events.length) 
		{
			events[numEvents] = event;
			numEvents++;
		}
	}

	/**
	 * scheduleVolunteer method
	 * Attempts to schedule a volunteer based on day and full availability.
	 * Finds and schedules the first matching event that still needs volunteers.
	 * @param day the day the volunteer is available
	 * @param start the time the volunteer can start
	 * @param end the time the volunteer can work until
	 * @return the scheduled CollectionEvent or null if none found
	 */
	public CollectionEvent scheduleVolunteer(char day, int start, int end) {
		for (int i = 0; i < numEvents; i++) {
			CollectionEvent event = events[i];
			if (event.sameAs(day) && event.determineVolunteersNeeded() > 0) {
				boolean scheduled = event.scheduleVolunteer(start, end);
				if (scheduled) {
					return event;
				}
			}
		}
		return null;
	}

	/**
	 * needsMoreVolunteers method
	 * Checks whether any event still needs volunteers.
	 * @return true if at least one event needs more volunteers, false otherwise
	 */
	public boolean needsMoreVolunteers() 
	{
		for (int i = 0; i < numEvents; i++) 
		{
			if (events[i].determineVolunteersNeeded() > 0)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * totalVolunteersNeeded method
	 * Calculates the total number of volunteers still needed for the week.
	 * @return the number of volunteer spots remaining
	 */
	public int totalVolunteersNeeded() 
	{
		int total = 0;
		for (int i = 0; i < numEvents; i++) {
			total += events[i].determineVolunteersNeeded();
		}
		return total;
	}

	/**
	 * toString method
	 * Returns a string containing the state of all events for the week.
	 * @return formatted string listing each CollectionEvent
	 */
	public String toString() 
	{
		String str = "";
		for (int i = 0; i < numEvents; i++) 
		{
			str = str +(events[i].toString())+ "\n";
		}
		return str;

	}


}

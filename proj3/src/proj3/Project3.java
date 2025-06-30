package proj3;
import java.util.Scanner;
/**
 * <p>Title: Project 3. A scheduling App </p>
 * <p>Description: The App will let the volunteer know whether 
 * they have been scheduled to work on an upcoming collection day
 </p>
 * @author Olena Fedochynska
 */
public class Project3 {
	public static void main(String[] args) {
		// declares and instantiates a CollectionEvent object
		CollectionEvent event = new CollectionEvent('S', 900, 1400);
		
		Scanner scnr = new Scanner (System.in);
		
		//ask volunteer for available day
		System.out.print("Enter the day you are available (M, T, W, R, F, S, U): ");
		char volAvailable = scnr.next().charAt(0);
		
		// check if in volunteer's available day there is event
		boolean dayAvailable = event.sameDay(volAvailable);
		
		if (dayAvailable == true)
		{
			//Ask for time
			System.out.print("Enter your available start time (military format): ");
			int volStart = scnr.nextInt();
			
			System.out.print("Enter your available end time (military format): ");
			int endStart = scnr.nextInt();
			
			//check volunteer's time equal event time
			boolean timeAvailable = event.scheduleVolunteer(volStart, endStart);
			
			if (timeAvailable == true)
			{
				System.out.println("Thank you! You are scheduled to volunteer on \n\n" + event.toString()); 
			}
			else
			{
				System.out.println("Sorry, we do not need volunteers at those times.\n\n" + event.toString());
			}
		}
		else
		{
			System.out.println("Sorry, this is not an available collection day.\n\n" + event.toString());
		}
		scnr.close();
		
		/*
		 * Testing:
		 * 1. Input: 'T' → Expected: 
		 * Sorry, this is not an available collection day.
		 * 
		 * Collection day:
		 * Collection occurs on: S
		 * Start time: 900
		 * End time: 1400
		 * Number of volunteers: 0
		 * 
		 * 2. Input: 'S', 0800, 1100 → Expected: "
		 *Sorry, we do not need volunteers at those times.
		 *
		 *Collection day:
		 *Collection occurs on: S
		 *Start time: 900
		 *End time: 1400
		 *Number of volunteers: 0
		 *
		 * 3. Input: 'S', 0900, 1400 → Expected: 
		 * Thank you! You are scheduled.
		 * 
		 * Collection day:
		 * Collection occurs on: S
		 * Start time: 900
		 * End time: 1400
		 * Number of volunteers: 1
		 */

	}
}

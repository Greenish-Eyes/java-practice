package proj6;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * Project6
 * Reads collection event data from a file and interacts with volunteers to schedule them.
 * Displays results when done.
 * @author Olena Fedochynska
 */
public class Project6 {


	public static void main(String[] args) throws IOException {
		char day;
		int start;
		int end;
		WeeksEvents week = new WeeksEvents();
		Scanner fileScan = new Scanner(new File("events.txt"));
		while (fileScan.hasNext()) 
		{
			day = fileScan.next().charAt(0);
			start = fileScan.nextInt();
			end = fileScan.nextInt();
			CollectionEvent event = new CollectionEvent(day, start, end);
			week.insertEvent(event);
		}
		fileScan.close();
		System.out.println(week);

		Scanner scnr = new Scanner(System.in);
		boolean haveVolunteer;
		System.out.print("Do you have more volunteers to register? (Y/N) ");
		char needRegister = scnr.next().toUpperCase().charAt(0);
		
		if ((needRegister != 'Y') && (needRegister != 'N'))
		{
			System.out.print("Wrong format! Try again!\nDo you have more volunteers to register? (Y/N) ");
			needRegister = scnr.next().toUpperCase().charAt(0);
		}
		if (needRegister == 'Y')
			haveVolunteer = true;

		else
			haveVolunteer = false;
		

		while((week.needsMoreVolunteers() == true) && (haveVolunteer == true))
		{
			//ask volunteer for available day		
			System.out.print("Enter the day you are available (M, T, W, R, F, S, U): ");
			char volAvailable = scnr.next().toUpperCase().charAt(0);
			if ((volAvailable != 'M') && (volAvailable != 'T') && (volAvailable != 'W') && (volAvailable != 'R') && (volAvailable != 'F') && (volAvailable != 'S') && (volAvailable != 'U'))
			{
				System.out.print("Wrong format! Try again!\nEnter the day you are available (M, T, W, R, F, S, U): ");
				volAvailable = scnr.next().toUpperCase().charAt(0);
			}
			//Ask for time
			System.out.print("Enter your available start time (military format): ");
			int volStart = scnr.nextInt();
			if ((volStart < 0)|| (volStart > 2359))
			{
				System.out.print("Wrong format! Try again!\nEnter your available start time (military format): ");
				volStart = scnr.nextInt();
			}

			System.out.print("Enter your available end time (military format): ");
			int volEnd = scnr.nextInt();
			if ((volEnd < 0)|| (volEnd > 2359))
			{
				System.out.print("Wrong format! Try again!\nEnter your available end time (military format): ");
				volEnd = scnr.nextInt();
			}


			// check if in volunteer's available day there is event
			CollectionEvent scheduledEvent = week.scheduleVolunteer(volAvailable, volStart, volEnd);


			if (scheduledEvent != null)
				System.out.println("You are scheduled for event: \n" + scheduledEvent);
			else
				System.out.println("There are no events for that match your availability!");
			
			System.out.print("Do you have more volunteers to register? (Y/N) ");
			needRegister = scnr.next().toUpperCase().charAt(0);
			if ((needRegister != 'Y') && (needRegister != 'N'))
			{
				System.out.print("Wrong format! Try again!\nDo you have more volunteers to register? (Y/N) ");
				needRegister = scnr.next().toUpperCase().charAt(0);
			}
			if (needRegister == 'Y')
				haveVolunteer = true;

			else
				haveVolunteer = false;

		}
		scnr.close();
		System.out.println("\nWeek event summary: \n" + week);
		System.out.println("Total volunteers still needed: " + week.totalVolunteersNeeded());



	}

}

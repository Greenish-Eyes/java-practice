package lab4;

import java.util.Scanner;

/**
 * <p>Title: Lab 4 - Restaurant Program </p>
 * <p>Description: This program creates a Restaurant object, adds 3 Tables to the
 * Restaurant and displays information about the state of the Restaurant. </p>
 * @author CSC 120 Instructor
 */
public class Lab4App {
	public static void main(String[] args)
	{
		Restaurant myFavoritePlace = new Table();		
		myFavoritePlace.setRestaurantName("Best Food Ever");
		myFavoritePlace.determineServers();
		
		Restaurant table1 = myFavoritePlace.makeReservation(6);
		table1.assignServer();
		
		table1.calcBill(25.00);
		table1.calcTip(15.0);
		
		System.out.println(myFavoritePlace.toString());
		
				
	}
}

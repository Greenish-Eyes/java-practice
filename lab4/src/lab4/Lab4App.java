package lab4;
import java.util.Scanner;
/**
* <p>Title: Lab 4 - Restaurant Program </p>
* <p>Description: This program creates a Restaurant object, adds 3 Tables to the
* Restaurant and displays information about the state of the Restaurant. </p>
* @author John & Olena
*/
public class Lab4App {
	public static void main(String[] args)
	{
		// changed data type to Restaurant
		Restaurant myFavoritePlace = new Restaurant();		
		myFavoritePlace.setRestaurantName("Best Food Ever");
		myFavoritePlace.determineServers();
		
		//changed date type to Table
		Table table1 = myFavoritePlace.makeReservation(6);
		myFavoritePlace.assignServer(table1);
		
		table1.calcBill(25.00);
		table1.calcTip(15.0);
		
		double billTotal = table1.determineTotalOwed();
		System.out.println(myFavoritePlace.toString());
		System.out.println("\nTable 1's bill total is $" + billTotal);
		System.out.println("\nAfter a second table has been reserved");
		
		Table table2 = myFavoritePlace.makeReservation(4);
		myFavoritePlace.assignServer(table2);
		
		table2.calcBill(40.00);
		table2.calcTip(20.00);
		
		billTotal = table2.determineTotalOwed();
		System.out.println(myFavoritePlace.toString());
		System.out.println("\nTable 2's bill total is $" + billTotal +"\n");
		
		
		
		
		System.out.println("\nAfter a third table has been reserved");
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter number of the guests: ");
		int guests = scnr.nextInt();
		Table table3 = myFavoritePlace.makeReservation(guests);
		myFavoritePlace.assignServer(table3);
		
		System.out.println("Enter the cost per guest: ");
		double cost = scnr.nextDouble();
		table3.calcBill(cost);
		
		System.out.println("Enter the tips: ");
		double tips = scnr.nextDouble();
		table3.calcTip(tips);
	
		
		billTotal = table3.determineTotalOwed();
		System.out.println(myFavoritePlace.toString());
		System.out.println("\nTable 3's bill total is $" + billTotal +"\n");
		
		int numGuests = myFavoritePlace.calcTotalGuests();
		System.out.println("The restaurant has " +numGuests + " guests.");
		
		double totalAmount = myFavoritePlace.calcTotalCollected();
		System.out.println("The restaurant has collected $" + totalAmount + " today.");
	
		
		
		
		
				
	}
}


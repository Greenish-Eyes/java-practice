package lab1Debug;
import java.util.Scanner;
/**
 * <p>Title: Store Receipt</p>
 * <p>Description: This program prompts the user to enter the item price and the tax rate.  
 * It calculates the amount owed and displays a receipt.</p>
 * @author Olena Fedochynska
 */
public class Lab1PracticeApp {
	public static void main(String[] args) {
		double price;
		double taxRate;
		int quantity;
		double subtotal;
		double taxOwed;
		double total;

		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter the item price: ");
		price = scnr.nextDouble();
		System.out.print("Please enter the tax rate: ");
		taxRate = scnr.nextDouble();

		quantity = 2;
		subtotal = price * quantity;
		taxOwed = subtotal * taxRate / 100;
		total = subtotal + taxOwed;	

		System.out.println("Price:   $" + price);
		System.out.println("Quantity:"  + quantity);
		System.out.println("Subtotal:   $" + subtotal);
		System.out.println("Tax Rate: " + taxRate + "%");
		System.out.println("Tax:   $" + taxOwed);
		System.out.println("Total:   $" + total);
		scnr.close();

	}
}
package lab3;
/**
 * <p>Title: Lab 3 Program </p>
 * <p>Description: For this program we trim strings, we check for words in a sentence and their index, 
 * then we compare between 2 strings and see if they are the same or not.
 * After that we compare the 2 strings using the ASCII Table to see the difference in characters and display in the output
 * the difference.
 * We then  </p>
 *
 * @author Benjamin Kapp, Olena Fedochynsha
 */
public class Lab3App {
	public static void main(String[] args)
	{
		String item1 = new String("    water  ");
		String item2 = new String("pasta");
		String item3 = new String("Pasta");
		String item4 = new String("milk");
		String item5 = new String("chocolate chip cookies and milk");

		String item6 = "Apple";
		String item7 = "Apple";
		String item8 = new String("Apple");
		String item9 = new String("Apples");
		String item10 = new String("Applc");
		String item11 = new String("Appld");

		// place #3 statement here
		String item1T = item1.trim();
	

		System.out.println("Before trim: " + item1 + "*\nAfter trim: " + item1T + "*");

		// place #5 statement here
		int position = item5.indexOf(item4);

		System.out.println("\nThe result of checking the indexOf " + item4 + " in " + item5 + " is " + position);

		// place #7 statement here
		position = item5.indexOf(item2);

		System.out.println("The result of checking the indexOf " + item2 + " in " + item5 + " is " + position);

		// place #8 statement here
		boolean result = item5.contains(item4);

		System.out.println("\nThe result of checking if " + item5 + " contains " + item4 + " is " + result);

		// place #10 statement here
		result = item5.contains(item2);

		System.out.println("The result of checking if " + item5 + " contains " + item2 + " is " + result);

		// place #11 statement here
		result = item5.startsWith("choco");
		
		
		System.out.println("\nThe result of checking if " + item5 + " starts with choco is " + result);

		// place #12 statement here
		result = item5.startsWith("Choco");

		System.out.println("The result of checking if " + item5 + " starts with Choco is " + result + "\n");

		// #14 - uncomment the two if/else statements below
		
		if (item6 == item7)
		{
			System.out.println(item6 + " and " + item7 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item7 + " are NOT the same");
		}

		if (item6 == item8)
		{
			System.out.println(item6 + " and " + item8 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item8 + " are NOT the same");
		}
		System.out.println();
		 

		// #15 - uncomment the two if/else statements below
		
		if (item6.equals(item7))  
		{
			System.out.println(item6 + " and " + item7 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item7 + " are NOT the same");
		}

		
		if (item6.equals(item8))
		{
			System.out.println(item6 + " and " + item8 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item8 + " are NOT the same");
		}
		System.out.println();
		 



		// place #16 statement here
		int num;
		num = item8.compareTo(item7);

		System.out.println("The result of comparing " + item8 + " to " + item7 + " is " + num);	

		// place #17 statement here
		num = item8.compareTo(item9);

		System.out.println("The result of comparing " + item8 + " to " + item9 + " is " + num);		

		// place #18 statement here
		num = item8.compareTo(item10);

		System.out.println("The result of comparing " + item8 + " to " + item10 + " is " + num);	

		// place #19 here
		num = item8.compareTo(item11);

		System.out.println("The result of comparing " + item8 + " to " + item11 + " is " + num);

		// place #20 here
		num = item11.compareTo(item8);

		System.out.println("The result of comparing " + item11 + " to " + item8 + " is " + num);

		// place #21 statement here
		num = item2.compareTo(item4);
		System.out.println("The result of comparing " + item2 + " to " + item4 + " is " + num);	

		// place #22 statement here
		num = item2.compareTo(item3);
		System.out.println("The result of comparing " + item2 + " to " + item3 + " is " + num);		

		// place #23 statement here
		num = item3.compareTo(item4);
		System.out.println("The result of comparing " + item3 + " to " + item4 + " is " + num);	


	}
}
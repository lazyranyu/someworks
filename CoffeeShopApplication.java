import  java.io.*;
import  java.util.*;

public class CoffeeShopApplication{

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	private CoffeeShop coffeeShop;

	private static final int MIN_NUMBER = 0;
	
	private static final int MAX_NUMBER = 50;

	private static final double MIN_COST = 2.0;
	
	private static final double MAX_COST = 50.0;

	public static void main(String[]  args) throws IOException  {

		CoffeeShopApplication application = new  CoffeeShopApplication();

		application.run();
	}

	private void run() throws IOException  {

		coffeeShop = new  CoffeeShop();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {

				coffeeShop.addCoffee(readCoffee());
			} else if (choice == 2)  {

				stdOut.println(coffeeShop.toString());
			} else if (choice == 3)  {

				stdOut.println("Total Cost: " + coffeeShop.getTotalCost());
			}

			choice = getChoice();
		}
	}

	private int  getChoice() throws IOException  {

		/* PLACE YOUR CODE HERE */

		return 0; //you need to change it.
	}

	private Coffee readCoffee() throws IOException {

		
		/* PLACE YOUR CODE HERE */
		return null; //you need to change it.
	}
}
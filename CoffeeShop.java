import java.io.PrintStream;
import java.util.*;

public class CoffeeShop {

	private ArrayList<Coffee> cart;

	public CoffeeShop() {

		this.cart = new ArrayList<Coffee>();
	}

	public String toString() {

		if (this.cart.size() == 0){
			return "empty";
                   }
		
                   Iterator<Coffee>  iterator = this.cart.iterator();
		StringBuffer stringbuffer = new StringBuffer(iterator.next().toString());
		
                  for (; iterator.hasNext(); stringbuffer.append(iterator.next().toString())) {

			stringbuffer.append("\n");
		}
		return stringbuffer.toString();
	}

	public double getTotalCost() {

		double d = 0.0D;
		if (this.cart.size() == 0) {

			System.err.println("There is no coffee in the cart!");
			return 0.0D;
		}
		for (Iterator iterator = this.cart.iterator(); iterator.hasNext();) {

			d += ((Coffee) iterator.next()).getCost();
		}
		return d;
	}

	public void addCoffee(Coffee coffee) {

		this.cart.add(coffee);
	}
}

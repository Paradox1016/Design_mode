package Factory;

//public class NYStyleCheesePizza extends Pizzaa {
//	public NYStyleCheesePizza() {
//		name="NY Style Sauce and Cheese Pizza";
//		dough="Thin Cruse Dough";
//		sauce="Marinara Sauce";
//		
//		toppings.add("Grated Reggiano Cheese");
//	}
//}

//2
public class NYStyleCheesePizza implements Pizza{
@Override
public void make() {
	System.out.println("NYStylrCheesePizza is making...");
 }
}
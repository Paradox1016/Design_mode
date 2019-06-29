package Factory;

/*public class ChicagoStyleCheesePizza extends Pizzaa {
	public ChicagoStyleCheesePizza() {
	name="Chicago Style Deep Dish Cheese Pizza";
	dough="Extra Think Crust Dough";
	sauce="Plum Tomato Sauce";
	toppings.add("Shredded Mozzarella Cheese");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
*/
//2
public class ChicagoStyleCheesePizza implements Pizza{
	@Override
	public void make() {
		System.out.println("ChicagoStyleCheesePizza is making");
	}
}
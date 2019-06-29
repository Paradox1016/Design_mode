package Factory;


//1
public class PizzaStore2 {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        pizza.make();
    }
}

/*public abstract class PizzaStore {
	
	public Pizzaa orderPizza(String type) {
		Pizzaa pizza;
	//	pizza=factory.createPizza(type);
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;	
	}
	protected abstract Pizzaa createPizza(String type);		//把工厂对象移动到这个方法中
}
*/
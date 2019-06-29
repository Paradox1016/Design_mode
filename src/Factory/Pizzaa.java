package Factory;
import java.util.*;
public class Pizzaa {
	String name;
	String dough;
	String sauce;
	ArrayList toppings=new ArrayList();
	
	void prepare() {
		System.out.println("prepering "+name);
		System.out.println("Tossing dough...");
		System.out.println("adding sauce...");
		System.out.println("Adding toppings:");
		for(int i=0;i<toppings.size();i++) {
			System.out.println("  "+toppings.get(i));
		}
	}
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	void bake() {
		// TODO �Զ����ɵķ������
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut() {
		// TODO �Զ����ɵķ������
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public String getName() {
		return name;
	}
	
}

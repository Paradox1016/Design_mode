package Abstract_Factory;

public class NYPizzaStore {
    private PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        ingredientFactory = new NYPizzaIngredientFactory();
    }

    public void makePizza() {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        System.out.println(dough.doughType());
        System.out.println(sauce.sauceType());
    }
}
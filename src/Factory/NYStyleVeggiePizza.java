package Factory;

public class NYStyleVeggiePizza implements Pizza {
    @Override
    public void make() {
        System.out.println("NYStyleVeggiePizza is making..");
    }
}
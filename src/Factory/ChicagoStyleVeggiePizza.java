package Factory;

public class ChicagoStyleVeggiePizza implements Pizza{
    @Override
    public void make() {
        System.out.println("ChicagoStyleVeggiePizza is making..");
    }
}
package decorate;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return 0.05+beverage.cost();
	}
}

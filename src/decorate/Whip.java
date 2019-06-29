package decorate;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return 0.35+beverage.cost();
	}

}

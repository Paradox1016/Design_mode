package decorate;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return 0.2+beverage.cost();
	}

}

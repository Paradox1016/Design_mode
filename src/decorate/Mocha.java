package decorate;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO �Զ����ɵķ������
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO �Զ����ɵķ������
		return 0.2+beverage.cost();
	}

}

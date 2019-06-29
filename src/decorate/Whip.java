package decorate;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO �Զ����ɵķ������
		return beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		// TODO �Զ����ɵķ������
		return 0.35+beverage.cost();
	}

}

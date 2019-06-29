package decorate;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO �Զ����ɵķ������
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		// TODO �Զ����ɵķ������
		return 0.05+beverage.cost();
	}
}

package inin;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
		}
	
	@Override
	public void display() {
		// TODO �Զ����ɵķ������
		System.out.println("This is a Model Duck");
	}

}

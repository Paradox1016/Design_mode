package inin;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
		}
	
	@Override
	public void display() {
		// TODO 自动生成的方法存根
		System.out.println("This is a Model Duck");
	}

}

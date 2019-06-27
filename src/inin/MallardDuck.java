package inin;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings(); 
	}
	
	
	@Override
	public void display() {
		// TODO 自动生成的方法存根
		
		System.out.println("I'm a real Mallard duck");
	}

}

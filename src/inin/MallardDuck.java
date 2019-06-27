package inin;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings(); 
	}
	
	
	@Override
	public void display() {
		// TODO �Զ����ɵķ������
		
		System.out.println("I'm a real Mallard duck");
	}

}

package inin;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Duck mallard=new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}

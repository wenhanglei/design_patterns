package org.wenhanglei.strategy;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("我是一只红头鸭！");
	}

}

package org.wenhanglei.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squack());
	}

	@Override
	public void display() {
		System.out.println("我是一只橡胶鸭！");
	}

}

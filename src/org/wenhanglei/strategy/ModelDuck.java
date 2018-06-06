package org.wenhanglei.strategy;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("我是一只模型鸭子！");
	}

}

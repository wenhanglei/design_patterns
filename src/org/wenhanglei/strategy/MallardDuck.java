package org.wenhanglei.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("我是一只快乐的麻鸭子！");
	}

}

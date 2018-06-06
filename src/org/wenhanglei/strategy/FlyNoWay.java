package org.wenhanglei.strategy;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("我不会飞！");
	}

}

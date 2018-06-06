package org.wenhanglei.strategy;

public class FlyRocketPowered implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("使用火箭驱动飞行！");
	}

}

package org.wenhanglei.strategy;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("使用翅膀飞行！");
	}

}

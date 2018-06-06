package org.wenhanglei.strategy;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("嘎嘎！");
	}

}

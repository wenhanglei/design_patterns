package org.wenhanglei.strategy;

public class FakeQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("珈珈!");
	}

}

package org.wenhanglei.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("沉默，是今晚的康桥！");
	}

}

package org.wenhanglei.strategy;
/** 
 * 抽象鸭子基类
 * @author wenhanglei
 */
public abstract class Duck {
	
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	Duck(){
	}
	
	public void setFlyBehavior(FlyBehaviour fb){
		this.flyBehaviour = fb;
	}
	
	public void setQuackBehavior(QuackBehaviour qb){
		this.quackBehaviour = qb;
	}
	
	/**
	 * 让鸭子飞行
	 */
	public void performFly(){
		flyBehaviour.fly();
	}
	
	/**
	 * 发出鸭子叫声
	 */
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	/**
	 * 显示鸭子
	 */
	public abstract void display();
	
	/**
	 * 游泳(所有子类都有的方法)
	 */
	public void swim(){
		System.out.println("所有的鸭子都能游泳！");
	}

}

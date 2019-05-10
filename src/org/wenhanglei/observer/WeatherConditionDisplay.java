package org.wenhanglei.observer;

/**
 * @Author: wenhanglei
 * @Date: 2019/5/10
 * @Time: 14:59
 * @Info:
 */
public class WeatherConditionDisplay implements Observer {

    private Subject subject;

    WeatherConditionDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void unregister(){
        subject.removeObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("*****************************");
        System.out.println("当前的温度：" + temperature);
        System.out.println("当前的湿度：" + humidity);
        System.out.println("当前的气压：" + pressure);
        System.out.println("*****************************");
    }
}

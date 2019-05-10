package org.wenhanglei.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: wenhanglei
 * @Date: 2019/5/8
 * @Time: 14:58
 * @Info:
 */
public class WeatherData implements Subject{

    private List<Observer> list = null;
    private int temperature = 0;
    private int humidity = 0;
    private int pressure = 0;

    WeatherData(){
        list = new LinkedList<>();
    }

    public int getHumidity(){
        return this.humidity;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public int getPressure(){
        return this.pressure;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setHumidity(int humidity){
        this.humidity = humidity;
        measurementsChanged();
    }

    public void setPressure(int pressure){
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++){
            list.get(i).update(getTemperature(), getHumidity(), getPressure());
        }
    }
}

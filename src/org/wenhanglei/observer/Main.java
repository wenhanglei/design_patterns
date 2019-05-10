package org.wenhanglei.observer;

/**
 * @Author: wenhanglei
 * @Date: 2019/5/10
 * @Time: 15:26
 * @Info:
 */
public class Main {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        WeatherConditionDisplay weatherConditionDisplay = new WeatherConditionDisplay(weatherData);

        weatherData.setTemperature(35);
        weatherData.setHumidity(20);
        weatherData.setPressure(100);
    }

}

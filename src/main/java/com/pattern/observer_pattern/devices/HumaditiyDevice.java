package com.pattern.observer_pattern.devices;

import com.pattern.observer_pattern.Data.WeatherData;
import com.pattern.observer_pattern.interfaces.DisplayElement;
import com.pattern.observer_pattern.interfaces.Observer;

public class HumaditiyDevice implements Observer, DisplayElement {
    private float humidity;
    
    public HumaditiyDevice(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("*--- Humidity Device Record ---*");
        if (humidity < 30) {
            System.out.println(humidity + " Humidity is so low");
        } else if (humidity < 80) {
            System.out.println(humidity + " Humidity is high");
        } else if (humidity > 80) {
            System.out.println(humidity + " Humidity is too high");
        }
    }

    @Override
    public void update(float humidity) {
        this.humidity = humidity;
        display();
    }
}
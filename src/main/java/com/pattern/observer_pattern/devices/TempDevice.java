package com.pattern.observer_pattern.devices;

import com.pattern.observer_pattern.Data.WeatherData;
import com.pattern.observer_pattern.interfaces.DisplayElement;
import com.pattern.observer_pattern.interfaces.Observer;

public class TempDevice implements Observer, DisplayElement{
    private float temperature;
    
    public TempDevice(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("*--- temperature Device Record ---*");
        if (temperature < 10) {
            System.out.println(temperature + " degree temperature is so low");
        } else if (temperature < 30) {
            System.out.println(temperature + " degree temperature is high");
        } else if (temperature > 40) {
            System.out.println(temperature + " degree temperature is too high");
        }
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }  
}

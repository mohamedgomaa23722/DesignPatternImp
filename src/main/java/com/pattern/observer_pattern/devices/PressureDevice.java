package com.pattern.observer_pattern.devices;

import com.pattern.observer_pattern.Data.WeatherData;
import com.pattern.observer_pattern.interfaces.DisplayElement;
import com.pattern.observer_pattern.interfaces.Observer;

public class PressureDevice implements Observer, DisplayElement {
    private float pressure;

    public PressureDevice(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("*--- Pressure Device Record ---*");
        if (pressure < 30) {
            System.out.println(pressure + "% pressure is so low");
        } else if (pressure < 80) {
            System.out.println(pressure + "% pressure is high");
        } else if (pressure > 80) {
            System.out.println(pressure + "% pressure is too high");
        }
    }

    @Override
    public void update(float pressure) {
        this.pressure = pressure;
        display();
    }
}

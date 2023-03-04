package com.pattern.observer_pattern;

import java.util.Random;

import com.pattern.observer_pattern.Data.WeatherData;
import com.pattern.observer_pattern.devices.HumaditiyDevice;
import com.pattern.observer_pattern.devices.PressureDevice;
import com.pattern.observer_pattern.devices.TempDevice;

public class WeatherStation {
    public WeatherStation() {
        WeatherData tempData = new WeatherData();
        WeatherData pressureData = new WeatherData();
        WeatherData hData = new WeatherData();

        // First Observer
        new TempDevice(tempData);
        new PressureDevice(pressureData);
        new HumaditiyDevice(hData);

        new Thread(() -> {
            while (true) {
                tempData.setMeasurements(new Random().nextFloat(70f));
                pressureData.setMeasurements(new Random().nextFloat(100f));
                hData.setMeasurements(new Random().nextFloat(200f));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

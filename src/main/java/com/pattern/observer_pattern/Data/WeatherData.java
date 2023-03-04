package com.pattern.observer_pattern.Data;

import java.util.ArrayList;
import java.util.List;

import com.pattern.observer_pattern.interfaces.Observer;
import com.pattern.observer_pattern.interfaces.Subject;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float data;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
                observer.update(data);
        }
    }
    public void setMeasurements(float data) {
        this.data = data;
        notifyObservers();
    }


}

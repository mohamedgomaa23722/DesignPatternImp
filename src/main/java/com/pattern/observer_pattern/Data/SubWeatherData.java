package com.pattern.observer_pattern.Data;

import java.util.ArrayList;
import java.util.List;

import com.pattern.observer_pattern.observers.Observer;
import com.pattern.observer_pattern.subjects.SubSubject;

public class SubWeatherData implements SubSubject{
    private List<Observer> observers;
    private float data;

    public SubWeatherData() {
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

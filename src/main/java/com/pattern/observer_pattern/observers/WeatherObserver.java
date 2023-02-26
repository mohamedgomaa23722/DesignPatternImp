package com.pattern.observer_pattern.observers;

public interface WeatherObserver {
    public void update(float temperature, float humidity, float pressure);
}

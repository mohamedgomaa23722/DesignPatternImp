package com.pattern.observer_pattern.subjects;

import com.pattern.observer_pattern.observers.WeatherObserver;

public interface WeatherSubject extends Subject<WeatherObserver>{
    public void notifyObservers();
}

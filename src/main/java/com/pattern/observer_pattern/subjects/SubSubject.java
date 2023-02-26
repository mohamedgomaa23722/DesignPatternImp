package com.pattern.observer_pattern.subjects;

import com.pattern.observer_pattern.observers.Observer;

public interface SubSubject extends Subject<Observer> {
    void notifyObservers();
}

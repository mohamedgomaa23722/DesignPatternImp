package com.pattern.observer_pattern.interfaces;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObservers();
    Object getUpdate();
}

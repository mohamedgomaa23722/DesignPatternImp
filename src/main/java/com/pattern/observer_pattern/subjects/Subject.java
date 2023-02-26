package com.pattern.observer_pattern.subjects;

public interface Subject<T> {
    void addObserver(T observer);
    void removeObserver(T observer);
}

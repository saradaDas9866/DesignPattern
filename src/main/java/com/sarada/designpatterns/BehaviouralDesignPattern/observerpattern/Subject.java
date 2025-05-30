package com.sarada.designpatterns.BehaviouralDesignPattern.observerpattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

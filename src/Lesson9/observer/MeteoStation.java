package Lesson9.observer;

import java.util.ArrayList;
import java.util.Arrays;

public class MeteoStation {
    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addObservers(Observer... observers) {
        this.observers.addAll(Arrays.asList(observers));
    }

    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    public void eventFired(String event) {
        for (Observer obs : observers) {
            obs.getEvent(event);
        }
    }
}

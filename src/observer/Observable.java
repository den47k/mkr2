package observer;

import factory.Character;
import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }
}

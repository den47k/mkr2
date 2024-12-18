package observer;

import factory.Character;

public class PlayerObserver implements Observer {
    @Override
    public void update(Character character) {
        System.out.println("Сповіщення: На арену вийшов " + character.getName());
    }
}

package observer;

import mediator.Arena;
import factory.Character;

public class ArenaObservable extends Observable {
    private Arena arena;

    public ArenaObservable(Arena arena) {
        this.arena = arena;
    }

    public void addCharacter(Character character) {
        arena.addCharacter(character);
        notifyObservers(character);
    }
}

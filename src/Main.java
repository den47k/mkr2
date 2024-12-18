import mediator.Arena;
import factory.Character;
import factory.CharacterFactory;
import observer.ArenaObservable;
import observer.PlayerObserver;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        ArenaObservable observableArena = new ArenaObservable(arena);

        PlayerObserver observer = new PlayerObserver();
        observableArena.addObserver(observer);

        Character warrior1 = CharacterFactory.createCharacter("воїн", "T. Bobr");
        Character warrior2 = CharacterFactory.createCharacter("воїн", "den47k");
        Character mage = CharacterFactory.createCharacter("маг", "3mo");

        observableArena.addCharacter(warrior1);
        observableArena.addCharacter(warrior2);
        observableArena.addCharacter(mage);

        arena.move(warrior1, 5, 10);
        arena.attack(warrior2, mage);

        warrior1.displayInfo();
        warrior2.displayInfo();
        mage.displayInfo();
    }
}

package mediator;

import factory.Character;
import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " увійшов на арену.");
    }

    public void attack(Character attacker, Character target) {
        if (characters.contains(attacker) && characters.contains(target)) {
            target.takeDamage(attacker.getAttackPower());
            System.out.println(attacker.getName() + " атакує " + target.getName() +
                    ", завдаючи " + attacker.getAttackPower() + " шкоди.");
        }
    }

    public void move(Character character, int x, int y) {
        character.setPosition(x, y);
        System.out.println(character.getName() + " переміщається на координати (" + x + ", " + y + ").");
    }
}

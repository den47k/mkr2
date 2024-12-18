package factory;

public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "воїн": return new Warrior(name);
            case "маг": return new Mage(name);
            case "лучник": return new Archer(name);
            default: throw new IllegalArgumentException("Невідомий тип персонажа");
        }
    }
}

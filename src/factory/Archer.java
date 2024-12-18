package factory;

public class Archer extends Character {
    public Archer(String name) { super(name, 120, 30); }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Лучник): Здоров'я = " + health + ", Атака = " + attackPower);
    }
}

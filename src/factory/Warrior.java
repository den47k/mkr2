package factory;

public class Warrior extends Character {
    public Warrior(String name) { super(name, 150, 20); }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Воїн): Здоров'я = " + health + ", Атака = " + attackPower);
    }
}

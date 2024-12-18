package factory;

public class Mage extends Character {
    public Mage(String name) { super(name, 100, 40); }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Маг): Здоров'я = " + health + ", Атака = " + attackPower);
    }
}

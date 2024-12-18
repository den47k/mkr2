package factory;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public int getAttackPower() { return attackPower; }

    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    public void takeDamage(int damage) { this.health -= damage; }

    public abstract void displayInfo();
}

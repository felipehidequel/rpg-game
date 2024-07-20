public class Monster extends NPC {
    private int damage; // 5 * level

    public Monster(String name, int level, int health, int damage) {
        super(name, level, health);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString() {
        return "Name: " + name + "\nLevel: " + level + "\nHealth: " + health + "\nDamage: " + damage;
    }

    public static Monster createMonster(String name, int level) {
        return new Monster(name, level, 100 * level, 5 * level);
    }

}

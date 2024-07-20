
public class Monster extends NPC {
    private int damage; // 5 * level
    private int exp;
    private int healthMax;

    public Monster(String name, int level, int health, int damage) {
        super(name, level, health);
        this.damage = damage;
        this.exp = level * 7;
        healthMax = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getExp() {
        return exp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthMax() {
        return healthMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDamage: " + damage;
    }

    public void print_atributes() {
        Logg.log("Attributes " + this.getName() + " : " + this.getLevel() + " " + this.getHealth() + " "
                + this.getDamage());
    }

    public void attack(Player player) {
        int damage = this.damage;
        player.setHealth(player.getHealth() - damage);
        Logg.monster_attack(this.name + " attacked " + player.getName() + " for " + damage + " damage.");
        // Logg.log(player.getName() + " has " + player.getHealth() + " health left.");
    }
}

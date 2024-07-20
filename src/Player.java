public class Player {
    private String name;
    private int level; // 1 - 50
    private int health; // 100 * level
    private int damage; // 5 * level
    private int exp;
    private Weapon weapon;
    private int healthMax = 100;
    private int expMax = 50;

    Player(String name, int health) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.damage = 25;
        this.exp = 0;
        this.weapon = new Weapon();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapom(Weapon weapon) {
        this.weapon = weapon;
    }

    public void resetHealth() {
        this.health = healthMax;
    }

    public void print_atributes() {
        Logg.detail();
        Logg.log("Attributes " + this.getName() + " : [Level] " + this.getLevel() + " [HP] " + this.getHealth()
                + " [Damage] "
                + this.getDamage() + " [Exp] " + this.getExp());
        Logg.detail();
    }

    public void levelUp() {
        if (this.exp >= expMax) {
            this.level++;
            this.exp = 0;
            this.expMax *= 2;
            this.healthMax += 100;
            this.health = healthMax;
            this.damage += 5;
            Logg.log(this.name + " leveled up to " + this.level + "!");
        }
    }

    // Method to attack a monster
    public void attackMonster(Monster monster) {
        int monsterHealth = monster.getHealth();
        int damageDealt = this.damage;

        monsterHealth -= damageDealt;
        monster.setHealth(monsterHealth);

        Logg.player_attack(this.name + " attacked " + monster.getName() + " for " + damageDealt + " damage.");
        // Logg.log(monster.getName() + " has " + monster.getHealth() + " health
        // left.");

        if (monster.getHealth() > 0) {
            monster.attack(this);
        }
    }
}
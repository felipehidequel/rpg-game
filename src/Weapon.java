public class Weapon {
    int damage;
    String name;

    public Weapon(){
        this.name = "empty hands";
        this.damage = 0;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


}

public class Logg {
    public static void log(String message) {
        System.out.println(message);
    }

    public static void player_attack(String message) {
        System.out.println("\u001B[32mFIGTH: " + message + "\u001B[0m");
    }

    public static void monster_attack(String message) {
        System.out.println("\u001B[31mFIGTH: " + message + "\u001B[0m");
    }
    // public static void warn(String message) {
    // System.out.println("\u001B[31mWARNING: " + message + "\u001B[0m");
    // }

    public static void infoBattle(Player player, Monster monster) {
        System.out
                .println("\u001B[32m[Player]\u001B[0m " + "Hp: " + player.getHealthMax() + "/" + player.getHealth());
        System.out.println(
                "\u001B[31m[Monster]\u001B[0m " + "Hp: " + monster.getHealthMax() + "/" + monster.getHealth());
    }

    public static void updateStatus(Player player) {
        System.out.println("\u001B[32m[Player]\u001B[0m " + "Hp: " + player.getHealthMax() + "/" + player.getHealth()
                + " Exp: ++" + player.getExp());
    }

    public static void detail() {
        String message = "******************************************************";
        System.out.println("\u001B[34m " + message + "\u001B[0m");
    }
}

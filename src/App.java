import java.util.ArrayList;

// import java.util.Random;

public class App {

    // TODO: create a logic for the player interact with weapons
    // TODO: create a drop system for the monsters (weapons, armors, etc)
    // TODO: create a system to level up the player

    public static Monster createMonster(String name, int level) {
        return new Monster(name, level, 100 * level, 5 * level);
    }

    public static ArrayList<Monster> createMonsters(int amount) {
        ArrayList<Monster> monsters = new ArrayList<>();
        // Random random = new Random();

        for (int i = 0; i < amount; i++) {
            // int level = random.nextInt(50) + 1;
            monsters.add(createMonster("Monster #" + i, i + 1));
        }
        return monsters;
    }

    public static void battle(Player player, Monster monster) {
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            player.attackMonster(monster);
            Logg.infoBattle(player, monster);
        }

        if (player.getHealth() <= 0) {
            Logg.log("You died.");
        } else {
            Logg.log("You killed the monster.");
            player.setExp(player.getExp() + monster.getExp());
            Logg.updateStatus(player);
            player.print_atributes();
            player.resetHealth();
            player.levelUp();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Monster> list_npc = createMonsters(5);
        Player player = new Player("Felipe", 100);

        for (Monster npc : list_npc) {
            System.out.println(npc);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {

            Monster monster_selected = list_npc.get(i);
            monster_selected.print_atributes();
            battle(player, monster_selected);
        }

    }
}

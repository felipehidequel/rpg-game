import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        ArrayList<Monster> list_npc = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int level = random.nextInt(50) + 1;
            list_npc.add(Monster.createMonster("Goblin", level));
        }

        for (Monster npc : list_npc) {
            System.out.println(npc);
            System.out.println();
        }
    }
}

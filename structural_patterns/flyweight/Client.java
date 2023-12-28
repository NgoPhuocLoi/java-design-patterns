package structural_patterns.flyweight;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Army army = new Army();
        int toDraw = 1000;
        Random random = new Random();
        for (int i = 0; i < toDraw; i++) {
            army.spawnFighter(FighterRank.values()[random.nextInt(FighterRank.values().length)]);
        }

        army.draw();
    }
}

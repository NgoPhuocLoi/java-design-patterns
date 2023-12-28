package structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank rank) {
        this.army.add(FighterFactory.getFighter(rank));
    }

    public void draw() {
        for (Fighter fighter : army) {
            System.out.print(switch (fighter.getRank()) {
                case PRIVATE -> "P ";
                case MAJOR -> "M ";
                default -> "S ";
            });
        }
    }
}

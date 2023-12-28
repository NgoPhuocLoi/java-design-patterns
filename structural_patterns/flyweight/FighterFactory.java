package structural_patterns.flyweight;

import java.util.EnumMap;

public class FighterFactory {
    private static EnumMap<FighterRank, Fighter> fighters = new EnumMap<>(FighterRank.class);

    public static Fighter getFighter(FighterRank rank) {
        Fighter fighter = fighters.get(rank);
        if (fighter == null) {
            fighter = new Fighter(rank);
            fighters.put(rank, fighter);
        }
        return fighter;
    }
}

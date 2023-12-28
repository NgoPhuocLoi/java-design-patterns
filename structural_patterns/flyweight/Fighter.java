package structural_patterns.flyweight;

public class Fighter implements Sprite {
    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    public FighterRank getRank() {
        return this.rank;
    }

    @Override
    public void draw() {
        System.out.println("Filter with rank %s is  drawn".formatted(this.rank));
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move to [%d, %d]".formatted(x, y));
    }
}

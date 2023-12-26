package structural_patterns.adapter;

public class NewData {
    private int position;
    private int amount;

    public NewData(int position, int amount) {
        this.position = position;
        this.amount = amount;
    }

    public int getPosition() {
        return position;
    }

    public int getAmount() {
        return amount;
    }

}

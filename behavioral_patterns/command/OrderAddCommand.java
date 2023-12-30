package behavioral_patterns.command;

public class OrderAddCommand implements Command {
    private int id;
    private double price;

    public OrderAddCommand(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public void execute() {
        System.out.println("Command %d is added with price %.2f".formatted(id, price));
    }

}

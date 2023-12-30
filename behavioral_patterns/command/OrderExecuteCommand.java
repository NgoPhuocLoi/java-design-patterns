package behavioral_patterns.command;

public class OrderExecuteCommand implements Command {

    private int id;

    public OrderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Command %d is executed!".formatted(id));
    }

}

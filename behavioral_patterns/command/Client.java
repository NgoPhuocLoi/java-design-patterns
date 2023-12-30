package behavioral_patterns.command;

public class Client {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.addCommand(new OrderAddCommand(1, 13.33))
                .addCommand(new OrderAddCommand(2, 20.44))
                .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(1))
                .processCommands();
    }
}

package behavioral_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<Command> commands = new ArrayList<>();

    public Processor addCommand(Command command) {
        this.commands.add(command);
        return this;
    }

    public void processCommands() {
        commands.forEach(Command::execute);
    }
}

package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void invoke(Command command) {
        commands.add(command);
        command.execute();
    }
}

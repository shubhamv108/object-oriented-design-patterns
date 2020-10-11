package command.invokers;

import command.ICommand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class QueuedInvoker {
    private Queue<ICommand> commands = new LinkedList<>();

    public void setCommand(ICommand command) {
        commands.add(command);
        command.execute();
    }

    public void undoInReverseOrder() {
        while (!commands.isEmpty())
            commands.poll().undo();
    }
}

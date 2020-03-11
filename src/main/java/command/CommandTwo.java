package command;

public class CommandTwo<R> implements Command {

    private R request;

    public CommandTwo(R request) {
        this.request = request;
    }

    @Override
    public void execute() {

    }
}

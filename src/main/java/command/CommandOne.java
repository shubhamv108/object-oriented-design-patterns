package command;

public class CommandOne<R> implements Command {

    private R request;
    public CommandOne(R request) {
        this.request = request;
    }

    @Override
    public void execute() {

    }

}

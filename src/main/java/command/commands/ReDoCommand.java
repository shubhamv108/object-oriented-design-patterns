package command.commands;

import builder.IBuilder;
import command.ICommand;

public class ReDoCommand implements ICommand {

    private final UnDoCommand command;

    public ReDoCommand(final UnDoCommand command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println(String.format("Executing undo command for %s", this.getUnDoCommand()));
        this.getUnDoCommand().undo();
        System.out.println(String.format("Executed undo command for %s", this.getUnDoCommand()));
    }

    @Override
    public void undo() {
        System.out.println(String.format("Undoing undo command for %s", this.getUnDoCommand()));
        this.getUnDoCommand().execute();
        System.out.println(String.format("Undid undo command for %s", this.getUnDoCommand()));
    }

    public ICommand getUnDoCommand() {
        return this.command;
    }

    public static ReDoCommandBuilder builder() {
        return new ReDoCommandBuilder();
    }

    public static class ReDoCommandBuilder implements IBuilder<ReDoCommand> {
        private UnDoCommand command;

        public ReDoCommandBuilder withCommand(final UnDoCommand command) {
            this.command = command;
            return this;
        }

        @Override
        public ReDoCommand build() {
            return new ReDoCommand(this.command);
        }
    }
}


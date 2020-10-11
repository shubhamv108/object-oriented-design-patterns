package command.commands;

import command.ICommand;
import command.receivers.ReceiverOne;

public class CommandFour implements ICommand {

    ReceiverOne receiver;

    public CommandFour(ReceiverOne receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing CommandFour");
        this.receiver.action();
        System.out.println("Executed CommandFour");
    }

    @Override
    public void undo() {
        System.out.println("Undoing CommandFour");
        this.receiver.undoAction();
        System.out.println("Undone CommandFour");
    }

}

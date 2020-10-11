package command.commands;

import command.ICommand;
import command.receivers.ReceiverOne;

public class CommandOne implements ICommand {

    ReceiverOne receiver;

    public CommandOne(ReceiverOne receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing CommandOne");
        this.receiver.action();
        System.out.println("Executed CommandOne");
    }

    @Override
    public void undo() {
        System.out.println("Undoing CommandOne");
        this.receiver.undoAction();
        System.out.println("Undone CommandOne");
    }

}

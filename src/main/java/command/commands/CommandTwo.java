package command.commands;

import command.ICommand;
import command.receivers.ReceiverOne;

public class CommandTwo implements ICommand {

    ReceiverOne receiver;

    public CommandTwo(ReceiverOne receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing CommandTwo");
        this.receiver.action();
        System.out.println("Executed CommandTwo");
    }

    @Override
    public void undo() {
        System.out.println("Unding CommandTwo");
        this.receiver.undoAction();
        System.out.println("Undone CommandTwo");
    }

}

package command.commands;

import command.ICommand;
import command.receivers.ReceiverOne;

public class CommandThree implements ICommand {

    ReceiverOne receiver;

    public CommandThree(ReceiverOne receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing CommandThree");
        this.receiver.action();
        System.out.println("Executed CommandThree");
    }

    @Override
    public void undo() {
        System.out.println("Undoing CommandThree");
        this.receiver.undoAction();
        System.out.println("Undone CommandThree");
    }

}

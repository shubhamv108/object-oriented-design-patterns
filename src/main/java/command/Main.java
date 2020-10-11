package command;

import command.commands.CommandFour;
import command.commands.CommandOne;
import command.commands.CommandThree;
import command.commands.CommandTwo;
import command.invokers.InvokerOne;
import command.invokers.QueuedInvoker;
import command.receivers.ReceiverOne;

public class Main {

    public static void main(String[] args) {
        CommandOne commandOne = new CommandOne(new ReceiverOne());
        QueuedInvoker queuedInvoker = new QueuedInvoker();
        queuedInvoker.setCommand(commandOne);

        InvokerOne invokerOne = new InvokerOne(
                new CommandOne(new ReceiverOne()),
                new CommandTwo(new ReceiverOne()),
                new CommandThree(new ReceiverOne()),
                new CommandFour(new ReceiverOne())
        );

        invokerOne.executeOne();
        invokerOne.executeTwo();
        invokerOne.executeThree();
        invokerOne.executeFour();
    }

}

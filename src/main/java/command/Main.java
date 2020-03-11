package command;

import chainofresponsibility.Request;

public class Main {

    public static void main(String[] args) {
        Request request = new Request();
        CommandOne<Request> commandOne = new CommandOne<>(request);
        Invoker invoker = new Invoker();
        invoker.invoke(commandOne);
        invoker.invoke(() -> {});
    }

}

package command.receivers;

public class ReceiverOne {
    public void action() {
        System.out.println("ReceiverOne received command to perform action");
    }

    public void undoAction() {
        System.out.println("ReceiverOne received command to undo action");
    }
}

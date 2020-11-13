package chainofresponsibility;

public abstract class Handler<HandlerData> {

    private Handler<HandlerData> next;

    protected abstract boolean handleImpl(HandlerData data);

    protected abstract boolean isSpam(HandlerData data);

    public final void handle(HandlerData data) {
        if (isSpam(data)) return;
        this.handleImpl(data);
        if (this.getNext() != null) this.getNext().handle(data);
    }

    public final void handleByAnyOne(HandlerData data) {
        boolean isHandled;
        if (isSpam(data)) return;
        isHandled = this.handleImpl(data);
        if (this.getNext() != null && !isHandled) this.getNext().handle(data);
    }

    public Handler<HandlerData> setNext(Handler<HandlerData> nextHandler) {
        this.next = nextHandler;
        return this;
    }

    public Handler getNext() {
        return this.next;
    }
}

package chainofresponsibility;

public abstract class Handler<R> {

    private Handler next;

    protected abstract boolean handleImpl(R request);

    protected abstract boolean isSpam(R request);

    public final void handle(R request) {
        if (isSpam(request)) {
            boolean isHandled = this.handleImpl(request);
        }
        if (next != null) {
            next.handle(request);
        }
    }

    public final void handleByAnyOne(R request) {
        boolean isHandled = false;
        if (isSpam(request)) {
           isHandled = this.handleImpl(request);
        }
        if (next != null && !isHandled) {
            next.handle(request);
        }
    }

    public void setNext(Handler<R> nextHandler) {
        this.next = nextHandler;
    }

    public Handler getNext() {
        return this.next;
    }
}

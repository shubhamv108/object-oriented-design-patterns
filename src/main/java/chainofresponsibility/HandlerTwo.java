package chainofresponsibility;

public class HandlerTwo<R> extends Handler<R> {

    @Override
    protected boolean handleImpl(R request) {
        return false;
    }

    @Override
    protected boolean isSpam(R request) {
        return false;
    }

}

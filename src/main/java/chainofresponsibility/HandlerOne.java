package chainofresponsibility;

public class HandlerOne<R> extends Handler<R> {

    @Override
    protected boolean handleImpl(R request) {
        return true;
    }

    @Override
    protected boolean isSpam(R request) {
        return false;
    }

}

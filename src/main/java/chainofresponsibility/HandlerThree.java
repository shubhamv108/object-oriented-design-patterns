package chainofresponsibility;

public class HandlerThree<R> extends Handler<R> {

    @Override
    protected boolean handleImpl(R request) {
        return true;
    }

    @Override
    protected boolean isSpam(R request) {
        return false;
    }

}

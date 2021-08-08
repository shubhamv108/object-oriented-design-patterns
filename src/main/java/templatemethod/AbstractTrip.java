package templatemethod;

public abstract class AbstractTrip {

    /**
     * Template Method
     * Must not be overridden
     */
    public final void performTrip(){
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }

    public abstract void doComingTransport();
    public abstract void doDayA();
    public abstract void doDayB();
    public abstract void doDayC();
    public abstract void doReturningTransport();
}

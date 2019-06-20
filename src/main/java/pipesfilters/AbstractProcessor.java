package pipesfilters;

public abstract class AbstractProcessor<T>  {

    private AbstractProcessor<T> nextProcessor;
    private boolean isAutoChainingEnabled;

    public abstract T process (T t);

    public T execute (T t) {
        t = process(t);
        if (nextProcessor != null && isAutoChainingEnabled)
            nextProcessor.execute(t);
        return t;
    }

    public void next (AbstractProcessor<T> processor) {
        nextProcessor = processor;
        isAutoChainingEnabled = true;
    }

    public void enableAutoChaining() {
        isAutoChainingEnabled = true;
    }

    public void disableAutoChaining() {
        isAutoChainingEnabled = false;
    }

}

package strategy;

/**
 * Select an algorithm at runtime
 */
interface IStrategy {
    void apply();
}

class Strategy1 implements IStrategy {
    @Override
    public void apply() {

    }
}

class Strategy2 implements IStrategy {
    @Override
    public void apply() {

    }
}

class Context {

    private IStrategy strategy;

    public Context (final IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(final IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.apply();
    }
}

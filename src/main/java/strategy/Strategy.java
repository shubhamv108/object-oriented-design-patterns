package strategy;

interface IStrategy {  }

class Strategy1 implements IStrategy {  }

class Strategy2 implements IStrategy {  }

class StrategicObject {

    private IStrategy strategy;

    public StrategicObject (IStrategy strategy) {
        this.strategy = strategy;
    }

}

package principles.solid;

/**
 * The Open Close Principle states that the design and writing of the code should be done in a way that
 * new functionality should be added with minimum changes in the existing code
 *
 * Decorator pattern help us to follow Open Close principle
 */
public class OpenClosePrinciple {

    abstract class AbstractClass {
        abstract void perform();
    }

    class ConcreteClassOne extends AbstractClass {
        @Override
        void perform() {

        }
    }

    class ConcreteClassTwo extends AbstractClass {
        @Override
        void perform() {

        }
    }

}

package factorymethod;

public class ConcreteCreator extends AbstractCreator {
    @Override
    protected IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}

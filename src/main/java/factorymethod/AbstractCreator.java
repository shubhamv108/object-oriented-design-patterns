package factorymethod;

public abstract class AbstractCreator
{
    public void anOperation() {
        IProduct product = factoryMethod();
        System.out.println(product);
    }

    protected abstract IProduct factoryMethod();
}


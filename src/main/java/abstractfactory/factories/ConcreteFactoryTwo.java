package abstractfactory.factories;

import abstractfactory.AbstractFactory;
import abstractfactory.products.productA.AbstractProductA;
import abstractfactory.products.productA.implementations.ProductA2;
import abstractfactory.products.productB.AbstractProductB;
import abstractfactory.products.productB.implementations.ProductB2;

public class ConcreteFactoryTwo extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

package abstractfactory.factories;

import abstractfactory.AbstractFactory;
import abstractfactory.products.productA.AbstractProductA;
import abstractfactory.products.productA.implementations.ProductA1;
import abstractfactory.products.productB.AbstractProductB;
import abstractfactory.products.productB.implementations.ProductB1;

public class ConcreteFactoryOne extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

package abstractfactory;

import abstractfactory.products.productA.AbstractProductA;
import abstractfactory.products.productB.AbstractProductB;

public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();

}

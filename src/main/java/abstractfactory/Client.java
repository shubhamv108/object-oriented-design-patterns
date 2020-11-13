package abstractfactory;

import abstractfactory.factories.FactoryMaker;
import abstractfactory.products.productA.AbstractProductA;
import abstractfactory.products.productB.AbstractProductB;

public class Client {

    public static void main(String[] args) {

        AbstractFactory factoryOne = FactoryMaker.getFactory("One");
        AbstractProductA productA1 = factoryOne.createProductA();
        AbstractProductB productB1 = factoryOne.createProductB();

        AbstractFactory factoryTwo = FactoryMaker.getFactory("Two");
        AbstractProductA productA2 = factoryTwo.createProductA();
        AbstractProductB productB2 = factoryTwo.createProductB();

        System.out.println(productA1.getName());
        System.out.println(productB1.getName());
        System.out.println(productA2.getName());
        System.out.println(productB2.getName());

    }

}

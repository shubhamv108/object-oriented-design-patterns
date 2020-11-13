package abstractfactory.factories;

import abstractfactory.AbstractFactory;

// Factory for Abstract factories
public class FactoryMaker {

    public static AbstractFactory getFactory(final String factoryName) {
        AbstractFactory factory = null;
        if ("One".equals(factoryName)) {
            factory = new ConcreteFactoryOne();
        } else if ("Two".equals(factoryName)) {
            factory = new ConcreteFactoryTwo();
        }
        return factory;
    }

}

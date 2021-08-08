package factorymethod;

/**
 * Defines an interface for creating objects, but let subclasses to decide which class to instantiate
 * Refers to the newly created object through a common interface
 *
 *
 * The need for implementing the Factory Method is very frequent. The cases are the ones below:
 * when a class can't anticipate the type of the objects it is supposed to create
 * when a class wants its subclasses to be the ones to specific the type of a newly created object
 */
public class Main {

    public static void main(String args[]) {
        AbstractCreator creator = new ConcreteCreator();
        creator.anOperation();
    }

}

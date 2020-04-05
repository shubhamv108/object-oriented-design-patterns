package factory;

/**
 * It keeps the initialization logic of each object at one place, i.e inside the factory,
 * so that the user remains unaware of it.
 */

abstract class AbstractObject {  }

class Object1 extends AbstractObject {}

class Object2 extends AbstractObject {}

public class ObjectFactory {

    public static AbstractObject get (String objectName) {
        AbstractObject object = null;
        switch (objectName.toLowerCase()) {
            case "object1" : object = new Object1(); break;
            case "object2" : object = new Object2(); break;
            default: new IllegalArgumentException("Object not supported");
        }
        return object;
    }

}
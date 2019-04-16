package factory;

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
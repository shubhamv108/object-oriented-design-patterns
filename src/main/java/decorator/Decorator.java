package decorator;

abstract class AbstractObject {
    public abstract String name();
}

class Object1 extends AbstractObject {
    public String name() {
        return "Object1";
    }
}

abstract class AbstractDecorator extends AbstractObject {  }

class ObjectDecorator1 extends AbstractDecorator {
    private AbstractObject object;
    public ObjectDecorator1 (AbstractObject object) {
        this.object = object;
    }
    public String name() {
        return object.name() + " " + "Decorator1";
    }
}

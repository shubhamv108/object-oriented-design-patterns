package adapter;

interface AbstractObject {
    String destroyAndGetName();
}

class Object1 implements AbstractObject {
    @Override
    public String destroyAndGetName() {
        return "Object1";
    }
}

interface OtherObject {
    String killAndGetName();
}

class OtherObject1 implements OtherObject {
    @Override
    public String killAndGetName() {
        return "OtherObject1";
    }
}

class OriginalObjectAdapter implements OtherObject {

    private AbstractObject object;

    public OriginalObjectAdapter (AbstractObject object) {
        this.object = object;
    }

    @Override
    public String killAndGetName() {
        return object.destroyAndGetName();
    }
}

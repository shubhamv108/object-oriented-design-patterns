package proxy;

interface IObject {
    String name();
}

class RealObject implements IObject {
    @Override
    public String name() {
        return "RealObject";
    }
}

class ProxyObject implements IObject {

    private RealObject object;

    @Override
    public String name() {
        if (object == null) object = new RealObject();
        return "Proxied " + object.name();
    }
}
package adapter;

class Adaptee {
    public String destroyAndGetName() {
        return "Adaptee";
    }
}

interface Target {
    String killAndGetName();
}

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(final Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String killAndGetName() {
        return this.adaptee.destroyAndGetName();
    }
}

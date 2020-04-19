package visitor;

public class ConcreteVisitable<C> implements IVisitable<C> {

    private Object state;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(IVisitor visitor, C context) {
        visitor.visit(this, context);
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("Concrete Visitable: %s", state);
    }
}

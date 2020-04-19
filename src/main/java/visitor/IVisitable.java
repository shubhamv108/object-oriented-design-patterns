package visitor;

public interface IVisitable<C> {

    void accept(IVisitor visitor);
    void accept(IVisitor visitor, C context);

}

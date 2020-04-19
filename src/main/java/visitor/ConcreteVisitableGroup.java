package visitor;

import java.util.ArrayList;
import java.util.List;

public class ConcreteVisitableGroup<C> implements IVisitable<C> {

    private List<ConcreteVisitable> group = new ArrayList<>();

    @Override
    public void accept(IVisitor visitor) {
        group.forEach(visitable -> visitable.accept(visitor));
    }

    @Override
    public void accept(IVisitor visitor, C context) {
        group.forEach(visitable -> visitable.accept(visitor, context));
    }

    public void add(ConcreteVisitable visitable) {
        group.add(visitable);
    }

}

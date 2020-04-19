package visitor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConcreteVisitor<C> implements IVisitor<C> {

    Set<Class> knowClassesForDefaultHandling = new HashSet<>(Arrays.asList());

    @Override
    public void visit(ConcreteVisitable visitable) {
//        System.out.println(visitable.toString());
    }

    @Override
    public void visit(ConcreteVisitable visitable, C context) {
//        System.out.println(visitable.toString() + ", " + context);
    }

    public void defaultVisit(Object object)
    {
        // if we don't know the class we do nothing
        if (object.getClass().equals(KnownNotVisitable.class)) {
            System.out.println("default visit: "
                    + object.getClass().getSimpleName());
        } else if (knowClassesForDefaultHandling.contains(object)) {
            System.out.println("default visit: "
                    + object.getClass().getSimpleName());
        }

    }

}

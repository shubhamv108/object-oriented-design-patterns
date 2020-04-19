package visitor;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ConcreteVisitableGroup<Set<String>> concreteVisitableGroup = new ConcreteVisitableGroup<>();
        ConcreteVisitable<Set<String>> concreteVisitableOne = new ConcreteVisitable<>();
        concreteVisitableOne.setState("Visitable One");
        ConcreteVisitable<Set<String>> concreteVisitableTwo = new ConcreteVisitable<>();
        concreteVisitableTwo.setState("Visitable Two");
        concreteVisitableGroup.add(concreteVisitableOne);
        concreteVisitableGroup.add(concreteVisitableTwo);

        Set<String> context = new HashSet<>();
        concreteVisitableGroup.accept(new ConcreteVisitor<Set<String>>() {
            @Override
            public void visit(ConcreteVisitable visitable, Set<String> context) {
                context.add(visitable.getState().toString());
                super.visit(visitable, context);
            }
        }, context);

        System.out.println(context);

    }

}

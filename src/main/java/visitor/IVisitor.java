package visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface IVisitor<C> {

    void visit(ConcreteVisitable visitable);
    void visit(ConcreteVisitable visitable, C context);

    void defaultVisit(Object object);

    default void visit(Object object) {
        try {
            Method downPolymorphic = object.getClass().getMethod("visit",
                    new Class[]{object.getClass()});

            if (downPolymorphic == null) {
                defaultVisit(object);
            } else {
                downPolymorphic.invoke(this, new Object[]{object});
            }
        } catch (NoSuchMethodException e) {
            this.defaultVisit(object);
        } catch (InvocationTargetException e) {
            this.defaultVisit(object);
        } catch (IllegalAccessException e) {
            this.defaultVisit(object);
        }

    }

    default void visit(Object object, C context) {
        try {
            Method downPolymorphic = object.getClass().getMethod("visit",
                    new Class[]{object.getClass(), context.getClass()});

            if (downPolymorphic == null) {
                defaultVisit(object);
            } else {
                downPolymorphic.invoke(this, new Object[]{object, context});
            }
        } catch (NoSuchMethodException e) {
            this.defaultVisit(object);
        } catch (InvocationTargetException e) {
            this.defaultVisit(object);
        } catch (IllegalAccessException e) {
            this.defaultVisit(object);
        }
    }

}

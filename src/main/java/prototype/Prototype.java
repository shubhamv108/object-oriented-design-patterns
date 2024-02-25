package prototype;

import java.util.HashMap;
import java.util.Map;

public abstract class Prototype implements Cloneable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning Not allowed");
        }
    }
}

class Object1 extends Prototype {  }

class Object2 extends Prototype {  }

class PrototypeRegistry {
    private static Map<Class, Prototype> registry = new HashMap<>();
    static {
        registry.put (Object1.class, new Object1());
        registry.put (Object2.class, new Object2());
    }
    public Prototype getPrototype (Class clazz) {
        return (Prototype) registry.get(clazz).clone();
    }
}
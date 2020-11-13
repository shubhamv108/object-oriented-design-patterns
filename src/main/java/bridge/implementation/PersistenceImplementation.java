package bridge.implementation;

import bridge.IPersistence;
import bridge.IPersistenceImplementor;

public class PersistenceImplementation implements IPersistence {

    private final IPersistenceImplementor implementor;

    public PersistenceImplementation(IPersistenceImplementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public String persist(Object object) {
        return String.valueOf(this.implementor.saveObject(object));
    }

    @Override
    public Object findById(String id) {
        return this.implementor.getObject(Long.valueOf(id));
    }

    @Override
    public void deleteById(String id) {
        this.implementor.deleteObject(Long.valueOf(id));
    }
}

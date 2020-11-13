package bridge;

public interface IPersistenceImplementor {
    long saveObject(Object object);
    void deleteObject(long objectId);
    Object getObject(long objectId);
}

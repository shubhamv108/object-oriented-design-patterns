package bridge;

public interface IPersistence {

    String persist(Object object);
    Object findById(String id);
    void deleteById(String id);

}

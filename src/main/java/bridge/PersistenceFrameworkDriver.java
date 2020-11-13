package bridge;

import bridge.implementation.PersistenceImplementation;
import bridge.implementors.DatabasePersistenceImplementor;
import bridge.implementors.FileSystemPersistenceImplementor;

public class PersistenceFrameworkDriver {

    public static void main(String[] args) {
        IPersistenceImplementor implementor = null;

        if(databaseDriverExists()){
            implementor = new DatabasePersistenceImplementor();
        } else{
            implementor = new FileSystemPersistenceImplementor();
        }
        IPersistence persistenceAPI = new PersistenceImplementation(implementor);

        Object o = persistenceAPI.findById("");
        persistenceAPI.persist(o);

        persistenceAPI = new PersistenceImplementation(new DatabasePersistenceImplementor());
        persistenceAPI.deleteById("");
    }


    private static boolean databaseDriverExists() {
        return false;
    }

}

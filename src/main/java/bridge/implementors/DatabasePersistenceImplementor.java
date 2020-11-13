package bridge.implementors;

import bridge.IPersistenceImplementor;

import java.sql.Connection;

public class DatabasePersistenceImplementor implements IPersistenceImplementor {

    private Connection connection;

    public DatabasePersistenceImplementor() {
        this.connection = null; // initialize connection
    }

    @Override
    public long saveObject(Object object) {
        return 0l;
    }

    @Override
    public void deleteObject(long objectId) {

    }

    @Override
    public Object getObject(long objectId) {
        return null;
    }

    private static boolean databaseDriverExists() {
        return false;
    }

}

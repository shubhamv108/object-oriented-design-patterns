package bridge.implementors;

import bridge.IPersistenceImplementor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemPersistenceImplementor implements IPersistenceImplementor {
    @Override
    public long saveObject(Object object) {
        long fileId = System.currentTimeMillis();
        Path filePath = Paths.get(String.valueOf(fileId));
        try {
            Files.createFile(filePath);
            Files.write(filePath, object.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileId;
    }

    @Override
    public void deleteObject(long objectId) {
        Path filePath = Paths.get(String.valueOf(objectId));
        try {
            Files.delete(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getObject(long objectId) {
        Object object = null;
        try {
            Files.readAllBytes(Paths.get(String.valueOf(objectId)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

}

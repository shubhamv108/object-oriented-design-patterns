package nullobject.factories;

import nullobject.constants.enums.LoggerType;
import nullobject.loggers.AbstractLogger;
import nullobject.loggers.ConsoleLogger;
import nullobject.loggers.FileLogger;
import nullobject.loggers.NullLogger;

public class LoggerFactory {

    public static LoggerFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder {
        private static final LoggerFactory INSTANCE = new LoggerFactory();
    }

    public AbstractLogger get(final LoggerType type) {
        if (LoggerType.FILE.equals(type)) {
            return new FileLogger();
        } else if (LoggerType.CONSOLE.equals(type)) {
            return new ConsoleLogger();
        }
        return new NullLogger();
    }

}

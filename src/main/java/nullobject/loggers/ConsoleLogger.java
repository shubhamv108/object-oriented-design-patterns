package nullobject.loggers;

import nullobject.loggers.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
    @Override
    public void log(final String message) {
        System.out.println(message);
    }
}

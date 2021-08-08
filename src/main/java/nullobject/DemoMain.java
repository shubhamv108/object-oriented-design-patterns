package nullobject;

import nullobject.constants.enums.LoggerType;
import nullobject.factories.LoggerFactory;
import nullobject.loggers.AbstractLogger;

/**
 * Provide an object as a surrogate for the lack of an object of a given type.
 * The Null Object Pattern provides intelligent do nothing behavior, hiding the details from its collaborators.
 *
 * The Null Object can be used to remove old functionality by replacing it with null objects.
 * The big advantage is that the existing code doesn't need to be touched.
 *
 * The Null Object Pattern is used to avoid special if blocks for do nothing code,
 * by putting the “do nothing” code in the Null Object which becomes responsible for doing nothing.
 */
public class DemoMain {

    public static void main(String[] args) {
        AbstractLogger consoleLogger = LoggerFactory.getInstance().get(LoggerType.CONSOLE);
        consoleLogger.log("Test");
        AbstractLogger nullLogger = LoggerFactory.getInstance().get(null);
        nullLogger.log("Test");
    }

}

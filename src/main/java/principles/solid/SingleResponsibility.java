package principles.solid;

/**
 *
 * This principle states that if we have 2 reasons to change for a class,
 * we have to split the functionality in two classes
 *
 * A class should have only one reason to change.
 */
public class SingleResponsibility {

    interface IEmail {
        public void setSender(String sender);
        public void setReceiver(String receiver);
        public void setContent(IContent content);
    }

    interface IContent {
        public String getAsString();
    }

    class Email implements IEmail {
        public void setSender(String sender) {}
        public void setReceiver(String receiver) {}
        public void setContent(IContent content) {}
    }
}

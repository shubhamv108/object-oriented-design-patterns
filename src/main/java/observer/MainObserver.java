package observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;


interface Observer {

    void update(Subject subject, Object object);
    void handle(Object object);

    default Object update(Observable observable) {
        return pull(observable);
    }

    default Object pull(Observable observable) {
        return observable.getState();
    }

}

enum Aspect {
    ASPECT_ONE,
    ASPECT_TWO
}

interface Subject {

    void attach(Observer observer, Aspect aspect);
    void detach(Observer observer, Aspect aspect);
    void notifyObservers(Object state);
    void notifyObservers(Object state, Aspect aspect);

    Object getState();

    default void updateState(Object state) {
        notifyObservers(state);
    }

    default void updateState(Object state, Aspect aspect) {
        notifyObservers(state, aspect);
    }

}

abstract class Observable implements Subject {

    final Map<Aspect, Set<Observer>> observers = new HashMap<>();

    @Override
    public void attach(Observer observer, Aspect aspect) {
        if (Objects.isNull(observer)) new IllegalArgumentException("Invalid observer");
        if (Objects.isNull(aspect))   new IllegalArgumentException("Invalid aspect");
        Set<Observer> aspectObservers = observers.get(aspect);
        if (aspectObservers == null) {
            aspectObservers = registerAspectAndGetObservers(aspect);
        }
        aspectObservers.add(observer);
    }

    @Override
    public void detach(Observer observer, Aspect aspect) {
        if (Objects.isNull(observer)) new IllegalArgumentException("Invalid observer");
        if (Objects.isNull(aspect))   new IllegalArgumentException("Invalid aspect");
        Set<Observer> aspectObservers = observers.get(aspect);
        if (aspectObservers == null) {
            throw new RuntimeException("No such observer registered");
        }
        boolean wasSubscribed = aspectObservers.remove(observer);
        if (!wasSubscribed) {
            throw new RuntimeException("No such observer registered");
        }
    }

    @Override
    public void notifyObservers(Object state) {
        if (Objects.isNull(state))  new IllegalArgumentException("Invalid state");
        Set<Aspect> aspectsSnapshot = observers.keySet();
        /**
         * ToDo: Fix <code>ConcurrentModificationException</code>
         */
        aspectsSnapshot.forEach(
                aspect -> observers.get(aspect)
                            .forEach(observer -> push(observer, state)));
    }

    @Override
    public void notifyObservers(Object state, Aspect aspect) {
        if (Objects.isNull(state))  new IllegalArgumentException("Invalid state");
        if (Objects.isNull(aspect)) new IllegalArgumentException("Invalid aspect");
        Set<Observer> aspectObservers = observers.get(aspect);
        aspectObservers.forEach(observer -> push(observer, state));
    }

    private synchronized Set<Observer> registerAspectAndGetObservers(Aspect aspect) {
        Set<Observer> aspectObservers = observers.get(aspect);
        if (Objects.isNull(aspectObservers)) {
            aspectObservers = new CopyOnWriteArraySet<>();
            observers.put(aspect, aspectObservers);
        }
        return aspectObservers;
    }

    void push(Observer observer, Object state) {
        observer.update(this, state);
    }

}

class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject, Object object) {
        handle(object);
    }

    @Override
    public void handle(Object state) {
        System.out.println(state);
    }
}

class ConcreteObservable extends Observable {

    Object state;

    @Override
    public void updateState(Object state) {
        super.updateState(state);
    }

    @Override
    public void updateState(Object state, Aspect aspect) {
        super.updateState(state, aspect);
    }

    @Override
    public Object getState() {
        return state;
    }

}

public class MainObserver {
    public static void main(String[] args) throws InterruptedException {
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        Observable observable1 = new ConcreteObservable();

        Thread t1 = new Thread( () -> observable1.attach(observer1, Aspect.ASPECT_ONE));
        t1.start();

        Thread t2 = new Thread( () -> observable1.updateState("State - Common"));
        t2.start();

        Thread t3 = new Thread( () -> observable1.attach(observer2, Aspect.ASPECT_TWO));
        t3.start();

        Thread t4 = new Thread( () -> observable1.updateState("State - Aspect One", Aspect.ASPECT_ONE));
        t4.start();

//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();


    }
}
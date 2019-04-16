package singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}

class Singleton1 {
    private Singleton1() {}
    public static Singleton1 getInstance() {
        return SingletonInitializer.INSTANCE;
    }
    private static class SingletonInitializer {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
}



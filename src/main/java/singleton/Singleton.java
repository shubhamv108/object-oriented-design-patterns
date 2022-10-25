package singleton;

class Singleton {

    private static volatile Singleton INSTANCE = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}

class Singleton2 {
    private Singleton2() {}

    public static Singleton2 getInstance() {
        return SingletonInitializer.INSTANCE;
    }

    private static class SingletonInitializer {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return Singleton2.getInstance();
    }
}

enum Singleton3 {
    INSTANCE
}



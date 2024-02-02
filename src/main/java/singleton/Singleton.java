package singleton;

class Singleton {
    private Singleton() {}
    private static final Singleton INSTANCE = new Singleton();
    public static Singleton getInstance() {
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
    private static volatile Singleton2 INSTANCE = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton2();
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

class Singleton3 {
    private Singleton3() {}

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return Singleton3.getInstance();
    }
}

enum Singleton4 {
    INSTANCE
}



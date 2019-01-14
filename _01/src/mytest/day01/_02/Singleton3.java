package mytest.day01._02;

public class Singleton3 {
    private Singleton3() {
    }

    private static volatile Singleton3 instance;
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

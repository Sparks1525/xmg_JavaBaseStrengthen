package mytest.day01._02;

public class Singleton2 {
    private Singleton2(){}

    private static Singleton2 instance;

    private synchronized static Singleton2 getInstance(){

        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

package mytest.day01._02;

public class Singleton7 {

    private Singleton7(){}

    private static final ThreadLocal threadLocal = new ThreadLocal();

    private static Singleton7 instance;

    public static Singleton7 getInstance(){

        if(threadLocal == null){
            createInstance();
        }


        return instance;
    }
    private static void createInstance(){
        synchronized (Singleton7.class){
            if (instance == null){
                instance = new Singleton7();
            }
        }
        threadLocal.set(threadLocal);
    }


}

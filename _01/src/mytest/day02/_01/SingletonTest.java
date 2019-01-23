package mytest.day02._01;

public class SingletonTest {
}

class Singleton0{
    private Singleton0(){}

    private static Singleton0 instance = new Singleton0();

    public static Singleton0 getInstance(){
        return instance;
    }
}

//------------------------------------
class Singleton1{
    private Singleton1(){}

    private volatile static Singleton1 instance;

    public synchronized static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}

//------------------------------------
class Singleton2{

    private Singleton2(){}

    private volatile static Singleton2 instance;

    public static Singleton2 getInstance(){

        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
//------------------------------------

enum Singleton3{
    INSTANCE;

    private InstEnum instance;
    Singleton3(){
        instance = new InstEnum();
    }
    public InstEnum getInstance(){
        return instance;
    }
}

class InstEnum{}




//------------------------------------
class Singleton4{
    private Singleton4(){}
    public static class holder{
        private static Singleton4 instance = new Singleton4();
        public static Singleton4 getInstance(){
            return holder.instance;
        }
    }
}

//------------------------------------
class Singleton5{
    private Singleton5(){}
    private static class holder{
        private static Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return holder.instance;
    }
}

//------------------------------------
class Singleton6{
    private Singleton6(){}

    private static final ThreadLocal threadLocal = new ThreadLocal();

    private static Singleton6 instance;

    public static Singleton6 getInstance(){
        if(threadLocal == null){
            createIns();
        }
        return instance;
    }

    private static void createIns(){
        synchronized (Singleton6.class){
            if(instance == null){
                instance = new Singleton6();
            }
        }
        threadLocal.set(threadLocal);
    }
}


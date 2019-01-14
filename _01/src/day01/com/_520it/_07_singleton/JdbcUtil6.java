package day01.com._520it._07_singleton;

public class JdbcUtil6 {

    private JdbcUtil6(){}

    private static final ThreadLocal perThreadInstance = new ThreadLocal();
    private static JdbcUtil6 instance;

    public static JdbcUtil6 getInstance(){
        if(perThreadInstance.get() == null){
            creatInstance();
        }
        return instance;
    }

    private static void creatInstance(){
        synchronized (JdbcUtil6.class){
            if(instance == null){
                instance = new JdbcUtil6();
            }
        }
        perThreadInstance.set(perThreadInstance);
    }
}

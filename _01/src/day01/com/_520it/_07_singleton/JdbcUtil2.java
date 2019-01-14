package day01.com._520it._07_singleton;

public class JdbcUtil2 {

    private JdbcUtil2(){}

    private static JdbcUtil2 instance;

    public synchronized static JdbcUtil2 getInstance(){

        if(instance == null){
            instance = new JdbcUtil2();
        }
        return instance;
    }
}

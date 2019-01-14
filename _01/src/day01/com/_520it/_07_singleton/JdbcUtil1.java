package day01.com._520it._07_singleton;

public class JdbcUtil1 {

    private JdbcUtil1(){}

    private static JdbcUtil1 instance = new JdbcUtil1();

    public static JdbcUtil1 getInstance(){
        return instance;
    }

}

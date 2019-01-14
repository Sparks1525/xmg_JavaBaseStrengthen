package day01.com._520it._07_singleton;

public class JdbcUtil4 {

    private JdbcUtil4() {}

    private volatile static JdbcUtil4 instance;
    public static JdbcUtil4 getInstance() {

        if (instance == null) {
            synchronized (JdbcUtil4.class) {
                if (instance == null) {
                    instance = new JdbcUtil4();
                }
            }
        }
        return instance;
    }
}

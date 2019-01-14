package day01.com._520it._07_singleton;

public class JdbcUtil5 {
    private JdbcUtil5(){}

    public static class Holder{
        // 这里的私有没有什么意义
        /* private */ static JdbcUtil5 instance = new JdbcUtil5();
        public static JdbcUtil5 getInstance(){
            // 外围类能直接访问内部类(不管是否是静态的)的私有变量
            return Holder.instance;
        }
    }
}


package day01.com._520it._07_singleton;

public enum JdbcUtil3 {
    INSTANCE;

    private SingletonClass instance;

    JdbcUtil3(){
        this.instance = new SingletonClass();
        System.out.println("枚举类构造函数");
    }

    public SingletonClass getInstance(){
        return this.instance;
    }
}

class SingletonClass {
    int i = 0;

    public SingletonClass() {
        System.out.println("SingletonClass被初始化 " + ++i + "次");
    }
}


class SingletonTest{
    public static void main(String[] args) {
        SingletonClass instance1 = JdbcUtil3.INSTANCE.getInstance();
        SingletonClass instance2 = JdbcUtil3.INSTANCE.getInstance();
        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }
}
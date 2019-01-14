package day01.com._520it._07_singleton;

public class JdbcUtil7 {


}

class InstanceFactory{
    private static class InstanceHolder{
        public static Instance instance = new Instance();
    }
    public static Instance getInstance(){
        return InstanceHolder.instance;
    }
}

class Instance{}

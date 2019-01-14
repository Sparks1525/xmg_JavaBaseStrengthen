package mytest.day01._02;

public class Singleton6 {

    private static class holder{
        private static Singleton6 instance = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return holder.instance;
    }

}

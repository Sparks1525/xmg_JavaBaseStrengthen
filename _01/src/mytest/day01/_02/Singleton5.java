package mytest.day01._02;

public class Singleton5 {

    public static class hoder{
        private static Singleton5 instance = new Singleton5();

        public static Singleton5 getInstance() {
            return hoder.instance;
        }
    }
}

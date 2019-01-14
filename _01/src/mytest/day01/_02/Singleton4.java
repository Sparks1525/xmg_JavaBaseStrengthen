package mytest.day01._02;

public enum  Singleton4 {
    INSTANCE;
    private DB db;
    Singleton4(){
        db = new DB();
    }
    public DB getDb() {
        return db;
    }
}

class DB{}

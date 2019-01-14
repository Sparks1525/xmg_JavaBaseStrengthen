package day01.com._520it._01_classinstance;



class User{

    public User(){}
    public User(String name){
        System.out.println("name : " + name);
    }

    private User(String name, int age){
        System.out.println("name : " + name + ",,age : " + age);
    }


}

public class ClassInstanceDemo {

    public static void main(String[] args) throws Exception {

        Class clz1 = User.class;
        Class clz2 = Class.forName("day01.com._520it._01_classinstance.User");
        Class clz3 = new User().getClass();


        System.out.println(clz1 == clz2);
        System.out.println(clz2 == clz3);


    }
}

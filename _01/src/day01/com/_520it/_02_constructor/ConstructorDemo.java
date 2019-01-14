package day01.com._520it._02_constructor;


import java.lang.reflect.Constructor;

class User{
    public User(){
        System.out.println("empty User()");
    }
    public User(String name){
        System.out.println("name : " + name);
    }

    private User(String name, int age){
        System.out.println("name : " + name + ",,age : " + age);
    }


    // char... == char[]

    private User(int age, char... abc){
        System.out.println("age : " + age + ",,abc : " + abc);
    }

    private User(int age, char[] abc, float f){
        System.out.println("age : " + age + ",,abc : " + abc + ",,f : " + f);
    }

}


public class ConstructorDemo {
    public static void main(String[] args) throws Exception {

        Class<User> clz = User.class;
        Constructor[] conss1 =  clz.getConstructors();
        for(Constructor con : conss1){
            System.out.println("con : " + con);
        }
        System.out.println("---------------------------------------");

        Constructor[] conss2 = clz.getDeclaredConstructors();
        for(Constructor con : conss2){
            System.out.println("con : " + con);
        }
        System.out.println("---------------------------------------");

        Constructor cot1 = clz.getConstructor();
        System.out.println("cot1 : " + cot1);
        Constructor cot2 = clz.getConstructor(String.class);
        System.out.println("cot2 : " + cot2);
        Constructor cot3 = clz.getDeclaredConstructor(String.class,int.class);
        System.out.println("cot3 : " + cot3);
        Constructor cot4 = clz.getDeclaredConstructor(int.class, char[].class);
        System.out.println("cot4 : " + cot4);
        Constructor cot5 = clz.getDeclaredConstructor(int.class, char[].class, float.class);
        System.out.println("cot5 : " + cot5);
    }
}

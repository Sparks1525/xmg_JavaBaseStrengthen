package day01.com._520it._03_createinstance;


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

public class CreateInstanceDemo {

    public static void main(String[] args) throws Exception {
        Class clz = User.class;
        Object obj0 = clz.newInstance();
        System.out.println("obj0 : " + obj0);

        System.out.println("-----------------------------------" );

        Constructor cot1 = clz.getConstructor();
        Object obj1 = cot1.newInstance();
        System.out.println("obj1 : " + obj1);

        System.out.println("-----------------------------------" );

        Constructor cot2 = clz.getConstructor(String.class);
        Object obj2 = cot2.newInstance("abc");
        System.out.println("cot2 : " + cot2);

        System.out.println("-----------------------------------" );

        Constructor cot3 = clz.getDeclaredConstructor(String.class, int.class);
        cot3.setAccessible(true);
        Object obj3 = cot3.newInstance("def",123);
        System.out.println("obj3 : " + obj3);

        System.out.println("-----------------------------------" );

        Constructor cot4 = clz.getDeclaredConstructor(int.class, char[].class);
        cot4.setAccessible(true);
        Object obj4 = cot4.newInstance(123, new char[]{'A', 'B'});
        System.out.println("obj4 : " + obj4);

        Constructor cot5 = clz.getDeclaredConstructor(int.class, char[].class, float.class);
        cot5.setAccessible(true);
        Object obj5 = cot5.newInstance(456, new char[]{'C', 'D'}, 3f);
        System.out.println("obj5 : " + obj5);

    }
}

package day01.com._520it._04_method;

import java.lang.reflect.Method;

class User {
    public User() {
        System.out.println("empty User()");
    }

    public User(String name) {
        System.out.println("name : " + name);
    }

    private User(String name, int age) {
        System.out.println("name : " + name + ",,age : " + age);
    }

    private User(int age, char... abc) {
        System.out.println("age : " + age + ",,abc : " + abc);
    }

    private User(int age, char[] abc, float f) {
        System.out.println("age : " + age + ",,abc : " + abc + ",,f : " + f);
    }


    public void sayHello() {
        System.out.println("empty");
    }

    public void sayHi(String name) {
        System.out.println("name : " + name);
    }

    private String sayHi(String name, int age) {
        return name + "_" + age;
    }


    private void test(String name, int x, String... arr) {
        System.out.println("name : " + name + ",x : " + x + ",arr : " + arr);
    }

}

public class MethodDemo {

    public static void main(String[] args) throws Exception {

        Class clz = User.class;


        Method[] mtt1 = clz.getMethods();
        for (Method mtt : mtt1) {
            System.out.println("mtt : " + mtt);
        }

        System.out.println("------------------------------");

        Method[] mtt2 = clz.getDeclaredMethods();
        for (Method mtt : mtt2) {
            System.out.println("mtt : " + mtt);
        }

        System.out.println("--------------------------------");

        Method mt0 = clz.getMethod("sayHello");
        System.out.println("mt0 : " + mt0);

        Method mt1 = clz.getMethod("sayHi", String.class);
        System.out.println("mt1 : " + mt1);

        Method mt2 = clz.getDeclaredMethod("sayHi", String.class, int.class);
        System.out.println("mt2 : " + mt2);

        Method mt3 = clz.getDeclaredMethod("test", String.class, int.class, String[].class);
        System.out.println("mt3 : " + mt3);
    }
}

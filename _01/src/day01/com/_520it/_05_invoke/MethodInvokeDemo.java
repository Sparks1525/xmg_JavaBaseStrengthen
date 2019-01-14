package day01.com._520it._05_invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

class User {
    public User() {
        System.out.println("empty constructor");
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
        System.out.println("empty method");
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

    public void show2(String... nums) {
        System.out.println(Arrays.toString(nums));
    }

}


public class MethodInvokeDemo {

    public static void main(String[] args) throws Exception {

        Class clz = User.class;
        Constructor cot0 = clz.getConstructor();
        Object obj0 = cot0.newInstance();

        Method mt0 = clz.getMethod("sayHello");
        mt0.invoke(obj0);

        Method mt1 = clz.getMethod("sayHi", String.class);
        mt1.invoke(obj0, "laowang");

        Method mt2 = clz.getDeclaredMethod("sayHi", String.class, int.class);
        mt2.setAccessible(true);
        Object result2 = mt2.invoke(obj0, "laoli", 123);
        System.out.println("result2 : " + result2);

        Method mt3 = clz.getDeclaredMethod("test", String.class, int.class, String[].class);
        mt3.setAccessible(true);
        mt3.invoke(obj0, "laozhao", 123, new String[]{"a", "b", "c"});

        Method mt4 = clz.getDeclaredMethod("test", String.class, int.class, String[].class);
        mt4.setAccessible(true);
        mt4.invoke(obj0, new Object[]{"laozhao", 123, new String[]{"a", "b", "c"}});

        Method mt5 = clz.getMethod("show2", String[].class);
        // mt5.invoke(null, new String[]{"a", "b", "c"}); error
        mt5.invoke(obj0, new Object[]{new String[]{"a", "b", "c"}});

    }

}

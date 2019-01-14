package day01.com._520it._05_invoke;


import java.lang.reflect.Method;
import java.util.Arrays;

class Person {

    public static void staticMethod() {
        System.out.println("emtype method");
    }


    public static void staticMethod(String name) {
        System.out.println(name);
    }

    public static void show1(int... nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static void show2(String... nums) {
        System.out.println(Arrays.toString(nums));
    }
}


public class MethodCallDemo {
    public static void main(String[] args) throws Exception {

        Class clz = Person.class;

        Method met0 = clz.getMethod("staticMethod");
        met0.invoke(null);

        Method met1 = clz.getMethod("staticMethod", String.class);
        met1.invoke(null, "aaa");

        Method met2 = clz.getMethod("show1", int[].class);
        met2.invoke(null, new int[]{1, 3, 4, 6});

        Method met3 = clz.getMethod("show2", String[].class);
        // met3.invoke(null, new String[]{"a", "b", "c"}); error
        met3.invoke(null, new Object[]{new String[]{"a", "b", "c"}});

    }
}

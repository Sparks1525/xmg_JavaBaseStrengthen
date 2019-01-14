package mytest.day01._02;

import java.util.Arrays;

public class User {

    public String name;
    public int age;
    private int[] cardID;
    private String[] talk;

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

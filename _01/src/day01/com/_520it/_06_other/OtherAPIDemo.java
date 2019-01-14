package day01.com._520it._06_other;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

abstract class User {


    public String name;
    public int age;

    private String work;
    private int num;

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


public class OtherAPIDemo {

    public static void main(String[] args) throws Exception {

       Class clz = User.class;

        Field[] fields = clz.getFields();
        for(Field f : fields){
            System.out.println("f : " + f);
        }

        System.out.println("------------------------");
        Field[] fields1 = clz.getDeclaredFields();
        for(Field f : fields1){
            System.out.println("f : " + f);
        }

        System.out.println("------------------------");

        Field field = clz.getField("name");
        System.out.println("field : " + field);

        Field field1 = clz.getDeclaredField("num");
        System.out.println("field1 : " + field1);

        System.out.println("==============================================================");

        int modNum = clz.getModifiers();
        System.out.println("modNum : " + modNum);
        System.out.println(Modifier.toString(modNum));

        String clzName = clz.getName();
        System.out.println("clzName : " + clzName);

        Class clz0 = OtherAPIDemo.class;
        String clz0Name = clz0.getName();
        System.out.println("clzl0Name : " + clz0Name);

        int modNum1 = clz0.getModifiers();
        System.out.println(Modifier.toString(modNum1));


        Method mt0 = clz.getMethod("sayHello");

        int modMt0 = mt0.getModifiers();
        System.out.println(Modifier.toString(modMt0));
    }
}

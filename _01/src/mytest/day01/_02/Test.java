package mytest.day01._02;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {


    public static void main(String[] args) throws Exception{

        // 反射

        // 获取类
        Class clz = User.class;
        Class clz1 = new User().getClass();
        Class clz2 = Class.forName("test6.User");

        // 获取构造器

        Constructor[] cons1 = clz.getConstructors();

        Constructor[] cons2 = clz.getDeclaredConstructors();

        Constructor con1 = clz.getConstructor(String.class);
        Constructor con2 = clz.getDeclaredConstructor(String.class, int.class);
        con2.setAccessible(true);

        Constructor con3 = clz.getDeclaredConstructor(int.class, char[].class);
        con3.setAccessible(true);

        // 获取对象

        Object obj1 = con1.newInstance("aaa");
        Object obj2 = con2.newInstance("bbb", 123);
        Object obj3 = con3.newInstance(123, new char[]{'a'});

        // 获取方法
        Method[] ms1 = clz.getMethods();
        Method[] ms2 = clz.getDeclaredMethods();

        Method m1 = clz.getMethod("sayHello");
        Method m2 = clz.getDeclaredMethod("sayHi", String.class, int.class);
        m2.setAccessible(true);

        Method m3 = clz.getMethod("sayHi", String.class);

        // 调用方法

        m1.invoke(obj1);
        m2.invoke(obj2,new Object[]{"aaaa", 123});



    }

}

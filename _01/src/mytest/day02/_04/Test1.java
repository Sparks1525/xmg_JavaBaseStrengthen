package mytest.day02._04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws Exception{

        Class clz = User.class;

        Constructor con0 = clz.getConstructor();
        Object obj0 = con0.newInstance();
        Method m0 = clz.getMethod("sayHello");
        m0.invoke(obj0);


        Constructor con1 = clz.getConstructor(String.class);
        Object obj1 = con1.newInstance("abc");
        Method m1 = clz.getMethod("sayHi", String.class);
        m1.invoke(obj1, "cccc");


        Constructor con2 = clz.getDeclaredConstructor(String.class, int.class);
        con2.setAccessible(true);
        Object obj2 = con2.newInstance("aaa", 111);
        Method m2 = clz.getDeclaredMethod("sayHi", String.class, int.class);
        m2.setAccessible(true);
        Object result2 = m2.invoke(obj2, new Object[]{"bbb", 222});
        System.out.println(result2);

    }
}

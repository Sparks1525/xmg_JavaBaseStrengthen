package mytest.day02._01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {


    @org.junit.Test
    public void testCons() throws Exception {
        Class clz = User.class;
        Class clz1 = Class.forName("test12.User");
        Class clz2 = new User().getClass();

        Constructor[] cons = clz.getConstructors();
        Constructor[] conds = clz.getDeclaredConstructors();

        for (Constructor con : cons) {
            System.out.println("con:" + con);
        }

        System.out.println("----------------------------");

        for (Constructor cond : conds) {
            System.out.println("cond:" + cond);
        }
        System.out.println("-----------------------------");

        Constructor con0 = clz.getConstructor();
        System.out.println("con0:" + con0);
        Constructor con1 = clz.getConstructor(String.class);
        System.out.println("con1:" + con1);
        Constructor con2 = clz.getDeclaredConstructor(String.class, int.class);
        con2.setAccessible(true);
        System.out.println("con2:" + con2);
        System.out.println("---------------------------------");
    }

    @org.junit.Test
    public void testInst() throws Exception {

        Class clz = User.class;
        Constructor con0 = clz.getConstructor();
        Object obj0 = con0.newInstance();
        System.out.println("obj0:" + obj0);

        Constructor con1 = clz.getConstructor(String.class);
        Object obj1 = con1.newInstance("abc");
        System.out.println("obj1:" + obj1);

        Constructor con2 = clz.getDeclaredConstructor(String.class, int.class);
        con2.setAccessible(true);
        Object obj2 = con2.newInstance("aaa", 123);
        System.out.println("obj2:" + obj2);

    }


    @org.junit.Test
    public void testMeth() throws Exception {

        Class clz = User.class;
        Constructor con = clz.getConstructor();
        Object obj = con.newInstance();

        Method[] methods = clz.getMethods();
        Method[] methodds = clz.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("m:" + m);
        }

        System.out.println("------------------------------");

        for (Method md : methodds) {
            System.out.println("md:" + md);
        }
        System.out.println("---------------------------------");


        Method m0 = clz.getMethod("sayHello");
        System.out.println("m0:" + m0);
        m0.invoke(obj);

        Method m1 = clz.getMethod("sayHi", String.class);
        System.out.println("m1:" + m1);
        m1.invoke(obj,"m111111");


        Method m2 = clz.getDeclaredMethod("sayHi", String.class, int.class);
        m2.setAccessible(true);
        System.out.println("m2:" + m2);
        m2.invoke(obj,new Object[]{"aaa", 123});


    }


}

package mytest.day02._02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOTest {

    @MyBefore
    public void init() throws Exception {
        System.out.println("初始化...");
    }

    @MyAfter
    public void destory() throws Exception {
        System.out.println("销毁...");
    }

    @MyTest
    public void testSave() throws Exception {
        System.out.println("testSave");
    }

    @MyTest
    public void testDelete() throws Exception {
        System.out.println("testDelete");
    }


    public static void main(String[] args) throws Exception{
        Class clz = EmployeeDAOTest.class;
        Constructor con = clz.getConstructor();
        Object obj = con.newInstance();
        Method[] ms = clz.getMethods();

        List<Method> beforeList = new ArrayList<>();
        List<Method> afterList = new ArrayList<>();
        List<Method> testList = new ArrayList<>();

        for (Method m : ms) {
            if(m.isAnnotationPresent(MyBefore.class)){
                beforeList.add(m);
            } else if(m.isAnnotationPresent(MyAfter.class)){
                afterList.add(m);
            } else if(m.isAnnotationPresent(MyTest.class)){
                testList.add(m);
            }
        }

        for(Method m : testList){
            for(Method m1 : beforeList){
                m1.invoke(obj);
            }
            m.invoke(obj);
            for(Method m1 : afterList){
                m1.invoke(obj);
            }
        }
    }
}

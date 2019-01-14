package day02.prep.test1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOTest {

    @MyBefore
    public void init() throws Exception{
        System.out.println("初始化...");
    }

    @MyAfter
    public void destory() throws Exception{
        System.out.println("销毁...");
    }

    @MyTest
    public void testSave() throws Exception{
        System.out.println("testSave");
    }

    @MyTest
    public void testDelete() throws Exception{
        System.out.println("testDelete");
    }


    public static void main(String[] args) throws Exception{
        Class clzz = EmployeeDAOTest.class;
        Method[] ms = clzz.getMethods();
        List<Method> beforeList = new ArrayList<>();
        List<Method> testList = new ArrayList<>();
        List<Method> afterList = new ArrayList<>();

        for(Method m : ms){
            if(m.isAnnotationPresent(MyBefore.class)){
                beforeList.add(m);
            } else if(m.isAnnotationPresent(MyTest.class)){
                testList.add(m);
            } else if(m.isAnnotationPresent(MyAfter.class)){
                afterList.add(m);
            }
        }
        Object obj = clzz.newInstance();
        for(Method method : testList){
            for(Method bm : beforeList){
                bm.invoke(obj);
            }
            method.invoke(obj);
            for(Method bm : afterList){
                bm.invoke(obj);
            }
        }
    }
}

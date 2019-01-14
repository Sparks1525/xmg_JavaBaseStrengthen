package mytest.day02._04;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test5 {

    public static void main(String[] args) throws Exception{
        Class clz = Person.class;
        Annotation[] as = clz.getAnnotations();
        boolean isA = clz.isAnnotationPresent(VIP.class);

        if(isA){
            Annotation a = clz.getAnnotation(VIP.class);
            VIP vip = (VIP)a;
            System.out.println(vip.level());
            System.out.println(vip.hobby());
            System.out.println(vip.age());
            System.out.println(vip.sex());
        }

        Method m = clz.getMethod("doWork");
        Deprecated deprecated = m.getAnnotation(Deprecated.class);
        System.out.println(deprecated);
    }
}


@VIP(level = "hight", sex = Gender.BOY, hobby = {"A", "B", "C"})
class Person {
    @Deprecated
    public void doWork() {
    }
}
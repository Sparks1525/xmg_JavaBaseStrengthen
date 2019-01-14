package mytest.day02._04;

import java.util.List;
import java.util.Set;

public class Test3 {

    public void doWork1(){
        @SuppressWarnings({"rawtypes", "unused"})
        Set set = null;

        @SuppressWarnings({"rawtypes", "unused"})
        List list = null;
    }

    @Deprecated
    public void doWork3(){}

    @Override
    public String toString(){
        return super.toString();
    }


    @SuppressWarnings("unchecked")
    public static <T> List<T> asList1(T... a){
        return null;
    }

    @SafeVarargs
    public static <T> List<T> asList2(T... a){
        return null;
    }
}

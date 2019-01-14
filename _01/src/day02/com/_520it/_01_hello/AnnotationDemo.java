package day02.com._520it._01_hello;

import java.util.List;
import java.util.Set;

@SuppressWarnings({"rawtypes","unused"})
public class AnnotationDemo extends Object{

    public void doWork1(){
        @SuppressWarnings({"rawtypes","unused"})
        Set set = null;
        @SuppressWarnings({"rawtypes","unused"})
        List list = null;
    }

    @SuppressWarnings({"rawtypes","unused"})
    public void doWork2(){
        Set set = null;
        List list = null;
    }

    @Deprecated
    public void doWork3(){
        java.util.Date d = new java.util.Date();
        d.toLocaleString();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

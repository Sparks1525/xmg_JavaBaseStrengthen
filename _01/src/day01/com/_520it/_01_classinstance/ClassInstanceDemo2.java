package day01.com._520it._01_classinstance;

import java.util.ArrayList;
import java.util.List;

public class ClassInstanceDemo2 {
    public static void main(String[] args) {

        Class sclz = String.class;
        Class iclz = int.class;
        Class bclz = boolean.class;
        Class fclz = float.class;

        Class iiclz = int[].class;
        Class ffclz = float[].class;

        List<String> stringList1 = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();
        Class slclz1 = stringList1.getClass();
        Class ilclz1 = integerList1.getClass();
        System.out.println(slclz1 == ilclz1); // true



        List<String> stringList2 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        stringList2.add("abc");
        integerList2.add(123);
        Class slclz2 = stringList2.getClass();
        Class ilclz2 = integerList2.getClass();

        System.out.println(slclz2 == ilclz2); // true
    }
}

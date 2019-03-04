package day01.com._520it._10_resource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadResourceDemo {

    public static void read1() throws Exception {

        String fileName = "D:\\Sparks\\Sparks_xiaomageNote\\day02\\resources\\db.properties";

        InputStream inputStream = new FileInputStream(fileName);

        Properties p = new Properties();

        p.load(inputStream);
        System.out.println(p);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }


    // 推荐
    public static void read2() throws Exception {
        String fielName = "db.properties";
        Properties p = new Properties();
        InputStream inputStream = null;

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        inputStream = loader.getResourceAsStream(fielName);

        p.load(inputStream);
        System.out.println(p);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }

    public static void read3() throws Exception {
        String fielName = "db.properties";
        Properties p = new Properties();
        InputStream inputStream = null;

        // db.properties必须放在LoadResourceDemo.class的文件夹下
        inputStream = LoadResourceDemo.class.getResourceAsStream(fielName);

        p.load(inputStream);
        System.out.println(p);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }



    public static void main(String[] args) throws Exception {
        LoadResourceDemo.read1();
        System.out.println("--------------------------------------");
        LoadResourceDemo.read2();
        System.out.println("--------------------------------------");
        // LoadResourceDemo.read3();
    }
}

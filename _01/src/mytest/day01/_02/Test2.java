package mytest.day01._02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws Exception{

        String address = "D:\\Sparks\\testProject\\MyTest\\src\\db.properties";

        Properties p = new Properties();

        InputStream inputStream2 = new FileInputStream(address);
        p.load(inputStream2);


        String address2 = "db.properties";
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(address2);
        p.load(inputStream);
        p.getProperty("xxxx");
        p.getProperty("xxxx");


        InputStream inputStream1 = Test2.class.getResourceAsStream(address);
        p.load(inputStream);
        p.getProperty("");
        p.getProperty("");

    }
}

package mytest.day02._01;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void testLoad() throws Exception{

        Properties properties = new Properties();

        String url = "db.properties";
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(url);

        InputStream inputStream1 = PropertiesTest.class.getResourceAsStream(url);

        String url1 = "D:\\Sparks\\testProject\\MyTest\\src\\db.properties";
        InputStream inputStream2 = new FileInputStream(url1);

        properties.load(inputStream);
        String un = properties.getProperty("username");
        String ps = properties.getProperty("password");

        System.out.println("un:" + un);
        System.out.println("ps:" + ps);
    }
}

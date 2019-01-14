package mytest.day02._05;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Test7 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Sparks/testProject/MyTest/src/test-xml2.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc;
        if(f.exists()){
            doc = builder.parse(f);
        } else {
            doc = builder.newDocument();
            doc.setXmlVersion("1.0");
            Element root = doc.createElement("contacts");
            doc.appendChild(root);
        }
    }
}

package mytest.day02._05;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Sparks/testProject/MyTest/src/test-xml.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(f);

        Element root = doc.getDocumentElement();
        NodeList linkmanNl = root.getElementsByTagName("linkman");

        Element linkman1 = (Element) linkmanNl.item(1);
        NodeList nameNl = linkman1.getElementsByTagName("name");

        Element nameEl = (Element) nameNl.item(0);
        String name = nameEl.getTextContent();
        System.out.println(name);

    }
}

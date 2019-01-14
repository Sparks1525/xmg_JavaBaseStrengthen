package mytest.day02._05;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Test3 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Sparks/testProject/MyTest/src/test-xml.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(f);

        Element root = document.getDocumentElement();
        Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
        Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
        emailEl.setTextContent("aaa@qq.com");

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source source = new DOMSource(document);
        Result target = new StreamResult(f);
        transformer.transform(source, target);
    }
}

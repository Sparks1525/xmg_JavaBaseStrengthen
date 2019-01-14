package mytest.day02._05;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Test6 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Sparks/testProject/MyTest/src/test-xml.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);

        Element root = doc.getDocumentElement();
        Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(2);
        linkmanEl.getParentNode().removeChild(linkmanEl);

        Transformer trans = TransformerFactory.newInstance().newTransformer();
        trans.transform(new DOMSource(doc), new StreamResult(f));
    }
}

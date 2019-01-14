package mytest.day02._05;




import org.junit.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Sparks/testProject/MyTest/src/test-xml.xml");

        // 1.获取Document文档对象.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(f);
        // 2.获取XML的根元素对象:contacts.
        Element root = doc.getDocumentElement();
        // 3.获取根元素下的第二个linkman元素.
        NodeList nodeList = root.getElementsByTagName("linkman");
        Element linkmanEl = (Element)nodeList.item(1);
        // 4.获取该linkman元素下的第一个name元素.
        Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
        // 5.获取该name元素的文本内容.
        String name = nameEl.getTextContent();
        Assert.assertEquals("Stef", name);
        System.out.println(name);


//        TransformerFactory factory1 = TransformerFactory.newInstance();
//        Transformer trans = factory1.newTransformer();
//        Source source = new DOMSource(doc); // 内存中的Document对象
//        Result target = new StreamResult(f); // 磁盘中的xml文件对象
//        trans.transform(source, target);

    }

}

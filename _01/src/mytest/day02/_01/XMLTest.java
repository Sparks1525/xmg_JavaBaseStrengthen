package mytest.day02._01;


import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class XMLTest {

    @Test
    public void testW3CXML() throws Exception {

        String url = "D:\\Sparks\\testProject\\MyTest\\src\\test-xml.xml";
        File file = new File(url);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        Element root = doc.getDocumentElement();
        NodeList linkmanNL = root.getElementsByTagName("linkman");
        Element linkmanEl = (Element) linkmanNL.item(0);
        Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
        String nameText = nameEl.getTextContent();
        System.out.println("nameText:" + nameText);
        Element linkman2 = doc.createElement("linkman");
        root.appendChild(linkman2);

        linkman2.getParentNode().removeChild(linkman2);

        TransformerFactory factory1 = TransformerFactory.newInstance();
        Transformer transformer = factory1.newTransformer();
        Source source = new DOMSource(doc);
        Result result = new StreamResult(file);
        transformer.transform(source, result);

        System.out.println("-------------------------------------------------------------");

        Document doc2 = null;
        String url2 = "D:\\Sparks\\testProject\\MyTest\\src\\test-xml2.xml";
        File file2 = new File(url2);

        if(file2.exists()){
            doc2 = builder.parse(file2);
        } else {
            doc2 = builder.newDocument();
            doc2.setXmlVersion("1.0");
            Element root2 = doc2.createElement("contacts");
            Element newLinkman2 = doc2.createElement("linkman");
            Element newName2 = doc2.createElement("name");
            newLinkman2.setTextContent("aaa");
            root2.appendChild(newLinkman2);
            newLinkman2.appendChild(newName2);
        }
    }

    @Test
    public void testDom4jXML() throws Exception{

        String url = "D:\\Sparks\\testProject\\MyTest\\src\\test-xml.xml";
        File file = new File(url);

        SAXReader reader = new SAXReader();
        org.dom4j.Document doc = reader.read(file);

        org.dom4j.Element root = doc.getRootElement();
        List<org.dom4j.Element> linkmans = root.elements("linkman");
        for(org.dom4j.Element linkman : linkmans){
            org.dom4j.Element nameEl = linkman.element("name");
            String nameText = nameEl.getText();
            System.out.println("nameText:" + nameText);
        }

        org.dom4j.Element linkman2 = root.addElement("linkman");
        org.dom4j.Element name2 = linkman2.addElement("name");
        name2.setText("aaa");

        FileWriter fileWriter = new FileWriter(file);
        doc.write(fileWriter);
        fileWriter.close();

        OutputFormat format = OutputFormat.createCompactFormat();
        XMLWriter xmlWriter = new XMLWriter(fileWriter, format);
        xmlWriter.write(doc);
        xmlWriter.close();
    }
}

package lr10.Example22;
// Сделайте в текстовом редакторе свой файл в формате XML продукты (Product).
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
public class Example221 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Product");
            doc.appendChild(rootElement);

            // Добавление первого продукта
            Element product1 = doc.createElement("Pasta");
            rootElement.appendChild(product1);

            Element name1 = doc.createElement("Name");
            name1.appendChild(doc.createTextNode("Barilla"));
            product1.appendChild(name1);

            Element company1 = doc.createElement("Company");
            company1.appendChild(doc.createTextNode("Barilla G. e R. Fratelli S.p.A"));
            product1.appendChild(company1);


            // Добавление второго продукта
            Element product2 = doc.createElement("Rice");
            rootElement.appendChild(product2);

            Element name2 = doc.createElement("Name");
            name2.appendChild(doc.createTextNode("Makfa"));
            product2.appendChild(name2);

            Element company2 = doc.createElement("Company");
            company2.appendChild(doc.createTextNode("AO Makfa"));
            product2.appendChild(company2);


            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/lr10/Example22/Example221.xlsx");
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

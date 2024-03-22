package lr10.Example22;
//Добавьте возможность поиска книг по автору или году издания. Например,
//пользователь может ввести автора или год издания, а программа выведет список
//книг, удовлетворяющих этому критерию поиска.
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.util.List;
public class Example223 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr10/Example22/Example222.xlsx/");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора или год издания для поиска: ");
            String searchCriteria = scanner.nextLine();

            NodeList nodeList = doc.getElementsByTagName("book");

            // Фильтрация и выборка книг, удовлетворяющих критериям поиска
            List<Element> books = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author = element.getElementsByTagName("author").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    if (author.equalsIgnoreCase(searchCriteria) || year.equals(searchCriteria)) {
                        books.add(element);
                    }
                }
            }

            // Вывод найденных книг
            for (Element book : books) {
                System.out.println("\nНазвание книги: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год издания: " + book.getElementsByTagName("year").item(0).getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package lr10.Example22;
//Добавьте возможность записывать новые книги в XML-файл.
//Например, пользователь может ввести данные о новой книге, а программа добавит новый элемент <book> в XML-файл.

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;
public class Example222 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // Добавление существующих книг
            addBook(doc, "Война и мир", "Лев Толстой", "1869");
            addBook(doc, "Мастер и Маргарита", "Михаил Булгаков", "1967");

            // Добавление новой книги
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название новой книги:");
            String newTitle = scanner.nextLine();
            System.out.println("Введите автора новой книги:");
            String newAuthor = scanner.nextLine();
            System.out.println("Введите год издания новой книги:");
            String newYear = scanner.nextLine();
            addBook(doc, newTitle, newAuthor, newYear);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/lr10/Example22/Example222.xlsx/");
            transformer.transform(source, result);

            System.out.println("XML-файл успешно обновлен!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для добавления книги в XML-файл
    private static void addBook(Document doc, String title, String author, String year) {
        Element book = doc.createElement("book");
        Element bookTitle = doc.createElement("title");
        bookTitle.appendChild(doc.createTextNode(title));
        book.appendChild(bookTitle);
        Element bookAuthor = doc.createElement("author");
        bookAuthor.appendChild(doc.createTextNode(author));
        book.appendChild(bookAuthor);
        Element bookYear = doc.createElement("year");
        bookYear.appendChild(doc.createTextNode(year));
        book.appendChild(bookYear);
        doc.getDocumentElement().appendChild(book);
    }
}

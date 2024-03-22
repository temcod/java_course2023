package lr10.Example23;
//Добавьте функционал записи полученных данных в файл для сохранения информации на будущее.
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Example231 {
    public static void main(String[] args) {
        String url= "https://itlearn.ru/first-step";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");

            // Создаем новый файл для записи данных
            File file = new File("src/lr10/Example22/links.txt");
            FileWriter writer = new FileWriter(file);

            for (Element link : links) {
                // Выводим ссылки в консоль
                System.out.println(link.attr("abs:href"));

                // Записываем ссылки в файл
                writer.write(link.attr("abs:href") + "\n");
            }

            writer.close(); // Закрываем FileWriter

            System.out.println("Данные успешно записаны в файл links.txt");
        } catch (IOException e) {
            // Выводим сообщение об ошибке
            e.printStackTrace();
        }
    }
}

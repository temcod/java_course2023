package lr10.Example4;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try{
            //получаем HTML код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            //извлекаем список новостей
            Elements newParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            // выводим последние 10 новостей в консоль
            for(int i = 3; i < 20 ; i++){
                if(!(i%2==0)){
                    List<Node> nodes = newParent.get(0).childNodes();
                    System.out.println("Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    System.out.println("Дата: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0)+"\n");

                }
            }
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}

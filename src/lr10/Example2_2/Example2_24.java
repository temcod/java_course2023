package lr10.Example2_2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class Example2_24 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/Example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("autor"));
                System.out.println("Год издания: " + book.get("year"));
            }

            deleteBookByTitle(jsonArray, "Название книги для удаления");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookByTitle(JSONArray jsonArray, String title) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject book = (JSONObject) jsonArray.get(i);
            if (book.get("title").equals(title)) {
                jsonArray.remove(i);
                System.out.println("Книга с названием '" + title + "' была удалена.");
                return;
            }
        }
        System.out.println("Книга с названием '" + title + "' не была найдена.");
    }
}

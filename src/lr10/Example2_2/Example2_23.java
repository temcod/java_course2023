package lr10.Example2_2;
//Добавьте функционал для добавления новой книги в массив.
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
public class Example2_23 {
    public static void main(String[] args) {
        JSONArray books = new JSONArray();

        // Создаем новую книгу
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Новая книга");
        JSONObject author = new JSONObject();
        author.put("autor", "Новый автор");
        newBook.put("genre", "Фантастика");

        // Добавляем новую книгу в массив
        books.add(newBook);

        try (FileWriter file = new FileWriter("books.json")) {
            file.write(books.toString());
            System.out.println("Новая книга добавлена в JSON file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

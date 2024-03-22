package lr10.Example23;
//Добавьте обработку ошибок при получении HTML-кода страницы, например
//вывод сообщения об ошибке и попытка переподключения к сайту.
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class Example232 {
    public static void main(String[] args) {
        // URL адрес сайта, с которым будем работать
        String websiteUrl = "https://itlearn.ru/first-step";

        // Попытка подключиться к сайту
        try {
            URL url = new URL(websiteUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            // Проверка успешности подключения
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Сайт успешно подключен. Получение HTML-кода страницы...");
                // Дальнейшая обработка HTML-кода
            } else {
                System.out.println("Ошибка при подключении к сайту. Код ошибки: " + responseCode);

            }
        } catch (IOException e) {
            System.out.println("Ошибка при попытке подключения к сайту: " + e.getMessage());

        }
    }
}
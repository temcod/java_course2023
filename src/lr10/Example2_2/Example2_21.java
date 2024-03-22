package lr10.Example2_2;
//Сделайте в текстовом редакторе свой файл в формате JSON в зависимости от варианта (Приложение 1).
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example2_21 {
    public static void main(String[] args) {

        JSONObject library = new JSONObject();
        JSONArray product = new JSONArray();

        JSONObject product1 = new JSONObject();
        product1.put("product1", "Pasta");
        product1.put("name", "Barilla");
        product1.put("company", "Barilla G. e R. Fratelli S.p.A");

        JSONObject product2 = new JSONObject();
        product2.put("product2", "Rice");
        product2.put("name", "Makfa");
        product2.put("company", "AO Makfa");

        product.add(product1);
        product.add(product2);

        library.put("products", product);

        try(FileWriter file = new FileWriter("src/lr10/Example2_2/example-json.json")) {
            file.write(library.toJSONString());
            System.out.println("Json файл успешно создан");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

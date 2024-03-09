package lr9.chapter6.IndexTime;
import java.util.ArrayList;
public class IndexTimeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Заполняем ArrayList
        for (int i=0; i<1000000; i++) {
            arrayList.add(i);
        }

        // Замеряем время выполнения операции получения элемента по индексу
        long startTime = System.nanoTime();

        int element = arrayList.get(500000);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // Время выполнения операции в наносекундах

        System.out.println("Время затраченное на получение элемента по индексу из ArrayList: " + duration + " наносекунд");
    }
}

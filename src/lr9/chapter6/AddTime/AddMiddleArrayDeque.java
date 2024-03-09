package lr9.chapter6.AddTime;
import java.util.ArrayDeque;

public class AddMiddleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 500000; i++) {
            arrayDeque.add("Element" + i);
        }

        long startTime = System.nanoTime();
        arrayDeque.add("Element250000");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на добавление элемента в середину ArrayDeque: " + duration + " наносекунд");
    }
}

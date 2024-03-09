package lr9.chapter6.DeleteTime;
import java.util.ArrayDeque;
public class DeleteMiddleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 500000; i++) {
            arrayDeque.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 250000; i++) {
            arrayDeque.removeFirst();
        }
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на удаление элемента из середины ArrayDeque: " + duration + " наносекунд");
    }
}

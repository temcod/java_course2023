package lr9.chapter6.AddTime;
import java.util.ArrayList;
public class AddBeginArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }

        long endTime = System.nanoTime();
        long durationArrayList = endTime - startTime;
        System.out.println("Время затраченное на добавление элементов в начале ArrayList: " + durationArrayList + " наносекунд");
    }
}

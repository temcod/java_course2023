package lr9.chapter6.AddTime;
import java.util.TreeMap;

public class AddBeginTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < 500000; i++) {
            treeMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        treeMap.put(-1, "Element-1");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на добавление элемента в начало TreeMap: " + duration + " наносекунд");
    }
}

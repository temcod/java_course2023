package lr9.chapter6.AddTime;
import java.util.TreeMap;

public class AddMiddleTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < 500000; i++) {
            treeMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        treeMap.put(500000, "Element500000");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на добавление элемента в середину TreeMap: " + duration + " наносекунд");
    }
}
